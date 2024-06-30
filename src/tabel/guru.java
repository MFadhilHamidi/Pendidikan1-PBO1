/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel;

/**
 *
 * @author asus
 */
public class guru extends kodemapel {
    
  String kodeGuru, namaGuru, alamat, noTelp, pendAkhir;
    
    public guru(){}
    public guru(String kodeGuru, String namaGuru, String alamat, String noTelp, String pendAkhir){
    this.kodeGuru = kodeGuru;
    this.namaGuru = namaGuru;
    this.alamat = alamat;
    this.noTelp = noTelp;
    this.pendAkhir = pendAkhir;
    }
     
    public void inputKODEGURU(String kodGuru){
        this.kodeGuru = kodGuru;
    }
    
    public String ambilKODEGURU(){
        return this.kodeGuru;
    }
    
    public void inputNAMAGURU(String namGuru){
        this.namaGuru = namGuru;
    }
    
    public String ambilNAMAGURU(){
        return this.namaGuru;
    }
    
    public void inputALAMAT(String alamatGuru){
        this.alamat = alamatGuru;
    }
    
    public String ambilALAMAT(){
        return this.alamat;
    }
    
    public void inputTELP(String nomorTelp){
        this.noTelp = nomorTelp;
    }
    
    public String ambilTELP(){
        return this.noTelp;
    }
    
    public void inputAKHIR(String pendiAkhir){
        this.pendAkhir = pendiAkhir;
    }
    
    public String ambilAKHIR(){
        return this.pendAkhir;
    }
    

}


    

