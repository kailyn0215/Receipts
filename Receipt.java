// Receipt.java

import java.util.Scanner;

public class Receipt
{
    public static void main(String[] args)
    {
        int numToenail;
        double priceToenail = 9.95;
        String descToenail = "Luxury Clipped Toenails";

        int numFingernail;
        double priceFingernail = 5.99;
        String descFingernail = "Finely Chopped Fingernails";

        int numBread;
        double priceBread = 1.25;
        String descBread = "Aged Moldy Bread";

        int numEscargot;
        double priceEscargot = 89.99;
        String descEscargot = "Delicately Sizzled Escarcot";

        int numGarlic;
        double priceGarlic = 69.69;
        String descGarlic = "Beautifully Stinky Garlic";

        System.out.println("Welcome to my store!!! Please either buy something or get out :)");
        System.out.println("Please go through the prompts and enter how many of each item you would like to buy.");
        Scanner scan = new Scanner(System.in);
        System.out.print("How many luxury clipped toenails would you like to buy? ($9.95 each) ");
        toenail = scan.nextInt();
        System.out.print("How many finely chopped ($9.95 each) ");
        toenail = scan.nextInt();

    }
}
