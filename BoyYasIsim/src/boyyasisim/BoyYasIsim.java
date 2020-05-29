/**
 * Bu Uygulama Kullanıcıdan Kişisel bir takım bilgileri isteyip
 * kullanıcının sağlamış olduğu bilgileri sonuç olarak ekrana yazdırır.
 */

package boyyasisim;

import java.util.Scanner;

/**
 *
 * @author melih
 */

public class BoyYasIsim {
    
    static String scannerString() {
        Scanner scanner = new Scanner(System.in); //Kullanıcının veri girmesini sağlayan kod satırı.
        return(scanner.nextLine());
    }
    
    static int scannerInt()  {
        Scanner scanner = new Scanner(System.in); //Kullanıcının veri girmesini sağlayan kod satırı.
        return(scanner.nextInt());
    }
    
    static double scannerDouble() {
        Scanner scanner = new Scanner(System.in); //Kullanıcının veri girmesini sağlayan kod satırı.
        return(scanner.nextDouble());
    }

    static void showKisi() {
        Kisisel kisi = new Kisisel(); //Kisiel adlı classtan kisi adlı nesneyi oluşturduğumuz kod satırı
        System.out.println("İsminiz Nedir ? "); // Kullanıcıdan isim aldığımız kod satırı
        kisi.setIsim(scannerString());
        System.out.println("Soy isminiz Nedir ? "); // Kullanıcıdan soy isim aldığımız kod satırı
        kisi.setSoyisim(scannerString());
        System.out.println("Kaç Yaşındasınız ? "); // Kulanıcıdan yas aldığımız kod satırı
        kisi.setYas(scannerInt());
        System.out.println("Kilonuz ne ? "); // Kullanıcıdan kilo aldığımız kod satırı
        kisi.setKilo(scannerDouble());
        System.out.println("İsminiz: " + kisi.getIsim() +",Soy isminiz: " + kisi.getSoyisim() +",Kilonuz: " + kisi.getKilo() + "kg ve " + kisi.getYas() + " yaşındasınız. "); // isim, soy isim, kilo ve yaşı ekrana yazdıran kod satırı
    }
    public static void main(String[] args) { 
        showKisi();
    }
}
