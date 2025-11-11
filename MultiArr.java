public class MultiArr {
    public static void main(String[] args) {
        int arr[][]= new int [3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=(int)(Math.random()*100);
                // System.out.println(arr[i][j]);
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    
}
