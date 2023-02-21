class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int s=0,e=numbers.length-1;
       int i=0,j=0;
       int temp[]=numbers;
       int res[]=new int[2];
       while(s < e){
           if(temp[s] + temp[e] == target){
                res[0]=s+1;
                res[1]=e+1;
                return res;
                
           }else if(temp[s] + temp[e] > target ){
                 e--;
           }else{
                s++;
           }
       }
       
       return res;
    }
}
