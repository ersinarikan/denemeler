package hafta7;

import java.util.Scanner;

public class Kitaplik {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç kitap girilecek");
		int uzunluk = scanner.nextInt();
		String kitapAdi[] = new String[uzunluk];
		String yazarAdi[] = new String[uzunluk];
		int sayfaSayisi[] = new int[uzunluk];
		int basimYili[] = new int[uzunluk];
		int ks = 0;
		int secim = 0;
		do {
			System.out.println("1-Kayıt girişi\n2-Listeleme\n3-Yazar Adı arama\n4-En Yeni Kitaplar");
			System.out.println("5-Toplam Kitap Sayısı\n6-Sayfa Sayısı ortalaması\n7-Basım yılı ortalaması");
			System.out.println("8-Aranan yazarın en çok sayfalı kitabı nedir.\n9-çıkış");

			secim = scanner.nextInt();
			switch (secim) {
			case 1:
				if (ks < uzunluk) {
					FonkKitaplik.kitapEkle(scanner, kitapAdi, yazarAdi, sayfaSayisi, basimYili, ks);
					ks++;

				} else {
					System.out.println("Dizi dolu, yeni kitap kaydı girilmez.");
				}
				break;
			case 2:
				for (int i = 0; i < ks; i++)
					FonkKitaplik.Listele(kitapAdi[i], yazarAdi[i], sayfaSayisi[i], basimYili[i]);
				break;
			case 3:
				System.out.print("Hangi Yazarın Kitapları : ");
				String arananYazar = scanner.next();
				System.out.println("aranan yazar : " + arananYazar);
				FonkKitaplik.YazarArama(kitapAdi, yazarAdi, sayfaSayisi, basimYili, arananYazar);
				break;
			case 4:
				FonkKitaplik.EnYeniKitaplar(kitapAdi, yazarAdi, sayfaSayisi, basimYili);
				break;
			case 5:
				System.out.println("Kütüphanedeki toplam kitap sayısı : " + ks);
				break;
			case 6:
				FonkKitaplik.sayfaSayisiOrtalamasi(sayfaSayisi,ks);
				break;
			case 7:
				FonkKitaplik.basimYiliORtalamasi(basimYili,ks);
				break;
			case 8:
				System.out.println("Aranan yazarı giriniz : ");
				String arananYazar8= scanner.next();
				FonkKitaplik.ecsKitap(yazarAdi, sayfaSayisi, arananYazar8 );
				
				break;
				
			case 9:
				System.out.println("Program bitti");
				System.exit(0);
			default:
				System.out.println("Yanlış menü değeri");
			}
		} while (secim != 10);
	}
}
