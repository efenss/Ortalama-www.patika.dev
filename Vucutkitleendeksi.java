import java.util.Scanner;

public class Vucutkitleendeksi {

public static void main(String[] args) {
    
    double boy ;
    int kilo ;

    Scanner input = new Scanner(System.in) ;

    System.out.print("Kilonuzu giriniz :");
    kilo= input.nextInt() ;

    System.out.print("Boyunuzu giriniz :");
    boy= input.nextDouble() ;

    double endeks = kilo/(boy*boy) ;

    System.out.println("Vücut kitle endeksiniz :" +endeks);


}    
}