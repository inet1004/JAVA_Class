package co.park.sort;

public class Rank {
	private int[] score;
	private int[] rank;
	
	private void arrayInit(int[] num) {	//순위 구하기위한 배열 초기화
		score=new int[num.length];	//배열 변수의 format의 인스턴스를 새로이 생성함
		rank=new int[num.length];	//배열 변수의 format의 인스턴스를 새로이 생성함
// ***  score=num; 사이즈를 새로 생성하지 않고 주소를 넘겨줌(이후 작업이 단계축소)   ***
//		for(int i=0; i<score.length;i++) {
		for(int i=0; i<num.length;i++) {
			score[i]=num[i];
			rank[i]=1;
		}
	}
	
	private void rankAlgorithm() {
		for(int i=0; i<score.length; i++) {
			// 실제 순위 결졍
			for(int j=i+1;j<score.length;j++) {
				if(score[i] < score[j])
					rank[i]++;
				else if(score[i] > score[j])
					rank[j]++;
			}
		}
	}
	
	private void toPrint() {
		for(int i=0; i<score.length;i++) {
			System.out.println(score[i]+" "+rank[i]);
		}
	}
	
	public void run(int[] outNum) {
		arrayInit(outNum);
		rankAlgorithm();
		toPrint();
	}
	
	
}
