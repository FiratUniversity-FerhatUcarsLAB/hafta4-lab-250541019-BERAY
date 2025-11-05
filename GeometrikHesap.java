 * Ad Soyad: Beray Akar
 * Ogrenci No: 250541019
 * Tarih: 05.11.2025
 * Açıklama: Görev-2 Geometrih Hesaplama
 * Bu kod yarıcapı 5 cm olan bir dairenin alanı, çevresi, çapını ve yarıçapı 5 cm olan bir kürenin hacmi ve yüzey alanını hesaplar.

   import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        // Sabit PI değeri
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);

        System.out.println("=== Geometri Hesaplama ===");
        System.out.print("Dairenin yarıçapını girin (cm): ");
        double r = input.nextDouble();

        // Hesaplamalar
        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * r * r;

        // Sonuçları yazdır
        System.out.println("\n=== SONUÇLAR ===");
        System.out.printf("Daire Alanı        : %.2f cm²%n", daireAlani);
        System.out.printf("Daire Çevresi      : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Çapı         : %.2f cm%n", daireCapi);
        System.out.printf("Küre Hacmi         : %.2f cm³%n", kureHacmi);
        System.out.printf("Küre Yüzey Alanı   : %.2f cm²%n", kureYuzeyAlani);

        input.close();
    }
}

