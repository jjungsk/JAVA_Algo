package solvedAC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1085_직사각형탈출 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine(), " ");
		int x = 0, y = 0, w = 0, h = 0;
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());

		
		int minV = Integer.MAX_VALUE;
		minV = (minV > x)? x: minV;
		minV = (minV > y)? y: minV;
		minV = (minV > w-x)? w-x: minV;
		minV = (minV > h-y)? h-y: minV;
		
		System.out.println(minV);
		
	}

}
