package boomerang;

public class Boomerang {
    public static void main(String[] args){
        System.out.println(countBoomerangV2(new int[]{2,2,2,3,5,4,5,4}));
    }

    public static int countBoomerangV2(int[] nums){
        int evens = -1;
        int times = 0;
        int odds = -1;
        for(int i=0;i<nums.length;i++){

            if(i%2==0){
                if(evens==nums[i] && nums[i]!=odds){
                    times++;
                }else{
                    evens = nums[i];
                }
            }else{
                if(odds==nums[i] && nums[i]!=evens){
                    times++;
                }else{
                    odds = nums[i];
                }
            }
        }
        return times;
    }
}
