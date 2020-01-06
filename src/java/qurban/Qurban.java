/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qurban;

/**
 *
 * @author ACER-NITRO
 */
public class Qurban {
    private String nama_qur, masjid_qur ,kelompok_qur, bayar_qur;
    private int kode_qur, harga_qur;
    
    public void setId(int kode_qur){
        this.kode_qur = kode_qur;
    }
    public int getId(){
        return kode_qur;
    }
    
    public void setNamaPequrban(String nama_qur){
        this.nama_qur = nama_qur;
    }
    public String getNamaPequrban(){
        return nama_qur;
    }
    
    public void setMasjid(String masjid_qur){
        this.masjid_qur = masjid_qur;
    }
    public String getMasjid(){
        return masjid_qur;
    }
    
    public void setKelompok(String kelompok_qur){
        this.kelompok_qur = kelompok_qur;
    }
    public String getKelompok(){
        return kelompok_qur;
    }
    
    public void setHarga(int harga_qur){
        this.harga_qur = harga_qur;
    }
    public int getHarga(){
        return harga_qur;
    }
    
    public void setBayar(String bayar_qur){
        this.bayar_qur = bayar_qur;
    }
    public String getBayar(){
        return bayar_qur;
    }
    
}
