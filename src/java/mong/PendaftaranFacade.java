/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mong;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author ACER-NITRO
 */
public class PendaftaranFacade {
    public Pendaftaran[]getDataPendaftaran(){
        Pendaftaran[]dataPendaftaran = null;
        Pendaftaran tempPendaftaran = null;
        ArrayList listPendaftaran = new ArrayList();
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        String dbUrl = "jdbc:mysql://localhost:3306/mongmbek";
        String pwd = "";
        String login = "root";
        String sql = "Select * from pendaftaran";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            String kode_supplier = null;
            while(rs.next()){
                tempPendaftaran = new Pendaftaran();
                tempPendaftaran.setId(rs.getInt("id_pdft"));
                tempPendaftaran.setNamaPendaftar(rs.getString("nama_pdft"));
                tempPendaftaran.setJkPendaftar(rs.getString("jk_pdft"));
                tempPendaftaran.setNohpPendaftar(rs.getString("nohp_pdft"));
                tempPendaftaran.setAlamat(rs.getString("alamat_pdft"));
                tempPendaftaran.setUsername(rs.getString("username"));
                tempPendaftaran.setPassword(rs.getString("password"));
                listPendaftaran.add(tempPendaftaran);
            }
            dataPendaftaran = new Pendaftaran[listPendaftaran.size()];
            listPendaftaran.toArray(dataPendaftaran);
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        }catch(SQLException a){
            a.printStackTrace();
        }finally{
            try{
                rs.close();
                stmt.close();
                con.clearWarnings();
                return dataPendaftaran;
            }catch(SQLException b){
                b.printStackTrace();
                return dataPendaftaran;
            }
        }
    }
    public boolean create (Pendaftaran dataPendaftaran){
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/mongmbek","root","");
        try{
            String insert = "insert into pendaftaran values("
                    + "'"+dataPendaftaran.getId()+"',"
                    + "'"+dataPendaftaran.getNamaPendaftar()+"',"
                    + "'"+dataPendaftaran.getJkPendaftar()+"',"
                    + "'"+dataPendaftaran.getNohpPendaftar()+"',"
                    + "'"+dataPendaftaran.getAlamat()+"',"
                    + "'"+dataPendaftaran.getUsername()+"',"
                    + "'"+dataPendaftaran.getPassword()+"')";
            akses.connect();
            akses.executeUpdate(insert);
            return true;
        }catch(ClassNotFoundException x){
            x.printStackTrace();
            return false;
        }catch(SQLException n){
            n.printStackTrace();
            return false;
        }
    }
    public boolean delete(String kode){
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/mongmbek","root","");
        boolean sukses = false;
        
        try{
            String insert = "DELETE FROM pendaftaran where id_pdft='"+kode+"'";
            akses.connect();
            
            int baris = akses.executeUpdate(insert);
            if (baris > 0) {
                sukses = true;
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                akses.disconnect();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return sukses;
    } 
    public Pendaftaran getDataPendaftaran(String kode){
        Pendaftaran dataPendaftaran = null;
        Pendaftaran tempPendaftaran = null;
        ArrayList listPendaftaran = new ArrayList();
        
        Pendaftaran pen = null;
        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        
        
        String dbUrl = "jdbc:mysql://localhost:3306/mongmbek";
        String pwd = "";
        String login = "root";
        String sql = "Select * from pendaftaran where id_pdft = '"+kode+"'";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            if(rs.next()){
                tempPendaftaran = new Pendaftaran();
                tempPendaftaran.setId(rs.getInt("id_pdft"));
                tempPendaftaran.setNamaPendaftar(rs.getString("nama_pdft"));
                tempPendaftaran.setJkPendaftar(rs.getString("jk_pdft"));
                tempPendaftaran.setNohpPendaftar(rs.getString("nohp_pdft"));
                tempPendaftaran.setAlamat(rs.getString("alamat_pdft"));
                tempPendaftaran.setUsername(rs.getString("username"));
                tempPendaftaran.setPassword(rs.getString("password"));
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                rs.close();
                stmt.close();
                con.clearWarnings();
                return dataPendaftaran;
            }catch(SQLException b){
                b.printStackTrace();
                return dataPendaftaran;
            }
        }
    }
    public Pendaftaran getDataPendaftaranById(String kode){
        Pendaftaran pen = null;
        String pwd="";
        String login = "root";
        Connection con = null;
        ResultSet rs = null;
        
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/mongmbek",login,pwd);
        String sql= "SELECT * FROM pendaftaran where id_pdft ='"+ kode +"'";
        
        try{
            con = akses.connect();
            rs = akses.executeQuery(sql);
            
            if(rs.next()){
                pen = new Pendaftaran();
                pen.setId(rs.getInt("id_pdft"));
                pen.setNamaPendaftar(rs.getString("nama_pdft"));
                pen.setJkPendaftar(rs.getString("jk_pdft"));
                pen.setNohpPendaftar(rs.getString("nohp_pdft"));
                pen.setAlamat(rs.getString("alamat_pdft"));
                pen.setUsername(rs.getString("username"));
                pen.setPassword(rs.getString("password"));
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                akses.disconnect();
                return pen;
            }
            catch(SQLException e){
                e.printStackTrace();
                return null;
            }
        }
    }
    public boolean store(Pendaftaran dataPendaftaran){
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/mongmbek","root","");
        boolean sukses = false;
        
        try{
            String insert = "UPDATE pendaftaran SET nama_pdft = '"+dataPendaftaran.getNamaPendaftar()+"',"
                    + "jk_pdft='"+ dataPendaftaran.getJkPendaftar()+"',"
                    + "nohp_pdft='"+ dataPendaftaran.getNohpPendaftar()+"',"
                    + "alamat_pdft='"+ dataPendaftaran.getAlamat()+"',"
                    + "username='"+ dataPendaftaran.getUsername()+"',"
                    + "password='" + dataPendaftaran.getPassword()+"'where id_pdft='" + dataPendaftaran.getId()+"'";
            
            akses.connect();
            
            int baris = akses.executeUpdate(insert);
            if (baris > 0) {
                sukses = true;
            }
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                akses.disconnect();
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
        return sukses;
    }
//    public Pendaftaran[]getPendaftaran(String Jenis){
//        Pendaftaran[]dataPendaftaran = null;
//        Pendaftaran tempPendaftaran = null;
//        ArrayList listPendaftaran = new ArrayList();
//        
//        Connection con = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//        
//        String dbUrl = "jdbc:mysql://localhost:3306/mongmbek";
//        String pwd = "";
//        String login = "root";
//        String sql = "Select * from pendaftaran where kategori_barang='"+Jenis+"'";
//        
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection(dbUrl, login, pwd);
//            stmt = con.createStatement();
//            rs = stmt.executeQuery(sql);
//            
//            String kode_supplier = null;
//            while(rs.next()){
//                tempKategori = new Kategori();
//                tempKategori.setKode(rs.getInt("idb"));
//                tempKategori.setNamaBarang(rs.getString("nama_barang"));
//                tempKategori.setHarga(rs.getInt("harga_barang"));
//                tempKategori.setKategori(rs.getString("kategori_barang"));
//                listKategori.add(tempKategori);
//            }
//            dataKategori = new Kategori[listKategori.size()];
//            listKategori.toArray(dataKategori);
//        }catch(ClassNotFoundException a){
//            a.printStackTrace();
//        }catch(SQLException a){
//            a.printStackTrace();
//        }finally{
//            try{
//                rs.close();
//                stmt.close();
//                con.clearWarnings();
//                return dataKategori;
//            }catch(SQLException b){
//                b.printStackTrace();
//                return dataKategori;
//            }
//        }
//    }
}
