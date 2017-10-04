package com.example.adila.resepmasakan;

/**
 * Created by Adila on 03-Oct-17.
 */

public class Resep {
    private int gambarResep;
    private String judulResep;
    private String deskripsiResep;
    private String bahanResep;
    private String pembuatanResep;

    public Resep(int gambarResep, String judulResep, String deskripsiResep, String bahanResep, String pembuatanResep){
        this.gambarResep = gambarResep;
        this.judulResep = judulResep;
        this.deskripsiResep = deskripsiResep;
        this.bahanResep = bahanResep;
        this.pembuatanResep = pembuatanResep;
    }

    public int getGambarResep(){
        return gambarResep;
    }

    public String getJudulResep(){
        return judulResep;
    }

    public String getDeskripsiResep(){
        return deskripsiResep;
    }

    public String getBahanResep(){
        return bahanResep;
    }

    public String getPembuatanResep(){
        return pembuatanResep;
    }

}
