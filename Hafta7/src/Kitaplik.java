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
			System.out.println("1-Kayýt giriþi\n2-Listeleme\n3-Yazar Adý arama\n4-En Yeni Kitaplar");
			System.out.println("5-Toplam Kitap Sayýsý\n6-Sayfa Sayýsý ortalamasý\n7-Basým yýlý ortalamasý");
			System.out.println("8-aranan yazarýn en çok sayfalý kitabý nedir.\n9-Çýkýþ");

			secim = scanner.nextInt();
			switch (secim) {
			case 1:
				if (ks < uzunluk) {
					FonkKitaplik.kitapEkle(scanner, kitapAdi, yazarAdi, sayfaSayisi, basimYili, ks);
					ks++;

				} else {
					System.out.println("Dizi dolu, yeni kitap kaydý girilmez.");
				}
				break;
			case 2:
				for (int i = 0; i < ks; i++)
					FonkKitaplik.Listele(kitapAdi[i], yazarAdi[i], sayfaSayisi[i], basimYili[i]);
				break;
			case 3:
				System.out.print("Hangi Yazarýn Kitaplarý : ");
				String aY = scanner.next();
				System.out.println("aranan yazar : " + aY);
				FonkKitaplik.YazarArama(kitapAdi, yazarAdi, sayfaSayisi, basimYili, aY);
				break;
			case 4:
				FonkKitaplik.EnYeniKitaplar(kitapAdi, yazarAdi, sayfaSayisi, basimYili);
				break;
			case 5:
				System.out.println("Kütüphanedeki toplam kitap sayýsý : " + ks);
				break;
			case 9:
				System.out.println("Program bitti");
				System.exit(0);
			default:
				System.out.println("Yanlýþ menü deðeri");
			}
		} while (secim != 10);
	}
}
