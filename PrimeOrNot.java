public class PrimeOrNot {
    public static void main(String[] args) {
        int n = 5;
        boolean[] nums = new boolean[n+1];
        isPrime(n,nums);
    }
    static void isPrime(int n,boolean[] arr){

        for (int i = 2; i*i <=n ; i++) {
            if(!arr[i]){
                for (int j = i*2; j <=n ;j+=i) {
                    arr[j]=true;
                    }
                }
            }

        for (int i = 2; i <=n ; i++) {
            if (!arr[i]){
                System.out.println(i + " ");
            }
        }
//2,3,5,7,11,13,17,23,31,37
    }
}
