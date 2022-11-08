/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *  Nama : Nadiah Nuri Aisyah
 *  NRP : 5025211210
 *  Kelas : PBO B 
 */
public class main {

    public static void main(String[] args) {
        Enum mhs = Enum.MAHASISWA;
        System.out.println(mhs);
        
        Generic<String> nama = new Generic<>("Ismain bin Mail");
        System.out.println("Nama :" + nama.getdata());
        
        GenericsMethod demo = new GenericsMethod();
        demo.<String>genericsMethod("5025xxxxxx");
        
    }
    
}
