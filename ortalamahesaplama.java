import java.util.Scanner;

public class patika {

public static void main(String[] args) {
  //değişkenleri oluştur
  int matematik, kimya, muzik ;

  //scanner sınıfımızı tanımladık
  Scanner inp = new Scanner(System.in) ;

  //kullanıcı değerleri alıyoruz
  System.out.println("matematik notumuz :");
  matematik= inp.nextInt() ; 
  System.out.println("kimya notunuz :");
  kimya= inp.nextInt() ;
  System.out.println("müzik notunu giriniz");
  muzik= inp.nextInt() ;

  int toplam= (matematik+kimya+muzik) ;
  double ortalama= (toplam/3.0) ;
  System.out.println("ortalamanız :" + ortalama);

  boolean sonuc = ortalama>55 ;

  String mezun= sonuc ? "Geçtiniz Tebrikler" : "Kaldınız" ;

  System.out.println(mezun);


}  
}
