public class EvenNumberOfDigits {

    public static int findNumbers(int[] nums) {

        int evenAmount = 0;
        String newString;
        int strLength = 0;
        for(int i =0; i<nums.length; i++){

            newString= String.valueOf(nums[i]);
            strLength = newString.length();

            if(strLength % 2 ==0)
                evenAmount++;


        }

        return evenAmount;


    }

    public static void main(String[] args){


        int[] firstArray = new int[5];
        firstArray[0] = 12;
        firstArray[1] = 345;
        firstArray[2] = 2;
        firstArray[3] = 6;
        firstArray[4] = 7896;

        int[] secondArray = new int[4];
        secondArray[0] = 555;
        secondArray[1] = 901;
        secondArray[2] = 482;
        secondArray[3] = 1771;

        int evenAmount1 = findNumbers(firstArray);
        int evenAmount2 = findNumbers(secondArray);

        System.out.print("The amount of numbers with even digits in this array: ");
        for(int i =0; i<firstArray.length;i++){
            System.out.print(firstArray[i]+",");
        }

        System.out.print(" are "+evenAmount1);
        System.out.println();
        System.out.print("The amount of numbers with even digits in this array: ");
        for(int i =0; i<secondArray.length;i++){
            System.out.print(secondArray[i]+",");
        }

        System.out.print(" are "+evenAmount2);






    }
}
