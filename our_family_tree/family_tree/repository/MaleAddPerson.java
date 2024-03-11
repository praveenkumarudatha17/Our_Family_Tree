package family_tree.repository;


public class MaleAddPerson {

    public void addPerson(People people){
        System.out.println("Adding the Male Person");
        GetDBConnection.getMaleDB().addPerson(people);
    }
    
}
