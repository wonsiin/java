package enumtest;

public class PersonTest {
	public static void main(String[] args) {
		Person[] persons = Person.values();
		for(Person p : persons) {
			System.out.print("�̸� : " + p);
			System.out.println("\t��ü : " +p.getTmp());
			
			System.out.println("���� : " +p.work());
		}
	}
}
