package Week4;
import java.util.Scanner;


/**
 * Write a description of class Cinema here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cinema
{
    public static void main(String[]arg)
    {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your age ");
    int age=sc.nextInt();
    sc.nextLine();
    String agegroup;
    int baseprice;
    int price;
    double discount=0;
    double dis=0;
    
    if(age<=16)
    {
        agegroup="Child";
        baseprice=150;
        System.out.println("BasePrice=150");
    }
    else if(age<=60)
    {
        agegroup="Adult";
        baseprice=250;
        System.out.println("BasePrice=250");
    }else
    {
        baseprice=200;
        System.out.println("BasePrice=200");
    }
    
    System.out.println("Enter the movie language(Hindi or English:)");
    String language=sc.nextLine();
    if(language.equals("Hindi"))
    {
    price=baseprice+50;
    System.out.println("Price="+price);
    }else 
    {
    price=baseprice+100;
    System.out.println("Price="+price);
    }
    
    System.out.println("Are you a student (yes/no):");
    String student=sc.nextLine();
    if(student.equals("yes"))
    {
     discount= (0.2* price);
     System.out.println("Student discount "+discount);
     }
     
    System.out.println("Is there any festival offer today (yes/no)");
    String festival=sc.nextLine();
    if(festival.equals("yes"))
    {
     dis=(0.15* price);
     System.out.println("Festival discount "+dis);
    }
    
    double TotalPrice= price - discount - dis;
    System.out.println("Your Total Price is "+TotalPrice);
    }
}