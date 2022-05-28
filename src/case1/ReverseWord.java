package case1;

public class ReverseWord {
    public static void main(String[] args){
//        var s = "the sky is blue";
        var s = "a good   example";
        var r = "";
        var s_arr = s.split(" ");
        for (int i = s_arr.length - 1; i >= 0; i--){
//            if(s_arr[i] != " ") r += s_arr[i]+" ";
            if(!s_arr[i].isEmpty()) System.out.println(s_arr[i]);
        }
//        System.out.println(r.trim());
    }
}
