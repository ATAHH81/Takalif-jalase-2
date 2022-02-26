import java.awt.*;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] score = new float[10] ;
        int [] zarib = new int[10] ;
        float total = 0 ;
        int totalzarib = 0 ;
        int a , i , b ;
        System.out.println("Tedad e nomarat ra vared konid.");
        a = sc.nextInt() ;
        for ( i=0 ; i < a ; i++ ) {
            System.out.println("Nomre ra vared konid.");
            score[i] = sc.nextFloat() ;
            System.out.println("Zarib ra vared konid");
            zarib[i] = sc.nextInt() ;
            total = total + score[i]*zarib[i] ;
            totalzarib = totalzarib + zarib[i] ;
        }
        float avg = total/totalzarib ;
        System.out.println("Moaddel : " + avg);
    }

}
