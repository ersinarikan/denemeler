package hazirlik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Opsiyon {
	private String renk;
	private String marka;
	private String model;
	private int saseNo;

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSaseNo() {
		return saseNo;
	}

	public void setSaseNo(int saseNo) {
		this.saseNo = saseNo;
	}

	public Opsiyon(String renk, String marka, String model, int saseNo) {
		super();
		this.renk = renk;
		this.marka = marka;
		this.model = model;
		this.saseNo = saseNo;
	}

	@Override
	public String toString() {
		return "renk=" + renk + ", marka=" + marka + ", model=" + model + ", saseNo=" + saseNo;

	}

}

class Arac extends Opsiyon {
	private String kullanim;
	private double fiyati;

	public String getKullanim() {
		return kullanim;
	}

	public void setKullanim(String kullanim) {
		this.kullanim = kullanim;
	}

	public double getFiyati() {
		return fiyati;
	}

	public void setFiyati(double fiyati) {
		this.fiyati = fiyati;
	}

	public Arac(String renk, String marka, String model, int saseNo, String kullanim, double fiyati) {
		super(renk, marka, model, saseNo);
		this.kullanim = kullanim;
		this.fiyati = fiyati;
	}

	@Override
	public String toString() {
		return super.toString() + "kullanim=" + kullanim + ", fiyati=" + fiyati;
	}

}

public class Auto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Arac> aracListesi = new ArrayList<>();
		int secim = 0;
		while (secim != 7) {
			System.out.println("1-Araç Girişi\n2-Listeleme\n3-Sase No ile Arama\n"
					+ "4-Kayıt Düzeltme\n5-Silme\n6-İstatistik\n7-Çıkış");
			System.out.print("LÜtfen Seçiminizi Yspınız: ");
			secim = scanner.nextInt();
			switch (secim) {
			case 1:
				aracEkle(scanner, aracListesi);
				break;
			case 2:
				aracListele(aracListesi);
				break;
			case 3:
				saseIleArama(scanner, aracListesi);
				break;
			case 4:
				kayitDuzeltme(scanner, aracListesi);
				break;
			case 5:
				kayitSilme(scanner, aracListesi);
				break;
			case 6:
				istatistikleriGoster(aracListesi);
				break;
			case 7:
				System.out.println("Programdan çıkılıyor...");
				break;
			default:
				System.out.println("Geçersiz seçim!");
				break;
			}

		}

	}

	private static void istatistikleriGoster(List<Arac> aracListesi) {

		if (aracListesi.isEmpty()) {
			System.out.println("İstatistik gösterilecek arac bulunmamaktadır.");
		} else {
			double toplamFiyat = 0;
			double enBuyukFiyat = 0;
			String enbuyukaracMarka ="";

			for (Arac arac : aracListesi) {
				double aracf = arac.getFiyati();
				toplamFiyat += aracf;

				if (arac.getFiyati() > enBuyukFiyat) {
					enBuyukFiyat=arac.getFiyati();
					enbuyukaracMarka=arac.getMarka();

				}
			}

			double fiyatortalamasi = (double) toplamFiyat / aracListesi.size();

			System.out.println("Fiyat Ortalaması: " + fiyatortalamasi);
			System.out.println("En Pahali arac: " + enBuyukFiyat+ enbuyukaracMarka );

		}

	}

	private static void kayitSilme(Scanner scanner, List<Arac> aracListesi) {

		System.out.print("Silinecek Sase Numarasini Girin: ");
		int silineceksaseNo = scanner.nextInt();

		Iterator<Arac> iterator = aracListesi.iterator();
		boolean bulundu = false;
		while (iterator.hasNext()) {
			Arac arac = iterator.next();
			if (arac.getSaseNo() == (silineceksaseNo)) {
				iterator.remove();
				System.out.println("Arac silindi.");
				bulundu = true;
				break;
			}
		}

		if (!bulundu) {
			System.out.println("Silinecek Arac bulunamadı.");
		}

	}

	private static void kayitDuzeltme(Scanner scanner, List<Arac> aracListesi) {

		System.out.print("Düzeltilecek aracin Sase Numarasi: ");
		int duzeltileceksaseNo = scanner.nextInt();

		boolean bulundu = false;
		for (Arac arac : aracListesi) {
			if (arac.getSaseNo() == (duzeltileceksaseNo)) {
				System.out.println("Yeni bilgileri girin:");
				System.out.print("Renk: ");
				String yeniRenk = scanner.next();
				if (yeniRenk != null)
					arac.setRenk(yeniRenk);

				System.out.print("Marka: ");
				String yeniMarka = scanner.nextLine();
				arac.setMarka(yeniMarka);

				System.out.print("Model: ");
				String yeniModel = scanner.nextLine();
				arac.setModel(yeniModel);

				System.out.print("Sase Numarasi: ");
				int yenisaseNo = scanner.nextInt();
				arac.setSaseNo(yenisaseNo);

				System.out.print("Kullanım: ");
				String yeniKullanim = scanner.nextLine();
				arac.setKullanim(yeniKullanim);

				System.out.print("Fiyati: ");
				double yeniFiyati = scanner.nextDouble();
				arac.setFiyati(yeniFiyati);

				System.out.println("Kayıt düzeltildi.");
				bulundu = true;
				break;
			}
		}

		if (!bulundu) {
			System.out.println("Düzeltilecek sase numaralı araç bulunamadı.");
		}

	}

	private static void saseIleArama(Scanner scanner, List<Arac> aracListesi) {
		System.out.print("Aranacak Sase Numarasini Girin: ");
		int AranansaseNo = scanner.nextInt();
		boolean bulundu = false;
		for (Arac arac : aracListesi) {
			if (arac.getSaseNo() == (AranansaseNo)) {
				System.out.println("Aranan kişi:\n" + arac);
				bulundu = true;
				break;
			}
		}

		if (!bulundu) {
			System.out.println("Aradığınız arac bulunamadı.");
		}

	}

	private static void aracEkle(Scanner scanner, List<Arac> aracListesi) {
		System.out.println("Aracin Özelliklerini Giriniz :");
		System.out.println("Aracin Rengi :");
		String renk = scanner.next();
		System.out.println("Aracin Markasi :");
		String marka = scanner.next();
		System.out.println("Aracin Modeli :");
		String model = scanner.next();
		System.out.println("Aracin Sase Numarasi :");
		int saseNo = scanner.nextInt();
		System.out.println("Kullanim :");
		String kullanim = scanner.next();
		System.out.println("Fiyati :");
		double fiyati = scanner.nextDouble();

		Arac yeniArac = new Arac(renk, marka, model, saseNo, kullanim, fiyati);
		aracListesi.add(yeniArac);

	}

	private static void aracListele(List<Arac> aracListesi) {

		if (aracListesi.isEmpty()) {
			System.out.println("Listelenecek araba bulunmamaktadır.");
		} else {
			for (Arac arac : aracListesi) {
				System.out.println(arac);
			}
		}

	}
}
