package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main5 {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) {
				break;
			}
			int count = 0;
			boolean[] arr = new boolean[(n*2)+1];
			arr[0] = arr[1] = true;
			for(int i = 2; i < Math.sqrt(arr.length); i++) {
				for(int j = i * i; j < arr.length; j += i) {
					arr[j] = true;
				}
			}
			for(int i = n+1; i <= (n*2); i++) {
				if(arr[i] == false) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}