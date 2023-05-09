package Java.Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // Girilen bir ad soyadı örneğin "Berkay Gün" B.G.  şeklinde yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve soyadınız=");
        String adSoyad=oku.nextLine(); // adSoyad veri olarak alındı

        // Berkay Gün -> B.G.  -> B -> charAt(0) B.
        // indexOf(" ")-> boşluğun indexini veriyor, bunun 1 fazlası charAt() -> G yi verir
        char ilkHarf=adSoyad.charAt(0); // I
        int boslukIndex=adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1); // T

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");

        // char soyadIlkHarf= adSoyad.charAt(adSoyad.indexOf(" ")+1);
    }
}
