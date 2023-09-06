// Receipt.java

import java.util.Scanner;

public class Receipt
{
    public static void main(String[] args)
    {
        int spaces;

        int numToenail;
        double priceToenail = 9.95;
        String descToenail = "Luxury Clipped Toenails";

        int numFingernail;
        double priceFingernail = 5.99;
        String descFingernail = "Finely Chopped Fingernails";

        int numBread;
        double priceBread = 1.25;
        String descBread = "Aged Moldy loaves of Bread";

        int numEscargot;
        double priceEscargot = 89.99;
        String descEscargot = "Delicately Sizzled Escarcots";

        int numGarlic;
        double priceGarlic = 69.69;
        String descGarlic = "Beautifully Stinky Garlics";

        System.out.println("Welcome to my store!!! Please either buy something or get out :)");
        System.out.println("Please go through the prompts and enter how many of each item you would like to buy.");
        Scanner scan = new Scanner(System.in);
        System.out.print("How many " + descToenail + " would you like? ($" + priceToenail + " each) ");
        numToenail = scan.nextInt();
        System.out.print("How many " + descFingernail + " would you like? ($" + priceFingernail + " each) ");
        numFingernail = scan.nextInt();
        System.out.print("How many " + descBread + " would you like? ($" + priceBread + " each) ");
        numBread = scan.nextInt();
        System.out.print("How many " + descEscargot + " would you like? ($" + priceEscargot + " each) ");
        numEscargot = scan.nextInt();
        System.out.print("How many " + descGarlic + " would you like? ($" + priceGarlic + " each) ");
        numGarlic = scan.nextInt();

        for(int i = 0; i < 39; i++)
        {
            System.out.print("*");
        }
        System.out.println("*");

        if (numToenail > 0)
        {
            System.out.print("*");
            for(int x = 0; x < 38; x++)
            {
                System.out.print(" ");
            }
            System.out.println("*");

            System.out.println3
            ("*  " + numToenail + " " + descToenail + "           *");
            System.out.print("*  @ $" + priceToenail + " each");

            System.out.println("*");
        }

        System.out.print("*");
        for(int a = 0; a < 38; a++)
        {
            System.out.print(" ");
        }
        System.out.println("*");

        System.out.println("*   Thank you for shopping with us!    *");

        System.out.print("*");
        for(int b = 0; b < 38; b++)
        {
            System.out.print(" ");
        }
        System.out.println("*");

        for(int y = 0; y < 39; y++)
        {
            System.out.print("*");
        }
        System.out.println("*");
    }
}
