/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.uts_no2_a_3112_perbaikan;

/**
 *
 * @author ASUS
 */
public abstract class Employer {
  String nama;
    String jabatan_3112;
    double gajibersih_3112;
    double gajikotor_3112;
    double gajipokok_3112;
    double uangmakan_3112;
 
    public Employer()
    {
        gajipokok_3112=1500000.0;
    }
 
    public void setNama (String name)
    {
        this.nama=name;
    }
 
    public String getNama()
    {
        System.out.println ("Nama Karyawan : " +nama);
        return nama;
    }
 
    public String jabatan_3112()
    {
        System.out.println ("Posisi Jabatan : " +jabatan_3112);
        return jabatan_3112;
    }
 
    public abstract double perhitungangaji();
     
}
