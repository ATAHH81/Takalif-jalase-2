import java.util.Scanner;
public class Equation {
    public static void main(String[]args) {
// gereftane maqadir
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vared Konid : a : ");
        float a = scanner.nextFloat();
        System.out.println("Vared Konid : b : ");
        float b = scanner.nextFloat();
        System.out.println("Vared Konid : c : ");
        float c = scanner.nextFloat();
        System.out.println("Vared Konid : d : ");
        float d = scanner.nextFloat();
        System.out.println("Vared Konid : e : ");
        float e = scanner.nextFloat();
        System.out.println("Vared Konid : f : ");
        float f = scanner.nextFloat();

        float x = ( e * d - b * f ) / ( a * d - b * c );
        float y = ( a * f - e * c ) / ( a * d - b * c );

        if ( a * d - b * c == 0 ) {
            System.out.println("Bedune Pasokh");
        } else {
            System.out.println("x is : " + x);
            System.out.println("y is : " + y);
        }

    }

}
