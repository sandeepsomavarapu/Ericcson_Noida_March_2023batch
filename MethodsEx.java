
public class MethodsEx {

	public void addOfTwo(int a, int b) {
		int result = a + b;
		System.out.println("add of two numbers : " + result);
	}

	public static int subOfTwo(int a, int b) {
		int result = a - b;
		return result;
	}

	public void sayHello() {
		System.out.println("hello am methodex class....");
	}

	public static void main(String[] args) {
		MethodsEx obj = new MethodsEx();
		obj.addOfTwo(12, 13);

		obj.sayHello();
		System.out.println(MethodsEx.subOfTwo(22, 11));
	}

}
