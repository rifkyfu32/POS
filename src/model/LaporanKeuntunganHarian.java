/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.math.BigDecimal;

/**
 *
 * @author Fuady
 */

public class LaporanKeuntunganHarian {
    private String namaBarang;
    private BigDecimal keuntungan;

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public BigDecimal getKeuntungan() {
        return keuntungan;
    }

    public void setKeuntungan(BigDecimal keuntungan) {
        this.keuntungan = keuntungan;
    }
    
}
