/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

/**
 *
 * @author Olja
 */
@Entity
@Table(name = "sluzbenik")
public class Sluzbenik implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Pattern(regexp = "^(?=\\s*\\S).*$")
    @Column(nullable = false, length = 255)
    private String ime;
    @Pattern(regexp = "^(?=\\s*\\S).*$")
    @Column(nullable = false, length = 255)
    private String prezime;
    @Pattern(regexp = "^(?=\\s*\\S).*$")
    @Column(nullable = false, length = 255)
    private String username;
    @Pattern(regexp = "^(?=\\s*\\S).*$")
    @Column(nullable = false, length = 255)
    private String password;
    @Pattern(regexp = "^(?=\\s*\\S).*$")
    @Column(nullable = false, length = 255)
    private String email;
    @Column(nullable = false)
    private boolean ulogovan;

    public Sluzbenik() {
    }

    public Sluzbenik(String ime, String prezime, String username, String password, String email, boolean ulogovan) {
        this.ime = ime;
        this.prezime = prezime;
        this.username = username;
        this.password = password;
        this.email = email;
        this.ulogovan = ulogovan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isUlogovan() {
        return ulogovan;
    }

    public void setUlogovan(boolean ulogovan) {
        this.ulogovan = ulogovan;
    }

    @Override
    public String toString() {
        return this.ime + " " + this.prezime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sluzbenik other = (Sluzbenik) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        return true;
    }

}
