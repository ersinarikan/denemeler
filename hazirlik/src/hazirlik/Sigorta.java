package hazirlik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Police {
	private String ad;
	private String soyAd;
	private int policeId;
	private double primTutari;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyAd() {
		return soyAd;
	}

	public void setSoyAd(String soyAd) {
		this.soyAd = soyAd;
	}

	public int getPoliceId() {
		return policeId;
	}

	public void setPoliceId(int policeId) {
		this.policeId = policeId;
	}

	public double getPrimTutari() {
		return primTutari;
	}

	public void setPrimTutari(double primTutari) {
		this.primTutari = primTutari;
	}

	public Police(String ad, String soyAd, int policeId, double primTutari) {
		super();
		this.ad = ad;
		this.soyAd = soyAd;
		this.policeId = policeId;
		this.primTutari = primTutari;
	}

	@Override
	public String toString() {
		return "ad= " + ad + " soyAd= " + soyAd + ", policeId= " + policeId + " primTutari= " + primTutari;
	}

}

class HayatPolice extends Police {
	private int sure;
	private String dovizTipi;

	public int getSure() {
		return sure;
	}

	public void setSure(int sure) {
		this.sure = sure;
	}

	public String getDovizTipi() {
		return dovizTipi;
	}

	public void setDovizTipi(String dovizTipi) {
		this.dovizTipi = dovizTipi;
	}

	public HayatPolice(String ad, String soyAd, int policeId, double primTutari, int sure, String dovizTipi) {
		super(ad, soyAd, policeId, primTutari);
		this.sure = sure;
		this.dovizTipi = dovizTipi;
	}

	@Override
	public String toString() {
		return super.toString() + "sure= " + sure + " dovizTipi= " + dovizTipi;
	}

}

class SaglikPolice extends Police {
	private String saglikTipi;
	private String vip;

	public String getSaglikTipi() {
		return saglikTipi;
	}

	public void setSaglikTipi(String saglikTipi) {
		this.saglikTipi = saglikTipi;
	}

	public String getVip() {
		return vip;
	}

	public void setVip(String vip) {
		this.vip = vip;
	}

	public SaglikPolice(String ad, String soyAd, int policeId, double primTutari, String saglikTipi, String vip) {
		super(ad, soyAd, policeId, primTutari);
		this.saglikTipi = saglikTipi;
		this.vip = vip;
	}

	@Override
	public String toString() {
		return super.toString() + "saglikTipi= " + saglikTipi + " vip= " + vip;
	}

}

public class Sigorta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<HayatPolice> hayatPoliceListesi = new ArrayList<>();
		List<SaglikPolice> saglikPoliceListesi = new ArrayList<>();

		int secim = 0;
		while (secim != 7) {
			System.out.println("\n1-Saglik Policesi Girişi\n2-Hayat Policesi Girişi\n3-Listele\n"
					+ "4-Police no ile Kayıt Düzeltme\n5-Silme\n6-İstatistik\n7-Çıkış");
			System.out.print("LÜtfen Seçiminizi Yspınız: ");
			secim = scanner.nextInt();
			switch (secim) {
			case 1: saglikEkle(scanner,saglikPoliceListesi);
				
				break;
			case 2: hayatEkle(scanner, hayatPoliceListesi);
			
				break;
			case 3: policeListele(hayatPoliceListesi,saglikPoliceListesi);
			
				break;
			case 4: kayitDüzelt(scanner,hayatPoliceListesi,saglikPoliceListesi);
			
				break;
			case 5: kayitSil(scanner,hayatPoliceListesi,saglikPoliceListesi);
			
				break;
			case 6: Istatistik(hayatPoliceListesi,saglikPoliceListesi);
			
				break;
			case 7: System.exit(0);

				break;
			default: System.out.println("Yanlis Secim Yaptiniz");
				break;
			}
		}
	}



	private static void Istatistik(List<HayatPolice> hayatPoliceListesi, List<SaglikPolice> saglikPoliceListesi) {
		// TODO Auto-generated method stub
		
	}



	private static void kayitSil(Scanner scanner, List<HayatPolice> hayatPoliceListesi,
			List<SaglikPolice> saglikPoliceListesi) {
		// TODO Auto-generated method stub
		
	}



	private static void kayitDüzelt(Scanner scanner, List<HayatPolice> hayatPoliceListesi,
			List<SaglikPolice> saglikPoliceListesi) {
		// TODO Auto-generated method stub
		
	}



	private static void policeListele(List<HayatPolice> hayatPoliceListesi, List<SaglikPolice> saglikPoliceListesi) {

		if (hayatPoliceListesi.isEmpty()) {
			System.out.println("\nListelenecek Hayat Policesi bulunmamaktadır.");
		} else {
			System.out.println("\nHayat Policeleri");
			for (HayatPolice police : hayatPoliceListesi) {
				System.out.println(police);
			}
		}

		if (saglikPoliceListesi.isEmpty()) {
			System.out.println("\nListelenecek saglik Policesi bulunmamaktadır.");
		} else {
			System.out.println("\nSağlık Policeleri");
			for (SaglikPolice police : saglikPoliceListesi) {
				System.out.println(police);
			}
		}
	
		
	}



	private static void hayatEkle(Scanner scanner, List<HayatPolice> hayatPoliceListesi) {
		System.out.println("Hayat Sigortasinin Özelliklerini Giriniz :");
		System.out.println("Ad :");
		String ad = scanner.next();
		System.out.println("Soyad :");
		String soyAd = scanner.next();
		System.out.println("Police Numarasi :");
		int policeId = scanner.nextInt();
		System.out.println("Prim Tutari :");
		double primTutari = scanner.nextDouble();
		System.out.println("sure :");
		int sure =scanner.nextInt();
		System.out.println("Doviz Tipi");
		String dovizTipi=scanner.next();
		HayatPolice yeniPolice =new HayatPolice(ad,soyAd,policeId,primTutari,sure,dovizTipi);
		hayatPoliceListesi.add(yeniPolice);
		
		
	}

	private static void saglikEkle(Scanner scanner, List<SaglikPolice> saglikPoliceListesi) {
		System.out.println("Saglik Sigortasinin Özelliklerini Giriniz :");
		System.out.println("Ad :");
		String ad = scanner.next();
		System.out.println("Soyad :");
		String soyAd = scanner.next();
		System.out.println("Police Numarasi :");
		int policeId = scanner.nextInt();
		System.out.println("Prim Tutari :");
		double primTutari = scanner.nextDouble();
		System.out.println("Saglik Tipi:");
		String saglikTipi = scanner.next();
		System.out.println("Vip :");
		String vip = scanner.next();

		SaglikPolice yeniPolice = new SaglikPolice(ad, soyAd, policeId, primTutari, saglikTipi, vip);
		saglikPoliceListesi.add(yeniPolice);
		
	}

}
