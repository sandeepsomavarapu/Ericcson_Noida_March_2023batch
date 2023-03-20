import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter employee id:");
		int eid = scan.nextInt();
		System.out.println("Enter employee name:");
		String ename = scan.next();
		System.out.println("Enter employee salary:");
		float salary = scan.nextFloat();
		System.out.println("Enter employee address:");
		String address = scan.next();
		System.out.println("Enter employee designation:");
		String desg = scan.next();
		System.out.println(eid + " " + ename + " " + salary + " " + address + " " + desg);
	}

}
