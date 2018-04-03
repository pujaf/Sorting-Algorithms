package sorting;

public class SelectionSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {32,79,8,58,36};
		int temp=0;
		for (int i=0; i< array.length; i++){
			for (int j=i+1; j<array.length;j++){
				if(array[i]>array[j]){
					temp= array[j];
					array[j]=array[i];
					array[i]= temp;
				}
			}
		}
		for (int i=0;i<array.length; i++){
			System.out.println(array[i]);
		}
	}

}
