/* striver dsa sheet problems 
union of elements of two array
*/

public static void union(int arr[],int arr1[]) {
		int k=0;
		int temp[]= new int[arr.length+arr1.length];
		for(int i=0;i<arr.length;i++) {
			temp[k]=arr[i];
			k++;
		}
		for(int i=0;i<arr1.length;i++) {
			temp[k++]=arr1[i];	
		}
		
	Arrays.sort(temp);
		System.out.println(Arrays.toString(temp));
		
	}
