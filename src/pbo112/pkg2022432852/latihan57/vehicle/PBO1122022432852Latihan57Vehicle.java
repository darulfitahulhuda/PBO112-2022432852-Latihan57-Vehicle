/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo112.pkg2022432852.latihan57.vehicle;

/**
 *
 * @author Mini Pc
 * Nama : DaruL Fitahul Huda 
 * NIM : 2022432852 
 * Kode Kelas :FS112B (PBO112B) 
 * Deksripsi Program : menampilkan jenis kendaraan Menggunakan Konsep OOP inheritance,olymorphism dan constructor
 */
public class PBO1122022432852Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Bicycle b = new Bicycle();
        b.setMyBrand("Trex Bike");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        System.out.println("Bicycle");
        System.out.println("Brand : " + b.getMyBrand());
        System.out.println("Model : " + b.getMyModel());
        System.out.println("Jumlah Gear : " + b.getMyGearCount());
        
        System.out.println("");
        
        SkateBoard sb = new SkateBoard();
        sb.setMyBrand("Ally Skate");
        sb.setMyModel("Rocket");
        sb.setMyBoardLength(54.5);
        System.out.println("SkateBoard");
        System.out.println("Brand : " + sb.getMyBrand());
        System.out.println("Model : " + sb.getMyModel());
        System.out.println("Panjangnya Board : " + sb.getMyBoardLength());
    }
    
}
