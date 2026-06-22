package models;

import enums.TIPE_FUEL;
import enums.TIPE_KENDARAAN;

public class Helikopter extends Kendaraan{
    String jenis;
    String penggunaan;

    public Helikopter(String jenis, String penggunaan, String nama, int roda, int kapasitas){
        super(nama, roda, kapasitas, TIPE_KENDARAAN.KAPAL, TIPE_FUEL.DIESEL);
        
        this.jenis = jenis;
        this.penggunaan = penggunaan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getPenggunaan() {
        return penggunaan;
    }

    public void setPenggunaan(String penggunaan) {
        this.penggunaan = penggunaan;
    }

    @Override
    public String getPrintDetail() {
        return "yes";
    }

}
