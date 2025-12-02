package Week4;
import java.util.Scanner;


/**
 * Write a description of class Tax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tax
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the salary");
    long sal=sc.nextInt();
    double Tax; 
    if(sal<=500000)
    {
    Tax=0.01*sal;
    System.out.println("The tax amount= "+Tax);
    }
    else if(sal<=700000)
    {
    Tax=5000+(0.1*sal);
    System.out.println("The tax amount= "+Tax);
    }
    else if(sal<=1000000)
    {
    Tax=15000+(0.2*sal);
    System.out.println("The tax amount= "+Tax);
    }
    else if(sal<=2000000)
    {
    Tax=35000+(0.3*sal);
    System.out.println("The tax amount= "+Tax);
    }
    else if(sal<=5000000)
    {
    Tax=335000+(0.36*sal);
    System.out.println("The tax amount= "+Tax);
}
else 
{
Tax=1135000+(0.39*sal);
    System.out.println("The tax amount= "+Tax);
}
    }
}