package hafta3;

import java.util.Scanner;

public class fatura 
{

	public static void main(String[] args) {
		char devam;
		do
		{
		//Değişkenlerin tanımlanması.//
		
		char cevapSms, cevapKonusma, cevapInternet = 'E';
		byte kampanyaSms = 0, kampanyaInternet = 0, kampanyaKonusma = 0;
		int kullanimSms,kullanimInternet,kullanimKonusma=0;
		int otv=0;
		float fatura,faturaSms,faturaInternet,faturaKonusma=0;
		String telefonNumarasi = "";
		
		//Değişken tanımları burada bitti.//
		
		System.out.println("Cep Telefonu Fatura Hsaplama Uygulamasına Hoşgeldiniz");
		System.out.println("Cep Telefonu Numarasını başında 0 ve boşluk olmadan giriniz");
		Scanner giris = new Scanner(System.in);
		telefonNumarasi = giris.next();
		
		
		System.out.println(telefonNumarasi + " Numaralı hatta SMS paketi tanımlımı (E/H) ");
		cevapSms = giris.next().charAt(0);
		
		if (cevapSms == 'e' || cevapSms == 'E')
		{
			System.out.println("SMS Kampanyasını Seçiniz\n 1. 100 SMS e kadar Bizden\n 2. 500 SMS e kadar bizden\n 3. 1000 SMS e kadar bizden");
			kampanyaSms = giris.nextByte();
		}
		
		System.out.println(telefonNumarasi + " Numaralı hatta Konuşma paketi tanımlımı (E/H) ");
		cevapKonusma = giris.next().charAt(0);
		
		if (cevapKonusma == 'E' || cevapKonusma == 'e') 
		{
			System.out.println("Konuşma Kampanyasını Seçiniz\n 1. 1000dk Bizden\n 2. 1500dk Bizden\n 3. 2000dk Bizden");
			kampanyaKonusma = giris.nextByte();
		}
		System.out.println(telefonNumarasi + " Numaralı hatta İnternet paketi tanımlımı (E/H) ");
		cevapInternet = giris.next().charAt(0);
		
		if (cevapInternet == 'E' || cevapInternet == 'e') 
		{
			System.out.println("Internet Kampanyasını Seçiniz\n 1. 1GB Bizden\n 2. 5GB Bizden\n 3. 10GB Bizden");
			kampanyaInternet = giris.nextByte();
		}
		System.out.println("Fatura Döneminde Kullanılan SMS sayısını giriniz (adet)");
		kullanimSms=giris.nextInt();
		System.out.println("Fatura Döneminde Kullanılan Konuşma dk sayısınu giriniz (dakika) ");
		kullanimKonusma=giris.nextInt();
		System.out.println("Fatura Döneminde Kullanılan internet miktarını giriniz (MB cinsinden) ");
		kullanimInternet=giris.nextInt();
		
		//SMS hesaplama
		
		switch (kampanyaSms) {
		case 1:
			if (kullanimSms>100) {
				faturaSms=(float) (((kullanimSms-100)*1.5)+50);
			}

			else faturaSms=50;
		case 2:
						
			if( kullanimSms>500) { 
				faturaSms=(float) (((kullanimSms-500)*1.5)+60);
			}
		
			else faturaSms=60;
		case 3:
			if (kullanimSms>1000) {
			faturaSms=(float) (((kullanimSms-500)*1.5)+70);
			}
			else faturaSms=70;
		default: faturaSms=(float)(kullanimSms*1.5);
		}
		//Internet hesaplama
		
		switch (kampanyaInternet) {
		case 1:
			if (kullanimInternet>1000) {
				faturaInternet=(float) (((kullanimInternet-1000)*0.15)+50);
		}
	
			else faturaInternet=50;
		case 2:
						
			if( kullanimInternet>5000) { 
				faturaInternet=(float) (((kullanimInternet-5000)*0.15)+60);
			}
		
			else faturaInternet=60;
		case 3:
			if (kullanimInternet>10000) {
			faturaInternet=(float) (((kullanimInternet-10000)*0.15)+70);
			}
			else faturaInternet=70;
		default: faturaInternet=(float)(kullanimInternet*0.15);
		}
		//Konuşma Hesaplama
		
		switch (kampanyaKonusma) {
		case 1:
			if (kullanimKonusma>1000) {
				faturaKonusma=(float) (((kullanimKonusma-1000)*0.15)+50);
		}
	
			else faturaKonusma=50;
		case 2:
						
			if( kullanimKonusma>1500) { 
				faturaKonusma=(float) (((kullanimKonusma-1500)*0.15)+60);
			}
		
			else faturaKonusma=60;
		case 3:
			if (kullanimKonusma>2000) {
			faturaKonusma=(float) (((kullanimKonusma-2000)*0.15)+70);
			}
			else faturaKonusma=70;
		default: faturaKonusma=(float)(kullanimKonusma*0.15);
		}
		System.out.println("Özel Tüketim Vergisini Giriniz ");
		
		otv=giris.nextInt();
		fatura=((faturaKonusma+faturaInternet+faturaSms)+(((faturaKonusma+faturaInternet+faturaSms)*otv)/100));
		
		
		System.out.println(" Fatura SMS "+ faturaSms +"\n Fatura Internet "+faturaInternet+" \n Fatura Konuşma "+faturaKonusma);
		System.out.println(telefonNumarasi + " Numaralı Telefona Ait fatura " + fatura + "TL");
		System.out.println("Yeni Fatura Hesaplamak İstiyormusun (E/H)");

		devam=giris.next().charAt(0);
		
		}while (devam=='e'||devam=='E');
		
 
}

	

}
