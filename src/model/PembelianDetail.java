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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Fuady
 */
@Entity
@Table(name = "PEMBELIAN_DETAIL")
public class PembelianDetail implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "NOTA_PEMBELIAN", nullable = false)
    private Pembelian pembelian;

    @Column(name = "JUMLAH", nullable = false)
    private Integer jumlah;

    @Column(name = "HARGA_BELI", nullable = false, precision = 18, scale = 0)
    private BigDecimal hargaBeli;

    @Column(name = "HARGA_GROSIR", nullable = false, precision = 18, scale = 0)
    private BigDecimal hargaGrosir;
    
    @Column(name = "HARGA_ECERAN", nullable = false, precision = 18, scale = 0)
    private BigDecimal hargaEceran;

    @Column(name = "SUBTOTAL", nullable = false, precision = 18, scale = 0)
    private BigDecimal subtotal;

    @ManyToOne
    @JoinColumn(name = "KODE_BARANG", nullable = false)
    private Barang barang;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pembelian getPembelian() {
        return pembelian;
    }

    public void setPembelian(Pembelian pembelian) {
        this.pembelian = pembelian;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public BigDecimal getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(BigDecimal hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public BigDecimal getHargaGrosir() {
        return hargaGrosir;
    }

    public void setHargaGrosir(BigDecimal hargaGrosir) {
        this.hargaGrosir = hargaGrosir;
    }

    public BigDecimal getHargaEceran() {
        return hargaEceran;
    }

    public void setHargaEceran(BigDecimal hargaEceran) {
        this.hargaEceran = hargaEceran;
    }

    

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

}
