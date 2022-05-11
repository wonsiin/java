package pro2;

public class Besuk2 {
	public static void main(String[] args) {
		int[] gi = new int[10];


		if(gi[0]==0) {
			gi[1] = 1;
			for(int i=2; i < gi.length; ++i) {
					gi[i] = gi[i-1] + gi[i -2];
			}
				for(int i=0; i < gi.length; ++i) {
					System.out.print(gi[i] + " ");
				}
			}
		}
}
