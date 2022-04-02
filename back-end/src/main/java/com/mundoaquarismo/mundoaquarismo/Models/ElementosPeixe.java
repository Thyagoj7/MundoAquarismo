package com.mundoaquarismo.mundoaquarismo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class ElementosPeixe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;

    private String nome;
    private String especie;
    private String local;
    private String familia;
    private String tipoagua;
    private String alimentacao;
    private String informacao;

    public long getCodigo() { return codigo;}

    public void setCodigo(long codigo) {this.codigo = codigo;}

    public String getInformacao() {return informacao;}

    public void setInformacao(String informacao) {this.informacao = informacao;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getTipoagua() {
        return tipoagua;
    }

    public void setTipoagua(String tipoagua) {
        this.tipoagua = tipoagua;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }


}
