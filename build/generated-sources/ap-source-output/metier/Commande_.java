package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.ProduitCommande;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T16:08:32")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Float> penalite;
    public static volatile SingularAttribute<Commande, Integer> stockMin;
    public static volatile SingularAttribute<Commande, Integer> dEnvoiReel;
    public static volatile ListAttribute<Commande, ProduitCommande> produitCommandeList;
    public static volatile SingularAttribute<Commande, String> id;
    public static volatile SingularAttribute<Commande, Integer> dEnvoiPrevue;

}