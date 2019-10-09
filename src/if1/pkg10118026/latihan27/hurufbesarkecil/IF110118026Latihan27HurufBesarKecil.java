/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118026.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deskripsi Program	: membenarkan format huruf besar dan kecil
 */
public class IF110118026Latihan27HurufBesarKecil {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		System.out.print("Masukkan kalimat : ");
		Scanner sc = new Scanner(System.in);
		String kalimat = sc.nextLine();
		System.out.println("[#]==== Hasil Formatting ====[#]");
		System.out.println("Huruf Besar : " + kalimat.toUpperCase() );
		System.out.println("Huruf Kecil : " + kalimat.toLowerCase() );
	}
	
}
