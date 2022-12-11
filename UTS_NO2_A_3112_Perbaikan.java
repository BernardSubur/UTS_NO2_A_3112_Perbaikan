/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no2_a_3112_perbaikan;

/**
 *
 * @author ASUS
 */
public class UTS_NO2_A_3112_Perbaikan {

    public static void main(String[] args) {
    Employer ref;
        SalariedEmployee pekerja=new SalariedEmployee();
        CommisionEmployee pegawai=new CommisionEmployee();
        ProjectPlaner atasan=new ProjectPlaner();
     
        System.out.println ("DAFTAR GAJI KARYAWAN");
        System.out.println ("\n");
     
        ref=pekerja;      
        ref.setNama ("Andy");
        ref.getNama();
        ref.jabatan_3112();
        ref.perhitungangaji();
        System.out.println ("\n");
     
        ref=pegawai;
        ref.setNama ("Ani");
        ref.getNama();
        ref.jabatan_3112();
        ref.perhitungangaji();
        System.out.println ("\n");
        ref=atasan;
        ref.setNama ("Bernard");
        ref.getNama();
        ref.jabatan_3112();
        ref.perhitungangaji();
        }
    }


