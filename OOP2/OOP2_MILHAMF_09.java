package com.mycompany.tugas_pbo.OOP2;
import java.util.*;
/** @author ilham **/
public class OOP2_MILHAMF_09 {
    Scanner scanner = new Scanner(System.in);
    
    String[] kelas_tiket = {"Ekonomi", "Bisnis", "Eksekutif"};
    double[] harga_tiket = {15000, 80000, 110000};
    int pesanan = 0;
    double total = 0;
    
    public void Diketahui () {
        System.out.println("Deni ingin pergi ke malang dan membeli tiket bisnis");
        System.out.println("Dia mengoprasikan Sistem Tiket Kereta Api Sby - Malang");
        System.out.println("List harga tiket : ");
        for(int i = 0; i<harga_tiket.length; i++){
            System.out.println("Harga Tiket " + this.kelas_tiket[i] + " = Rp." + this.harga_tiket[i]);
        }
        System.out.println("Deni dkk memilih tiket : " + this.kelas_tiket[1]);
    }
    
    public void Ditanya () {
        System.out.println("Harga tiket yang harus dibeli Deni dkk?");
    }
    
    public void Pesan () {
        System.out.println("Enter pesanane : ");
        this.pesanan = scanner.nextInt();
        this.total = this.harga_tiket[1] * this.pesanan;
        System.out.println("Total harga tiket : " + this.total);
    }
        
    public static void main(String[] args) {
        OOP2_MILHAMF_09 h = new OOP2_MILHAMF_09();   
        h.Diketahui();
        h.Ditanya();
        h.Pesan();
    }
}
