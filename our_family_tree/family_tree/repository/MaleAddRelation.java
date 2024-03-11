package family_tree.repository;

public class MaleAddRelation {

    public void addRelation(Relations relations){
        System.out.println("Adding  relation");
        GetDBConnection.getMaleDB().addRelation(relations);
    }
}