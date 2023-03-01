import java.util.Arrays
public class Main {
    public static void main(String[] args) {
        double[] arr ={5.6,7.3,12.43,8,-1,-9.7}
        double maxValue=findMax(arr);
        double minValue = findMin(arr);
        double sum = findSum(arr);
        double average = findAve(arr);


        System.out.println("MaxValue:" + maxValue);
        System.out.println("MinValue:" + minValue);
        System.out.println("Sum of arr" + sum);
        System.out.println("Average of arr" + average);
    }

    /**
     * @description Takes in an array and returns max
     *
     * @param arr (takes in array)
     * @return the max value of  array
     */
    public static double findMax(double[] arr){
        double out = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < out){
                out = arr[i];
            }
        }
        return out;
    }

    /**
     * @description Takes in an array and returns min
     *
     * @param arr (takes in array)
     * @return the min value of the array
     */
    public static double findMin(double[] arr){
        double min= arr[0];
        for(int i =0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }

    /**
     * @description Takes in an array and returns sum of the array
     *
     * @param arr (takes in array)
     * @return the sum of the array
     */
    public static double findSum(double[] arr){
        double out = 0;
        for (double a : arr) {
            out +=a;
        }
        return out;
    }

    /**
     * @description in an array and returns average of the array
     *
     * @param arr (takes in array)
     * @return the average of the array
     */
    public static double findAve (double[] arr){
        double out = 0;
        for (double a : arr) {
            out +=a;
        }
        return out/arr.length;

    }
    public static double findMedian(double[] arr){
        Arrays.sort(arr);
        double length=arr.length;
        if (arr.length % 2 == 0){
            return(arr[(int)((length-1)/2]+arr[((int)(length-1)/2)+1])/2;
        }
        else{
            return arr[(int)((length+1)/2)];
        }


    }

   // public static boolean hasProperty(double[] arr){
        //for(int i=0;i<arr.length;i++){

       // }
    //}

}
