/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Lenovo
 */
public class Pegawai {
    String nip;
    String nama;
    String golongan;
    double gajiPokok;
    double tunjangan;
    double potongan;
    double gajiBersih;

    void setGajiPokok() {
        if (golongan.equalsIgnoreCase("A")) {
            gajiPokok = 3000000;
        } else if (golongan.equalsIgnoreCase("B")) {
            gajiPokok = 4000000;
        } else if (golongan.equalsIgnoreCase("C")) {
            gajiPokok = 5000000;
        } else {
            gajiPokok = 0;
        }
    }

    void hitungTunjangan() {
        tunjangan = 0.1 * gajiPokok;
    }
    void hitungGajiBersih() {
        gajiBersih = gajiPokok + tunjangan - potongan;
    }

    void tampilData() {
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.println("Golongan      : " + golongan);
        System.out.println("Gaji Pokok    : " + gajiPokok);
        System.out.println("Tunjangan     : " + tunjangan);
        System.out.println("Potongan      : " + potongan);
        System.out.println("Gaji Bersih   : " + gajiBersih);
    }
}
