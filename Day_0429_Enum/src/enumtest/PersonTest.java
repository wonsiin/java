package enumtest;

public class PersonTest {
	public static void main(String[] args) {
		Person[] persons = Person.values();
		for(Person p : persons) {
			System.out.print("이름 : " + p);
			System.out.println("\t정체 : " +p.getTmp());
			
			System.out.println("업무 : " +p.work());
		}
	}
}
