/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectmobil;

/**
 *
 * @author SARA VIKANA BANGUN
 */
public class Mobil {
    private String merek;
 private String warna;
 private int jumlahpintu;
 private String jenis;


    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getJumlahpintu() {
        return jumlahpintu;
    }

    public void setJumlahpintu(int jumlahpintu) {
        this.jumlahpintu = jumlahpintu;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
 
 public void tampilkandata(){
        System.out.println("merek mobil :"+getMerek());
        System.out.println("warna mobil :"+getWarna());
        System.out.println("total pintu :"+getJumlahpintu());
        System.out.println("jenis mobil :"+getJenis());
        
 }
 public void inputData(String m,String w,String j,int jp){
     setMerek(m);
     setWarna(w);
     setJenis(j);
     setJumlahpintu(jp);
 }


}
