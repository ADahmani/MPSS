/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yahyaz_rif
 */
@Entity
@Table(name = "produit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findDernierProduitProd", query = "SELECT p FROM Produit p WHERE p.nbLignes = :line ORDER BY p.dateDebutProd DESC"),
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.deleteAll", query = "DELETE FROM Produit p"),
    @NamedQuery(name = "Produit.findById", query = "SELECT p FROM Produit p WHERE p.id = :id"),
    @NamedQuery(name = "Produit.findByDateDebutProd", query = "SELECT p FROM Produit p WHERE p.dateDebutProd = :dateDebutProd")})
public class Produit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_debut_prod")
    private Integer dateDebutProd;
    @JoinColumn(name = "nbLignes", referencedColumnName = "id")
    @ManyToOne
    private LigneProd nbLignes;
    @JoinColumn(name = "id_pile", referencedColumnName = "id")
    @ManyToOne
    private Pile idPile;
    @JoinColumn(name = "id_produit_commande", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ProduitCommande idProduitCommande;

    public Produit() {
    }

    public Produit(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDateDebutProd() {
        return dateDebutProd;
    }

    public void setDateDebutProd(Integer dateDebutProd) {
        this.dateDebutProd = dateDebutProd;
    }

    public LigneProd getNbLignes() {
        return nbLignes;
    }

    public void setNbLignes(LigneProd nbLignes) {
        this.nbLignes = nbLignes;
    }

    public Pile getIdPile() {
        return idPile;
    }

    public void setIdPile(Pile idPile) {
        this.idPile = idPile;
    }

    public ProduitCommande getIdProduitCommande() {
        return idProduitCommande;
    }

    public void setIdProduitCommande(ProduitCommande idProduitCommande) {
        this.idProduitCommande = idProduitCommande;
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
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.Produit[ id=" + id + " ]";
    }
    
}
