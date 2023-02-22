import java.util.Scanner;
class HelloWorld {
     public static int[][] transpose(int[][] arr,int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
      int n= sc.nextInt();
      int arr[][]=  new int[n][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
          arr[i][j]=sc.nextInt();
        }
      }
      transpose(arr,n);

      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
         System.out.print(arr[i][j] +" ");
        }
         System.out.println("\n");
    }
}
}
