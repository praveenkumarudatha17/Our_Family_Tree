package family_tree.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import family_tree.exceptions.PersonNotFoundException;
import family_tree.repository.People;
import family_tree.repository.Relations;

public class MaleDB implements DBConnection {

    public static HashMap<String,HashMap<String,List<String>>> maleDB = new HashMap<>();

    public static HashMap<String, HashMap<String, List<String>>> getDB() {
        return maleDB;
    }


    @Override
    public void addPerson(People people) {
        maleDB.put(people.getName(), new HashMap<String,List<String>>());
    }

    @Override
    public void addRelation(Relations relations) {
        maleDB.get(relations.getFirstPerson()).put(relations.getRelationName(),new ArrayList<String>());
        if (!maleDB.containsKey(relations.getFirstPerson()) || !maleDB.containsKey(relations.getSecPerson()))    {
            throw new PersonNotFoundException("The Given Person not in our family Please check");
        } 
        if (!maleDB.get(relations.getFirstPerson()).containsKey(relations.getSecPerson())){
            maleDB.get(relations.getFirstPerson()).get(relations.getRelationName()).add(relations.getSecPerson());
        }
        
    }

    @Override
    public void connect() {
        return;
        
    }

    @Override
    public void connectRelation(Relations relations) {
        maleDB.get(relations.getFirstPerson()).get(relations.getRelationName()).add(relations.getSecPerson());
    }

}
