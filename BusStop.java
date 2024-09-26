/*
 * Write your program inside the main method to find the order
 * which the bus the student needs to take will arrive
 * according to the assignemnt description. 
 *
 * To compile:
 *        javac BusStop.java
 * 
 * DO NOT change the class name
 * DO NOT use System.exit()
 * DO NOT change add import statements
 * DO NOT add project statement
 * 
 */
public class BusStop {

    public static void main(String[] args) {

        int n = args.length;
    int[] busRoutes = new int[n-1];
    for (int i = 0; i < n-1; i++) {
      busRoutes[i] = Integer.parseInt(args[i]);
    }

    int s = Integer.parseInt(args[n-1]);

    int result = -1; 
    for (int i = 0; i < n-1; i++) {
      if(busRoutes[i] == s) {
        result = i+1;
        break;
      }
    }

    if (result == -1) {
      System.out.println(1000); 
    } else {
      System.out.println(result);
    }

    }
}
