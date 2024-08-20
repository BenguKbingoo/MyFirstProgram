package Challenges;

public class Challenge1 {

    public static void main(String[] args) {

        int[] nums = new int[10]; //[0,0,0,0,0,0,0,0,0,0,0]

        //nums = new int[]{1,2,3,4,5,6,7,8,9,10};

       //nums[0] = 1;
       //nums[1] = 2;
       //nums[2] = 3;
       //nums[3] = 4;
       //nums[4] = 5;
       //nums[5] = 6;
        //...

        for(int i = 0; i<10; i++) {
            nums[i] = i+1;
            System.out.println(nums[i]);
        }

        System.out.println("---------------------------------------");


        int curNum = nums[0];
        while(curNum < 5) {
            System.out.println(curNum);
            curNum++;
        }

    }
}
