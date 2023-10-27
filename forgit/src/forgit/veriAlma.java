package forgit;
import java.util.Scanner;

public class veriAlma {

	public static void main(String[] args) {
		Scanner giris=new Scanner(System.in);
		System.out.print("Vize Notu giriniz : ");
		byte vNot=giris.nextByte();
		System.out.print("Final Botu giriniz : ");
		byte fNot=giris.nextByte();
		byte bNot=(byte) ((vNot+fNot)/2);
		System.out.println("Başarı Notunuz : "+bNot);
		System.out.println("Program bitti");
	}
}