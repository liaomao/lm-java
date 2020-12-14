import java.util.Scanner;

public class test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n>=1 && n<=40) {
			int fn = fib(n);
			System.out.println("斐波那契数列的第n项为：" + fn);
		}else {
			System.out.println("请输入40以内的数字");
		}
		}

		public static int fib(int n) {
			int fn = 0;
			if (n == 1 || n == 2) {
			fn = 1;
			} else {
			fn = fib(n - 1) + fib(n - 2);
			}
			return fn;
		}
}
