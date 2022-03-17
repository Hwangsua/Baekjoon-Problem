package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
public class Pb4153 {
		
	    public static void main(String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        String[] cmdArr;
	        int heru, auset, ausar;
	        int max;
	        
	        while(true){
	            cmdArr = br.readLine().split(" ");
	            ausar = Integer.parseInt(cmdArr[0]);  
	            auset = Integer.parseInt(cmdArr[1]);  
	            heru = Integer.parseInt(cmdArr[2]);
	            
	            if(ausar==0 && auset==0 && heru == 0){
	                break;
	            }
	            
	            max = Math.max(ausar, auset);
	            max = Math.max(max, heru);
	           
	            if(max == heru) {
	            	bw.write(check(heru, ausar, auset));
	            }else if(max == ausar) {
	            	bw.write(check(ausar, heru, auset));
	            }else if(max == auset) {
	            	bw.write(check(auset, heru, ausar));
	            }
	            
	            bw.write("\n");
	        }
	        
	        bw.flush();
	        bw.close();
	        br.close();
	    }
	    
	    static String check(int max, int x, int y) {
	    	if(Math.pow(max,2) == (Math.pow(x,2)+(Math.pow(y,2)))){
	    		return "right";
	    	}
	    	return "wrong";
	    }
	
}
