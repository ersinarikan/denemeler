package odev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;

public class toptancifonk {

	public static void giris(String bakliyat_ismi, int depo_numarasi, int adet, int kg, int toplam) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/toptanci", "root", "");
			stmt = conn.createStatement();
			String sqlCreateTable = "CREATE TABLE IF NOT EXISTS depo (" + "id INT AUTO_INCREMENT PRIMARY KEY,"
					+ "bakliyat_ismi VARCHAR(255)," + "depo_numarasi INT," + "adet INT," + "kg INT," + "toplam INT)";

			stmt.executeUpdate(sqlCreateTable);
//			System.out.println("depo tablosu oluşturuldu");

		} catch (Exception e) {
			System.out.println(" Hata Tablo Oluşturma Hatasi" + e);
		}

		try {
			String sqlInsert = "INSERT INTO depo (bakliyat_ismi, depo_numarasi, adet, kg, toplam) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sqlInsert);
			pstmt.setString(1, bakliyat_ismi);
			pstmt.setInt(2, depo_numarasi);
			pstmt.setInt(3, adet);
			pstmt.setInt(4, kg);
			pstmt.setInt(5, toplam);
			pstmt.executeUpdate();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println(" Hata veri eklemede " + e);
		}

	}

	public static void kontrol(String bakliyat_ismi, int depo_numarasi, int adet, int kg, int toplam) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet resultSet = null;

		try {
			int sayi = 0;
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/toptanci", "root", "");

			pstmt = conn.prepareStatement(
					"SELECT SUM(adet) FROM depo WHERE bakliyat_ismi = ? AND depo_numarasi = ? AND kg = ?");
			pstmt.setString(1, bakliyat_ismi);
			pstmt.setInt(2, depo_numarasi);
			pstmt.setInt(3, -kg);
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {

				sayi = resultSet.getInt(1);
			}

			if (sayi == 0) {
				System.out.println("Sectigiz Urun Tipi Olan " + -kg + "Kg lik " + bakliyat_ismi + " Cuvalı "+  depo_numarasi + " Numarali Depoda Mevcut Degil");
				System.exit(0);
			} else if (sayi < -adet) {
				System.out.println("Depoda Yeteri kadar ürün yok sectiginiz urun tipinden enfazla " + sayi
						+ " cuval kadar satabilirsiniz");
				System.exit(0);
			}

			else {
				String sqlInsert = "INSERT INTO depo (bakliyat_ismi, depo_numarasi, adet, kg, toplam) VALUES (?, ?, ?, ?, ?)";
				PreparedStatement pstmte = conn.prepareStatement(sqlInsert);
				pstmte.setString(1, bakliyat_ismi);
				pstmte.setInt(2, depo_numarasi);
				pstmte.setInt(3, adet);
				pstmte.setInt(4, kg);
				pstmte.setInt(5, toplam);
				pstmte.executeUpdate();
				resultSet.close();
				pstmt.close();
				conn.close();
			}
		} catch (Exception e) {
			System.out.println("HATA: " + e);

		}
	}

	public static void rapor1() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/toptanci", "root", "");
			stmt = conn.createStatement();

			String[] bakliyatTurleri = { "Mercimek", "Nohut", "Fasulye", "Pirinc" };

			for (String bakliyat : bakliyatTurleri) {
				String sql = "SELECT SUM(toplam) FROM depo WHERE bakliyat_ismi = ?";
				try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
					pstmt.setString(1, bakliyat);
					rs = pstmt.executeQuery();

					while (rs.next()) {
						int toplamKg = rs.getInt(1);
						if (toplamKg == 0) {
							System.out.println("--------------------------------------------");
							System.out.println("Depolarda Hic " + bakliyat + " bulunmamaktadır");
							System.out.println("--------------------------------------------");

						} else {

							System.out.println("--------------------------------------------");
							System.out.println("Depolarda bulunan toplam " + bakliyat + ": " + toplamKg + " KG'dir.");
							System.out.println("--------------------------------------------");
						}
					}

				}

			}
			stmt.close();
			conn.close();
			rs.close();
		} catch (Exception e) {
			System.out.println("HATA: " + e);
		}

	}

	public static void rapor2() {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/toptanci", "root", "");
			stmt = conn.createStatement();

			for (int depoNumarasi = 1; depoNumarasi <= 2; depoNumarasi++) {
				for (String bakliyatIsmi : Arrays.asList("Mercimek", "Nohut", "Pirinc", "Fasulye")) {
					PreparedStatement kgStatement = conn.prepareStatement(
							"SELECT SUM(toplam) FROM depo WHERE bakliyat_ismi = ? AND depo_numarasi = ?");
					kgStatement.setString(1, bakliyatIsmi);
					kgStatement.setInt(2, depoNumarasi);

					ResultSet kgResultSet = kgStatement.executeQuery();

					int kilogram = 0;
					while (kgResultSet.next()) {
						kilogram = kgResultSet.getInt(1);
					}

					PreparedStatement adetStatement = conn.prepareStatement(
							"SELECT SUM(adet) FROM depo WHERE bakliyat_ismi = ? AND depo_numarasi = ?");
					adetStatement.setString(1, bakliyatIsmi);
					adetStatement.setInt(2, depoNumarasi);

					ResultSet adetResultSet = adetStatement.executeQuery();

					int adet = 0;
					while (adetResultSet.next()) {
						adet = adetResultSet.getInt(1);
					}
					if (adet == 0) {
						System.out.println("--------------------------------------------");
						System.out.println(depoNumarasi + " Numaralı Depoda  " + bakliyatIsmi + " Mevcut Degildir.");
						System.out.println("--------------------------------------------");
					} else {
						System.out.println("--------------------------------------------");
						System.out.println(depoNumarasi + " Numaralı Depoda Mevcut " + adet + " Çuval " + bakliyatIsmi
								+ " Vardir Toplam " + kilogram + " KG dır.");
						System.out.println("--------------------------------------------");
					}
				}
			}

			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.out.println("HATA" + e);
		}

	}

}
