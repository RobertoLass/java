package oca.basics;

class Peron {
	static class Maler {
		static String Desc = "Male";
	}

	static Gender Male = new Gender();
}

class Gender {
	String Desc = "Gender";
}

public class GenderDemo {

	public static void main(String[] args) {
		System.out.println(Peron.Male.Desc);
		System.out.println(Peron.Maler.Desc);
	}

}
