package ex1;

public class Program {
	public static void main(String args[]){
        int n = 6; // sodong
        int[][] a = new int[n][2*n-1];
    
        int d = 0;
        int h = n;
        int c =2*n-1;
        int gt = 0;
        while(d <= n/2 ){
            for(int i = d, j = n-1; i < h && j < c; i++ , j++ ) a[i][j] = gt++;
            for(int j = c -1 ; j >=d; j--) a[h-1][j] = gt++;
            for(int i = h-2, j= d + 1; i >d && j < n-1; i-- , j++ ) a[i][j] = gt++;
            d++;h--;c--;
        }

        for (int i = 0; i < n; i++){
            for(int j = 0; j < 2*n-1; j++){
                if(j != 2*n-1){
                    System.out.print(a[i][j] + " ");
                } else {
                    System.out.println(a[i][j]);
                }
            }
        }
    }
}
