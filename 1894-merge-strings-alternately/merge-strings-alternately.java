class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int i=0,j=0;
        while(i<word1.length()  && j<word2.length() ){
            merge.append(word1.charAt(i++));
            merge.append(word2.charAt(j++));
        }
        if(i<word1.length()){merge.append(word1.substring(i)); }
        if(j<word2.length()){merge.append(word2.substring(j)); }

        return merge.toString();
    }

}