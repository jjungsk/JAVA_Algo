package solvedAC;

import java.util.Arrays;
import java.util.Scanner;

public class Boj_2231_분해합 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int minV = 1_000_001;
		boolean flag = false;
		int cnt = Integer.toString(input).length(); // 1 10 100
	
		
		for (int i = 1; i <= input; i++) {
			int cons = 0;
			if (i <= 9)
				cons = i;
			else {
				char[] arr = Integer.toString(i).toCharArray();
				System.out.println(Arrays.toString(arr));
				for (char ch: arr)
					cons += ch - '0';
				cons += i;
				System.out.println("i : " + i + ", cons = " + cons);
			}
			if (cons == input) {
				minV = i;
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println(minV);
		else
			System.out.println(0);
	}
}