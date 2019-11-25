
//FASE 2
package rockets;

public class Propulsor {
    private int id_Propulsor;
    private int power;

    public Propulsor (int id_Propulsor, int power) {
        this.id_Propulsor = id_Propulsor;
        this.power = power;
    }

    public int getId_Propulsor() {
        return id_Propulsor;
    }

    public void setId_Propulsor(int id_Propulsor) {
        this.id_Propulsor = id_Propulsor;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}


