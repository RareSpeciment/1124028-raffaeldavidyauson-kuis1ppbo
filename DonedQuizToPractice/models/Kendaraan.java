package models;

import java.util.ArrayList;

import enums.TIPE_FUEL;
import enums.TIPE_KENDARAAN;

public abstract class Kendaraan {
    static ArrayList<Kendaraan> ObjectList = new ArrayList<Kendaraan>();
    static ArrayList<String> detaiList = new ArrayList<String>();

    String nama;
    private int roda;
    private int kapasitas;
    private TIPE_KENDARAAN type_kendaraan;
    private TIPE_FUEL tipe_fuel;

    public Kendaraan(String nama, int roda, int kapasitas, TIPE_KENDARAAN type_kendaraan, TIPE_FUEL tipe_fuel) {
        this.nama = nama;
        this.roda = roda;
        this.kapasitas = kapasitas;
        this.type_kendaraan = type_kendaraan;
        this.tipe_fuel = tipe_fuel;
    }

    public int getRoda() {
        return roda;
    }

    public void setRoda(int roda) {
        this.roda = roda;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public TIPE_KENDARAAN getType_kendaraan() {
        return type_kendaraan;
    }

    public void setType_kendaraan(TIPE_KENDARAAN type_kendaraan) {
        this.type_kendaraan = type_kendaraan;
    }

    public TIPE_FUEL getTipe_fuel() {
        return tipe_fuel;
    }

    public void setTipe_fuel(TIPE_FUEL tipe_fuel) {
        this.tipe_fuel = tipe_fuel;
    }

    public abstract String getPrintDetail();

    String getPrintDetail(String nama){
        return nama;
    }

    public static void addObject(Kendaraan k) {
        ObjectList.add(k);
        detaiList.add(k.getPrintDetail());
    }

    public static void printAllObjects() {
        System.out.println("daftar semua kendaraan");
        if (ObjectList.isEmpty()) {
            System.out.println("Belum ada objek yang dibuat.");
        } else {
            for (int i = 0; i < ObjectList.size(); i++) {
                System.out.println("Objek ke-" + (i+1) + ":");
                System.out.println("  Nama: " + ObjectList.get(i).getClass().getSimpleName());
                System.out.println("  Kendaraan: " + detaiList.get(i));
                System.out.println();
            }
        }
    }
}
