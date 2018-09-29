public class MergeSort implements SortingAlgorithm{
	// private int[] temp;

	/*public void merge(int[] array,int left,int mid, int right){
		int l = left;
		int m = mid;
		int r = right;
		for(int i = left; i<= right ;i++){
			temp[i] = array[i];
		}

		while(l <= m && m <= r){
			if (array[l] < array[r]){
				array[l++] = temp[l++];
			}
			else{
				array[r++] = temp[r++];
			}
		}
		while(l < temp[l]){
			temp[l] = array[l];
		}
		while(r < temp[r]){
			temp[r] = array[r];
		}
	}*/
	
    public void merge(int array[], int left, int mid, int right){ 
        // Find sizes of two subarrays to be merged 
        int n1 = mid - left + 1; 
        int n2 = right - mid; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = array[left + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[mid + 1+ j]; 

        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = left; 
        while (i < n1 && j < n2){ 
            if (L[i] <= R[j]){ 
                array[k] = L[i]; 
                i++; 
            } 
            else{ 
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
        /* Copy remaining elements of L[] if any */
        while (i < n1){ 
            array[k] = L[i]; 
            i++; 
            k++; 
        } 
        /* Copy remaining elements of R[] if any */
        while (j < n2) { 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 

	public void mergeSort(int[] array, int left, int right){
		if(right <= left){
			return;
		}
		int mid = (left+right)/2;
		mergeSort(array,left, mid);
		mergeSort(array, mid+1,right);
		merge(array, left, mid, right);
	}

	public void sort(int[] array){
		mergeSort(array,0,array.length-1);
	}
}