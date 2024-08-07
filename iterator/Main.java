package iterator;

public class Main {
	public static void main(String[] args) {
		UserManagement management = new UserManagement();
		management.addUser(new User("amrit", "1"));
		management.addUser(new User("kishore", "2"));
		management.addUser(new User("nitin", "3"));
		
		MyIterator iterator = management.getIterator();
		while(iterator.hasNext()) {
			User user = (User) iterator.next();
			System.out.println(user.getName());
		}
		}
}
