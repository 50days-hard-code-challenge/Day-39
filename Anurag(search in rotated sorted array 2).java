class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(high+low)/2;
            if(nums[mid]==target)
            {
                return true;
            }
            if(nums[mid]==nums[low] && nums[mid]==nums[high])
            {
                high--;
            }
            // mean ledt is sort fisrt serch in left
           else if(nums[low]<=nums[mid])
            {
                // element present in left or not
                if(target>=nums[low] && target<=nums[mid])
                {
                    high=mid-1;// if yes discard right
                }
                else
                {
                    low=mid+1;// else discard left
                }
            }
            // otherwise search in right
            else
            {
                // check element present in right or not
                 if(target>=nums[mid] && target<=nums[high])
                {
                     low=mid+1;//if yes discard left
                }
                else
                {
                     high=mid-1;// otherwise discard right
                }
            }
        }
        return false;
        
    }
 }
