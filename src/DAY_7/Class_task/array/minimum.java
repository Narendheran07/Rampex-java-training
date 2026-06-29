package DAY_7.Class_task.array;

class minimum {
    public static void main(String[] args){
        int [] nums={1,2,-8,4,5,7};
        int min= nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }

        }
        System.out.print("minimum number " + min);
    }
}
