package Week4;
import java.util.Scanner;


/**
 * Write a description of class A4Dimensions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A4Dimensions
{
    public static void main(String[]arg)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter paper size(A0-A5)");
    String size=sc.nextLine();
    
    switch(size)
    {
    case"A0":System.out.println("Dimension= 841x1189 mm (33.1x46.8 inches)");
    break;
    case"A1":System.out.println("Dimension= 594x841 mm (23.4x33.1 inches)");
    break;
    case"A2":System.out.println("Dimension= 420x594mm (16.5x23.4 inches)");
    break;
    case"A3":System.out.println("Dimension= 297x420 mm (11.7x16.5inches)");
    break;
    case"A4":System.out.println("Dimension= 210x297 mm (8.3x11.7 inches)");
    break;
    case"A5":System.out.println("Dimension= 148x210 mm (5.8x8.3 inches)");
    break;
    default:
        System.out.println("Invalid Paper Size");
    }
    
    
    
    }
}