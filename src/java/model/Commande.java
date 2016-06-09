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
@Table(name = "commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commande.findAllCommandeByDateEnvoiPrevue", query = "SELECT c FROM Commande c ORDER BY c.dEnvoiPrevue"),
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c"),
    @NamedQuery(name = "Commande.deleteAll", query = "DELETE FROM Commande c"),
    @NamedQuery(name = "Commande.findById", query = "SELECT c FROM Commande c WHERE c.id = :id"),
    @NamedQuery(name = "Commande.findByStockMin", query = "SELECT c FROM Commande c WHERE c.stockMin = :stockMin"),
    @NamedQuery(name = "Commande.findByDEnvoiPrevue", query = "SELECT c FROM Commande c WHERE c.dEnvoiPrevue = :dEnvoiPrevue"),
    @NamedQuery(name = "Commande.findByDEnvoiReel", query = "SELECT c FROM Commande c WHERE c.dEnvoiReel = :dEnvoiReel"),
    @NamedQuery(name = "Commande.findByPenalite", query = "SELECT c FROM Commande c WHERE c.penalite = :penalite")})
public class Commande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "id")
    private String id;
    @Column(name = "stockMin")
    private Integer stockMin;
    @Column(name = "dEnvoiPrevue")
    private Integer dEnvoiPrevue;
    @Column(name = "dEnvoiReel")
    private Integer dEnvoiReel;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "penalite")
    private Float penalite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCommande")
    private List<ProduitCommande> produitCommandeList;

    public Commande() {
    }

    public Commande(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStockMin() {
        return stockMin;
    }

    public void setStockMin(Integer stockMin) {
        this.stockMin = stockMin;
    }

    public Integer getDEnvoiPrevue() {
        return dEnvoiPrevue;
    }

    public void setDEnvoiPrevue(Integer dEnvoiPrevue) {
        this.dEnvoiPrevue = dEnvoiPrevue;
    }

    public Integer getDEnvoiReel() {
        return dEnvoiReel;
    }

    public void setDEnvoiReel(Integer dEnvoiReel) {
        this.dEnvoiReel = dEnvoiReel;
    }

    public Float getPenalite() {
        return penalite;
    }

    public void setPenalite(Float penalite) {
        this.penalite = penalite;
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
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.Commande[ id=" + id + " ]";
    }
    
}
