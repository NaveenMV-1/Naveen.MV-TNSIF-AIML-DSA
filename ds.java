public class ds {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int largest = arr[0];
        int second = arr[1];
        if(largest <= second){
            int temp = largest;
            largest = second;
            second = temp;
        }
        for (int i = 2; i < arr.length; i++)     {
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }else if(arr[i] > second){
                second = arr[i];
            }
        }
        System.out.println(second);
    }
}
