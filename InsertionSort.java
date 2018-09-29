public class InsertionSort implements SortingAlgorithm{
	
	public void sort(int[] array){
		for(int i = 0; i < array.length; i++){
			int temp = array[i];
			int k = i-1;
			while(k >= 0 && array[k] > temp){
				array[k+1] = array[k];
				--k;
			}
		array[k+1] = temp;
		}
	}
}
