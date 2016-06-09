package metier;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import metier.BoxType;
import metier.Pile;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-06-09T16:08:32")
@StaticMetamodel(BoxAchete.class)
public class BoxAchete_ { 

    public static volatile SingularAttribute<BoxAchete, BoxType> idTypeBox;
    public static volatile ListAttribute<BoxAchete, Pile> pileList;
    public static volatile SingularAttribute<BoxAchete, Integer> id;
    public static volatile SingularAttribute<BoxAchete, Integer> libre;
    public static volatile SingularAttribute<BoxAchete, Integer> numBox;

}