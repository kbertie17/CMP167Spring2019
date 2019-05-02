package life;

public class human {
  
	public int age;
	public String name;
	public double wealth;
	public boolean hasVehicle;
	public double hunger;
	public int food;
	Vehicle[] vehicles;
	
	public Human() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new Vehicle[100];
	}
	
	public int numberOfVehilces() {
		int total = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) {
				total++;
			}
			
			else {
				break;
			}
		}
		return total;
	}
	
	public int getAge () {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Human:[ name" +getName() + ", age:" + getAge()+" , wealth: " + this.wealth+"$]";
	}
	
	public void eat() {
		if (food >= 4.5) {
			hunger -= 1.0;
			food -= 1.5;
			System.out.println("Yummy, I ate all");
		}
		
		else {
			System.out.println("Not enough food, please buy more");
		}
	}
	
	public void eat(int food) {
		hunger -= (int)(food/4.5);
	}
	
	public void grow() {
		age++;
	}
	
	public void work() {
		if (hunger < 5) {
			wealth += 10.5;
			hunger += .5;
			System.out.println("Whoah, I worked a lot");
		}
		
		else {
			System.out.println("Too hungry to work");
		}
	}
	
	public void buyFood() {
		if (wealth > 5) {
			wealth -= 4.5;
			food++;
			System.out.println("Yoohoo! I bought some food!");
		}
		
		else {
			System.out.println("Not enough money, please work");
		}
	}

}
}
