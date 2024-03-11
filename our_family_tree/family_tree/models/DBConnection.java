package family_tree.models;

import family_tree.repository.People;
import family_tree.repository.Relations;

public interface DBConnection {
    
    public void connect();
    public void addPerson(People name);
    public void addRelation(Relations relations);
    public void connectRelation(Relations relations);

}
