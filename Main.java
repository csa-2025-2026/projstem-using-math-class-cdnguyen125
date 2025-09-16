import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        int numOfNums;
        System.out.println("what range of random ints from 2 to n+2 do you want?");
        numOfNums = scan.nextInt();
        if (numOfNums < 1)
        {
            System.out.println("try again! (must be at least 1)");
            numOfNums = scan.nextInt();
        }
        printRandom3(numOfNums);

        System.out.println("\nwhat x1, x2, y1, y2, would you like to find the slope between?");
        double x1 = scan.nextDouble(); 
        double x2 = scan.nextDouble();
        double y1 = scan.nextDouble();
        double y2 = scan.nextDouble();
        double slope = calcSlope(x1, x2, y1, y2);
        System.out.println("Slope is: " + slope);

        System.out.println("\nwhat two doubles do you want to find the distance of?");
        double dist1 = scan.nextDouble();
        double dist2 = scan.nextDouble();
        int distance = roundedDist(dist1, dist2);
        System.out.printf("two doubles: %2.2f , %2.2f\ndistance(rounded to int): %d\n", dist1, dist2, distance);
    }
    
    public static void printRandom3(int num)
    {
        // Do problem 1 here
        int randomNum1 = (int)(Math.random() * (num + 1)) + 2;
        int randomNum2 = (int)(Math.random() * (num + 1)) + 2;
        int randomNum3 = (int)(Math.random() * (num + 1)) + 2;
        int num2 = num + 2;
        System.out.printf("positive integer: %d\nrandom 3 integers from 2 to %d: %d %d %d\n", num, num2, randomNum1, randomNum2, randomNum3);
    }
    
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
        // Do problem 2 here; replace code below
        //System.out.printf("x1: %1.1f\nx2: %1.1f\ny1: %1.1f\ny2: %1.1f\n", x1, x2, y1, y2); optional lol just helps me keep track
        double slope = (y2 - y1)/(x2-x1);
        return slope;
    }
    
    public static int roundedDist(double a, double b)
    {
        // Do problem 3 here; replace code below
        int distance = (int)(Math.abs(a - b));
        return distance;
    }
}
