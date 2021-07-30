package method;

public class ControlFlowConcept {
	public static void main(String[] args) {
		
//		"오버로딩" (비교."오버라이딩")
		add(1, 5);
		add(11, 22);
		add(33, 55);
		
		add(1.5, 3.1);
	}

	public static void add(double d, double e) {
		System.out.println(d+e);
		
	}

	private static int add (int i, int j) {
		System.out.println(i+j);
		return j;
	}

	
	
	
}
