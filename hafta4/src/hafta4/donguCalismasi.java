package hafta4;

public class donguCalismasi {

	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			if (i%2==0)continue; //eğer i nin 2 ile kalanı 0 ise alttaki satıları görmeden i ye sonraki değeri ver.
			else if (i==3)continue; //eğer i nin değeri 3 olursa yazdırmadan bir sonraki değeri al. 
			System.out.println(i + " Okan Üniversitesi");
			//if (i==5)break; //eğer i 5 olursa döngüden çık.
			
		}
	}

}
