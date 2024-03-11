package family_tree.repository;

public class FemaleAddRelation{

    public void addRelation(Relations relations){
        System.out.println("Adding  relation");
        GetDBConnection.getFemaleDB().addRelation(relations);
    }
}