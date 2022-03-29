package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Pb2751_01 {
	
	static int[] arr;
	static int[] temp;
	
	//1. 1112ms
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		temp = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		mergeSort(0, n-1);
		
		for(int i=0; i<n; i++) {
			bw.write(String.valueOf(arr[i]));
			bw.write("\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
	
	static void mergeSort(int start, int end) {
		
		if(start == end) {
			return;
		}
		
		int mid = (start+end)/2;
		
		mergeSort(start, mid);
		mergeSort(mid+1, end);
		
		int left = start;
		int right = mid + 1;
		int index = left;
		
		while(left <= mid && right <= end) {
			
			if(arr[left] <= arr[right]) {
				temp[index++] = arr[left++];
			}else {
				temp[index++] = arr[right++]; 
			}
			
		}
		
		while(right <= end) { // 오른쪽 배열이 남아있는 경우
			temp[index++] = arr[right++];
		}
		
		while(left <= mid) { // 왼쪽 배열이 남아있는 경우
			temp[index++] = arr[left++];
		}
		
		for(int i=start; i<=end; i++) {
			arr[i] = temp[i];
		}
	}
}
