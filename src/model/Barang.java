/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Fuady
 */
@Entity
@Table(name="BARANG")
public class Barang implements Serializable {
    @Id @GeneratedValue
    @Column(name="KODE")
    private Long kode;

    @Column(name="NAMA",unique=true,nullable=false,length=150)
    private String nama;

    @Column(name="HARGA_BELI",scale=0,precision=18)
    private BigDecimal hargaBeli;
    
    @Column(name="HARGA_JUAL_GROSIR",scale=0,precision=18)
    private BigDecimal hargaJualGrosir;
    
    @Column(name="HARGA_JUAL_ECERAN",scale=0,precision=18)
    private BigDecimal hargaJualEceran;
    
    @Column(name="SATUAN",length = 100)
    private String satuan;
    
    @Column(name="STOCK")
    private Integer stock;

    public Long getKode() {
        return kode;
    }

    public void setKode(Long kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public BigDecimal getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(BigDecimal hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public BigDecimal getHargaJualGrosir() {
        return hargaJualGrosir;
    }

    public void setHargaJualGrosir(BigDecimal hargaJualGrosir) {
        this.hargaJualGrosir = hargaJualGrosir;
    }

    public BigDecimal getHargaJualEceran() {
        return hargaJualEceran;
    }

    public void setHargaJualEceran(BigDecimal hargaJualEceran) {
        this.hargaJualEceran = hargaJualEceran;
    }    

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
    
    
}
