class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        //step 1 : find maxcandies
        int maxCandie = 0;
        for(int c : candies){
            if(c >maxCandie)
            maxCandie = c;
        }
        // step 2 : find maxcandies for each kid - candies[i]+extracandies >=maxcandies
        for(int c:candies){
            if(c+extraCandies >= maxCandie)
            result.add(true);
            else
            result.add(false);
        }
        return result;
    }
}