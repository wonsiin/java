package enumtest;

public enum Person {
	
	�տ���("������"){
		public String work() {
			return "���� ����� ��´�. ��Ű ����.";
		}
	},�����("����"){
		public String work() {
			return "������ �մ´�. ����Ĵ� ����.";
		}
	},���Ȱ�("����"){
		public String work() {
			return "�׶��ϴ�. �Ḹ������.";
		}
	},�������("�ΰ�"){
		public String work() {
			return "�����. ���ϸ�� ģ�ϴ�.";
		}
	},����ġ("���׳�");
	
	private String tmp; //����� enum���� �Ʒ��� �־� �Ѵ�.

	private Person(String tmp) {
		this.tmp = tmp;
	}
	public String getTmp() {	//Ư¡���� ���� ������,���� ������ ���ϵȴ�.
		return tmp;
	}
	public String work() {
		return "���";
	}
	
}
