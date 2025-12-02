package Week4;
import java.util.Scanner;


/**
 * Write a description of class SellingPrice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPrice
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marked price");  
    float mp=sc.nextFloat();
    char category;
    
    System.out.println("Enter the category A/B/C/D");
    category=sc.next().charAt(0);
    
    float SPA=mp-(mp*0.6f);
    float SPB=mp-(mp*0.4f);
    float SPC=mp-(mp*0.2f);
    float SPD=mp-(mp*0.1f);
    
    if(category=='A' || category=='a')
    {
    System.out.println("The SellingPrice is "+SPA);
    }
    else if(category=='B' || category=='b')
{
System.out.println("The sellingPrice is "+SPB);
}
else if(category=='C' || category=='c')
{
System.out.println("The sellingPrice is "+SPC);
}
else if(category=='D' || category=='d')
{
 System.out.println("The SellingPrice is "+SPD);
}
else
{
    System.out.println("Invalid Category");
}

    
    
    
    
    }
}