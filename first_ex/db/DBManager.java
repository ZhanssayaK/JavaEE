package first_ex.db;

import java.util.ArrayList;

public class DBManager {
    private static int id = 2;
    private static ArrayList<Personal> personal = new ArrayList<>();

//    static {
//        personal.add(new Personal("Rauan", "Amantaiuly", "IT", 1000000, 1));
//    }

    public static ArrayList<Personal> getPersonal(){
        return personal;
    }
    public static void addPerson(Personal p){
        p.setId(id);
        personal.add(p);
        id++;
    }
}
