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
public class PItemTransient implements Serializable {
    private transient String nama;
    private transient double harga;

    public PItemTransient(String name, double price) {
        this.nama = name;
        this.harga = price;
    }

    @Override
    public String toString() {
        return "\r\nNama=" + nama + "\r\nHarga=" + harga + "\r\n";
    }
}

