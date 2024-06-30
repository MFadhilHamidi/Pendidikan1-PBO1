/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel;

/**
 *
 * @author asus
 */
public class kodeguru {
    
    String kodeGuru3, namaGuru3, alamat4, noTelp3, pendAkhir4, kode2, nama2,
            alamat3, nomorTelp, pendAKhir3;
    
    public kodeguru(){}
    
     public kodeguru(String kodeguru1){
     this.kodeGuru3 = kodeguru1;
     }//constructor 2
     
     public kodeguru(String kodeguru, String namaguru){
     this.kodeGuru3 = kodeguru;
     this.namaGuru3 = namaguru;
     }//constructor 3
     
     public kodeguru(String kodeguru1, String namaguru, String alamat){
     this.kodeGuru3 = kodeguru1;
     this.namaGuru3 = namaguru;
     this.alamat4 = alamat;
     }//constructor 4
     
     public kodeguru(String kodeguru1, String namaguru, String alamat, String notelp){
     this.kodeGuru3 = kodeguru1;
     this.namaGuru3 = namaguru;
     this.alamat4 = alamat;
     this.noTelp3 = notelp;
     }//constructor 5
     
     public kodeguru(String kodeguru1, String namaguru, String alamat, String notelp, String pendakhir){
     this.kodeGuru3 = kodeguru1;
     this.namaGuru3 = namaguru;
     this.alamat4 = alamat;
     this.noTelp3 = notelp;
     this.pendAkhir4 = pendakhir;
     }//constructor 5
     
     
     
     
    public void inputKODEGURU2(String kodGuru2){
        this.kodeGuru3 = kodGuru2;
    }
    
    public String ambilKODEGURU2(){
        this.kode2 ="";
        if (this.kodeGuru3.equals("I")){
            this.kode2 = "201";
        } else if (this.kodeGuru3.equals("II")){
            this.kode2 = "202";
        } else { this.kodeGuru3= "204";}
        
        return this.kode2;
    }
    
    public void inputNAMAGURU2(String namGuru2){
        this.namaGuru3 = namGuru2;
    }
    
    public String ambilNAMAGURU2(){
        this.nama2 ="";
        if (this.namaGuru3.equals("1")){
            this.nama2 = "Edwin";
        } else if (this.namaGuru3.equals("2")){
            this.nama2 = "Ahmad";
        } else { this.namaGuru3= "Nurul";}
        
        return this.nama2;
    }
    
    public void inputALAMAT2(String alamatGuru2){
        this.alamat4 = alamatGuru2;
    }
    
    public String ambilALAMAT2(){
         this.alamat3 ="";
        if (this.alamat4.equals("1")){
            this.alamat3 = "jl.veteran";
        } else if (this.alamat4.equals("2")){
            this.alamat3 = "A.Yani";
        } else { this.alamat4= "HKSN";}
        
        return this.alamat3;
    }
    
    public void inputTELP2(String nomorTelp2){
        this.noTelp3 = nomorTelp2;
    }
    
    public String ambilTELP2(){
         this.nomorTelp ="";
        if (this.noTelp3.equals("1")){
            this.nomorTelp = "081233532121";
        } else if (this.noTelp3.equals("2")){
            this.nomorTelp = "089765431234";
        } else { this.noTelp3= "081123456789";}
        
        return this.nomorTelp;
    }
    
    public void inputAKHIR2(String pendiAkhir2){
        this.pendAkhir4 = pendiAkhir2;
    }
    
    public String ambilAKHIR2(){
         this.pendAKhir3 ="";
        if (this.pendAkhir4.equals("1")){
            this.pendAKhir3 = "20 Agustus 2012";
        } else if (this.pendAkhir4.equals("2")){
            this.pendAKhir3 = "18 July 2013";
        } else { this.pendAkhir4= "21 Juny 2014";}
        return this.pendAKhir3;
    }
    

}

    

