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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yahyaz_rif
 */
@Entity
@Table(name = "produit_commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProduitCommande.findProduitByCommande", query = "SELECT p FROM ProduitCommande p WHERE p.idCommande = :commande"),
    @NamedQuery(name = "ProduitCommande.findAll", query = "SELECT p FROM ProduitCommande p"),
    @NamedQuery(name = "ProduitCommande.deleteAll", query = "DELETE FROM ProduitCommande p"),
    @NamedQuery(name = "ProduitCommande.findById", query = "SELECT p FROM ProduitCommande p WHERE p.id = :id"),
    @NamedQuery(name = "ProduitCommande.findByNbUnites", query = "SELECT p FROM ProduitCommande p WHERE p.nbUnites = :nbUnites")})
public class ProduitCommande implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nb_unites")
    private Integer nbUnites;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProduitCommande")
    private List<Produit> produitList;
    @JoinColumn(name = "id_type_produit", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private ProduitType idTypeProduit;
    @JoinColumn(name = "id_commande", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Commande idCommande;

    public ProduitCommande() {
    }

    public ProduitCommande(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNbUnites() {
        return nbUnites;
    }

    public void setNbUnites(Integer nbUnites) {
        this.nbUnites = nbUnites;
    }

    @XmlTransient
    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }

    public ProduitType getIdTypeProduit() {
        return idTypeProduit;
    }

    public void setIdTypeProduit(ProduitType idTypeProduit) {
        this.idTypeProduit = idTypeProduit;
    }

    public Commande getIdCommande() {
        return idCommande;
    }

    public void setIdCommande(Commande idCommande) {
        this.idCommande = idCommande;
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
        if (!(object instanceof ProduitCommande)) {
            return false;
        }
        ProduitCommande other = (ProduitCommande) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.ProduitCommande[ id=" + id + " ]";
    }
    
}
