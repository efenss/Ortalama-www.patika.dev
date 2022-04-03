import java.util.Scanner;

public class Kdvhesaplama {
  
    public static void main(String[] args) {
        
        double fiyat, kdvoranı, kdvtutarı, kdvdahil ;
        
        Scanner kdvv = new Scanner(System.in) ;
        
        System.out.print("Ürün Fiyatını giriniz :");
        fiyat= kdvv.nextDouble() ;

        System.out.println("Kdv hariç fiyatı :"+fiyat);

        boolean kdvcarpanı = fiyat < 1000 ;

        System.out.print("Kdv oranı :%");
        double kdvdeger = kdvcarpanı ? 18 : 8 ;
        
        System.out.println(kdvdeger);

        kdvtutarı = kdvdeger/100 * fiyat ;
        System.out.println("Kdv tutarı :"+kdvtutarı);

        kdvdahil = kdvtutarı + fiyat ; 
        System.out.println("Kdv dahil fiyatı :"+kdvdahil);
        

    }
}