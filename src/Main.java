
public class Main {

	public static void main(String[] args) {
		Human cecilia = new Human("Cecilia", 18);
		Human zheng = new Human("Zheng Huang",58);
		cecilia.setGender('F');
		cecilia.selfCall();
		zheng.selfCall();
		
		cecilia.run();
		zheng.eat();
	}

}

class Human {
	private String name = null;
	private int age = 0;
	private char gender = 'M';
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setGender(char c) {
		this.gender = c;
		
	}

	public void eat() {
		System.out.println(name + "is eating.");
		
	}

	public void run() {
		System.out.println(name+" am running.");
		
	}

	public void selfCall() {
		String boyorgirl = (this.gender=='M')?"boy":"girl";
		System.out.println("Hello, my name is "+this.name
				+". My age is "+this.age+" and I am a "+boyorgirl);
		
	}
	
}
