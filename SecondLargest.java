class Sample {
    void secondla() {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest number: " + secondMax);
    }
}
public class Main{
    public static void main(String args[]){
        Sample s1=new Sample();
        s1.secondla();
    }
}
