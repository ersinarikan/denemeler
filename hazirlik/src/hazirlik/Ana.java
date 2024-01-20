//1. class açma implements Serializable{ elle ekliyoruz, eclipse kütüphanesini otomatik ekliyor.
//2. ortak değişkenleri ekliyoruz. başlarına private koyarak.
//3. constructor ekliyoruz.
//4. set ve get fonksiyonlarını ekliyoruz.
//5. toString fonksiyonunu ekliyoruz. Burada SysOut gibi düzenliyoruz.
//6. BAşına static ekledim. ek özelliklerin olacağı bir class daha açıyoruz. extends ile Arabalar class ındaki verileri al aşağıdakileri ekle diyoruz. implements Serializable{ ekliyoruz.
//7. ilave değişkenleri ekliyoruz.
//8. set ve getlerini ekliyoruz.
//9. ekoz classının constractor ını ekliyoruz.
//10. ekoz içinde toString oluşturuyoruz. Ancak burada üsttekinin to stingrini al anlamında returnden sonra super.toStirns()+ ekliyoruz ve syntaxı düzenliyoruz.
//11. Uygulamayı yazmaya başlıyoruz.

package hazirlik;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import hazirlik.Ozellikler.Araba;

//1.
class Ozellikler implements Serializable {
	// 2.
	private String renk;
	private String marka;
	private String tip;
	private int model;

	// 3.
	public Ozellikler(String renk, String marka, String tip, int model) {
		super();
		this.renk = renk;
		this.marka = marka;
		this.tip = tip;
		this.model = model;
	}

	// 4.
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

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	// 5.
	@Override
	public String toString() {
		return "renk=" + renk + ", marka=" + marka + ", tip=" + tip + ", model=" + model;
	}

	// 6.
	static class Araba extends Ozellikler implements Serializable {
		// 7.
		private String motor;
		private String kullAmaci;

		// 8.
		public String getMotor() {
			return motor;
		}

		public void setMotor(String motor) {
			this.motor = motor;
		}

		public String getKullAmaci() {
			return kullAmaci;
		}

		public void setKullAmaci(String kullAmaci) {
			this.kullAmaci = kullAmaci;
		}

		// 9.
		public Araba(String renk, String marka, String tip, int model, String motor, String kullAmaci) {
			super(renk, marka, tip, model);
			this.motor = motor;
			this.kullAmaci = kullAmaci;
		}

		// 10.
		@Override
		public String toString() {
			return super.toString() + ", motor=" + motor + ", kullAmaci=" + kullAmaci;
		}
	}
}

public class Ana {

