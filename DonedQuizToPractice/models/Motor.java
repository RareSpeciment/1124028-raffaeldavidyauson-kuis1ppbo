package models;

import enums.TIPE_FUEL;
import enums.TIPE_KENDARAAN;

public class Motor extends Kendaraan{
    private String model;
    private int nomor_polisi;

    public Motor(String model, int nomor_polisi, String nama, int roda, int kapasitas){
        super(nama, roda, kapasitas, TIPE_KENDARAAN.MOTOR, TIPE_FUEL.BENSIN);
        
        this.model = model;
        this.nomor_polisi = nomor_polisi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNomor_polisi() {
        return nomor_polisi;
    }

    public void setNomor_polisi(int nomor_polisi) {
        this.nomor_polisi = nomor_polisi;
    }

    @Override
    public String getPrintDetail(){
        System.out.println("model kendaraan ini adalah : " + getModel());
        return getModel();
    }
}
