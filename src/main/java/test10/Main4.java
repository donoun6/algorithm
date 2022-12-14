package test10;

import java.io.*;

public class Main4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int index = Integer.parseInt(br.readLine());
		boolean[] arr = new boolean[2000001];
		for(int i = 0; i < index; i++) {
			arr[Integer.parseInt(br.readLine())+1000000] = true;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]) {
				bw.write(String.valueOf(i-1000000)+"\n");
			}
		}
		bw.flush();
	}
}