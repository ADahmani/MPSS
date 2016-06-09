package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.BoxAchete;
import metier.Produit;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T16:08:32")
@StaticMetamodel(Pile.class)
public class Pile_ { 

    public static volatile SingularAttribute<Pile, Integer> largeurPile;
    public static volatile ListAttribute<Pile, Produit> produitList;
    public static volatile SingularAttribute<Pile, Integer> id;
    public static volatile SingularAttribute<Pile, Integer> longueurPile;
    public static volatile SingularAttribute<Pile, BoxAchete> idBoxAchete;

}