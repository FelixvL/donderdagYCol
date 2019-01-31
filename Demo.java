public class Demo{
	public static void main(String[] args) {
		Student jojo = new Student();
		jojo.voornaam = "Fred";
		jojo.leeftijd = 24;
		jojo.voorstellen();
	}
}

class Student{
	String voornaam;
	int leeftijd;
	void voorstellen() {
		System.out.println("Hallo ik heet "+ voornaam + " en ik ben "+ leeftijd+" jaar oud");
	}
}
