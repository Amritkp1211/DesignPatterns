
public class Person {

	private static Person person;

	private Person() {

	}

	// lazy loading
	public static Person getPerson() {

		if (person == null) {

			synchronized (Person.class) {
				if (person == null) {
					person = new Person();
				}
			}
		}
		return person;
	}

}
