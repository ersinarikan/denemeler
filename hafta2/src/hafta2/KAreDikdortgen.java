package hafta2;

import java.util.Scanner;

public class KAreDikdortgen {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("Birinci Kenarı Giriniz : ");
		short k1=klavye.nextShort();
		System.out.println("İkinci Kenarı Giriniz : ");
		short k2=klavye.nextShort();
		short alan, cevre;
		if(k1==k2) { 
			System.out.println("Sen Bir karesin");
			System.out.println("Çevresi :"+(4*k1));
			System.out.println("Alanı : "+(k1*k1));
		}else {
			System.out.println("Sen Bir dikd�rtgensin");
			System.out.println("�evresi : "+(2*(k1+k2)));
			System.out.println("Alan� : "+(k1*k2));
		}
	} 

}
