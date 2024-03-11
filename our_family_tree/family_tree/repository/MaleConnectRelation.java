package family_tree.repository;

public class MaleConnectRelation{

    public void connectRelation(Relations relations){
        GetDBConnection.getMaleDB().connectRelation(relations);
    }
}