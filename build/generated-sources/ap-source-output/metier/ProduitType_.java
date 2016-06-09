package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.ProduitCommande;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T16:08:32")
@StaticMetamodel(ProduitType.class)
public class ProduitType_ { 

    public static volatile SingularAttribute<ProduitType, Integer> longueur;
    public static volatile SingularAttribute<ProduitType, Integer> tProduction;
    public static volatile SingularAttribute<ProduitType, String> color;
    public static volatile ListAttribute<ProduitType, ProduitCommande> produitCommandeList;
    public static volatile SingularAttribute<ProduitType, Integer> tSetup;
    public static volatile SingularAttribute<ProduitType, String> id;
    public static volatile SingularAttribute<ProduitType, Integer> nbEmpileMax;
    public static volatile SingularAttribute<ProduitType, Integer> hauteur;

}