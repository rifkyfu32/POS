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
@Table(name="PEMBELIAN")
public class Pembelian implements Serializable {
    @Id
    @Column(name="NOTA",unique=true,nullable=false,length=15)
    private String nota;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="TANGGAL",nullable=false)
    private Date tanggal;

    @OneToMany(mappedBy="pembelian",cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @Cascade(org.hibernate.annotations.CascadeType.DELETE_ORPHAN)
    private List<PembelianDetail> pembelianDetail;

    @Column(name="TOTAL",precision=18,scale=0,nullable=false)
    private BigDecimal total;
    
    @Column(name="STATUS",nullable = false)
    private Integer status;
    
    @Column(name="KETERANGAN")
    private String keterangan;

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    public List<PembelianDetail> getPembelianDetail() {
        return pembelianDetail;
    }

    public void setPembelianDetail(List<PembelianDetail> pembelianDetail) {
        this.pembelianDetail = pembelianDetail;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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
    
    
}
