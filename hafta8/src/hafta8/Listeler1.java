package hafta8;

import java.util.ArrayList;
import java.util.List;

public class Listeler1 {

	public static void main(String[] args) {
		List<String> meyveListe=new ArrayList<String>();
		System.out.println(meyveListe);
		meyveListe.add("Elma");
		meyveListe.add("Armut");
		meyveListe.add("Erik");
		meyveListe.add("Muz");
		meyveListe.add("Erik");
		System.out.println(meyveListe);
		meyveListe.add(1,"Kiraz");
		System.out.println(meyveListe);
		System.out.println(meyveListe.get(1));
		
		System.out.println("Muz varmı : "+meyveListe.contains("muz"));
		System.out.println("Kiraz varmı : "+meyveListe.contains("Kiraz"));
		for (int i = 0; i < meyveListe.size(); i++) {
			System.out.println(meyveListe.get(i));
		}
		System.out.println("----------------------");
		for (String meyve : meyveListe) {
			System.out.println(meyve);
		}
		meyveListe.remove(0);
		System.out.println(meyveListe);
		meyveListe.remove("Erik");
		meyveListe.clear();
		System.out.println(meyveListe);
	}
	

}
