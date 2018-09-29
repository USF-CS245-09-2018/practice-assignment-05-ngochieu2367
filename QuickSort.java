public class QuickSort implements SortingAlgorithm{
    
    public void swap(int[] array, int a, int b){
    	int temp = array[a];
    	array[a] = array[b];
    	array[b] = temp;
    }

	public int partition(int[] array, int left, int right){
		int pivot = array[left];
		int i = left;
		int k = right;

			while(i < k){
				while( i <= right && array[i] <= pivot && k >= i){
					i++;
				}
				while(k >= left && array[k] >= pivot && k >= i){
					k--;
				}
				if(i < k){
					swap(array,i,k);
				}
			}
			swap(array,left,k);
			return k;
		
	}
	

	public void sort(int[] array){
		sort(array, 0, array.length-1);
	}
    private void sort(int[] array, int left, int right){
		if (left < right){
			int p = partition(array,left,right);
			sort(array,left,p-1);
			sort(array,p+1,right);
		} else {
			return;
		}
	}
}