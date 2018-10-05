public class MergeSort implements SortingAlgorithm{

	public void merge(int[] array,int left,int mid, int right){
		int left_sub = left;     // left of the sub temp array
		int right_sub = mid + 1; // right of the sub temp array
		int temp[] = new int [right - left + 1];
		int t = 0;

		for (int i = left; i <= right; i++){ 
			if(left_sub > mid){                     // Check if the first part comes to an end or not
				temp[t++] = array[right_sub++];
			}
			else if(right_sub > right){             // Check if the second part come to an end or not 
				temp[t++] = array[left_sub++];
			}
			else if(array[left_sub] < array[right_sub]){
				temp[t++] = array[left_sub++];
			}
			else
				temp[t++] = array[right_sub++];
		}
		for(int i = 0; i < t; i++){
			array[left++] = temp[i];
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


	public static void main (String [] args) {
		MergeSort ms = new MergeSort();
		int [] arr = new int[] {31, 13, 55, 3, 49, 98, 7};
		ms.sort(arr);
	}
}
