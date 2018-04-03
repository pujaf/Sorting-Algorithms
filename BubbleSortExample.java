package sorting;

public class BubbleSortExample {

	public int[] sortBubble(int[] array){
		int temp=0;
		for (int i=0;i<array.length;i++) 
		{
			for (int j=0;j<array.length-1;j++)
			{
				if(array[j]> array[j+1])
				{
					temp= array[j+1];
					array[j+1]= array[j];
					array[j]= temp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array= {56,35,68,45,78,44,12,38,69,59};
		BubbleSortExample bss= new BubbleSortExample();
		array=bss.sortBubble(array);
		
for (int i=0;i<array.length; i++){
	System.out.println(array[i]);
}
	}

}
