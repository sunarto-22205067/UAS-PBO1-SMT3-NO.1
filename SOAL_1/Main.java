package SOAL_1;

/**
 *
 * @author mr.sun
 */
public class Main {

	public static void main(String[] args) {
		
		Mahasiswa mahasiswa = new Mahasiswa("Andi", 24);
		MahasiswaLama mahasiswaLama = new MahasiswaLama("Budi", 27, 2019);
		MahasiswaBaru mahasiswaBaru = new MahasiswaBaru("Sunarto", 32, 22205067);
		
		System.out.println("===== Objek Mahasiswa =====");
		mahasiswa.displayInfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Lama =====");
		mahasiswaLama.displayInfo();
		System.out.print("\n");
		
		System.out.println("===== Objek Mahasiswa Baru =====");
		mahasiswaBaru.displayInfo();
		System.out.print("\n");
	}

}