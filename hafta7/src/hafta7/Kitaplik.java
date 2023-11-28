package hafta7;

import java.util.Scanner;

public class Kitaplik {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ka� kitap girilecek");
		int uzunluk = scanner.nextInt();
		String kitapAdi[] = new String[uzunluk];
		String yazarAdi[] = new String[uzunluk];
		int sayfaSayisi[] = new int[uzunluk];
		int basimYili[] = new int[uzunluk];
		int ks = 0;
		int secim = 0;
		do {
			System.out.println("1-Kay�t giri�i\n2-Listeleme\n3-Yazar Ad� arama\n4-En Yeni Kitaplar");
			System.out.println("5-Toplam Kitap Say�s�\n6-Sayfa Say�s� ortalamas�\n7-Bas�m y�l� ortalamas�");
			System.out.println("8-aranan yazar�n en �ok sayfal� kitab� nedir.\n9-��k��");

			secim = scanner.nextInt();
			switch (secim) {
			case 1:
				if (ks < uzunluk) {
					FonkKitaplik.kitapEkle(scanner, kitapAdi, yazarAdi, sayfaSayisi, basimYili, ks);
					ks++;

				} else {
					System.out.println("Dizi dolu, yeni kitap kayd� girilmez.");
				}
				break;
			case 2:
				for (int i = 0; i < ks; i++)
					FonkKitaplik.Listele(kitapAdi[i], yazarAdi[i], sayfaSayisi[i], basimYili[i]);
				break;
			case 3:
				System.out.print("Hangi Yazar�n Kitaplar� : ");
				String aY = scanner.next();
				System.out.println("aranan yazar : " + aY);
				FonkKitaplik.YazarArama(kitapAdi, yazarAdi, sayfaSayisi, basimYili, aY);
				break;
			case 4:
				FonkKitaplik.EnYeniKitaplar(kitapAdi, yazarAdi, sayfaSayisi, basimYili);
				break;
			case 5:
				System.out.println("K�t�phanedeki toplam kitap say�s� : " + ks);
				break;
			case 9:
				System.out.println("Program bitti");
				System.exit(0);
			default:
				System.out.println("Yanl�� men� de�eri");
			}
		} while (secim != 10);
	}
}
