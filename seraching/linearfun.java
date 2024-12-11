public class linearfun {
    public static int checkitem(int arr[], int item){
        for (int i=0;i<arr.length ;i++ ) {
            if (arr[i]==item) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={12,34,56,77,55,77,5444,77,2};
        int key=5444;
        int out= checkitem(arr,key);
        if (out!= -1) {
            System.out.println("Element is found "+ out);
        }
        else{
            System.out.println("NOt found ");
        }
    }
}       
