import java.util.*;

 class MaxTipCalc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int n = s.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int a1 = s.nextInt();
            int b1 = s.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = s.nextInt();
            }
            System.out.println(function(a1,b1,a,b));
        }
    }

    private static int function(int a1, int b1, int[] a, int[] b) {
        if(a1 == 0){
            if(b1 >= b.length){
                int sum = 0;
                for (int i = 0; i < b.length; i++) {
                    sum += b[i];
                }
                return sum;
            }
            return Integer.MIN_VALUE;
        }
        if(b1 == 0){
            if(a1 >= a.length){
                int sum = 0;
                for (int i = 0; i < a.length; i++) {
                    sum += a[i];
                }
                return sum;
            }
            return Integer.MIN_VALUE;
        }
        if(a.length == 0){
            return 0;
        }
        if(b.length == 0){
            return 0;
        }
        return Math.max(a[0] + function(a1 - 1, b1, Arrays.copyOfRange(a,1,a.length), Arrays.copyOfRange(b,1,b.length)),b[0] + function(a1 , b1 - 1, Arrays.copyOfRange(a,1,a.length), Arrays.copyOfRange(b,1,b.length)));
    }
}
