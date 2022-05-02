public class Question1 {
    public String evenOdd(int n){
        if(n%2 ==0){
            return "even";
        }
        else{
            return  "odd";
        }
    }
    public int[] maxMin(int[] arr){
        int max = 0;
        int min = 0;
        int[] minMax = new int[2];
      for(int i = 1; i< arr.length;i++){
          if(arr[i]>arr[i-1]){
              max = arr[i];
          }
          else if(arr[i]<arr[i-1]){
              min = arr[i];
          }
      }
      minMax[0] = min;
      minMax[1] = max;
      return minMax;
    }
}
