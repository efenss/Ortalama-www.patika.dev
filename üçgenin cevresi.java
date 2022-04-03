import java.util.Scanner;

public class hipotenüs {

    public static void main(String[] args) {
        
        int a , b, c, alan;
        double u, alann;

        Scanner input = new Scanner (System.in) ;

        System.out.print("a değerini giriniz :");
        a = input.nextInt() ;

        System.out.print("b değerini giriniz :");
        b = input.nextInt() ;

        System.out.print("c değerini giriniz :");
        c = input.nextInt() ;
        
        u = (a+b+c)/2 ;

        System.out.println("ücgenin çevresi :"+ 2*u);

        alan = a*b / 2 ;

        System.out.println("ücgenin alanı :"+ alan);

        alann= u * (u-a)* (u-b)* (u-c) ; 

        System.out.println("alann :"+ alann);


















    }
}