class MinPositive {
    public int firstMissingPositive(int[] nums) {
        int min=1;
        while(true){
            boolean found=false;
           for(int i=0;i<nums.length;i++){
            if(nums[i]==min){
                found=true;
                break;
            }
           }
         
               
            if(!found){
                return min;
            }
          
               min++;
           }
        }
    }

      