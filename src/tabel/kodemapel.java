/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel;

/**
 *
 * @author asus
 */
public class kodemapel {
    
    String kode5, nama5, nilai5, kode6, nama6, nilai6;
    
    public kodemapel(){}
    
     public kodemapel(String kodeMAPEL1){
     this.kode5 = kodeMAPEL1;
     }//constructor 2
     
     public kodemapel(String kodeMAPEL1, String namaMAPEL1){
     this.kode5 = kodeMAPEL1;
     this.nama5 = namaMAPEL1;
     }//constructor 3
     
     public kodemapel(String kodeMAPEL1, String namaMAPEL1, String nilaiStandard){
     this.kode5 = kodeMAPEL1;
     this.nama5 = namaMAPEL1;
     this.nilai5 = nilaiStandard;
     }//constructor 4
     
    public void inputKODEMAPEL2(String kodmapel2){
        this.kode5 = kodmapel2;
    }
    
    public String ambilKODEMAPEL2(){
        this.kode6 ="";
        if (this.kode5.equals("I")){
            this.kode6 = "101";
        } else if (this.kode5.equals("II")){
            this.kode6 = "101";
        } else { this.kode5= "103";}
        
        return this.kode6;
    }
    
    public void inputNAMAMAPEL2(String nammapel2){
        this.nama5 = nammapel2;
    }
    
    public String ambilNAMAMAPEL2(){
        this.nama6 ="";
        if (this.nama5.equals("1")){
            this.nama6 = "Matematika";
        } else if (this.nama5.equals("2")){
            this.nama6 = "PBO1";
        } else { this.nama5= "Inggris";}
        
        return this.nama6;
    }
    
    public void inputNILAI2(String alamatNilai2){
        this.nilai5 = alamatNilai2;
    }
    
    public String ambilNILAI2(){
         this.nilai6 ="";
        if (this.nilai5.equals("1")){
            this.nilai6 = "100";
        } else if (this.nilai5.equals("2")){
            this.nilai6 = "90";
        } else { this.nilai5= "80";}
        
        return this.nilai6;
    }
    
    
}
