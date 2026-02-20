import java.util.*;

class Solution {
    public String makeLargestSpecial(String s) {
        List<String> list = new ArrayList<>();
        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
            else count--;

            // found one special substring
            if (count == 0) {
                // recursively solve inner part
                String inner = s.substring(start + 1, i);
                String processed = "1" + makeLargestSpecial(inner) + "0";
                list.add(processed);
                start = i + 1;
            }
        }

        // sort in descending order
        Collections.sort(list, Collections.reverseOrder());

        // join all
        StringBuilder result = new StringBuilder();
        for (String str : list) {
            result.append(str);
        }

        return result.toString();
    }
}