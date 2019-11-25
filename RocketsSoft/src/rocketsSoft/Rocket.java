package rocketsSoft;

import java.util.ArrayList;
import java.util.List;

/*
 //FASE 1
public class Rocket {

    private String id_rocket;
    private int propulsors;

    //Rocket Constructor
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

    @Override
	public String toString() {
		return "Rocket [id_rocket=" + id_rocket + ", propulsors=" + propulsors + "]";			
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_rocket == null) ? 0 : id_rocket.hashCode());
		result = prime * result + propulsors;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rocket other = (Rocket) obj;
		if (id_rocket == null) {
			if (other.id_rocket != null)
				return false;
		} else if (!id_rocket.equals(other.id_rocket))
			return false;
		if (propulsors != other.propulsors)
			return false;
		return true;
	}
}
*/

 /*
 //FASE 2

public class Rocket {

private String id_rocket;
private int propulsors;
private List<Propulsor> list_propulsors;
    	
	public Rocket(String id_rocket, int propulsors, List<Propulsor> list_propulsors) {
			super();
			this.id_rocket = id_rocket;
			this.propulsors = propulsors;
			this.list_propulsors = list_propulsors;
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

		public List<Propulsor> getList_propulsors() {
			return list_propulsors;
		}

		public void setList_propulsors(List<Propulsor> list_propulsors) {
			this.list_propulsors = list_propulsors;
		}

		@Override
		public String toString() {
			return "id_rocket=" + id_rocket + ", propulsors=" + propulsors + ", list_propulsors="
					+ list_propulsors;
		}    		
			
     }	
*/

 //FASE 3
/*
public class Rocket {

     	private String id_rocket;
     	private int propulsors;
     	private List<Propulsor> list_propulsors;
     	
 		public Rocket(String id_rocket, int propulsors, List<Propulsor> list_propulsors) {
 			super();
 			this.id_rocket = id_rocket;
 			this.propulsors = propulsors;
 			this.list_propulsors = list_propulsors;
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

 		public List<Propulsor> getList_propulsors() {
 			return list_propulsors;
 		}

 		public void setList_propulsors(List<Propulsor> list_propulsors) {
 			this.list_propulsors = list_propulsors;
 		}

 		@Override
 		public String toString() {
 			return "id_rocket=" + id_rocket + ", propulsors=" + propulsors + ", list_propulsors="
 					+ list_propulsors;
 		}    		
 			
}	
*/
//FASE 4
public class Rocket {

 	private String id_rocket;
 	private int propulsors;
 	private List<Propulsor> list_propulsors;
 	
		public Rocket(String id_rocket, int propulsors, List<Propulsor> list_propulsors) {
			super();
			this.id_rocket = id_rocket;
			this.propulsors = propulsors;
			this.list_propulsors = list_propulsors;
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

		public List<Propulsor> getList_propulsors() {
			return list_propulsors;
		}

		public void setList_propulsors(List<Propulsor> list_propulsors) {
			this.list_propulsors = list_propulsors;
		}

		@Override
		public String toString() {
			return "id_rocket=" + id_rocket + ", propulsors=" + propulsors + ", list_propulsors="
					+ list_propulsors;
		}    					
}	


