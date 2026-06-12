package Array_Practice_DSA;

public class Average_Array_Elements {

static double getAverage(int[] arr){
    double sum = 0;
    for (int i : arr){
        sum += i;
    }
    int size = arr.length;
    double avg = sum / size ;
    return avg;
}


    static void main() {
       int[] arr = { 2,4,1,3};
        System.out.println(getAverage(arr));
    }

}
