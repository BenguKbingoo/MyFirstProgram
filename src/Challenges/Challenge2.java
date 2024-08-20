package Challenges;

public class Challenge2 {

    public static void main(String[] args) {

        int[] nums = new int[10];

        nums = new int[]{2,34,67,32,41,79,24,63,11,3};



        int[] nums2 = new int[]{21, 35, 65, 78, 30, 97, 61, 5};
        int[] nums3 = new int[]{210, 351, 650, 781, 300, 971, 610, 51};

        divisible2(nums2);
        System.out.println("------------");
        divisible2(nums3);



    }

    public static void divisible2(int[] nums){
        for(int i = 0; i<nums.length; i++ ){

            if(nums[i] % 2 == 0) {
                System.out.println("This number is even");
            }
            else {
                System.out.println("This number is odd");
            }

        }
    }


}


