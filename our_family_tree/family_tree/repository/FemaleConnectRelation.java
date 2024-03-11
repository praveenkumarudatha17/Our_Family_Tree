package family_tree.repository;

public class FemaleConnectRelation{

    public void connectRelation(Relations relations){
        GetDBConnection.getFemaleDB().connectRelation(relations);
    }
    
}