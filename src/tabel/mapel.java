/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tabel;


/**
 *
 * @author asus
 */
public class mapel extends kodeguru {
     String kode, nama, nilai;
    
    public mapel(){}
    
    public mapel(String kodeMapel){
     this.kode = kodeMapel;
     }//constructor 2
     
     public mapel(String kodeMapel, String namaMapel){
     this.kode = kodeMapel;
     this.nama = namaMapel;
     }//constructor 3
     
     public mapel(String kodeMapel, String namaMapel, String nilaiMapel){
     this.kode = kodeMapel;
     this.nama = namaMapel;
     this.nilai = nilaiMapel;
     }//constructor 3
     
     
    
    
    public void inputKODE(String kode){
        this.kode = kode;
    }
    
    public String ambilKODE(){
        return this.kode;
    }
    
    public void inputNAMA(String nama){
        this.nama = nama;
    }
    
    public String ambilNAMA(){
        return this.nama;
    }
    
    public void inputNILAI(String nilai){
        this.nilai = nilai;
    }
    
    public String ambilNILAI(){
        return this.nilai;
    }
    

}
    
    

    

