import java.util.Scanner;

public class daireninalanı {

    public static void main(String[] args) {
        
    int r, a ; 
    double pi=3.14 ;
    Scanner input= new Scanner(System.in) ;

    System.out.print("Yarı çapını giriniz :");
    r= input.nextInt() ;
    System.out.print("Merkez açısını giriniz :");
    a= input.nextInt() ;
    
    double alan = (pi*(r*r)*a)/360  ;

    System.out.println("Dairenin alanaı :"+alan);


    }
}
