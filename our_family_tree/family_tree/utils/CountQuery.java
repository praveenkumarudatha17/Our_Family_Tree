package family_tree.utils;

import java.util.HashMap;
import java.util.List;

import family_tree.models.FemaleDB;
import family_tree.models.MaleDB;
import family_tree.repository.FamilyTreePeople;

public class CountQuery {

    public String name;
    public String relation;
    public HashMap<String, HashMap<String, List<String>>> dbConnection;
    public FamilyTreePeople gender;

    public CountQuery(String name, FamilyTreePeople gender, String relation) {
        this.name = name;
        this.gender = gender;
        this.relation = relation;
    }

    public int getCount(){
        if (gender.equals(FamilyTreePeople.MALE)){
            dbConnection = MaleDB.getDB();
        }
        else{
            dbConnection = FemaleDB.getDB();
        }
        return dbConnection.get(name).get(relation).size();
    }
}
