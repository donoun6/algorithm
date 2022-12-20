package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4 {
	public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] arr = new boolean[N + 1];
		arr[0] = arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(arr.length); i++) {
			for(int j = i * i; j < arr.length; j += i) {
				arr[j] = true;
				System.out.println(j);
			}
		}
				
		for(int i = M; i <= N; i++) {
//			if(!arr[i]) System.out.println(i);
		}
	}
}