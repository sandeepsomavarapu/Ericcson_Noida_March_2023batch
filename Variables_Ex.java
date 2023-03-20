
public class Variables_Ex {
	float salary = 23.4534234234234234f;
	double result = 89784.3333;// global variables and instance
	short age = 900;
	static int contryCode = 91;// global variable static

	public static void main(String[] args) {

		// classname objname=new classname() ;obj creation syntax
		System.out.println(Variables_Ex.contryCode);// way to access static variables

		Variables_Ex wel = new Variables_Ex();// all instance variables/methods will get memory space

		System.out.println(wel.salary);// way to access instance variables

		int marks = 200;// local variable
		double result = 89784.3333;
		char gender = 'M';
		boolean value = true;

		System.out.println("felling sleepy..." + marks);
	}

}

//ctrl+space -->for suggestions
//ctrl+shift+f --> for formatting
//ctrl+/ -->for single line comments

//ctrl+shift+/-->to  add multi line comments
//ctrl+shift+\-->to remove multi line comments