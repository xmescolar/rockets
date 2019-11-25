package rocketsSoft;

//FASE 1
/*
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

	@Override
	public String toString() {
		return "Propulsor [id_Propulsor=" + id_Propulsor + ", power=" + power + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_Propulsor;
		result = prime * result + power;
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
		Propulsor other = (Propulsor) obj;
		if (id_Propulsor != other.id_Propulsor)
			return false;
		if (power != other.power)
			return false;
		return true;
	}

}*/

//FASE 2
/*
public class Propulsor {
	private int id_Propulsor;
	private int power;
	
	public Propulsor(int id_Propulsor, int power) {
		super();
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

	@Override
	public String toString() {
		return "" + power;
	}
	
}
*/

//FASE 3
/*
public class Propulsor {	
	private int id_Propulsor;
	private int max_Power;
	private int now_Power;	
	
	public Propulsor(int id_Propulsor, int max_Power, int now_Power) {
		super();
		this.id_Propulsor = id_Propulsor;
		this.max_Power = max_Power;
		this.now_Power = now_Power;
	}
	
	public int getId_Propulsor() {
		return id_Propulsor;
	}
	
	public void setId_Propulsor(int id_Propulsor) {
		this.id_Propulsor = id_Propulsor;
	}
	
	public int getMax_Power() {
		return max_Power;
	}
	
	public void setMax_Power(int max_Power) {
		this.max_Power = max_Power;
	}
	
	public int getNow_Power() {
		return now_Power;
	}
	
	public void setNow_Power(int now_Power) {
		this.now_Power = now_Power;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_Propulsor;
		result = prime * result + max_Power;
		result = prime * result + now_Power;
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
		Propulsor other = (Propulsor) obj;
		if (id_Propulsor != other.id_Propulsor)
			return false;
		if (max_Power != other.max_Power)
			return false;
		if (now_Power != other.now_Power)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Propulsor [id_Propulsor=" + id_Propulsor + ", max_Power=" + max_Power + ", now_Power=" + now_Power
				+ "]";
	}	

	public Propulsor accelerate() {
			
			if (this.now_Power < this.max_Power) {
				this.now_Power += 10;
				System.out.println("Propulsor " + this.id_Propulsor + " " + this.now_Power + " " + this.max_Power);
			}
			else {
				System.out.println("Current power it's " + this.now_Power + " and maximal power : " + this.max_Power);
				System.out.println("Current power couldn't be upper to maximal power.");
			}
		
		return this;
	}	
	
	public Propulsor brake() {
		
			if ((this.now_Power < this.max_Power) && (this.now_Power > 0)) {
				this.now_Power -= 10;
				System.out.println("Propulsor " + this.id_Propulsor + " " + this.now_Power + " " + this.max_Power);
			}
			else {
				System.out.println("Current power it's " + this.now_Power + " and maximal power : " + this.max_Power);		
				System.out.println("Current power couldn't be negative.");
			}
		
		return this;
	}
		
}

*/

// FASE 4
//public class Propulsor implements Runnable {
public class Propulsor {	
	private int id_Propulsor;
	private int max_Power;
	private int now_Power;	
	
	public Propulsor(int id_Propulsor, int max_Power, int now_Power) {
		super();
		this.id_Propulsor = id_Propulsor;
		this.max_Power = max_Power;
		this.now_Power = now_Power;
	}
	
	public int getId_Propulsor() {
		return id_Propulsor;
	}
	
	public void setId_Propulsor(int id_Propulsor) {
		this.id_Propulsor = id_Propulsor;
	}
	
	public int getMax_Power() {
		return max_Power;
	}
	
	public void setMax_Power(int max_Power) {
		this.max_Power = max_Power;
	}
	
	public int getNow_Power() {
		return now_Power;
	}
	
	public void setNow_Power(int now_Power) {
		this.now_Power = now_Power;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_Propulsor;
		result = prime * result + max_Power;
		result = prime * result + now_Power;
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
		Propulsor other = (Propulsor) obj;
		if (id_Propulsor != other.id_Propulsor)
			return false;
		if (max_Power != other.max_Power)
			return false;
		if (now_Power != other.now_Power)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Propulsor [id_Propulsor=" + id_Propulsor + ", max_Power=" + max_Power + ", now_Power=" + now_Power
				+ "]";
	}	

	public Propulsor accelerate() {
			
//		System.out.println("Value of this: " + this);
			if (this.now_Power < this.max_Power) {
				this.now_Power += 10;
				System.out.println("Propulsor " + this.id_Propulsor + " " + this.now_Power + " " + this.max_Power);
			}
			else {
				System.out.println("Current power it's " + this.now_Power + " and maximal power : " + this.max_Power);
				System.out.println("Current power couldn't be upper to maximal power.");
			}
		
		return this;
	}	
	
	public Propulsor brake() {
		
			if ((this.now_Power < this.max_Power) && (this.now_Power > 0)) {
				this.now_Power -= 10;
				System.out.println("Propulsor " + this.id_Propulsor + " " + this.now_Power + " " + this.max_Power);
			}
			else {
				System.out.println("Current power it's " + this.now_Power + " and maximal power : " + this.max_Power);		
				System.out.println("Current power couldn't be negative.");
			}
		
		return this;
	}
		
}



