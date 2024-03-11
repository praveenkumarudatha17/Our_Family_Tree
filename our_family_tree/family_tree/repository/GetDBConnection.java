package family_tree.repository;

import family_tree.models.FemaleDB;
import family_tree.models.MaleDB;

public class GetDBConnection {

    public static MaleDB maleDbConnection = new MaleDB();

    public static FemaleDB femaleDbConnection = new FemaleDB();

    public static MaleDB getMaleDB(){
        return maleDbConnection;
    }   

    public static FemaleDB getFemaleDB(){
        return femaleDbConnection;
    }
    
}
