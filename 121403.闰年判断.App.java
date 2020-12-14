import java.util.Scanner;

public class test03 {
	public static void main(String[] args) {
		System.out.print("请输入年份：");

		int year;//接收输入的年份
		Scanner scanner = new Scanner(System.in);
		year = scanner.nextInt();

		if(year<3200 && year>0){
		   if(year%4==0&&year%100!=0||year%400==0){
			System.out.println(year+"年"+"是公元后闰年");
		    }else{
				System.out.println(year+"年"+"不是公元后闰年");
			}
		}
		
		if(year>-3200 && year<0){
			if(year%4==-1||year%400==-1){
			System.out.println(year+"年"+"是公元前闰年");
			}else{
				System.out.println(year+"年"+"不是公元前闰年");
			}
		}
	}
}
