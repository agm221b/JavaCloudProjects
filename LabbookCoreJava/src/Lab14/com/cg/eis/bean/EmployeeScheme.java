package Lab14.com.cg.eis.bean;

public class EmployeeScheme {

	public String find(String designation, double sal) {
		if ((sal > 5000 && sal < 20000) && designation.equals("System Associate")) {
			return "Scheme C";
		} else if ((sal >= 20000 && sal < 40000) && designation.equals("Programmer")) {
			return "Scheme B";
		} else if (sal >= 40000 && designation.equals("Manager")) {
			return "Scheme A";
		} else if (sal < 5000 && designation.equals("Clerk")) {
			return "No Scheme";
		} else
			return null;

	}
}