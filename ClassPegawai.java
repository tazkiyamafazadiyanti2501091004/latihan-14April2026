/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class ClassPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pegawai p = new Pegawai();

        System.out.print("Masukkan NIP        : ");
        p.nip = input.nextLine();

        System.out.print("Masukkan Nama       : ");
        p.nama = input.nextLine();

        System.out.print("Masukkan Golongan (A/B/C): ");
        p.golongan = input.nextLine();

        System.out.print("Masukkan Potongan   : ");
        p.potongan = input.nextDouble();
      
        p.setGajiPokok();
        p.hitungTunjangan();
        p.hitungGajiBersih();
       
        System.out.println("\n=== Data Pegawai ===");
        p.tampilData();
    }
}
