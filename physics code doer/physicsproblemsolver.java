import java.util.Scanner;

public class physicsproblemsolver {
    public static void main(String[] args) {
        // creates the variables for the program
        double mass;
        double vel;
        double sol;

        // Makes a scanner to read the user input
        Scanner kybd = new Scanner(System.in);

        // Prints out text
        System.out.println("This program calculates the kinetic energy of an object based on user input.");

        // Asks about and reads the mass of the object
        System.out.println("What is the mass of the object in kg?");
        mass = kybd.nextDouble();

        // Asks about and reads the velocity of the object
        System.out.println("What is the velocity of the object in m/s?");
        vel = kybd.nextDouble();

        // Calculates the kinetic energy of the object
        sol = 0.5 * mass * vel * vel;

        // Prints the solution found
        System.out.println("The kinetic energy of the object is " + sol + "J");

        // Closes the scanner 
        kybd.close();
    }
}