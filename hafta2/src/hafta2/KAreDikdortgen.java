package hafta2;

import java.util.Scanner;

public class KAreDikdortgen {

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.println("Birinci kenarý gir : ");
		short k1=klavye.nextShort();
		System.out.println("Ýkinci kenarý gir : ");
		short k2=klavye.nextShort();
		short alan, cevre;
		if(k1==k2) { 
			System.out.println("Sen Bir karesin");
			System.out.println("Çevresi : "+(4*k1));
			System.out.println("Alaný : "+(k1*k1));
		}else {
			System.out.println("Sen Bir dikdörtgensin");
			System.out.println("Çevresi : "+(2*(k1+k2)));
			System.out.println("Alaný : "+(k1*k2));
		}
	} 

}
