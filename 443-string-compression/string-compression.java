class Solution {
    public int compress(char[] chars) {
        
        int read = 0 ;
        int write = 0;

        while(read < chars.length){

            char current = chars[read];
            int count = 1;

            while(read < chars.length - 1 && chars[read] == chars[read+1]){
                read++;
                count++;
    
            } 
            chars[write] = current;
            write++;

            if(count > 1){
                String str = String.valueOf(count);

                for (char ch : str.toCharArray()) {
                    chars[write++] = ch;
                }
            }
            read++;

        }
        return write;

    }
}