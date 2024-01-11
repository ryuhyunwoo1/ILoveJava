package package1;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A	= Integer.parseInt(st.nextToken());
		Long arr[] = new Long[A];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < A; i ++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int count		= 0;
		
		for (int k = 0; k < A; k++) {
			long find	= arr[k];
			int start_point = 0;
			int end_point	= A - 1;
			
		}
	}
}
