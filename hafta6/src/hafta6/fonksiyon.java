package hafta6;

public class fonksiyon {

	public static void MenuGoruntule() {
		System.out.println("1-Listeleme\n 2-İsim Arama\n 3-Okul Durumu\n 4-Erkelerin Yas ORtalaması\n 5-Çıkış");
		
	}

	public static void listeleme(String[] ad, int[] yas, String[] cinsiyet) {
		for (int i = 0; i < yas.length; i++) {
			System.out.println("isminiz " +ad[i]);
			System.out.println("Yaşınız " +yas[i]);
			System.out.println("Cinsiyetiniz " +cinsiyet[i]);
			System.out.println("-----------------------------------");
			
			
		}
		
		
	}

	public static void Arama(String arananAd, String[] ad, int[] yas, String[] cinsiyet) {
		boolean kontrol=true;
		for (int i = 0; i < yas.length; i++) {
			if(arananAd.equalsIgnoreCase(ad[i])) {
				System.out.println("isminiz " +ad[i]);
				System.out.println("Yaşınız " +yas[i]);
				System.out.println("Cinsiyetiniz " +cinsiyet[i]);
				System.out.println("-----------------------------------");	
				kontrol=false;
			}
			
			if(kontrol)System.out.println("Aranan Kişi Listede Yok");
		}
		
	}



	public static void OkulDurumu(String[] ad, int[] yas) {
		String okulDurumu="";
		for (int i = 0; i < yas.length; i++) {
			if(yas[i]<5)okulDurumu="Çocuk Yaşta Evde";
			else if (yas[i]<7)okulDurumu="Ana Okulda";
			else if (yas[i]<11)okulDurumu="İlk Okulda";
			else if (yas[i]<15)okulDurumu="Orta Okulda";
			else if (yas[i]<19)okulDurumu="Lisede";
			else okulDurumu="Üniversitede olabilir veya çalışabilir";
			System.out.println(ad[i]+" " + okulDurumu);
						
		}
		
	}

	public static int ErkekYasOrt(String[] cinsiyet, int[] yas) {
		int toplamYas=0;
		int kisiSayisi=0;
		for (int i = 0; i < yas.length; i++) {
			if (cinsiyet[i].equalsIgnoreCase("erkek")){
				toplamYas+=yas[i];
				kisiSayisi+=1;
			}
			
			
		}
		return toplamYas/kisiSayisi;
	}

}
