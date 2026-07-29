class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        int n= asteroids.length;

        Stack <Integer> st = new Stack<>();
        

        for(int i =0; i < n ; i++){

            int num = asteroids[i];
            if(num > 0 ){ 
            st.push(num);
            }
            else{

                boolean alive = true;

                while( !st.isEmpty() && st.peek() > 0){

                    if(st.peek() < Math.abs(num)){
                        st.pop();
                    }else if(st.peek() == Math.abs(num)){
                        st.pop();
                        alive = false;
                        break;
                    }else {
                        alive = false;
                        break;
                    }
                }
                if(alive)
                st.push(num);

            }  
         }

         int[] arr = new int[st.size()];
         for(int i = st.size() -1 ; i>=0 ;i--){
            arr[i] = st.pop();
         }
        return arr;
    }
}