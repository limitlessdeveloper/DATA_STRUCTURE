import java.util.Arrays;
 
 class ExampleBucketSort {
 
    public static void main(String[] args) {
 
        int[] num = { 3,6,1,7,2,8,10,4,9,5};
        int n = num.length;
        
        bucketSort(num);
        
        for (int h = 0; h < n; h++)
            System.out.print(num[h]+ " ");
    }
 
     
     public static int[] bucketSort(int[] arr) {
            int i, j;
            int[] bucket = new int[arr.length+1];
            Arrays.fill(bucket, 0);
			
            
            
			for (i = 0; i < arr.length; i++) {
				
                bucket[arr[i]]++;
            }
			// for(i=0;i<=arr.length;i++)System.out.print(bucket[i]+" ");
            int k=0;
            for (i = 0; i < bucket.length; i++) {
                for (j = 0; j<bucket[i]; j++) {
					System.out.println(j+" "+k+" "+arr[k]+" "+i);
                    arr[k++] = i;
                }
            }
            return arr;
        }
 
 
}