package practice5.sort;

public class MaxSum {
    public static int maxSubArraySum(int arr[]){
        
        int n = arr.length;
        int max_sum = Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];

            if (sum>max_sum){
                max_sum = sum;
            }
            if(sum<0);
            sum =0;
        }
        return max_sum;
    }
    public static void main(String[] args) {
        int [] arr={ 23,45,23,-667,13,87,34,5};
    System.out.println(maxSubArraySum(arr));
    }
}
