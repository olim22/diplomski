/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fon.silab.njt.diplomski.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Olja
 */
@Entity
public class Dobavljac implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2, message = "Invalid name")
    private String nazivDobavljaca;
    @NotNull
    @Size(min = 9, max = 9, message = "Invalid pib")
    private String pib;
    @NotNull
    @Size(min = 8, max = 8, message = "Invalid maticni broj")
    private String maticniBroj;
    @NotNull
    @Size(min = 2, message = "Invalid account")
    private String tekuciRacun;
    @NotNull
    @Size(min = 2, message = "Invalid name of bank")
    private String banka;
    @NotNull
    @ManyToOne
    private Grad grad;

    public Dobavljac() {
    }

    public Dobavljac(String nazivDobavljaca, String pib, String maticniBroj, String tekuciRacun, String banka, Grad grad) {
        this.nazivDobavljaca = nazivDobavljaca;
        this.pib = pib;
        this.maticniBroj = maticniBroj;
        this.tekuciRacun = tekuciRacun;
        this.banka = banka;
        this.grad = grad;
    }

    public String getNazivDobavljaca() {
        return nazivDobavljaca;
    }

    public void setNazivDobavljaca(String nazivDobavljaca) {
        this.nazivDobavljaca = nazivDobavljaca;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getMaticniBroj() {
        return maticniBroj;
    }

    public void setMaticniBroj(String maticniBroj) {
        this.maticniBroj = maticniBroj;
    }

    public String getTekuciRacun() {
        return tekuciRacun;
    }

    public void setTekuciRacun(String tekuciRacun) {
        this.tekuciRacun = tekuciRacun;
    }

    public String getBanka() {
        return banka;
    }

    public void setBanka(String banka) {
        this.banka = banka;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Grad getGrad() {
        return grad;
    }

    public void setGrad(Grad grad) {
        this.grad = grad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.id);
        hash = 47 * hash + Objects.hashCode(this.nazivDobavljaca);
        hash = 47 * hash + Objects.hashCode(this.pib);
        hash = 47 * hash + Objects.hashCode(this.maticniBroj);
        hash = 47 * hash + Objects.hashCode(this.tekuciRacun);
        hash = 47 * hash + Objects.hashCode(this.banka);
        hash = 47 * hash + Objects.hashCode(this.grad);
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
        final Dobavljac other = (Dobavljac) obj;
        if (!Objects.equals(this.nazivDobavljaca, other.nazivDobavljaca)) {
            return false;
        }
        if (!Objects.equals(this.pib, other.pib)) {
            return false;
        }
        if (!Objects.equals(this.maticniBroj, other.maticniBroj)) {
            return false;
        }
        if (!Objects.equals(this.tekuciRacun, other.tekuciRacun)) {
            return false;
        }
        if (!Objects.equals(this.banka, other.banka)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.grad, other.grad)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dobavljac: " + nazivDobavljaca;
    }

}
