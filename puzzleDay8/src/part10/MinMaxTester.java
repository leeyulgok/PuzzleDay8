package part10;

import java.util.Scanner;

public class MinMaxTester {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("x값 : ");
		int x = scan.nextInt();
		System.out.print("y값 : ");
		int y = scan.nextInt();
		System.out.print("z값 : ");
		int z = scan.nextInt();
		
		System.out.print("배열 a의 요소 수 : ");
		int a = scan.nextInt();
		int[] list = new int[a];
		
		for(int i = 0; i < list.length; i++) {
			System.out.print("a["+i+"] = ");
			int aa = scan.nextInt();
			list[i] = aa;
		}
		
		System.out.println("x,y의 최솟값은 " + MinMax.min(x, y) + "입니다.");
		System.out.println("x,y의 최댓값은 " + MinMax.max(x, y) + "입니다.");
		System.out.println("x,y,z의 최솟값은 " + MinMax.min(x, y, z) + "입니다.");
		System.out.println("x,y,z의 최댓값은 " + MinMax.max(x, y, z) + "입니다.");
		
		int[] minList = MinMax.minList(list);
		System.out.println("배열 a의 최솟값은 " + MinMax.min(list) + "입니다.");
		System.out.print("인덱스는 { ");
		for(int i = 0; i < minList.length; i++) {
			System.out.print(minList[i] + " ");
		}
		System.out.print("} 입니다.");
		System.out.println();
		int[] maxList = MinMax.maxList(list);
		System.out.println("배열 a의 최댓값은 " + MinMax.max(list) + "입니다.");
		System.out.print("인덱스는 { ");
		for(int i = 0; i < maxList.length; i++) {
			System.out.print(maxList[i] + " ");
		}
		System.out.print("} 입니다.");
		
		scan.close();
	}

}
