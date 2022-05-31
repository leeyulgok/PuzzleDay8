package part10;

public class MinMax {
	// a,b의 최솟값
	public static int min(int a, int b) {
		int min = a;
		if(min > b) {
			min = b;
		}
		return min;
	}
	// a,b,c의 최솟값
	public static int min(int a, int b, int c) {
		int min = a;
		if(min > b) {
			min = b;
		}
		if(min > c) {
			min = c;
		}
		return min;
	}
	// 배열 a의 최솟값 반환
	public static int min(int[] a) {
		int min = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	// 배열 a의 최솟값을 가지는 모든 요소의 인덱스를 저장한 배열 반환
	public static int[] minList(int[] a) {
		int min = min(a);
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == min) {
				count++;
			}
		}
		int[] list = new int[count--];
		for(int i = a.length - 1; count >= 0; i--) {
			if(a[i] == min) {
				list[count--] = i;
			}
		}
		return list;
	}
	
	// a,b의 최댓값
	public static int max(int a, int b) {
		int max = a;
		if(max < b) {
			max = b;
		}
		return max;
	}
	// a,b,c의 최댓값
	public static int max(int a, int b, int c) {
		int max = a;
		if(max < b) {
			max = b;
		}
		if(max < c) {
			max = c;
		}
		return max;
	}
	// 배열 a의 최댓값 반환
	public static int max(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	// 배열 a의 최댓값을 가지는 모든 요소의 인덱스를 저장한 배열 반환
	public static int[] maxList(int[] a) {
		int max = max(a);
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] == max) {
				count++;
			}
		}
		int[] list = new int[count--];
		for(int i = a.length - 1; count >= 0; i--) {
			if(a[i] == max) {
				list[count--] = i;
			}
		}
		return list;
	}
}
