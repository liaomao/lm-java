public class find {
	//row 代表y值，colum代表x值
	void findzero(int arr2[][]){
		for (int row = 0; row < arr2.length; row++) {
			for (int colum = 0; colum < arr2[0].length; colum++) {
				if (arr2[row][colum]==0) {
					System.out.println("R_zero("+colum+","+row+")");
				}
			}
		}
	}
	void finleft(int arr2[][]){
		for (int row = 0; row < arr2.length; row++) {
			for (int colum = 0; colum < arr2[0].length; colum++) {
				if (arr2[row][colum]==10 && row==1){
					System.out.println("R_left("+colum+","+row+")");
				}
			}
		}
	}
	
	void finright(int arr2[][]){
		for (int row = 0; row < arr2.length; row++) {
			for (int colum = 0; colum < arr2[0].length; colum++) {
				if (arr2[row][colum]==12 && row==1) {
					System.out.println("R_right("+colum+","+row+")");
				}
			}
		}
	}
	
	void finup(int arr2[][]){
		for (int row = 0; row < arr2.length; row++) {
			for (int colum = 0; colum < arr2[0].length; colum++) {
				if (arr2[row][colum]==5 && row==0) {
					System.out.println("R_up("+colum+","+row+")");
				}
			}
		}
	}
	void findown(int arr2[][]){
		for (int row = 0; row < arr2.length; row++) {
			for (int colum = 0; colum < arr2[0].length; colum++) {
				if (arr2[row][colum]==11 && row==2) {
					System.out.println("R_down("+colum+","+row+")");
				}
			}
		}
	}
}
