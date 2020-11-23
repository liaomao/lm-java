import java.util.Scanner;


public class App {
	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		while (true) {
			int a = sr.nextInt();
			System.out.println(a);
			
			if(a==1){
				System.out.print("(R)"+(int)(Math.random()*100)+",");
				System.out.println((int)(Math.random()*100));
			}else{
				System.out.println("输入错误");
			}
		}
	}
}
