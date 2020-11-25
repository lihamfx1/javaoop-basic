package com.mycompany.tugas_pbo.OOP1;

import com.mycompany.tugas_pbo.*;
import java.util.*;

/**
 *
 * @author ilham
 */
public class OOP1_MILHAMF_09 {
    Scanner scanner = new Scanner(System.in);
    double harga = 950, total;
    int jumlah = 0;
    String penjual = "Pak Kumis", pembeli;
    
    public void Diketahui () {
        System.out.println("Nama penjual sate       : " + penjual);
        System.out.println("Harga sate              : Rp." + harga + " per tusuk");
    }
        
    public void Total () {
        System.out.println("Masukkan jumlah pesanan : ");
        this.jumlah = scanner.nextInt();
        total = this.harga * this.jumlah;
        System.out.println("Pembeli membeli sate    : " + jumlah + " tusuk");
        System.out.println("Berapa harga sate yang harus dibayar pembeli? ");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Jadi harga sate yang harus di bayar pembeli adalah : Rp." + total);
    }
    
    public static void main(String[] args){
        OOP1_MILHAMF_09 tes = new OOP1_MILHAMF_09();
        tes.Diketahui();
        tes.Total();
    }

}
