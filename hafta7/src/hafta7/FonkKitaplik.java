package hafta7;
import java.util.Scanner;

public class FonkKitaplik {

	public static void kitapEkle(Scanner scanner, String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi,
			int[] basimYili, int ks) {
		scanner.nextLine();
		System.out.print("Kitap ad� : ");
		kitapAdi[ks] = scanner.nextLine();
		System.out.print("Yazar ad� : ");
		yazarAdi[ks] = scanner.nextLine();
		System.out.print("Sayfa Say�s�");
		sayfaSayisi[ks] = scanner.nextInt();
		System.out.print("Bas�m y�l�");
		basimYili[ks] = scanner.nextInt();
	}

	public static void Listele(String kitapAdi, String yazarAdi, int sayfaSayisi, int basimYili) {
		System.out.println("Kitap ad�: " + kitapAdi);
		System.out.println("Yazar ad�: " + yazarAdi);
		System.out.println("Bas�m Y�l� : " + basimYili);
		System.out.println("Sayfa Say�s� : " + sayfaSayisi);
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
			System.out.println("Hi� kitap girilmemi�");
		}

	}

}
