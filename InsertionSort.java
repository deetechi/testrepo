public class InsertionSort {
    
    public int[] insertSort(int a[]) {
        
        for (int i=1;i<a.length;i++) {
           int curr = a[i];
           int j = i-1;
           while (j >= 0 && a[j] > curr) {
               a[j +1] = a[j];
               j--;
           }
           
               a[j+1] = curr;
        }
        
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
        
        return null;
    }
    
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int arr[] = {9,6,5,0,8,2,7,1,3};
        is.insertSort(arr);
    }
}
