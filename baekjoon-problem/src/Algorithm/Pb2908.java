package Algorithm;

import java.io.IOException;


public class Pb2908 {
	public static void main(String[] args) throws IOException{
		
		int value = 0;
		int[] valueArr = new int[2];
		
		for(int i=0; i<valueArr.length; i++) {
			for(int j=0; j<3; j++) {
				value = System.in.read();
				if(value == 32) {
					j--;
					continue;
				}
				valueArr[i] += (int)Math.pow(10, j)*(value-48);
			}
		}
		System.out.print(valueArr[0]>valueArr[1] ? valueArr[0] : valueArr[1]);
	
	}
}
