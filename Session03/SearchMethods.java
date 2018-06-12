import java.util.*;

class Search {

	public static int binarySearch(int a[], int start , int end , int elementToBeFound){
	    // find the mid based on current start and end.
	    int mid = (start + end)/2;

		if(a[mid] == elementToBeFound){
	        // element found at position = mid 
	            return mid + 1;
		}

		if(end <= start){
			return -1;
		}

        if(a[mid] > elementToBeFound){
            end = mid - 1;				// element lies in the left half of the array 
			return binarySearch(a,start,end,elementToBeFound);
		}

        if(a[mid] < elementToBeFound){
	        start = mid + 1;				// element lies in the right half of the array
	    	return binarySearch(a,start,end,elementToBeFound);
		}

		return -1;

	}

}

class demo {
	public static void main(String[] args) {
		int[] a = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		System.out.println(Search.binarySearch(a,0,a.length,51));
	}

}
