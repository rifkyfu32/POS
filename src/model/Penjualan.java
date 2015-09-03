/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Cascade;

/**
 *
 * @author Fuady
 */
@Entity
@Table(name="PEJUALAN")
public class Penjualan implements Serializable {
    @Id 
    @Column(name="ID")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TANGGAL",nullable=false)
    private Date tanggal;

    @OneToMany(mappedBy="penjualan",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    private List<PenjualanDetail> penjualanDetail;

    @Column(name = "JENIS_JUAL")
    @Enumerated(value = EnumType.STRING)
    private JenisPenjualan jenisPenjualan;
    
    @Column(name="TOTAL",precision=18,scale=0,nullable=false)
    private BigDecimal total;
    
    @Column(name="STATUS",nullable = false)
    private Integer status;
    
    @Column(name="KETERANGAN")
    private String keterangan;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PenjualanDetail> getPenjualanDetail() {
        return penjualanDetail;
    }

    public void setPenjualanDetail(List<PenjualanDetail> penjualanDetail) {
        this.penjualanDetail = penjualanDetail;
    }
    
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public JenisPenjualan getJenisPenjualan() {
        return jenisPenjualan;
    }

    public void setJenisPenjualan(JenisPenjualan jenisPenjualan) {
        this.jenisPenjualan = jenisPenjualan;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    
    
    
}
