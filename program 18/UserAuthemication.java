import java.util.Scanner;

class InvalidLoginExpcetion extends Exception
{
	public InvalidLoginExpcetion(String message)
	{
		super(message);
	}
}

public class UserAuthemication
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String username, password;

		System.out.println("Enter username:");
		username = sc.next();

		System.out.println("Enter password:");
		password = sc.next();

		try {
			if (username.equals("admin") && password.equals("1234")) {
				System.out.println("Login Successful");
			} else {
				throw new InvalidLoginExpcetion("Invalid username and Password");
			}
		} catch (InvalidLoginExpcetion e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
