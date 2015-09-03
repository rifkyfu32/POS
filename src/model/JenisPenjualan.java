/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Fuady
 */
public enum JenisPenjualan {
    GROSIR("Grosir"),ECERAN("Eceran");

    private JenisPenjualan(String text) {
        this.text = text;
    }
    private final String text;

    @Override
    public String toString() {
        return text;
    }
    
}
