package models;

import enums.TIPE_FUEL;
import enums.TIPE_KENDARAAN;

public class Kapal extends Kendaraan{
    private int lebar;
    private int panjang;
    private String jenis;

    public Kapal(int lebar, int panjang, String jenis, String nama, int roda, int kapasitas){
        super(nama, roda, kapasitas, TIPE_KENDARAAN.KAPAL, TIPE_FUEL.DIESEL);
        
        this.lebar = lebar;
        this.panjang = panjang;
        this.jenis = jenis;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @Override
    public String getPrintDetail(){
        System.out.println("Kapal ini mempunyai panjang : " + getPanjang());
        return nama;
    }

    //Overloading Practice
    public String getPrintDetail(double luas){
        luas = getPanjang() * getLebar();
        String detail = "Kapal ini mempunyai Luas : " + luas;
        return detail;
    }
}
