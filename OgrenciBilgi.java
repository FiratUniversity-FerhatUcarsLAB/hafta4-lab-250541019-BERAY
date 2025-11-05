
 * Ad Soyad: Beray Akar
 * Ogrenci No: 250541019
 * Tarih: 05.11.2025
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve duzenli bir formatta ekrana yazdirir.
 

import java.util.Scanner;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Ogrenci Bilgi Sistemi ===");

        System.out.println("Adinizi Girin: ");
        String ad = input.nextLine();

        System.out.println("Soyadinizi Girin: ");
        String soyad = input.nextLine();

        System.out.println("Yasiniz: ");
        int yas = input.nextInt();

        System.out.println("Ogrenci Numaraniz: ");
        int OgrNo = input.nextInt();

        System.out.printf(soyad, args)("GPA (0.00 - 4.00): ");
        double GPA = input.nextDouble();

        System.out.println("\n=== Ogrenci Bilgileri ===");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Yas: " + yas);
        System.out.println("Ogrenci No: " + OgrNo);
        System.out.printf("GPA: %.2f%n", GPA);

        input.close();
    }
}

