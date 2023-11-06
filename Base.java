package inheritance;

//This is Multiple inheritance and Java doesn't support multiple inheritance;
//Because this raises ambiguity problem,if C extends both A and B and if they had same methods,
// it confuses to choose either from A or B... This can be over come by Interface,..

class A{
	void inherit() {
		System.out.println("Class A");
	}
}
class B{
	void inherit() {
		System.out.println("Class B");
	}
}
//class C extends A extends B{
//	
//}

public class Base {

	public static void main(String[] args) {
		
		MultiLevel s = new MultiLevel();
		int r1 = s.add(6, 3);
		int r2 = s.sub(6, 3);
		int r3 = s.mul(6, 3);
		int r4 = s.div(6, 3);
		double r5 = s.pow(6, 3);
		System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
	}

}
