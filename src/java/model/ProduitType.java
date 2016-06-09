/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yahyaz_rif
 */
@Entity
@Table(name = "produit_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProduitType.deleteAll", query = "DELETE FROM ProduitType p"),
    @NamedQuery(name = "ProduitType.findAll", query = "SELECT p FROM ProduitType p"),
    @NamedQuery(name = "ProduitType.findById", query = "SELECT p FROM ProduitType p WHERE p.id = :id"),
    @NamedQuery(name = "ProduitType.findByTSetup", query = "SELECT p FROM ProduitType p WHERE p.tSetup = :tSetup"),
    @NamedQuery(name = "ProduitType.findByTProduction", query = "SELECT p FROM ProduitType p WHERE p.tProduction = :tProduction"),
    @NamedQuery(name = "ProduitType.findByColor", query = "SELECT p FROM ProduitType p WHERE p.color = :color"),
    @NamedQuery(name = "ProduitType.findByHauteur", query = "SELECT p FROM ProduitType p WHERE p.hauteur = :hauteur"),
    @NamedQuery(name = "ProduitType.findByLongueur", query = "SELECT p FROM ProduitType p WHERE p.longueur = :longueur"),
    @NamedQuery(name = "ProduitType.findByNbEmpileMax", query = "SELECT p FROM ProduitType p WHERE p.nbEmpileMax = :nbEmpileMax")})
public class ProduitType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "id")
    private String id;
    @Column(name = "t_setup")
    private Integer tSetup;
    @Column(name = "t_production")
    private Integer tProduction;
    @Size(max = 45)
    @Column(name = "color")
    private String color;
    @Column(name = "hauteur")
    private Integer hauteur;
    @Column(name = "longueur")
    private Integer longueur;
    @Column(name = "nbEmpileMax")
    private Integer nbEmpileMax;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTypeProduit")
    private List<ProduitCommande> produitCommandeList;

    public ProduitType() {
    }

    public ProduitType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getTSetup() {
        return tSetup;
    }

    public void setTSetup(Integer tSetup) {
        this.tSetup = tSetup;
    }

    public Integer getTProduction() {
        return tProduction;
    }

    public void setTProduction(Integer tProduction) {
        this.tProduction = tProduction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getHauteur() {
        return hauteur;
    }

    public void setHauteur(Integer hauteur) {
        this.hauteur = hauteur;
    }

    public Integer getLongueur() {
        return longueur;
    }

    public void setLongueur(Integer longueur) {
        this.longueur = longueur;
    }

    public Integer getNbEmpileMax() {
        return nbEmpileMax;
    }

    public void setNbEmpileMax(Integer nbEmpileMax) {
        this.nbEmpileMax = nbEmpileMax;
    }

    @XmlTransient
    public List<ProduitCommande> getProduitCommandeList() {
        return produitCommandeList;
    }

    public void setProduitCommandeList(List<ProduitCommande> produitCommandeList) {
        this.produitCommandeList = produitCommandeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProduitType)) {
            return false;
        }
        ProduitType other = (ProduitType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.ProduitType[ id=" + id + " ]";
    }
    
}
