import java.util.Scanner;

/**
 * Write a description of class AushadiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AushadiPasal
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);

    String medicine1="Niko";
    int price1=25;
    int stock1=500;
    
    System.out.println("Enter the name of medicine");
    String med1=sc.nextLine();
    System.out.println("Enter the quantity");
    int quantity=sc.nextInt();
    
    int price=quantity*price1;
    System.out.println("The Price is "+price);
    
    int newstock=stock1-quantity;
    System.out.println("Stock left "+newstock);
    
    
    
    }
}