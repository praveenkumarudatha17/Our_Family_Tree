package family_tree.controllers;

import family_tree.repository.FamilyTreePeople;
import family_tree.repository.Person;

import java.util.HashMap;
import java.util.List;

import family_tree.factories.FamilyTreePeopleFactory;
import family_tree.models.FemaleDB;
import family_tree.models.MaleDB;

public class FamilyTreeController {

    public static Person getFamilyController(FamilyTreePeople familyTreePeople){
        return FamilyTreePeopleFactory.getFamilyPeople(familyTreePeople);
    }
    
    public static HashMap<String, HashMap<String, List<String>>> getDBConnection(FamilyTreePeople familyTreePeople){
        if (familyTreePeople.equals(FamilyTreePeople.MALE)) return MaleDB.getDB();
        return FemaleDB.getDB();
    }

}
