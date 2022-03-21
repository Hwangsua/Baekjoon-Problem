package Algorithm;

public class Eratos {
	
	static final int NUMBER = 100000;
	static int intArr[] = new int[NUMBER+1];
	static boolean booleanArr[] = new boolean[NUMBER+1];
	
	public static void main(String[] args) {
		
		// 방법1. int 배열
		for(int i=2; i<=NUMBER; i++) {
			intArr[i] = i;
		}
		
		for(int i=2; i<=NUMBER; i++) {
			if(intArr[i]==0) continue;
			
			for(int j=2*i; j<=NUMBER; j+=i) {
				intArr[j] = 0;
			}
		}
		
		for(int i=2; i<=NUMBER; i++) {
			if(intArr[i]!=0) System.out.println(intArr[i]); 
		}
		
		// 방법2. boolean 배열
		
		booleanArr[0] = booleanArr[1] = true; // 소수는 false, 1과 0 제외
		
		for(int i=2; i*i<=NUMBER; i++) {
			if(!booleanArr[i]) {
				for(int j=i*i; j<=NUMBER; j+=i) booleanArr[j] = true;
			}
		}
		
		for(int i=2; i<=NUMBER ; i++) {
			if(!booleanArr[i]) System.out.println(booleanArr[i]); 
		}
		
	}
}
