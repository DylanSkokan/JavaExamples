package toString;

public class ToStringDriver {
	public static void main(String[] args) {
		Account acc1 = new Account("test@test.com", "username", "p@ssw0rd!");
		
		System.out.println(acc1);
	}
}
