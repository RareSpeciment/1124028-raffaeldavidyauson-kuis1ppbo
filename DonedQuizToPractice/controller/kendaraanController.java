package controller;

import java.util.Scanner;
import models.*;
import views.MainMenu;

public class kendaraanController {
    static Scanner sc = new Scanner(System.in);
    static MainMenu menu = new MainMenu();

    public static void Motor(){
        System.out.println("masukan Nama model :");
        String namaModel = sc.nextLine();

        System.out.println("masukan Nomor Polisi :");
        int nomorPolisi = sc.nextInt();

        System.out.println("Kapasitas : ");
        int caps = sc.nextInt();

        System.out.println("Nama Motor : ");
        String nama = sc.nextLine();
        int ban = 2;

        models.Kendaraan motor = new Motor(namaModel, nomorPolisi, nama, ban, caps);
        motor.getPrintDetail();
        models.Kendaraan.addObject(motor);

        System.out.println("Kendaraan berhasil ditambahkan ke ArrayList!");
        System.out.println();
        menu.ShowMainMenu();
    }

    public static void mobil(){
        System.out.println("masukan Nama model :");
        String namaModel = sc.nextLine();

        System.out.println("masukan Nomor Polisi :");
        int nomorPolisi = sc.nextInt();

        System.out.println("Please Insert Many People that can fit : ");
        int caps = sc.nextInt();

        System.out.println("Please Insert The Name Of The Car : ");
        String Car_name = sc.nextLine();
        int ban = 4;

        models.Kendaraan mobil = new Mobil(namaModel, nomorPolisi, Car_name, ban, caps);
        mobil.getPrintDetail();
        models.Kendaraan.addObject(mobil);

        System.out.println("Kendaraan berhasil ditambahkan ke ArrayList!");
        System.out.println();
        menu.ShowMainMenu();
    }

    public static void Helikopter(){
        System.out.println("masukan Jenis :");
        String jenis = sc.nextLine();

        System.out.println("masukan Penggunaans (militer / komersil) :");
        String penggunaan = sc.nextLine();

        System.out.println("Please Insert Many People that can fit : ");
        int caps = sc.nextInt();

        System.out.println("Nama Heli : ");
        String nama = sc.nextLine();
        int ban = 2;

        models.Kendaraan helikopter = new Helikopter(jenis, penggunaan, nama, ban, caps);
        helikopter.getPrintDetail();
        models.Kendaraan.addObject(helikopter);

        System.out.println("Kendaraan berhasil ditambahkan ke ArrayList!");
        System.out.println();
        menu.ShowMainMenu();
    }

    public static void Kapal(){
        System.out.println("masukan Lebar :");
        int lebar = sc.nextInt();

        System.out.println("masukan panjang :");
        int pangjang = sc.nextInt();
        sc.nextInt();

        System.out.println("masukan jenis :");
        String jenis = sc.nextLine();

        System.out.println("Masukan Nama dari kapal ini : ");
        String nama = sc.nextLine();

        System.out.println("Please Insert Many People that can fit : ");
        int caps = sc.nextInt();
        int ban = 0;

        models.Kendaraan kapal = new Kapal(lebar, pangjang, jenis, nama, ban, caps);
        kapal.getPrintDetail();
        models.Kendaraan.addObject(kapal);

        System.out.println("Kendaraan berhasil ditambahkan ke ArrayList!");
        System.out.println();
        menu.ShowMainMenu();
    }

    public static void PrintAll(){
        models.Kendaraan.printAllObjects();
    }
}
