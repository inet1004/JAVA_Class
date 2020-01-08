package co.park.sort;

public class MainApp {

	public static void main(String[] args) {
//		Rank rank=new Rank();
		int[] result;
		int[] sungjuk = {90,40,100,99,80,70,90,46,87};
//		rank.run(sungjuk);
		
		Sort sort = new Sort();
//		result=sort.selectionSort(sungjuk,0); // n=0 이면 오름차순
		result=sort.bubbleSort(sungjuk); // n=0 이면 오름차순
		
		
//		for(int i=0;i<result.length;i++) {
//			System.out.print(result[i]+" ");
//		}
		
	}
}
