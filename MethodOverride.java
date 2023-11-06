package inheritance;

class Super{
	void inherit() {
		System.out.println("Class A");
	}
}
class Sub extends Super{
	//You an override methods of A in B if you want
	void inherit() {
		System.out.println("Class B");
	}
}

public class MethodOverride {

	public static void main(String[] args) {
		
		Sub obj = new Sub();
		obj.inherit();
	}

}
