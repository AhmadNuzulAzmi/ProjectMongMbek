/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qurban;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mong.AksesJdbcOdbc;
/**
 *
 * @author ACER-NITRO
 */
public class QurbanFacade {
    public Qurban[]getDataQurban(){
        Qurban[]dataQurban = null;
        Qurban tempQurban = null;
        ArrayList listQurban= new ArrayList();
        
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        String dbUrl = "jdbc:mysql://localhost:3306/mongmbek";
        String pwd = "";
        String login = "root";
        String sql = "Select * from qurban";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            String kode_qurban = null;
            while(rs.next()){
                tempQurban = new Qurban();
                tempQurban.setId(rs.getInt("kode_qur"));
                tempQurban.setNamaPequrban(rs.getString("nama_qur"));
                tempQurban.setMasjid(rs.getString("nama_mas"));
                tempQurban.setKelompok(rs.getString("kelompok_qur"));
                tempQurban.setHarga(rs.getInt("harga_qur"));
                tempQurban.setBayar(rs.getString("bayar_qur"));
                listQurban.add(tempQurban);
            }
            dataQurban = new Qurban[listQurban.size()];
            listQurban.toArray(dataQurban);
        }catch(ClassNotFoundException a){
            a.printStackTrace();
        }catch(SQLException a){
            a.printStackTrace();
        }finally{
            try{
                rs.close();
                stmt.close();
                con.clearWarnings();
                return dataQurban;
            }catch(SQLException b){
                b.printStackTrace();
                return dataQurban;
            }
        }
    }
    public boolean create (Qurban dataQurban){
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/mongmbek","root","");
        try{
            String insert = "insert into qurban values("
                    + "'"+dataQurban.getId()+"',"
                    + "'"+dataQurban.getNamaPequrban()+"',"
                    + "'"+dataQurban.getMasjid()+"',"
                    + "'"+dataQurban.getKelompok()+"',"
                    + "'"+dataQurban.getHarga()+"',"
                    + "'"+dataQurban.getBayar()+"')";
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
            String insert = "DELETE FROM qurban where kode_qur='"+kode+"'";
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
    public Qurban getDataQurban(String kode){
        Qurban dataQurban = null;
        Qurban tempQurban = null;
        ArrayList listQurban = new ArrayList();
        
        Qurban qur = null;
        Connection con = null;
        ResultSet rs = null;
        Statement stmt = null;
        
        
        String dbUrl = "jdbc:mysql://localhost:3306/mongmbek";
        String pwd = "";
        String login = "root";
        String sql = "Select * from qurban where kode_qur = '"+kode+"'";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(dbUrl, login, pwd);
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            
            if(rs.next()){
                tempQurban = new Qurban();
                tempQurban.setId(rs.getInt("kode_qur"));
                tempQurban.setNamaPequrban(rs.getString("nama_qur"));
                tempQurban.setMasjid(rs.getString("nama_mas"));
                tempQurban.setKelompok(rs.getString("kelompok_qur"));
                tempQurban.setHarga(rs.getInt("harga_qur"));
                tempQurban.setBayar(rs.getString("bayar_qur"));
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
                return dataQurban;
            }catch(SQLException b){
                b.printStackTrace();
                return dataQurban;
            }
        }
    }
    public Qurban getDataQurbanByKode(String kode){
        Qurban qur = null;
        String pwd="";
        String login = "root";
        Connection con = null;
        ResultSet rs = null;
        
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/mongmbek",login,pwd);
        String sql= "SELECT * FROM qurban where kode_qur ='"+ kode +"'";
        
        try{
            con = akses.connect();
            rs = akses.executeQuery(sql);
            
            if(rs.next()){
                qur = new Qurban();
                qur.setId(rs.getInt("kode_qur"));
                qur.setNamaPequrban(rs.getString("nama_qur"));
                qur.setMasjid(rs.getString("nama_mas"));
                qur.setKelompok(rs.getString("kelompok_qur"));
                qur.setHarga(rs.getInt("harga_qur"));
                qur.setBayar(rs.getString("bayar_qur"));
                
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
                return qur;
            }
            catch(SQLException e){
                e.printStackTrace();
                return null;
            }
        }
    }
    public boolean store(Qurban dataQurban){
        AksesJdbcOdbc akses = new AksesJdbcOdbc("jdbc:mysql://localhost:3306/mongmbek","root","");
        boolean sukses = false;
        
        try{
            String insert = "UPDATE qurban SET nama_qur = '"+dataQurban.getNamaPequrban()+"',"
                    + "nama_mas='"+ dataQurban.getMasjid()+"',"
                    + "kelompok_qur='"+ dataQurban.getKelompok()+"',"
                    + "harga_qur='"+ dataQurban.getHarga()+"',"
                    + "bayar_qur='" + dataQurban.getBayar()+"'where kode_qur='" + dataQurban.getId()+"'";
            
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
}