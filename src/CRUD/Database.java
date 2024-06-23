/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
import java.sql.Connection; // mendapatkan koneksi
import java.sql.DriverManager; // menghubunkan database
import java.sql.PreparedStatement; // perintah sql [CRUD]
import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author ACER
 */
public class Database {
    private String databaseName = "muhammad_fadhil_hamidi_2210010243";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;

    public Database(){
        try {
            String location = "jdbc:mysql://localhost:3307/" + databaseName;
            Class.forName("com.mysql.jdbc.Driver");
            connectionDB = DriverManager.getConnection(location, username, password);
            System.out.println("connected");

        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void tambahTbGuru(String kode_guru, String nama_guru, String alamat, String no_telp, String pendidikan_akhir){
        try {
            String sql = "insert into tb_guru (kode_guru, nama_guru, alamat, no_telp, pendidikan_akhir) value(?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_guru);
            perintah.setString(2, nama_guru);
            perintah.setString(3, alamat);
            perintah.setString(4, no_telp);
            perintah.setString(5, pendidikan_akhir);
            
            perintah.executeUpdate();
            System.out.println("added");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    public void ubahTbGuru(String kode_guru, String nama_guru, String alamat, String no_telp, String pendidikan_akhir){
        try {
            String sql = "update tb_guru set nama_guru = ?, alamat = ?, no_telp = ?, pendidikan_akhir = ? where kode_guru = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_guru);
            perintah.setString(2, alamat);
            perintah.setString(3, no_telp);
            perintah.setString(4, pendidikan_akhir);
            perintah.setString(5, kode_guru);

            
            perintah.executeUpdate();
            System.out.println("updated");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTbGuru(String kode_guru){
        try {
            String sql = "delete from tb_guru where kode_guru = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_guru);
            
            perintah.executeUpdate();
            System.out.println("deleted");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Tabel Mapel
    
    public void tambahTbMapel(String kode_mapel, String nama_mapel, String nilai_standar_minimum){
        try {
            String sql = "insert into tb_mapel (kode_mapel, nama_mapel, nilai_standar_minimum) value(?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_mapel);
            perintah.setString(2, nama_mapel);
            perintah.setString(3, nilai_standar_minimum);
    
            
            perintah.executeUpdate();
            System.out.println("added");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    public void ubahTbMapel(String kode_mapel, String nama_mapel, String nilai_standar_minimum){
        try {
            String sql = "update tb_mapel set nama_mapel = ?, nilai_standar_minimum = ? where kode_mapel = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_mapel);
            perintah.setString(2, nilai_standar_minimum);
            perintah.setString(3, kode_mapel);
     
            
            perintah.executeUpdate();
            System.out.println("updated");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTbMapel(String kode_mapel){
        try {
            String sql = "delete from tb_mapel where kode_mapel = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_mapel);
            
            perintah.executeUpdate();
            System.out.println("deleted");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Tabel Pengampu
    public void tambahTbPengampu(String kode_pengampu, String kode_guru, String kode_mapel){
        try {
            String sql = "insert into tb_pengampu (kode_pengampu, kode_guru, kode_mapel) value(?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_pengampu);
            perintah.setString(2, kode_guru);
            perintah.setString(3, kode_mapel);
    
            
            perintah.executeUpdate();
            System.out.println("added");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    public void ubahTbPengampu(String kode_pengampu, String kode_guru, String kode_mapel){
        try {
            String sql = "update tb_pengampu set kode_mapel = ?, kode_guru = ? where kode_pengampu = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_mapel );
            perintah.setString(2, kode_guru);
            perintah.setString(3, kode_pengampu);
     
            
            perintah.executeUpdate();
            System.out.println("updated");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTbPengampu(String kode_pengampu){
        try {
            String sql = "delete from tb_pengampu where kode_pengampu = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_pengampu);
            
            perintah.executeUpdate();
            System.out.println("deleted");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Tabel Ulangan
    public void tambahTbUlangan(String kode_ulangan, String nama_ulangan){
        try {
            String sql = "insert into tb_ulangan (kode_ulangan, nama_ulangan) value(?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_ulangan);
            perintah.setString(2, nama_ulangan);
    
            
            perintah.executeUpdate();
            System.out.println("added");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    public void ubahTbUlangan(String kode_ulangan, String nama_ulangan){
        try {
            String sql = "update tb_ulangan set nama_ulangan= ? where kode_ulangan = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, nama_ulangan );
            perintah.setString(2, kode_ulangan);
            
     
            
            perintah.executeUpdate();
            System.out.println("updated");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTbUlangan(String kode_ulangan){
        try {
            String sql = "delete from tb_ulangan where kode_ulangan = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, kode_ulangan);
            
            perintah.executeUpdate();
            System.out.println("deleted");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Cari Data Tb_Guru
    
    public void cariTbGuru(String kode_guru){
        try {
        String sql="SELECT*FROM tb_guru WHERE kode_guru=?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, kode_guru);
        ResultSet data = perintah.executeQuery();
        while(data.next()){
            System.out.print("kode_guru :"+data.getString("kode_guru"));
            System.out.print("nama_guru :"+data.getString("nama_guru"));
            System.out.print("alamat :"+data.getString("alamat"));
            System.out.print("no_telp :"+data.getString("no_telp"));
            System.out.print("pendidikan_akhir :"+data.getString("pendidikan_akhir"));
            }
           }catch (Exception e) {
            System.out.println(e.getMessage());
        }
      }
    
    //Data Tb_Guru
    
    public void dataTbGuru(){
        try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT*FROM tb_guru ORDER by kode_guru ASC");
        while(baris.next()){
           System.out.println(baris.getString("kode_guru")+"|"+
                              baris.getString("nama_guru")+"|"+
                              baris.getString("alamat")+"|"+
                              baris.getString("no_telp") +"|"+
                              baris.getString("pendidikan_akhir"));
            }
           } catch (Exception e) {
            System.err.println(e.getMessage());
        }
      }
    
      //Cari Data Tb_Mapel
    
    public void cariTbMapel(String kode_mapel){
        try {
        String sql="SELECT*FROM tb_mapel WHERE kode_mapel=?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, kode_mapel);
        ResultSet data = perintah.executeQuery();
        while(data.next()){
            System.out.print("kode_mapel :" +data.getString("kode_mapel"));
            System.out.print("nama_mapel :" +data.getString("nama_mapel"));
            System.out.print("nilai_standar_minimum :" +data.getString("nilai_standar_minimum"));
            }
           }catch (Exception e) {
            System.out.println(e.getMessage());
        }
      }
    
     //Data Tb_Mapel
    
    public void dataTbMapel(){
        try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT*FROM tb_mapel ORDER by kode_mapel ASC");
        while(baris.next()){
           System.out.println(baris.getString("kode_mapel")+"|"+
                              baris.getString("nama_mapel")+"|"+
                              baris.getString("nilai_standar_minimum"));
            }
           } catch (Exception e) {
            System.err.println(e.getMessage());
        }
      }
    
    //Cari Data Tb_Pengampu
    
    public void cariTbPengampu(String kode_pengampu){
        try {
        String sql="SELECT*FROM tb_pengampu WHERE kode_pengampu=?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, kode_pengampu);
        ResultSet data = perintah.executeQuery();
        while(data.next()){
            System.out.print("kode_pengampu :" +data.getString("kode_pengampu"));
            System.out.print("kode_guru :" +data.getString("kode_guru"));
            System.out.print("kode_mapel :" +data.getString("kode_mapel"));
            }
           }catch (Exception e) {
            System.out.println(e.getMessage());
        }
      }
    
    public void dataTbPengampu(){
        try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT*FROM tb_pengampu ORDER by kode_pengampu ASC");
        while(baris.next()){
           System.out.println(baris.getString("kode_pengampu")+"|"+
                              baris.getString("kode_guru")+"|"+
                              baris.getString("kode_mapel"));
            }
           } catch (Exception e) {
            System.err.println(e.getMessage());
        }
      }
    
       //Cari Data Tb_Ulangan
    
    public void cariTbUlangan(String kode_ulangan){
        try {
        String sql="SELECT*FROM tb_ulangan WHERE kode_ulangan=?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, kode_ulangan);
        ResultSet data = perintah.executeQuery();
        while(data.next()){
            System.out.print("kode_ulangan :" +data.getString("kode_ulangan"));
            System.out.print("nama_ulangan :" +data.getString("nama_ulangan"));
            }
           }catch (Exception e) {
            System.out.println(e.getMessage());
        }
      }
    
         //Data Tb_Ulangan
    
    public void dataTbUlangan(){
        try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT*FROM tb_ulangan ORDER by kode_ulangan ASC");
        while(baris.next()){
           System.out.println(baris.getString("kode_ulangan")+"|"+
                              baris.getString("nama_ulangan"));
            }
           } catch (Exception e) {
            System.err.println(e.getMessage());
        }
      }
}
   

