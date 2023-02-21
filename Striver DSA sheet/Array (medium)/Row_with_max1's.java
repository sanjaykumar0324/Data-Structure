/*
Row with max 1's in matrix
*/
int rowWithMax1s(int arr[][], int n, int m) {
        // code here
         int count=0;
        int temp[]= new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == 1){
                    count++;
                }
                
            }
            temp[k++] = count;
            count=0;
            
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<temp.length;i++){
            if(temp[i] > max){
                max=temp[i];
            }
        
        }
        
        for(int i=0;i<temp.length;i++){
            if(max == 0){
                return -1;
            }
            if(temp[i] == max){
                return i;
            }
        
        }
        
        return -1;
    }
