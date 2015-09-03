/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.ColumnTransformer;

/**
 *
 * @author Fuady
 */
@Entity
@Table(name = "LOGIN")
public class Login implements Serializable {

    @Id
    @Column(name = "USERNAME")
    private String username;
    @Column(columnDefinition = "LONGBLOB", name = "password")
    @ColumnTransformer(
            read = "AES_DECRYPT(password, 'fuck')",
            write = "AES_ENCRYPT(?, 'fuck')")
    private byte[] password;

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
