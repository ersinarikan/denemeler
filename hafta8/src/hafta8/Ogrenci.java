package hafta8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ogrenci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> adListesi = new ArrayList<>();
		List<Byte> vizeListesi = new ArrayList<>();
		List<Byte> finalListesi = new ArrayList<>();
		int secim = 0;
		do {
			System.out.println("1-Kay�t giri�i\n2-Listeleme\n3-�sim arama\n4-Kay�t d�zelt\n5-Kay�t Sil\n6-��k��");
			secim = scanner.nextInt();
			switch (secim) {
			case 1:
				Fonksiyon.KayitEkle(scanner, adListesi, vizeListesi, finalListesi);
				break;
			case 2:
				Fonksiyon.Listele(adListesi, vizeListesi, finalListesi);
				break;
			case 3:
				Fonksiyon.Arama(scanner, adListesi, vizeListesi, finalListesi);
				break;
			case 4:
				Fonksiyon.Duzeltme(scanner, adListesi, vizeListesi, finalListesi);
				break;
			case 5:
				Fonksiyon.Silme(scanner, adListesi, vizeListesi, finalListesi);
				break;
			case 6:
				byte vizeOrt = Fonksiyon.Ortalama(vizeListesi);
				System.out.println("Vize Not ortalamas� : " + vizeOrt);
				System.out.println("Final Not ortalamas� : " + Fonksiyon.Ortalama(finalListesi));
			case 7:
				System.out.println("Program bitti");
				System.exit(0);
				break;

			default:
				System.out.println("Yanl�� men� de�eri");
				break;
			}
		} while (secim != 7);

	}
}
