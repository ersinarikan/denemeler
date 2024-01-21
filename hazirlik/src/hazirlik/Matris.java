package hazirlik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Kisi {
	private String ad;
	private String soyad;
	private int yas;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	public Kisi(String ad, String soyad, int yas) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "ad=" + ad + ", soyad=" + soyad + ", yas=" + yas;

	}

}

class Calisan extends Kisi  {
	private String gorev;
	private double maas;

	public String getGorev() {
		return gorev;
	}

	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

	public double getMaas() {
		return maas;
	}

	public void setMaas(double maas) {
		this.maas = maas;
	}

	public Calisan(String ad, String soyad, int yas, String gorev, double maas) {
		super(ad, soyad, yas);
		this.gorev = gorev;
		this.maas = maas;
	}

	@Override
	public String toString() {
		return super.toString() + " gorev= " + gorev + ", maas= " + maas;
	}

}

public class Matris {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Calisan> calisanListesi = new ArrayList<>();

		int secim = 0;
		while (secim != 7) {
			System.out.println("1-Kayıt Girişi\n2-Listeleme\n3-Ad ile Arama\n"
					+ "4-Kayıt Düzeltme\n5-Silme\n6-İstatistik\n7-Çıkış");
			System.out.print("Seçiminiz: ");
			secim = scanner.nextInt();

			switch (secim) {
			case 1:
				calisanEkle(scanner, calisanListesi);
				break;
			case 2:
				calisanlariListele(calisanListesi);
				break;
			case 3:
				adIleArama(scanner, calisanListesi);
				break;
			case 4:
				kayitDuzeltme(scanner, calisanListesi);
				break;
			case 5:
				kayitSilme(scanner, calisanListesi);
				break;
			case 6:
				istatistikleriGoster(calisanListesi);
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

	private static void istatistikleriGoster(List<Calisan> calisanListesi) {
		if (calisanListesi.isEmpty()) {
			System.out.println("İstatistik gösterilecek çalışan bulunmamaktadır.");
		} else {
			int toplamYas = 0;
			int enBuyukYas = Integer.MIN_VALUE;
			Calisan enBuyukYasaSahipKisi = null;

			for (Calisan calisan : calisanListesi) {
				int yas = calisan.getYas();
				toplamYas += yas;

				if (yas > enBuyukYas) {
					enBuyukYas = yas;
					enBuyukYasaSahipKisi = calisan;
				}
			}

			double yasOrtalamasi = (double) toplamYas / calisanListesi.size();

			System.out.println("Yaş Ortalaması: " + yasOrtalamasi);
			System.out.println("En Büyük Yaş: " + enBuyukYas);
			if (enBuyukYasaSahipKisi != null) {
				System.out.println("En Büyük Yaşa Sahip Kişi: " + enBuyukYasaSahipKisi);
			}
		}
	}

	private static void kayitSilme(Scanner scanner, List<Calisan> calisanListesi) {
		System.out.print("Silinecek kişinin adı: ");
		String silinecekAd = scanner.next();

		Iterator<Calisan> iterator = calisanListesi.iterator();
		boolean bulundu = false;
		while (iterator.hasNext()) {
			Calisan calisan = iterator.next();
			if (calisan.getAd().equalsIgnoreCase(silinecekAd)) {
				iterator.remove();
				System.out.println("Kişi silindi.");
				bulundu = true;
				break;
			}
		}

		if (!bulundu) {
			System.out.println("Silinecek kişi bulunamadı.");
		}
	}

	private static void kayitDuzeltme(Scanner scanner, List<Calisan> calisanListesi) {
		System.out.print("Düzeltilecek kişinin adı: ");
		String duzeltilecekAd = scanner.next();

		boolean bulundu = false;
		for (Calisan calisan : calisanListesi) {
			if (calisan.getAd().equalsIgnoreCase(duzeltilecekAd)) {
				System.out.println("Yeni bilgileri girin:");

				System.out.print("Ad: ");
				String yeniAd = scanner.next();
				if (yeniAd != null)
					calisan.setAd(yeniAd);

				System.out.print("Soyad: ");
				String yeniSoyad = scanner.next();
				calisan.setSoyad(yeniSoyad);

				System.out.print("Yaş: ");
				int yeniYas = scanner.nextInt();
				calisan.setYas(yeniYas);

				System.out.print("Görev: ");
				String yeniGorev = scanner.next();
				calisan.setGorev(yeniGorev);

				System.out.print("Maaş: ");
				double yeniMaas = scanner.nextDouble();
				calisan.setMaas(yeniMaas);

				System.out.println("Kayıt düzeltildi.");
				bulundu = true;
				break;
			}
		}

		if (!bulundu) {
			System.out.println("Düzeltilecek kişi bulunamadı.");
		}
	}

	private static void adIleArama(Scanner scanner, List<Calisan> calisanListesi) {
		System.out.print("Aranacak kişinin adı: ");
		String arananAd = scanner.next();

		boolean bulundu = false;
		for (Calisan calisan : calisanListesi) {
			if (calisan.getAd().equalsIgnoreCase(arananAd)) {
				System.out.println("Aranan kişi:\n" + calisan);
				bulundu = true;
				break;
			}
		}

		if (!bulundu) {
			System.out.println("Aradığınız isimde çalışan bulunamadı.");
		}
	}

	private static void calisanlariListele(List<Calisan> calisanListesi) {
		if (calisanListesi.isEmpty()) {
			System.out.println("Listelenecek çalışan bulunmamaktadır.");
		} else {
			for (Calisan calisan : calisanListesi) {
				System.out.println(calisan);
			}
		}
	}

	private static void calisanEkle(Scanner scanner, List<Calisan> calisanListesi) {
		System.out.print("Ad: ");
		String ad = scanner.next();
		System.out.print("Soyad: ");
		String soyad = scanner.next();
		System.out.print("Yaş: ");
		int yas = scanner.nextInt();
		System.out.print("Görev: ");
		String gorev = scanner.next();
		System.out.print("Maaş: ");
		double maas = scanner.nextDouble();

		Calisan yeniCalisan = new Calisan(ad, soyad, yas, gorev, maas);
		calisanListesi.add(yeniCalisan);
		System.out.println("Yeni çalışan eklendi.");

	}

}
