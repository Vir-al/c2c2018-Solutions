# Practice Set
### PhoneEmulator:
1.  Write a class PhoneEmulator. It should have the following methods:
    1.  `call(long phoneNumber)`
    2.  `hangUp()`
    3.  `isCallOngoing()`
    4.  `redial()`
    5.  `toggleMute()`
    6.  `isMuted()`
    7.  `getBill(int rateScheme)`  
        a.  0 = 2 paisa per second, constant  
        b.  1 = free for first 10 seconds, then 3 paisa/s  
        c.  2 = 1 paisa/s for first 20 seconds, then 2 paisa/s  
 
    Edge cases :  
        1. What happens if you try to hang up when there is no ongoing call?  
        2. What happens if you invoke `call`, when there is already an ongoing call?  
        
### 2DPoint:
2. Write a class 2DPoint. It should have the following constructors and methods
    1. `Point()`  
    2. `Point(double x, double y)`  
    3. `euclideanDistanceTo(Point p)` - Distance to Point p, using [Euclidean Distance Formula](https://en.wikipedia.org/wiki/Euclidean_distance#Two_dimensions)  
    4. `manhattanDistanceto(Point p)` - Distance to Point p using [Manhattan Distance Formula](https://xlinux.nist.gov/dads/HTML/manhattanDistance.html)  
    5. `midpoint(Point a, Point b)` - Return the midpoint of the two points.  
    6. A static variable called `ORIGIN`, that represents the origin.  
    
### MathUtil:
3. Make a `MathUtil` class. It should contain the following methods:
    1. `gcd(long a, long b)`
    2. `lcm(long a, long b)`
    3. `min(long[] arr)`
    4. `min(int[] arr)`
    5. `max(long[] arr)`
    6. `max(int[] arr)`
    7. `average(long[] arr)`  


### SearchMethods:
4. Write a recursive version of binarySearch function written [here](https://github.com/sunnypatel165/c2c2018/tree/master/Session03#binary-search).
