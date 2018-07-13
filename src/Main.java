import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Create a Simple Grocery Invoice Application:
        //
        //Requirements:
        //
        //Prompt the user for input of 2 grocery item with the following criterias:
        //itemName01, itemName02 (is a text value)
        //itemPrice01, itemPrice02 (is a decimal number value)
        //itemQuantity01, itemQuantity02 (is a whole number value)
        //Calculate the total cost of each grocery item (cost=price*quantity)
        //Calculate the total amount of items in the purchase
        //Your final display should be similar to:
        //Item Name       Price      Quantity     Cost
        //Apple           $2.25      3            $6.75
        //Banana          $1.50      5            $7.50
        //
        //Total Purchase Amount = $14.25

        Scanner sca = new Scanner(System.in);
       // String itemName01;
       // String itemName02;
       // double itemPriceo1;
        //double itemPriceo2;
       // int iteamQuantity01;
       // int iteamQuantity02;
        System.out.println("Enter your grocery 1");
        String itemName01= sca.next();
        System.out.println("Enter your grocery 2");
        String itemName02= sca.next();
        System.out.println("Enter the price 1");
        double itemPriceo1=sca.nextDouble();
        System.out.println("Enter the price 2");
        double itemPriceo2=sca.nextDouble();
        System.out.println("Enter the quantity 1");
        int iteamQuantity01=sca.nextInt();
        System.out.println("Enter the quantity 2");
        int iteamQuantity02=sca.nextInt();
        double cost1 = ( itemPriceo1 *   iteamQuantity01);
        System.out.println("Cost of item 1:"+cost1);
        //double itemPriceo2=sca.nextDouble();
       // System.out.println("Enter the quantity");
        //int iteamQuantity02=sca.nextInt();
        double cost2= ( itemPriceo2 *   iteamQuantity02);
        System.out.println("Cost of item 2:"+cost2);
        double TotalPerchaseAmount =(cost1+cost2);
        System.out.println("Total Perchase Amount:"+ TotalPerchaseAmount);
        System.out.println("Item Name:\tPrice\t Quantity\t Cost");
        System.out.println(itemName01 + "\t      $"+ itemPriceo1 + " \t   " + iteamQuantity01 + "     \t$" + cost1);
        System.out.println(itemName02 + "\t      $" + itemPriceo2 + " \t   " + iteamQuantity02 + "      \t$" + cost2);
        System.out.println("Total Perchase Amount:"+ "$" + TotalPerchaseAmount);
        //BONUS:

        //Generate a random number from 1-10 for each item's quantity amount
        //If you spend more than $20, print "You spent too much today..." to the console
        //Otherwise, print "Thank you for shopping at my market!"
        Random ran1 = new Random();
        int quantityamount1 = 1 +ran1.nextInt(10);
        System.out.println("First quantity amount:" + quantityamount1);


        Random ran2 = new Random();
        int quantityamount2 = 1 +ran1.nextInt(10);
        System.out.println("Second quantity amount:" + quantityamount2 );

        if ( TotalPerchaseAmount >20){
            System.out.println("You spent too much today..." );
        }else{
            System.out.println("Thank you for shopping at my market!");
        }

    }
}
