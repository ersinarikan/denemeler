package forgit;
import java.util.Scanner;
public class daire {
	public static void main(String[] args) {
		short r;
		float cevre;
		float alan;
		final float pi = 3.1415f;
		Scanner klavye = new Scanner(System.in);
		System.out.print("Yarıçap giriniz : ");
		r=klavye.nextShort();
		cevre=2*pi*r;
		alan=pi*r*r;
		System.out.println("Yarıçapı "+r+" \nolan dairenin çevresi "+cevre);
		System.out.println("Yarıçapı "+r+"\t olan dairenin alanı "+alan);
		boolean devam=true;
		System.out.println("Atatürk Diyor ki \"Ne mutlu\"");
		System.out.println("Atatürk Diyor ki \'Ne mutlu\'");
		System.out.println("Atatürk\'ün annesi Zübeyde Hanımdır");
		System.out.println("kdkldflk \\dssd");
	}

}