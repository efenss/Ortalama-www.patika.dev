import java.util.Scanner; 


public class hesapmakinesi {

   public static void main(String[] args) {
      
      int m1, m2, select ;

      Scanner input = new Scanner(System.in) ;

      System.out.print("Sayı giriniz :");

      m1 = input.nextInt() ;
      
      System.out.print("Sayı giriniz :");

      m2 = input.nextInt() ;

      System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

      System.out.print("işlemlerden birini seçiniz :");

      select = input.nextInt() ;

      switch (select) {
         case 1:
            System.out.println("Toplam :"+ (m1+m2));          
            break;
            
         case 2:
         System.out.println("Çıkarma :"+ (m1-m2));
            break;

         case 3:
         System.out.println("Çarpma :"+ (m1*m2));
            break;

         case 4:
         if (m2!=0) {   System.out.println("Bölme :"+ (m1/m2)); ;
      }
         else {System.out.println("Herhangi bir sayı sıfıra bölünemez! ");
      }
            break;

         default:
         System.out.println("Girdiğiniz değerleri kontrol ediniz\n 4 işlemden birini seçiniz");
            break;
      }
      

   }
}