 * Ad Soyad: Beray Akar
 * Ogrenci No: 250541019
 * Tarih: 05.11.2025
 * Açıklama: Görev-3 Maaş Hesabı

    Bu program çalışan bilgilerini alıp maaş bordrosunu hesaplar.


   import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        // === Sabit oranlar ===
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        Scanner input = new Scanner(System.in);

        System.out.println("=== MAAS BORDROSU HESAPLAMA ===");

        // === Girdi Alma ===
        System.out.print("Calişan Adı Soyadı: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylık Brüt Maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalık Çalışma Saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai Saati Sayısı: ");
        int mesaiSaat = input.nextInt();

        // === Hesaplamalar ===
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        // === İstatistikler ===
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176; // 22 gün * 8 saat
        double gunlukNetKazanc = netMaas / 22;

        // === Çıktı ===
        System.out.println("\n====================================");
        System.out.println("             MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %-20s%n", adSoyad);
        System.out.println("\nGELIRLER:");
        System.out.printf("Brüt Maaş               : %10.2f TL%n", brutMaas);
        System.out.printf("Mesai Ücreti (%d saat)  : %10.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------------------");
        System.out.printf("TOPLAM GELIR            : %10.2f TL%n", toplamGelir);

        System.out.println("\nKESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%)     : %10.2f TL%n", SGK_ORANI * 100, sgkKesinti);
        System.out.printf("Gelir Vergisi (%.1f%%)     : %10.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%)     : %10.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------------------");
        System.out.printf("TOPLAM KESINTI          : %10.2f TL%n", toplamKesinti);
        System.out.printf("NET MAAS                : %10.2f TL%n", netMaas);

        System.out.println("\nISTATISTIKLER:");
        System.out.printf("Kesinti Oranı           : %5.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç      : %10.2f TL%n", saatlikNetKazanc);
        System.out.printf("Günlük Net Kazanç       : %10.2f TL%n", gunlukNetKazanc);
        System.out.println("====================================");
       
        input.close();
    }
}
