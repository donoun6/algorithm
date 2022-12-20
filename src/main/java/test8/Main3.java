package test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		for(int i = 2; i <= N; i ++) {
			while(N%i == 0) {
				N /= i;
				System.out.println(i);
			}
		}
	}
}
