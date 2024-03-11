package family_tree.models;

import java.util.HashMap;
import java.util.List;

import family_tree.exceptions.PersonNotFoundException;
import family_tree.repository.People;
import family_tree.repository.Relations;

public class FemaleDB implements DBConnection {

    public static HashMap<String,HashMap<String,List<String>>> femaleDB = new HashMap<>();

    public static HashMap<String, HashMap<String, List<String>>> getDB() {
        return femaleDB;
    }


    @Override
    public void addPerson(People people) {
        femaleDB.put(people.getName(), new HashMap<String,List<String>>());
    }

    @Override
    public void addRelation(Relations relations) {
        if (!femaleDB.containsKey(relations.getFirstPerson()) || !femaleDB.containsKey(relations.getSecPerson())){
            throw new PersonNotFoundException("The Given Person not in our family Please check");
        }
        if (!femaleDB.get(relations.getFirstPerson()).containsKey(relations.getSecPerson())){
            femaleDB.get(relations.getFirstPerson()).get(relations.getRelationName()).add(relations.getSecPerson());
        }
    }

    @Override
    public void connect() {
        return;
    }

    @Override
    public void connectRelation(Relations relations) {
        femaleDB.get(relations.getFirstPerson()).get(relations.getRelationName()).add(relations.getSecPerson());
    }

}
