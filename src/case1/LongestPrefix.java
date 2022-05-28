package case1;

public class LongestPrefix {

    public static void main(String[] args){
        String[] strs = {"ab", "a"};
        var result = longestPrefix(strs);
        System.out.println(result);
    }

    private static String longestPrefix(String[] strs){
        String prefix = "";
        for (int i = 0; i < strs[0].length(); i++){
            var charecter = strs[0].toCharArray()[i];
            for (int j = 1; j < strs.length; j++){
                if (strs[j].length() <= i) return prefix;
                if(strs[j].toCharArray()[i] != charecter) return prefix;
            }
            prefix += charecter;
        }
        return prefix;
    }
}
