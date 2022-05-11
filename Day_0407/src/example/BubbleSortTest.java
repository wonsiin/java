package example;

public class BubbleSortTest {

	public static void main(String[] args) {
		int[] ary = {95,65,71,32,1,56,13,84,23,68};
		System.out.println();
		System.out.println("##최초 정렬 전");
		print(ary);
		
		sort(ary);
		
		System.out.println();
		System.out.println("## 정렬 후 ");
		print(ary);	
	}
	
	public static void sort(int[]ary) {
		int temp;
		for(int i = 0; i < ary.length-1; ++i) {
			for(int j = 0;j < ary.length-(i+1);++j) {
				if(ary[j] > ary[j+1]) {
					temp = ary[j];
					ary[j] = ary[j+1];
					ary[j+1] = temp;
				}
			}
		}
	}
	
	public static void print(int[]ary) {
		
		for (int i=0;i < ary.length;++i) {
			System.out.print("[" + i + "]" + ary[i]);
		}
	}

}
