package exercices;

public class Person {

    private String name;
	private int age;
	private boolean wilder;
    
	
    public Person(String name, int age) {
	this.name = name;
	this.age = age;
	this.wilder = wilder;
		}
    



    




    public String getName() {
				return name;
			}




			public void setName(String name) {
				this.name = name;
			}




			public int getAge() {
				return age;
			}




			public void setAge(int age) {
				this.age = age;
			}




			public boolean isWilder() {
				return wilder;
			}




			public void setWilder(boolean wilder) {
				this.wilder = wilder;
			}

			
			public String whoAmI() {
				return ("My name is " + this.name + " and I'm " + this.age);
			}


	
    public Person() {
    }

}




  