	public static void main(String[] args) {
		// 11.

		Scanner scanner = new Scanner(System.in);

		List<Ozellikler.Araba> arabalarListesi = new ArrayList<>();

		int secim = 0;
		while (secim != 7) {
			System.out.println("1-Araba Ekle \n2-Listeleme\n3-Marka ile Arama\n"
					+ "4-Kayıt Düzeltme\n5-Silme\n6-İstatistik\n7-Çıkış");
			System.out.print("Seçiminiz: ");
			secim = scanner.nextInt();

			switch (secim) {
			case 1:
				arabaEkle(scanner, arabalarListesi);
				break;
			case 2:
				arabalariListele(arabalarListesi);
				break;
			case 3:
				markaArama(scanner, arabalarListesi);
				break;
			case 4:
				kayitDuzeltme(scanner, arabalarListesi);
				break;
			case 5:
				kayitSilme(scanner, arabalarListesi);
				break;
			case 6:
				istatistikleriGoster(arabalarListesi);
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

	private static void istatistikleriGoster(List<Araba> arabalarListesi) {
		 if (arabalarListesi.isEmpty()) {
	            System.out.println("İstatistik gösterilecek araç bulunmamaktadır.");
	        } else {
	            int toplamModel = 0;
	            int enBuyukModel = Integer.MIN_VALUE;
	            Araba enBuyukModelarac = null;

	            for (Araba araba : arabalarListesi) {
	                int model = araba.getModel();
	                toplamModel += model;

	                if (model > enBuyukModel) {
	                    enBuyukModel = model;
	                    enBuyukModelarac = araba;
	                }
	            }

	            double ModelOrtalamasi = (double) toplamModel / arabalarListesi.size();

	            System.out.println("Model Ortalaması: " + ModelOrtalamasi);
	            System.out.println("En Büyük Model: " + enBuyukModel);
	            if (enBuyukModelarac != null) {
	           
	                System.out.println("En Büyük Modele Sahip Arac: " + enBuyukModelarac);
	            }
	        }
	    }

	private static void kayitSilme(Scanner scanner, List<Araba> arabalarListesi) {
		 System.out.print("Silinecek aracin markasi: ");
	        String silinecekMarka = scanner.next();

	        Iterator<Araba> iterator = arabalarListesi.iterator();
	        boolean bulundu = false;
	        while (iterator.hasNext()) {
	            Araba araba = iterator.next();
	            if (araba.getMarka().equalsIgnoreCase(silinecekMarka)) {
	                iterator.remove();
	                System.out.println("Marka Silindi.");
	                bulundu = true;
	                break;
	            }
	        }

	        if (!bulundu) {
	            System.out.println("Silinecek Marka Bulunamadı.");
	        }
	    }

	private static void kayitDuzeltme(Scanner scanner, List<Araba> arabalarListesi) {
		 System.out.print("Düzeltilecek Aracın MArkası: ");
	        String duzeltilecekMarka = scanner.next();

	        boolean bulundu = false;
	        for (Araba araba : arabalarListesi) {
	            if (araba.getMarka().equalsIgnoreCase(duzeltilecekMarka)) {
	                System.out.println("Yeni bilgileri girin:");

	                System.out.print("Renk: ");
	                String yeniRenk = scanner.next();
	                if(yeniRenk!=null)
	                	araba.setRenk(yeniRenk);

	                System.out.print("Marka: ");
	                String yeniMarka = scanner.next();
	                araba.setMarka(yeniMarka);

	                System.out.print("Tip: ");
	                String yeniTip = scanner.next();
	                araba.setTip(yeniTip);
	 

	                System.out.print("Model: ");
	                int yeniModel = scanner.nextInt();
	                araba.setModel(yeniModel);

	                System.out.print("Motor: ");
	                String yeniMotor = scanner.next();
	                araba.setMotor(yeniMotor);

	                System.out.print("Kullanim Amaci: ");
	                String yenikullAmaci = scanner.next();
	                araba.setKullAmaci(yenikullAmaci);
	                
	                System.out.println("Kayıt düzeltildi.");
	                bulundu = true;
	                break;
	            }
	        }

	        if (!bulundu) {
	            System.out.println("Düzeltilecek kişi bulunamadı.");
	        }
	    }
	private static void markaArama(Scanner scanner, List<Araba> arabalarListesi) {
		System.out.print("Aranacak markayı girin: ");
		String arananMarka = scanner.next();
		boolean bulundu = false;
		for (Araba araba : arabalarListesi) {
			if (araba.getMarka().equalsIgnoreCase(arananMarka)) {
				System.out.println("Aranan araba:\n" + araba);
				bulundu = true;
				break;
			}
		}
		if (!bulundu) {
			System.out.println("Aradığınız markada araba bulunamadı.");
		}
	}

	private static void arabalariListele(List<Araba> arabalarListesi) {
		if (arabalarListesi.isEmpty()) {
			System.out.println("Listelenecek araba bulunmamaktadır.");
		} else {
			for (Araba araba : arabalarListesi) {
				System.out.println(araba);
			}
		}
	}

	private static void arabaEkle(Scanner scanner, List<Araba> arabalarListesi) {
		System.out.print("Renk: ");
		String renk = scanner.next();
		System.out.print("Marka: ");
		String marka = scanner.next();
		System.out.print("Tip: ");
		String tip = scanner.next();
		System.out.print("Model: ");
		int model = scanner.nextInt();
		System.out.print("Motor: ");
		String motor = scanner.next();
		System.out.print("Kullanım Amacı: ");
		String kullAmaci = scanner.next();
		Araba yeniAraba = new Araba(renk, marka, tip, model, motor, kullAmaci);
		arabalarListesi.add(yeniAraba);
	}
}
