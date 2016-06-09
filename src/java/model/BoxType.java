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
@Table(name = "box_type")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BoxType.deleteAll", query = "Delete FROM BoxType b"),
    @NamedQuery(name = "BoxType.findAll", query = "SELECT b FROM BoxType b"),
    @NamedQuery(name = "BoxType.findById", query = "SELECT b FROM BoxType b WHERE b.id = :id"),
    @NamedQuery(name = "BoxType.findByLbox", query = "SELECT b FROM BoxType b WHERE b.lbox = :lbox"),
    @NamedQuery(name = "BoxType.findByHbox", query = "SELECT b FROM BoxType b WHERE b.hbox = :hbox"),
    @NamedQuery(name = "BoxType.findFirstByLH", query = "SELECT b FROM BoxType b WHERE b.hbox = :hbox AND b.lbox = :lbox"),
    @NamedQuery(name = "BoxType.findByPrixBox", query = "SELECT b FROM BoxType b WHERE b.prixBox = :prixBox")})
public class BoxType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 55)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Lbox")
    private int lbox;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Hbox")
    private int hbox;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prixBox")
    private float prixBox;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTypeBox")
    private List<BoxAchete> boxAcheteList;

    public BoxType() {
    }

    public BoxType(String id) {
        this.id = id;
    }

    public BoxType(String id, int lbox, int hbox, float prixBox) {
        this.id = id;
        this.lbox = lbox;
        this.hbox = hbox;
        this.prixBox = prixBox;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLbox() {
        return lbox;
    }

    public void setLbox(int lbox) {
        this.lbox = lbox;
    }

    public int getHbox() {
        return hbox;
    }

    public void setHbox(int hbox) {
        this.hbox = hbox;
    }

    public float getPrixBox() {
        return prixBox;
    }

    public void setPrixBox(float prixBox) {
        this.prixBox = prixBox;
    }

    @XmlTransient
    public List<BoxAchete> getBoxAcheteList() {
        return boxAcheteList;
    }

    public void setBoxAcheteList(List<BoxAchete> boxAcheteList) {
        this.boxAcheteList = boxAcheteList;
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
        if (!(object instanceof BoxType)) {
            return false;
        }
        BoxType other = (BoxType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "metier.BoxType[ id=" + id + " ]";
    }
    
}
