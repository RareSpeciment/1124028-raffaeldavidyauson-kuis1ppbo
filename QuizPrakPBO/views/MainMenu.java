package views;

import java.util.Scanner;
import controller.kendaraanController;

public class MainMenu {
    Scanner sc = new Scanner(System.in);

    //ITS NOT STATIC WHY WONT YOU JOIN THE DAMN APP
    public void ShowMainMenu(){
        System.out.println("1. tambah Kendaraan");
        System.out.println("2. Print semua kendaraan");
        System.out.println("____________________________");
        int ppilihan = sc.nextInt();

        switch (ppilihan) {
            case 1 :
                tambahKendaraan();
                break;

            case 2 : 
                printSemuaKendaraan();
                break;
        
            default:
                break;
        }
    }

    public void tambahKendaraan(){
        System.out.println("Mau Tambahkan Kendaraan apa?");
        System.out.println("1. Motor");
        System.out.println("2. Mobil");
        System.out.println("3. Helikopter");
        System.out.println("4. kapal");
        System.out.println("____________________________");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                kendaraanController.Motor();
                break;
            case 2:
                kendaraanController.mobil();
                break;
            case 3:
                kendaraanController.Helikopter();
                break;
            case 4:
                kendaraanController.Kapal();
                break;
        
            default:

                break;
        }
    }

    public void printSemuaKendaraan(){
        kendaraanController.PrintAll();
    }
}
