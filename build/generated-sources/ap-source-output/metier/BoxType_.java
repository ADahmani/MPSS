package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.BoxAchete;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T16:08:32")
@StaticMetamodel(BoxType.class)
public class BoxType_ { 

    public static volatile SingularAttribute<BoxType, Integer> hbox;
    public static volatile SingularAttribute<BoxType, String> id;
    public static volatile SingularAttribute<BoxType, Float> prixBox;
    public static volatile SingularAttribute<BoxType, Integer> lbox;
    public static volatile ListAttribute<BoxType, BoxAchete> boxAcheteList;

}