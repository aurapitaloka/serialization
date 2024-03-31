/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p03.serialization;
import java.io.Serializable;

/**
 *
 * @author Aura Pitaloka
 */
public class PItemStatic implements Serializable {
    static String nama;
    static double harga;

    public PItemStatic(String name, double price) {
        PItemStatic.nama = name;
       PItemStatic.harga = price;
    }

    @Override
    public String toString() {
        return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\n";
    }
}

