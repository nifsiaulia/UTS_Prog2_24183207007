/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa2;

import java.util.Scanner;

/**
 *
 * @author nifsi
 */
public class MainApp {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Mahasiswa2 mhs = null; // objek Mahasiswa2 masih kosong
        int pilihan;

        do {
            System.out.println("===== MENU DATA MAHASISWA =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();
            input.nextLine();

        if (pilihan == 1) {
            // Tambah data
            System.out.println("<<<<<>>>>>");
            System.out.print("Masukkan NPM        : ");
            String npm = input.nextLine();
            System.out.print("Masukkan Nama       : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Prodi      : ");
            String prodi = input.nextLine();
            System.out.print("Masukkan Angkatan   : ");
            int angkatan = input.nextInt();
            System.out.print("Masukkan IPK        : ");
            double ipk = input.nextDouble();

            mhs = new Mahasiswa2(npm, nama, prodi, angkatan, ipk);
            System.out.println("Data berhasil ditambahkan!");

        } else if (pilihan == 2) {
            // Tampilkan data
            if (mhs != null) {
                mhs.tampilkanData();
            } else {
                System.out.println("Belum ada data mahasiswa!");
            }

        } else if (pilihan == 3) {
            System.out.println("Data Selesai Dimasukkan");
            System.out.println("Keluar dari program...");
            System.out.println("<<<<<>>>>>");




        } else {
            System.out.println("!Pilihan tidak valid!");
        }
        } while (pilihan != 3); 

        input.close();
    }
}
