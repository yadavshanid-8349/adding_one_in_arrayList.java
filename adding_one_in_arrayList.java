import java.util.*;
public class adding_one_in_arrayList {
    Vector<Integer> addOne(int[] arr) {
        // code here
        Vector<Integer> ans=new Vector<>();
        int n=arr.length-1,carry=1;
        for(int i=n;i>=0;i--){
            if(arr[i]+carry<=9){
                ans.add(arr[i]+carry);
                carry=0;
            }else{
                ans.add(0);
                carry=1;
            }
        }
        if(carry==1){
            ans.add(1);
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the size of array:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i;
        for (i = 0; i < arr.length; i++) {
            System.out.println("enter the element: " + (i + 1));
            arr[i] = input.nextInt();
        }
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
       adding_one_in_arrayList obj=new adding_one_in_arrayList();
        Vector<Integer> result=obj.addOne(arr);
        System.out.print(result);
    }
}
