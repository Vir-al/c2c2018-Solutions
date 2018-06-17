import java.util.*;

public class PhoneEmulator {

	private boolean callOngoing = false;
	private boolean mute = false;
	private int balance = 0;
	private long lastcalled;
	private long rate;
	private long[][] callTimings = new long[0][2]; // [][0] -> callStart  [][1] -> callEnd

	public boolean call(long phoneNumber){
		if(isCallOngoing()){
			return false;
		} else {
			callOngoing = true;
			lastcalled = phoneNumber;
			long startTime = System.currentTimeMillis();
			callTimings = arrayAdd(callTimings,startTime);
			return true;
		}
	}

	public void show(){
		for (long[] timings : callTimings) {
			for (long time : timings) {
				System.out.print(time + " ");
			}
			System.out.println();
		}
	}

	private long[][] arrayAdd(long[][] timings, long time){

		long[][] tempTiming = new long[(timings.length+1)][2];
		int i = 0;
		for (long[] times : timings) {
			tempTiming[i++] = times;
		}

		tempTiming[i][0] = time;

		return tempTiming;

	}

	public long hangUp(){
		if(isCallOngoing()){
			callOngoing = false;
			long endTime = System.currentTimeMillis();
			callTimings[(callTimings.length - 1)][1] = endTime;
			return ( endTime - callTimings[(callTimings.length - 1)][0] );
		} else {
			return -1;
		}
	}

	public boolean isCallOngoing(){
		return callOngoing;
	}

	public boolean redial(){
		return call(lastcalled);
	}

	public boolean toggleMute(){
		return mute = (!mute);
	}

	public boolean isMuted(){
		return mute;
	}

	public double getBill(int rateScheme){
		// 0 = 2 paisa per second, constant
		// 1 = free for first 10 seconds, then 3 paisa/s
		// 2 = 1 paisa/s for first 20 seconds, then 2 paisa/s
		if(callTimings.length == 0){
			return 0;
		}

		long duration = 0;
		for (long[] times : callTimings) {
			duration += (times[1] - times[0]);
		}
		double seconds = (double) duration / 1000;

		switch(rateScheme){
			case 0:
				rate = 2;
				return (seconds * 2);


			case 1:
				rate = 3;
				if(seconds > 10){
					return (seconds - 10) * rate;
				} else {
					return 0;
				}


			case 2:
				rate = 2;
				if(seconds > 20){
					return ( (seconds - 10) * rate ) + 20;
				} else {
					return seconds;
				}


			default:
				return 0;			
		}

	}

}

class demo {
	public static void main(String[] args) {
		PhoneEmulator ph = new PhoneEmulator();
		int choice;
		Scanner sc = new Scanner(System.in);
		// System.out.print(System.currentTimeMillis());
		do {
			System.out.print("\n\n\n1. Make call\n2. Hang\n3. view bill\n4. Exit\n Your choice :");
			choice = sc.nextInt();
			switch(choice){
				case 1:
					boolean callResult = ph.call(8828707915L);
					System.out.println(callResult + "\n");
					break;
				case 2:
					long hangResult = ph.hangUp();
					System.out.println(hangResult + "\n");
					break;
				case 3:
					double bill = ph.getBill(0);
					System.out.println(bill + "\n");
					break;

			}
		} while(choice != 4);
	}

}