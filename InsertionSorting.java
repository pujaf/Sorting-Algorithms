package sorting;


public class InsertionSorting {

	public static void main(String[] args){
		Integer[] arrayToBeSorted ={59,66,79,23,3,35,6,92,33,1234,456,90,7,49,67,108,72,33,59,67
				};
		Integer[] sortedArray= new Integer[arrayToBeSorted.length];
		sortedArray[0]=arrayToBeSorted[0];
		
		for(int i=1;i<arrayToBeSorted.length;i++){
			int p;
			if(arrayToBeSorted[i]<sortedArray[i-1]){
				sortedArray[i]= sortedArray[i-1];
				sortedArray[i-1]=arrayToBeSorted[i];
				if(i>2){
				for(p=i;p>2;p--){
					if(sortedArray[p-1]<sortedArray[p-2]){
						int temp=sortedArray[p-2];
						sortedArray[p-2]= sortedArray[p-1];
						sortedArray[p-1]=temp;
					}
	
				}
				}
			}
			else{
				sortedArray[i]=arrayToBeSorted[i];
			}
		}
		for (int x=0;x<sortedArray.length;x++){
			System.out.println(sortedArray[x]);

		}
	}
}
