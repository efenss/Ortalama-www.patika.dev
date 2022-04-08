import java.util.Scanner;

import javafx.scene.media.EqualizerBand; 


public class kullanıcıgirişi {

    public static void main(String[] args) {
        
    String username, password ;

    Scanner inp = new Scanner(System.in) ;

    System.out.print("Kullanıcı adı :");
    
    username = inp.nextLine();
    
    System.out.print("Paralo :");
    
    password = inp.nextLine();

    if (username.equals("patika") && password.equals("java1234")) {

        System.out.println("Kullanıcı bilgileri doğru ");
    }  else {
        System.out.println("Kullanıcı adı ve paralonuzu kontrol ediniz!");
    }
















    }
}