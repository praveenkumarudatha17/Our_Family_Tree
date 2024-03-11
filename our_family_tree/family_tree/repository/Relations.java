package family_tree.repository;

public class Relations {
    
    public String firstPerson;
    public String secPerson;
    public String relationName;

    public Relations(String firstPerson, String secPerson, String relationName) {
        this.firstPerson = firstPerson;
        this.secPerson = secPerson;
        this.relationName = relationName;
    }
    public String getFirstPerson() {
        return firstPerson;
    }
    public void setFirstPerson(String firstPerson) {
        this.firstPerson = firstPerson;
    }
    public String getSecPerson() {
        return secPerson;
    }
    public void setSecPerson(String secPerson) {
        this.secPerson = secPerson;
    }

    public String getRelationName() {
        return relationName;
    }
    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }
    
}
