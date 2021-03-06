/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ferasweb.curriculoonline.model.entity;

import com.ferasweb.curriculoonline.model.commons.EntityInterface;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author Andressa
 */
@Entity
@Table(name = "Grupo")
public class Grupo implements EntityInterface<Grupo>{
    
    @TableGenerator(name="Grupo_Generator",
            table="GENERATED_KEYS",
            pkColumnName="PK_COLUMN",
            valueColumnName="VALUE_COLUMN",
            pkColumnValue="Grupó_ID",
            allocationSize=10
    )
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "Grupo_Generator")
    @Column(name = "Grupo_Cod")
    private Integer grupoCod;
    
    @Column(name = "descricao")
    private String descricao;

    @Column(name = "nome")
    private String nome;

    public Grupo() {
    }

    public Grupo(String descricao, String nome) {
        this.descricao = descricao;
        this.nome = nome;
    }
    
    public Integer getGrupoCod() {
        return grupoCod;
    }

    public void setGrupoCod(Integer grupoCod) {
        this.grupoCod = grupoCod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public Serializable getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getLabel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean verificarId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isMarcado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Grupo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
