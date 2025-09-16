[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=20535729)
# unit-2-8-assignment

## Compiling and Running Java Programs
Run your code by running
```
javac Filename.java
java Filename
```

## Scanner Class for User Input (Optional)
Documentation for the `Scanner` class can be found in the [AP CSA Java Quick Reference (clickable link)](https://apcentral.collegeboard.org/media/pdf/ap-computer-science-a-java-quick-reference.pdf).
1. First, import the `Scanner` class to the top of your program.
```java
import java.util.Scanner;
```
2. Then, create your `Scanner` object (typicallyl, within `main`).  Use `System.in` (the keyboard) as your source of input.
```java
Scanner scan = new Scanner(System.in);
```
3. Prompt the user with a print statement of some kind.
```java
System.out.println("Give me a number:");
```
4. Create the variable, and store the user input from the `Scanner` object within the variable.
```java
int favNum;
System.out.println("What is your favorite number?");
favNum = scan.nextInt();
```


# Instructions

## Problem 1
Write a method named `printRandom3()` that takes in a positive integer `n`, then prints 3 random integers from 2 to `n`+2 inclusive using `Math.random()`.

Note: Make sure your minimum output is 2 or more and make sure your maximum output is only up to n + 2 (so if user inputs 5, the maximum output should only be 7).

Hint: Knowing your PEMDAS will help a lot.

Sample Run:
```
Enter a positive integer:
6
Random numbers:
7
2
5
```

## Problem 2
Write a function named `calcSlope()` that calculates the slope between two coordinates: `(x1, y1)` and `(x2, y2)`. The function should take four decimal inputs, in the order of `x1`, `x2`, `y1`, `y2`. Then print the slope.

Hint: Just find 4 points and plug in the formula.

The slope formula is

$$ \dfrac{y_2 - y_1}{x_2-x_1} $$

Sample run:
```
Enter the first x-coordinate:
3.9
Enter the second x-coordinate:
5.1
Enter the first y-coordinate:
4.8
Enter the second y-coordinate:
1.2
Slope: -3.0000000000000004
```

## Problem 3
Write a method named `roundedDist()` which should take two doubles as inputs, and calculates the distance between them.  It then rounds the distance to the nearest integer. The answer should be a positive integer regardless of the order in which the doubles are entered.

Sample run 1:
```
Enter two doubles:
>2.2
>9.6
Distance: 7
```
Sample run 2:
```
Enter two doubles:
>-4.5
>12.56
Distance: 17
```
## Sample Solutions
```java
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// problem 1
		System.out.println("Enter a positive integer");
		int N = sc.nextInt();
		printRandom3(N);

		// problem 2
		System.out.println("Enter values for x1, x2, y1, y2 in that order")
		double x1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		System.out.println("Slope: " + calcSlope(x1, x2, y1, y2));

		// problem 3
		System.out.println("Enter two doubles");
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		System.out.println("Distance: " + roundedDist(d1, d2));
	}

	public static void printRandom3(int num)
	{
		int m = n + 1;

		System.out.println( (int) ((Math.random() * m) + 2) );
		System.out.println( (int) ((Math.random() * m) + 2) );
		System.out.println( (int) ((Math.random() * m) + 2) );
	}

	public static double calcSlope(double x1, double x2, double y1, double y2)
	{
		return (y2-y1)/(x2-x1);
	}

	public static int roundedDist(double a, double b)
	{
		double dist = Math.abs(b - a);
		int rounded = (int) (dist + 0.5);
		return rounded;
	}
}
```

# Extra Resources

## API and Documentation
Documentation for the shape classes can be found [here](https://coderunner.projectstem.org/docs/shapes/index.html).

## Git Config if using VSCode on Computer
```
git config user.name "user"
git config user.email "email"
```
