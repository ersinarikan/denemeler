package hafta7;

import java.util.Scanner;

public class FonkKitaplik {

	public static void kitapEkle(Scanner scanner, String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi,
			int[] basimYili, int ks) {
		scanner.nextLine();
		System.out.print("Kitap adı : ");
		kitapAdi[ks] = scanner.nextLine();
		System.out.print("Yazar adı : ");
		yazarAdi[ks] = scanner.nextLine();
		System.out.print("Sayfa Sayısı");
		sayfaSayisi[ks] = scanner.nextInt();
		System.out.print("Basım yılı");
		basimYili[ks] = scanner.nextInt();
	}

	public static void Listele(String kitapAdi, String yazarAdi, int sayfaSayisi, int basimYili) {
		System.out.println("Kitap adı: " + kitapAdi);
		System.out.println("Yazar adı: " + yazarAdi);
		System.out.println("Basım Yılı : " + basimYili);
		System.out.println("Sayfa Sayısı : " + sayfaSayisi);
		System.out.println("---------------------------------");
	}

	public static void YazarArama(String[] kitapAdi, String[] yazarAdi, int[] sayfaSayisi, int[] basimYili,
			String arananYazar) {
		for (int i = 0; i < basimYili.length; i++) {
			// for (int i = 0; i < 3; i++) {
			if (yazarAdi[i].equalsIgnoreCase(arananYazar)) {
				// System.out.printf("yazaradı\n " +yazarAdi[i], "aranan yazar\n "+arananYazar);
				// if (yazarAdi[i]==arananYazar) {
				Listele(kitapAdi[i], yazarAdi[i], sayfaSayisi[i], basimYili[i]);
			}
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
					// System.out.println("indis "+yilindex);
				}
			}
			Listele(kitapAdi[yilindex], yazarAdi[yilindex], sayfaSayisi[yilindex], basimYili[yilindex]);
		} else {
			System.out.println("Hiç kitap girilmemiş");
		}

	}

	public static void sayfaSayisiOrtalamasi(int[] sayfaSayisi, int ks) {
		int toplam = 0;
		for (int i = 0; i < ks; i++) {
			toplam = toplam + sayfaSayisi[i];
		}
		System.out.println("Kütüpanedeki kitapların toplam sayfa sayısı ortalaması: " + toplam / ks);
	}

	public static void basimYiliORtalamasi(int[] basimYili, int ks) {
		int toplam = 0;
		for (int i = 0; i < ks; i++) {
			toplam = toplam + basimYili[i];
		}
		System.out.println("Kütüpanedeki kitapların basım yılı ortalaması: " + toplam / ks);

	}

/* public static void ecsKitap(String[] yazarAdi, int[] sayfaSayisi, String arananYazar8) {
		
		int ecss=sayfaSayisi[0] // int ecss = 0; 
		for (int j = 0; j < sayfaSayisi.length; j++) {

			if (yazarAdi[j].equalsIgnoreCase(arananYazar8)) {
				if (sayfaSayisi[j] > ecss) {
					ecss = sayfaSayisi[j];
				}
			}else System.out.println("Böyle bir yazar bulamadık"); //break de çalışıyor ama mesaj çıkmıyor HOCAYA Sor.
			
		}
		System.out.println("yazar " + arananYazar8 + "'ın yazdığı en çok sayfali kitap :" + ecss + " sayfadır");
	}
*/	
	public static void ecsKitap(String[] yazarAdi, int[] sayfaSayisi, String arananYazar8) {
		int ecss = 0;
		for (int j = 0; j < sayfaSayisi.length; j++) {
			if (yazarAdi[j].equalsIgnoreCase(arananYazar8) && (sayfaSayisi[j] > ecss)) {
				ecss = sayfaSayisi[j];
			}
		}
		if (ecss > 0) {
			System.out.println("Yazar " + arananYazar8 + "'ın yazdığı en kalın kitap " + ecss + " sayfadır");
		} else {
			System.out.println("Böyle bir yazar bulamadık");
			System.out.println("Sadece Aşağıdaki yazar isimlerini kullanabilirsin");
			for (int i = 0; i < sayfaSayisi.length; i++) {
			System.out.println(yazarAdi[i]);	
				
			}
		}
	}

}