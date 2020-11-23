public class App {
	public static void main(String[] args) throws InterruptedException {
		int arr[][]={
				{45,96},
				{100,300},
				{199,75},
				{99,20},
		};
		while(true){
			Thread.sleep(1000);
			int rdm=(int)(Math.random()*10%4);
			System.out.println(arr[rdm][0]+","+arr[rdm][1]);
		}
	}
}
