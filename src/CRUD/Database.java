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

    public void tambahTbGuru(String Kode_Guru, String Nama_Guru, String Alamat, String No_Telepon, String Pendidikan_Akhir){
        try {
            String sql = "insert into tb_guru (Kode_Guru, Nama_Guru, Alamat, No_Telepon, Pendidikan_Akhir) value(?, ?, ?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Kode_Guru);
            perintah.setString(2, Nama_Guru);
            perintah.setString(3, Alamat);
            perintah.setString(4, No_Telepon);
            perintah.setString(5, Pendidikan_Akhir);
            
            perintah.executeUpdate();
            System.out.println("added");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    public void ubahTbGuru(String Kode_Guru, String Nama_Guru, String Alamat, String No_Telepon, String Pendidikan_Akhir){
        try {
            String sql = "update tb_guru set Nama_Guru = ?, Alamat = ?, No_Telepon = ?, Pendidikan_Akhir = ? where Kode_Guru = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Nama_Guru);
            perintah.setString(2, Alamat);
            perintah.setString(3, No_Telepon);
            perintah.setString(4, Pendidikan_Akhir);
            perintah.setString(5, Kode_Guru);

            
            perintah.executeUpdate();
            System.out.println("updated");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTbGuru(String Kode_Guru){
        try {
            String sql = "delete from tb_guru where Kode_Guru = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Kode_Guru);
            
            perintah.executeUpdate();
            System.out.println("deleted");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Tabel Mapel
    
    public void tambahTbMapel(String Kode_MAPEL, String Nama_MAPEL, String Nilai_Standar_Minimum){
        try {
            String sql = "insert into tb_mapel (Kode_MAPEL, Nama_MAPEL, Nilai_Standar_Minimum) value(?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Kode_MAPEL);
            perintah.setString(2, Nama_MAPEL);
            perintah.setString(3, Nilai_Standar_Minimum);
    
            
            perintah.executeUpdate();
            System.out.println("added");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    public void ubahTbMapel(String Kode_MAPEL, String Nama_MAPEL, String Nilai_Standar_Minimum){
        try {
            String sql = "update tb_mapel set Nama_MAPEL = ?, Nilai_Standar_Minimum = ? where Kode_MAPEL = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Nama_MAPEL);
            perintah.setString(2, Nilai_Standar_Minimum);
            perintah.setString(3, Kode_MAPEL);
     
            
            perintah.executeUpdate();
            System.out.println("updated");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTbMapel(String Kode_MAPEL){
        try {
            String sql = "delete from tb_mapel where Kode_MAPEL = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Kode_MAPEL);
            
            perintah.executeUpdate();
            System.out.println("deleted");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Tabel Pengampu
    public void tambahTbPengampu(String Kode_Pengampu, String Kode_Guru, String Kode_MAPEL){
        try {
            String sql = "insert into tb_pengampu (Kode_Pengampu, Kode_Guru, Kode_MAPEL) value(?, ?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Kode_Pengampu);
            perintah.setString(2, Kode_Guru);
            perintah.setString(3, Kode_MAPEL);
    
            
            perintah.executeUpdate();
            System.out.println("added");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    public void ubahTbPengampu(String Kode_Pengampu, String Kode_Guru, String Kode_MAPEL){
        try {
            String sql = "update tb_pengampu set Kode_MAPEL = ?, Kode_Guru = ? where Kode_Pengampu = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Kode_MAPEL );
            perintah.setString(2, Kode_Guru);
            perintah.setString(3, Kode_Pengampu);
     
            
            perintah.executeUpdate();
            System.out.println("updated");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTbPengampu(String Kode_Pengampu){
        try {
            String sql = "delete from tb_pengampu where Kode_Pengampu = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Kode_Pengampu);
            
            perintah.executeUpdate();
            System.out.println("deleted");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Tabel Ulangan
    public void tambahTbUlangan(String Kode_Ulangan, String Nama_Ulangan){
        try {
            String sql = "insert into tb_ulangan (Kode_Ulangan, Nama_Ulangan) value(?, ?)";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Kode_Ulangan);
            perintah.setString(2, Nama_Ulangan);
    
            
            perintah.executeUpdate();
            System.out.println("added");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    
    public void ubahTbUlangan(String Kode_Ulangan, String Nama_Ulangan){
        try {
            String sql = "update tb_ulangan set Nama_Ulangan = ? where Kode_Ulangan = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Nama_Ulangan );
            perintah.setString(2, Kode_Ulangan);
            
     
            
            perintah.executeUpdate();
            System.out.println("updated");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusTbUlangan(String Kode_Ulangan){
        try {
            String sql = "delete from tb_ulangan where Kode_Ulangan = ?";
            PreparedStatement perintah = connectionDB.prepareStatement(sql);
            perintah.setString(1, Kode_Ulangan);
            
            perintah.executeUpdate();
            System.out.println("deleted");
            
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Cari Data Tb_Guru
    
    public void cariTbGuru(String Kode_Guru){
        try {
        String sql="SELECT*FROM tb_guru WHERE Kode_Guru=?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, Kode_Guru);
        ResultSet data = perintah.executeQuery();
        while(data.next()){
            System.out.print("Kode_Guru :"+data.getString("Kode_Guru"));
            System.out.print("Nama_Guru :"+data.getString("Nama_Guru"));
            System.out.print("Alamat :"+data.getString("Alamat"));
            System.out.print("Nomor_Telepon :"+data.getString("No_Telepon"));
            System.out.print("Pendidikan_Akhir :"+data.getString("Pendidikan_Akhir"));
            }
           }catch (Exception e) {
            System.out.println(e.getMessage());
        }
      }
    
    //Data Tb_Guru
    
    public void dataTbGuru(){
        try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT*FROM tb_guru ORDER by Kode_Guru ASC");
        while(baris.next()){
           System.out.println(baris.getString("Kode_Guru")+"|"+
                              baris.getString("Nama_Guru")+"|"+
                              baris.getString("Alamat")+"|"+
                              baris.getString("No_Telepon") +"|"+
                              baris.getString("Pendidikan_Akhir"));
            }
           } catch (Exception e) {
            System.err.println(e.getMessage());
        }
      }
    
      //Cari Data Tb_Mapel
    
    public void cariTbMapel(String Kode_Mapel){
        try {
        String sql="SELECT*FROM tb_mapel WHERE Kode_Mapel=?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, Kode_Mapel);
        ResultSet data = perintah.executeQuery();
        while(data.next()){
            System.out.print("Kode_Mapel :" +data.getString("Kode_Mapel"));
            System.out.print("Nama_Mapel :" +data.getString("Nama_Mapel"));
            System.out.print("Nilai_Standar_Minimum :" +data.getString("Nilai_Standar_Minimum"));
            }
           }catch (Exception e) {
            System.out.println(e.getMessage());
        }
      }
    
     //Data Tb_Mapel
    
    public void dataTbMapel(){
        try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT*FROM tb_mapel ORDER by Kode_Mapel ASC");
        while(baris.next()){
           System.out.println(baris.getString("Kode_Mapel")+"|"+
                              baris.getString("Nama_Mapel")+"|"+
                              baris.getString("Nilai_Standar_Minimum"));
            }
           } catch (Exception e) {
            System.err.println(e.getMessage());
        }
      }
    
    //Cari Data Tb_Pengampu
    
    public void cariTbPengampu(String Kode_Pengampu){
        try {
        String sql="SELECT*FROM tb_pengampu WHERE Kode_Pengampu=?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, Kode_Pengampu);
        ResultSet data = perintah.executeQuery();
        while(data.next()){
            System.out.print("Kode_Pengampu :" +data.getString("Kode_Pengampu"));
            System.out.print("Kode_Guru :" +data.getString("Kode_Guru"));
            System.out.print("Kode_MAPEL :" +data.getString("Kode_MAPEL"));
            }
           }catch (Exception e) {
            System.out.println(e.getMessage());
        }
      }
    
    public void dataTbPengampu(){
        try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT*FROM tb_pengampu ORDER by Kode_Pengampu ASC");
        while(baris.next()){
           System.out.println(baris.getString("Kode_Pengampu")+"|"+
                              baris.getString("Kode_Guru")+"|"+
                              baris.getString("Kode_Mapel"));
            }
           } catch (Exception e) {
            System.err.println(e.getMessage());
        }
      }
    
       //Cari Data Tb_Ulangan
    
    public void cariTbUlangan(String Kode_Ulangan){
        try {
        String sql="SELECT*FROM tb_ulangan WHERE Kode_Ulangan=?";
        PreparedStatement perintah = connectionDB.prepareStatement(sql);
        perintah.setString(1, Kode_Ulangan);
        ResultSet data = perintah.executeQuery();
        while(data.next()){
            System.out.print("Kode_Ulangan :" +data.getString("Kode_Ulangan"));
            System.out.print("Nama_Ulangan :" +data.getString("Nama_Ulangan"));
            }
           }catch (Exception e) {
            System.out.println(e.getMessage());
        }
      }
    
         //Data Tb_Ulangan
    
    public void dataTbUlangan(){
        try {
        Statement stmt = connectionDB.createStatement();
        ResultSet baris = stmt.executeQuery("SELECT*FROM tb_ulangan ORDER by Kode_Ulangan ASC");
        while(baris.next()){
           System.out.println(baris.getString("Kode_Ulangan")+"|"+
                              baris.getString("Nama_Ulangan"));
            }
           } catch (Exception e) {
            System.err.println(e.getMessage());
        }
      }
}
   

