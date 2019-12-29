/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mong;

/**
 *
 * @author ACER-NITRO
 */
public class Pendaftaran {
    private String nama_pendaftar, jk_pendaftar ,nohp_pendaftar, alamat_pendaftar, username, password;
    private int id_p;
    
    public void setId(int id_p){
        this.id_p = id_p;
    }
    public int getId(){
        return id_p;
    }
    
    public void setNamaPendaftar(String nama_pendaftar){
        this.nama_pendaftar = nama_pendaftar;
    }
    public String getNamaPendaftar(){
        return nama_pendaftar;
    }
    
    public void setJkPendaftar(String jk_pendaftar){
        this.jk_pendaftar = jk_pendaftar;
    }
    public String getJkPendaftar(){
        return jk_pendaftar;
    }
    
    public void setNohpPendaftar(String nohp_pendaftar){
        this.nohp_pendaftar = nohp_pendaftar;
    }
    public String getNohpPendaftar(){
        return nohp_pendaftar;
    }
    
    public void setAlamat(String alamat_pendaftar){
        this.alamat_pendaftar = alamat_pendaftar;
    }
    public String getAlamat(){
        return alamat_pendaftar;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    
}
