import java.util.Scanner;

/**
 * Write a description of class Medicine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Medicine
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("For Pharmacist");
    System.out.println("Enter the name of medicine");
    String name=sc.nextLine();
    System.out.println("Quantity the store has");
    int quan=sc.nextInt();
    System.out.println("The amount of the medicine per pcs");
    int price1=sc.nextInt();
    
    System.out.println("For Customer");
    System.out.println("Enter the name of medicine");
    String name1=sc.nextLine();
    System.out.println("Enter the quantity");
    int quantity=sc.nextInt();
    
    int price=quantity*price1;
    System.out.println("The Price is "+price);
    
    int newstock=quan-quantity;
    System.out.println("Stock left "+newstock);
    
    }
}