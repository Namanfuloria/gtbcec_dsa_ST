package week_5;

public class mooreAlgo {
    static int mooreAlgo(int nums[]){
    int count=0;
        int candidate=0;
        int current=0;
        for(int i=0; i<nums.length; i++){
            current =nums[i];
            if(count==0)
                candidate=nums[i];
            if(current==candidate)
                count++;
            else
                count--;
        }
        return candidate;
}
}