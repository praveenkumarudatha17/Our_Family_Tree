package family_tree.factories;
import family_tree.exceptions.InvalidPersonException;
import family_tree.repository.FamilyTreePeople;
import family_tree.repository.FemalePerson;
import family_tree.repository.MalePerson;
import family_tree.repository.Person;

public class FamilyTreePeopleFactory{

    public static Person getFamilyPeople(FamilyTreePeople familyPeople){
        switch (familyPeople) {
            case MALE:
                return new MalePerson();
            case FEMALE:
                return new FemalePerson();
            default:
                throw new InvalidPersonException("Please choose the correct gender to proceed");
        }
    }
}