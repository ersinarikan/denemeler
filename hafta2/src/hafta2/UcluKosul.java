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
		System.out.println("Ba�ar� Notunuz : " + bNot);
		/*
		 * if (bNot >= 50) System.out.println("Ge�tiniz"); else
		 * System.out.println("KAld�n�z");
		 */

		String sonuc=(bNot >= 50)?"Ge�tiniz":"KAld�n�z";
		System.out.println("durumunuz : "+sonuc);
		byte bSayi = vNot > fNot ? vNot : fNot;
		/*byte bSayi;
		if(vNot>fNot) bSayi=vNot;
		else bSayi=fNot;*/
		System.out.println("Vize yada finalden b�y�k olan : "+bSayi);
		System.out.println("Bitti");
	} 

}
