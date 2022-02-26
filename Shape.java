package J2T1;
import java.awt.*;
import java.util.Scanner;
public class Shape {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String shekl=sc.nextLine() ;
        float Length = sc.nextFloat() ;
        float Width = sc.nextFloat() ;
        float mohit = Length+Length+Width+Width ;
        System.out.println("P = " + mohit);
        switch (shekl) {
            case "square" :
                System.out.println("S = " + Length*Width) ;
                break ;
            case "rectangle" :
                System.out.println("S = " + Length*Width);
                break ;
        }


    }
}
