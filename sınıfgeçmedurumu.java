import java.util.Scanner; 

public class sınıfgeçmedurumu {

    public static void main(String[] args) {
        
    int matematik ,kimya ,türkçe ,fizik, biyoloji ;

    Scanner inp = new Scanner(System.in) ;

    System.out.print("Matematik notunuz :");
    matematik = inp.nextInt() ;
        
    System.out.print("Kimya notunuz :");
    kimya = inp.nextInt() ;

    System.out.print("Türkça notunuz :");
    türkçe = inp.nextInt() ;
    
    System.out.print("Fizik notunuz :");
    fizik = inp.nextInt() ;
        
    System.out.print("Biyoloji notunuz :");
    biyoloji = inp.nextInt() ;

    double ortalama = (matematik+kimya+türkçe+fizik+biyoloji) / 5 ;

    if (ortalama<=55) {
        System.out.println("Sınıf tekrarı");
    }else System.out.println("Sınıfı geçtiniz");

    System.out.println("ortalamanız :"+ortalama);
















    }
}