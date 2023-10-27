package hafta2;

import java.util.Scanner;

public class UcluKosul {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Vize Notu giriniz : ");
		byte vNot = giris.nextByte();
		System.out.print("Final Botu giriniz : ");
		byte fNot = giris.nextByte();
		byte bNot = (byte) ((vNot + fNot) / 2);
		System.out.println("Baþarý Notunuz : " + bNot);
		/*
		 * if (bNot >= 50) System.out.println("Geçtiniz"); else
		 * System.out.println("KAldýnýz");
		 */

		String sonuc=(bNot >= 50)?"Geçtiniz":"KAldýnýz";
		System.out.println("durumunuz : "+sonuc);
		byte bSayi = vNot > fNot ? vNot : fNot;
		/*byte bSayi;
		if(vNot>fNot) bSayi=vNot;
		else bSayi=fNot;*/
		System.out.println("Vize yada finalden büyük olan : "+bSayi);
		System.out.println("Bitti");
	} 

}
