package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.LigneProd;
import metier.Pile;
import metier.ProduitCommande;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T16:08:32")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile SingularAttribute<Produit, Integer> dateDebutProd;
    public static volatile SingularAttribute<Produit, LigneProd> nbLignes;
    public static volatile SingularAttribute<Produit, Integer> id;
    public static volatile SingularAttribute<Produit, Pile> idPile;
    public static volatile SingularAttribute<Produit, ProduitCommande> idProduitCommande;

}