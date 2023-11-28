import java.util.Scanner;

public class FonkKitaplik {

	public static void kitapEkle(Scanner scanner, String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi,
			int[] basimYili, int ks) {
		scanner.nextLine();
		System.out.print("Kitap adý : ");
		kitapAdi[ks] = scanner.nextLine();
		System.out.print("Yazar adý : ");
		yazarAdi[ks] = scanner.nextLine();
		System.out.print("Sayfa Sayýsý");
		sayfaSayisi[ks] = scanner.nextInt();
		System.out.print("Basým yýlý");
		basimYili[ks] = scanner.nextInt();
	}

	public static void Listele(String kitapAdi, String yazarAdi, int sayfaSayisi, int basimYili) {
		System.out.println("Kitap adý: " + kitapAdi);
		System.out.println("Yazar adý: " + yazarAdi);
		System.out.println("Basým Yýlý : " + basimYili);
		System.out.println("Sayfa Sayýsý : " + sayfaSayisi);
		System.out.println("---------------------------------");
	}

	public static void YazarArama(String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi, int[] basimYili,
			String arananYazar) {
		for (int i = 0; i < basimYili.length; i++) {
			if (yazarAdi[i].equalsIgnoreCase(arananYazar))
				Listele(kitapAdi[i], yazarAdi[i], sayfaSayisi[i], basimYili[i]);
		}

	}

	public static void EnYeniKitaplar(String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi, int[] basimYili) {
		if (kitapAdi.length > 0) {
			int enbBasimYili = basimYili[0];
			int yilindex = 0;
			for (int i = 0; i < basimYili.length; i++) {
				if (basimYili[i] > enbBasimYili) {
					enbBasimYili = basimYili[i];
					yilindex = i;
					System.out.println("indis "+yilindex);
				}
			}
			Listele(kitapAdi[yilindex], yazarAdi[yilindex], sayfaSayisi[yilindex], basimYili[yilindex]);
		} else {
			System.out.println("Hiç kitap girilmemiþ");
		}

	}

}
