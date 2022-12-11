/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no2_a_3112_perbaikan;

/**
 *
 * @author ASUS
 */
public class SalariedEmployee extends Employer {
double uangmakan;
     double tunjangankinerja;
 
    public SalariedEmployee()
    {
        jabatan_3112="salaried employee";
        uangmakan_3112=500000.0;
        tunjangankinerja=500000.0;
    }
 
    public double perhitungangaji()
    {
        double potongan;
        gajikotor_3112=gajipokok_3112+uangmakan_3112+tunjangankinerja;
        potongan=(10.0/100.0)*gajikotor_3112;
        gajibersih_3112=gajikotor_3112-potongan;
     
        System.out.println ("Gaji Pokok : " +gajipokok_3112);
        System.out.println ("Uang Makan : " +uangmakan_3112);
        System.out.println ("Tunjangan Kinerja : " +tunjangankinerja);
        System.out.println ("Gaji Kotor : " +gajikotor_3112);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +gajibersih_3112);
     
        return gajibersih_3112;
    }
}
