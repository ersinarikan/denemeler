package hafta8;

import java.util.List;
import java.util.Scanner;

public class Fonksiyon {

	public static void KayitEkle(Scanner scanner, List<String> adListesi, List<Byte> vizeListesi,
			List<Byte> finalListesi) {
		scanner.nextLine();
		System.out.println("isim giriniz : ");
		adListesi.add(scanner.next());
		System.out.println("Vize Notu gir");
		vizeListesi.add(scanner.nextByte());
		System.out.println("Final Notu gir");
		finalListesi.add(scanner.nextByte());
		System.out.println(adListesi.get(adListesi.size() - 1) + " Kaydını  girdiniz");
	}

	public static void Listele(List<String> adListesi, List<Byte> vizeListesi, List<Byte> finalListesi) {
		for (int i = 0; i < adListesi.size(); i++) {
			yazdir(adListesi.get(i), vizeListesi.get(i), finalListesi.get(i));
		}

	}

	private static void yazdir(String ad, Byte vn, Byte fn) {
		System.out.println("isminiz : " + ad);
		System.out.println("Vize notunuz : " + vn);
		System.out.println("Final notunuz : " + fn);
		System.out.println("Başarı notunuz : " + (vn * .4 + fn * .6));
		System.out.println("------------------------------------");
	}

	public static void Arama(Scanner scanner, List<String> adListesi, List<Byte> vizeListesi, List<Byte> finalListesi) {
		scanner.nextLine();
		System.out.println("Aranacak ismi giriniz");
		String arananAd = scanner.next();
		for (int i = 0; i < adListesi.size(); i++) {
			if (arananAd.equalsIgnoreCase(adListesi.get(i)))
				yazdir(adListesi.get(i), vizeListesi.get(i), finalListesi.get(i));
		}
	}

	public static void Duzeltme(Scanner scanner, List<String> adListesi, List<Byte> vizeListesi,
			List<Byte> finalListesi) {
		scanner.nextLine();
		System.out.println("Duzeltilecek ismi giriniz");
		String duzeltilecekAd = scanner.next();
		for (int i = 0; i < adListesi.size(); i++) {
			if (duzeltilecekAd.equalsIgnoreCase(adListesi.get(i))) {
				System.out.println("Yeni Vize Notu Gir");
				byte yeniVizeNotu=scanner.nextByte();
				System.out.println("Yeni Final Notu Gir");
				byte yeniFinalNotu=scanner.nextByte();
				vizeListesi.set(i, yeniVizeNotu);
				finalListesi.set(i, yeniFinalNotu);
			}
		}

	}

	public static void Silme(Scanner scanner, List<String> adListesi, List<Byte> vizeListesi, List<Byte> finalListesi) {
		scanner.nextLine();
		System.out.println("Silinecek ismi giriniz");
		String silinecekAd = scanner.next();
		for (int i = 0; i < adListesi.size(); i++) {
			if (silinecekAd.equalsIgnoreCase(adListesi.get(i))) {
				adListesi.remove(i);
				vizeListesi.remove(i);
				finalListesi.remove(i);
			}
		}
		
	}

	public static byte Ortalama(List<Byte> sayiListesi) {
		int toplam=0;
		for (Byte sayi : sayiListesi) {
			toplam+=sayi;
		}
		return (byte) (toplam/sayiListesi.size());
	}

}
