class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        generate(nums , 0 , result);

        return result;

    }

    public void generate(int[] nums , int index , List<List<Integer>> result){

        if( index == nums.length){

            ArrayList<Integer> list = new ArrayList<>();

            for(int i : nums)
            list.add(i);

            result.add(list);
        }

        HashSet<Integer> used = new HashSet<>();

        for(int i = index ; i< nums.length ; i++){

            if(used.contains(nums[i]))
            continue;

            used.add(nums[i]);
            swap(nums, index ,i);

            generate(nums,index+1 , result);

            swap(nums , index , i);
        }
    }

    public void swap(int[] arr , int a , int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}