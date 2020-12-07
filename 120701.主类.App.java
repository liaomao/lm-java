public class App {
	public static void main(String[] args) {
		int arr2[][]={
				{1,2,3,4,5,6},
				{7,8,9,10,0,12},
				{8,8,9,10,11,12},
				{7,8,3,10,11,12},
				{88,66,92,102,151,999}
		};
		new find().findzero(arr2);
		new find().finleft(arr2);
		new find().finright(arr2);
		new find().finup(arr2);
		new find().findown(arr2);
	}
}
