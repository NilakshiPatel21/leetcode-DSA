class Solution {
    public String convert(String s, int numRows) {
        
        if (numRows == 1)
         return s ;

        StringBuilder[] rows = new StringBuilder[numRows];

        int currow =0;
        boolean godown = true;

        for(int i = 0; i < numRows; i++){
          rows[i] = new StringBuilder();
      }
        for(char ch : s.toCharArray()){
            
            rows[currow].append(ch);
            
            if(currow == 0)
                godown = true;

            if(currow == numRows-1 ){
                godown = false;
            }
            if(godown)
                currow++;
            else
                currow--;
        }

        StringBuilder ans = new StringBuilder();
        for(StringBuilder row : rows){
            ans.append(row);
        }

        return ans.toString();
    }
}