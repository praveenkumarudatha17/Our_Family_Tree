package family_tree.factories;

import family_tree.controllers.FamilyTreeController;
import family_tree.repository.FamilyTreePeople;
import family_tree.repository.Person;
import family_tree.exceptions.InvalidPersonException;

public class GetPersonGenderFactory {

    public static Person getPersonGender(FamilyTreePeople familyTreePeople) {
        Person person;
        switch (familyTreePeople) {
            case MALE:
                person = FamilyTreeController.getFamilyController(FamilyTreePeople.MALE);
                break;
            case FEMALE:
                person = FamilyTreeController.getFamilyController(FamilyTreePeople.FEMALE);
                break;
            default:
                throw new InvalidPersonException("Please mention the correct gender to proceed");
        }
        return person;
    }
}
