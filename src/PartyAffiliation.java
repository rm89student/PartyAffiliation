//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String choice = "";

        System.out.println("Enter your party affiliation:");
        System.out.print("D = Democrat");
        System.out.print("R = Republican");
        System.out.print("I = Independent");
        System.out.print("Any other letter = Other");

        choice = in.nextLine();
        if (choice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democrat Donkey.");
        } else if (choice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if  (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other. ");
        }
    }
}