/**
 * Bu Uygulama Kullanıcıdan Kişisel bir takım bilgileri isteyip
 * kullanıcının sağlamış olduğu bilgileri sonuç olarak ekrana yazdırır.
 */

package boyyasisim;

/**
 *
 * @author melih
 */

public class Kisisel{
    private String isim; //isim başka classta değiştirilemesin diye private yaptık.
    private int yas; //yas başka classta değiştirilemesin diye private yaptık.
    private double kilo; //kilo başka classta değiştirilemesin diye private yaptık.
    private String soyisim; //soyisim başka classta değiştirilemesin diye private yaptık.

    public int getYas() { //getter metodu.
        return yas; // yas değerini döndüren kod satırı
    }
    public void setYas(int yas) { //setter metodu.
        this.yas = yas; //girilen yaşı yas'a atayan kod satırı
    }

    public String getIsim() { //getter metodu
        return isim; //isim değerini döndüren kod satırı 
    }

    public void setIsim(String isim) { // setter metodu
        this.isim = isim; //girilen ismi isme atayan kod satırı
    }
    
    public String getSoyisim() { //getter metodu
        return soyisim; //soy isim değerini döndüren kod satırı 
    }

    public void setSoyisim(String soyisim) { // setter metodu
        this.soyisim = soyisim; //girilen soy ismi soy isme atayan kod satırı
    }

    public double getKilo() { // getter metodu
        return kilo; // kilo değerini döndüren kod satırı
    }

    public void setKilo(double kilo) { // setter metodu
        this.kilo = kilo; // girilen kiloyu kiloya atayan kod satırı
    }
}

