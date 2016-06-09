/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yahyaz_rif
 */
@Entity
@Table(name = "ligne_prod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LigneProd.findAll", query = "SELECT l FROM LigneProd l"),
    @NamedQuery(name = "LigneProd.deleteAll", query = "DELETE FROM LigneProd l"),
    @NamedQuery(name = "LigneProd.findById", query = "SELECT l FROM LigneProd l WHERE l.id = :id"),
    @NamedQuery(name = "LigneProd.findByNbLignes", query = "SELECT l FROM LigneProd l WHERE l.nbLignes = :nbLignes")})
public class LigneProd implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nbLignes")
    private int nbLignes;
    @OneToMany(mappedBy = "nbLignes")
    private List<Produit> produitList;

    public LigneProd() {
    }

    public LigneProd(Integer id) {
        this.id = id;
    }

    public LigneProd(Integer id, int nbLignes) {
        this.id = id;
        this.nbLignes = nbLignes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNbLignes() {
        return nbLignes;
    }

    public void setNbLignes(int nbLignes) {
        this.nbLignes = nbLignes;
    }

    @XmlTransient
    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
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
        if (!(object instanceof LigneProd)) {
            return false;
        }
        LigneProd other = (LigneProd) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.LigneProd[ id=" + id + " ]";
    }
    
}
