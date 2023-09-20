import java.util.*;

class twolist {
    public static void main(String[] args){
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
       // int [] temp=new int[nums.length];
        int j=0;
		for(int i=0;i<=nums.length-1;i++) 
		{
			if(nums[i]!=val){
				nums[j]=nums[i];
				j++;
			}
		}
        return j;
    }
}
}