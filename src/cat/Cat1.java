package cat;
import lion.Lion1;
public class Cat1 extends Lion1 {
//	void print(){  // The method Cat1.print() does not override the inherited method from Lion1 since it is private to a different package
//		System.out.println("Meow");
//	}

	public static void main(String[] args) {

		Cat1 c1 = new Cat1();
		c1.execute();
//		c1.print();

	}

}
