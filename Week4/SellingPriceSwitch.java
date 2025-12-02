package Week4;
import java.util.Scanner;


/**
 * Write a description of class SellingPriceSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SellingPriceSwitch
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marked price");  
    float mp=sc.nextFloat();
    
   
    System.out.println("Enter the category A/B/C/D");
     char category=sc.next().charAt(0);
     
    float SPA=mp-(mp*0.6f);
    float SPB=mp-(mp*0.4f);
    float SPC=mp-(mp*0.2f);
    float SPD=mp-(mp*0.1f);
     
    switch(category)
    {
    case'A':System.out.println("The sellingprice is "+SPA);
    break;
    case'B':System.out.println("The sellingprice is "+SPB);
    break;
    case'C':System.out.println("The sellingprice is is "+SPC);
    break;
    case'D':System.out.println("The sellingprice is "+SPD);
    break;
    default:
        System.out.println("Invalid category");
        
    }
    }

    
    
    }
