package rockets;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

    //FASE 1
    //private String id_rocket;
    //private int propulsors;

    /*
    public Rocket(String id_rocket, int propulsors) {
        this.id_rocket = id_rocket;
        this.propulsors = propulsors;
    }

    public String getId_rocket() {
        return id_rocket;
    }

    public void setId_rocket(String id_rocket) {
        this.id_rocket = id_rocket;
    }

    public int getPropulsors() {
        return propulsors;
    }

    public void setPropulsors(int propulsors) {
        this.propulsors = propulsors;
    }

     */

    //FASE 2
    private String id_rocket;
    private ArrayList<Propulsor> propulsors;
    //= new ArrayList<Propulsor>();

    public Rocket(String id_rocket, ArrayList<Propulsor> propulsors) {
        this.id_rocket = id_rocket;
        this.propulsors = propulsors;
    }

    public String getId_rocket() {
        return id_rocket;
    }

    public void setId_rocket(String id_rocket) {
        this.id_rocket = id_rocket;
    }

    public ArrayList<Propulsor> getPropulsors() {
        return propulsors;
    }

    public void setPropulsors(ArrayList<Propulsor> propulsors) {
        this.propulsors = propulsors;
    }

    //FASE 3


    //FASE 4


}
