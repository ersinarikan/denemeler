package hafta8;

import java.util.List;

public class fonkToptanci {

	public static void rapor(List<Integer> nohut, List<Integer> mercimek, List<Integer> pirinc) {
		int toplamMercimek = 0;
		int toplamNohut = 0;
		int toplamPirinc = 0;
		for (int i = 0; i < mercimek.size(); i++) {
			toplamMercimek = mercimek.get(i) + toplamMercimek;
		}
		for (int i = 0; i < nohut.size(); i++) {
			toplamNohut = nohut.get(i) + toplamNohut;
		}
		for (int i = 0; i < pirinc.size(); i++) {
			toplamPirinc = pirinc.get(i) + toplamPirinc;
		}
		System.out.println("Depodaki Toplam Mercimek Miktarı " + toplamMercimek + " KG dır");
		System.out.println("Depodaki Toplam Nohut Miktarı " + toplamNohut + " KG dır");
		System.out.println("Depodaki Toplam Pirinç Miktarı " + toplamPirinc + " KG dır");
		
		
	}

}
