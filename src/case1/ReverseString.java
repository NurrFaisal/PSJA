package case1;

public class ReverseString {
    public static void main(String[] args){
        var str = "abcde";
        System.out.println(reverseString(str));
    }
    private static char[] reverseString(String str){
        char temp;
        int left = 0;
        int right = str.length() -1;
        char[] my_arr = str.toCharArray();
        while (left < right){
             temp = my_arr[left];
             my_arr[left] = my_arr[right];
             my_arr[right] = temp;
             left++;
             right--;
        }

        return my_arr;
    }
}
