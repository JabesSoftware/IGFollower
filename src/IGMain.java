import java.util.Scanner;

public class IGMain {

	public static void main(String[] args) throws InterruptedException {

		//takes in name and password
		Scanner nameInput = new Scanner(System.in);
		System.out.println("Enter Instagram name: ");
		String name = nameInput.next();

		Scanner passInput = new Scanner(System.in);  
		System.out.println("Enter Instagram password: ");
		String pass = passInput.next();

		//takes in account name of the person you want to follow
		Scanner accountInput = new Scanner(System.in);
		System.out.println("Enter IG account to connect to: ");
		String followFromAccount = accountInput.next();
		
		//set up page to connect to, and sends name and pass to there.
		loginIG.login(name, pass, followFromAccount);

		//follows 100 people
		actionsOnIG.follow100();
		
		//closes scanner.
		nameInput.close();
		passInput.close();
		accountInput.close();

		
		//actions to perform on IG
		
		
		//options on IG such as auto swapping accounts
		
		
		
	}

}
