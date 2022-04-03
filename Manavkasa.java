import java.util.Scanner;

public class Manavkasa {

public static void main(String[] args) {
    
    double elma, elmak=3.67,armut,armutk=2.14 ,domates,domatesk=1.11, muz,muzk=0.95, patlıcan,patlıcank=5 ;

    Scanner input= new Scanner(System.in);

    System.out.print("Elma kaç kilosu :");
    elma = input.nextDouble() ;
    double elmatotal = elma*elmak ; 

    System.out.println("Elmaya ödenecek fiyat :"+ elmatotal +" TL");

    System.out.print("Armut kaç kilosu :");
    armut = input.nextDouble() ;
    double armuttotal = armut*armutk ; 

    System.out.println("Armuta ödenecek fiyat :"+ armuttotal +" TL");


    System.out.print("Domates kaç kilosu :");
    domates = input.nextDouble() ;
    double domatestotal = domates*domatesk ; 

    System.out.println("Domatese ödenecek fiyat :"+ domatestotal +" TL");

    System.out.print("Muz kaç kilosu :");
    muz = input.nextDouble() ;
    double muztotal = muz*muzk ; 

    System.out.println("Muza ödenecek fiyat :"+ muztotal +" TL");

    System.out.print("Patlıcan kaç kilosu :");
    patlıcan = input.nextDouble() ;
    double patlıcantotal = patlıcan*patlıcank ; 

    System.out.println("Patlıcana ödenecek fiyat :"+ patlıcantotal +" TL");

    double total= domatestotal+armuttotal+muztotal+patlıcantotal+elmatotal ;
    System.out.println("Toplam ödenecek fiyat :"+ total +" TL");






    
    
    
    
    







}    
}