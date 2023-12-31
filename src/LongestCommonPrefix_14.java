import java.util.Arrays;

public class LongestCommonPrefix_14 {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;

        /* if size is 0, return empty string */
        if (size == 0)
            return "";

        if (size == 1)
            return strs[0];

        /* sort the array of strings */
        Arrays.sort(strs);

        /* find the minimum length from first and last string */
        int end = Math.min(strs[0].length(), strs[size - 1].length());

        /* find the common prefix between the first and
           last string */
        int i = 0;
        while (i < end && strs[0].charAt(i) == strs[size - 1].charAt(i))
            i++;

        String pre = strs[0].substring(0, i);
        return pre;
    }

    public static void main(String[] args) {

        LongestCommonPrefix_14 obj = new LongestCommonPrefix_14();

        String[] strs1 = {"flower", "flow", "flight"};

        System.out.println(obj.longestCommonPrefix(strs1));

        String[] strs2 = {"dog", "racecar", "car"};

        System.out.println(obj.longestCommonPrefix(strs2));

    }

}
