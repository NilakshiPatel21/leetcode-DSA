class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();

        generate(nums, 0 , result);

        return result;
    }

    public void generate(int[] arr , int index , List<List<Integer>> result){

        if(index == arr.length){
            
            List<Integer> list = new ArrayList<>();
            for(int x : arr)
            list.add(x);

            result.add(list);
            return;
        }

        for(int i = index ; i< arr.length ; i++){

            swap(arr , index , i);

            generate(arr , index+1 , result);

            swap(arr , index , i);
        }
    }

    public void swap(int[] arr , int a , int b){

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}