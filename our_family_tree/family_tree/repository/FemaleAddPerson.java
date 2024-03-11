package family_tree.repository;


public class FemaleAddPerson {

    public void addPerson(People people){
        System.out.println("Adding the FeMale Person");
        GetDBConnection.getFemaleDB().addPerson(people);
    }
    
}
