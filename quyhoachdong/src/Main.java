//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public  static  int subarray(int [] a){
        int[] dp=new int[100];
        int result=maxarr(a);
        for(int i=0;i<a.length;i++){
            dp[i]=a[i];
        }
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                dp[i]=dp[i]+a[j];
                result=Math.max(result,dp[i]);
            }
        }
      return result;
    }
    public static  int maxarr(int[] a){
        int maxsubarray=a[0];
        for (int i = 0; i <a.length ; i++) {
            if(maxsubarray<a[i]){
                maxsubarray=a[i];
            }
        }
        return maxsubarray;
    }

    public static void main(String[] args) {
        int[] a={1 };
        System.out.println(subarray(a));
    }
}