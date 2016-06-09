package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.Commande;
import metier.Produit;
import metier.ProduitType;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T16:08:32")
@StaticMetamodel(ProduitCommande.class)
public class ProduitCommande_ { 

    public static volatile SingularAttribute<ProduitCommande, ProduitType> idTypeProduit;
    public static volatile ListAttribute<ProduitCommande, Produit> produitList;
    public static volatile SingularAttribute<ProduitCommande, Integer> nbUnites;
    public static volatile SingularAttribute<ProduitCommande, Integer> id;
    public static volatile SingularAttribute<ProduitCommande, Commande> idCommande;

}