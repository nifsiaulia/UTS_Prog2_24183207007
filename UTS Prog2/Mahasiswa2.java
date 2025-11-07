/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa2;

/**
 *
 * @author nifsi
 */
public class Mahasiswa2 {
     // Variabel Global 
    private String npm;      
    private String nama;     
    private String prodi;  
    private int angkatan;    
    private double ipk;      

    // Konstruktor Default 
 public Mahasiswa2() {
        npm = "";
        nama = "";
        prodi = "";
        ipk = 0.0;
    }
    // Konstruktor Berparameter 
    public Mahasiswa2(String npm, String nama, String prodi, int angkatan, double ipk) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
        this.angkatan = angkatan;
        this.ipk = ipk;
    }

    // Setter dan Getter 
    public void setNim(String npm){ 
        this.npm = npm; 
    }
    public String getNpm(){ 
        return npm; 
    }

    public void setNama(String nama){ 
        this.nama = nama; 
    }
    public String getNama(){ 
        return nama; 
    }

    public void setProdi(String prodi){ 
        this.prodi = prodi; 
    }
    public String getProdi(){ 
        return prodi; 
    }

    public void setAngkatan(int angkatan){ 
        this.angkatan = angkatan; 
    }
    public int getAngkatan(){ 
        return angkatan; 
    }
    public void setIpk(double ipk){ 
        this.ipk = ipk; 
    }
    public double getIpk(){ 
        return ipk; 
    }

    //Method tambahan 
    public void tampilkanData() {
        //Menampilkan semua data dari class Mahasiswa
        System.out.println("======================================");
        System.out.println("NPM           : " + npm);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Angkatan      : " + angkatan);
        System.out.println("IPK           : " + ipk);
        System.out.println("======================================");
    }
}
