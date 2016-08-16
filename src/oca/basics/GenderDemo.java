package oca.basics;

class Peron {
	static class Male {
		static String Desc = "Male";
	}

	static Gender Male = new Gender();
}

class Gender {
	String Desc = "Gender";
}

public class GenderDemo {

	public static void main(String[] args) {
		// Schlechter Stil--> Statische innere Klasse, gleiche Name wie das Feld vom Type Gender. // Factory? 
		System.out.println(Peron.Male.Desc);
		System.out.println(Peron.Male.Desc);
	}

}
