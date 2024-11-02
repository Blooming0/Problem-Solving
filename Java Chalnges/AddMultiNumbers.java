package AddNumbers;

public class AddMultiNumbers {
    public static void main(String[] args) {
       double result = nums(1,2,3,4,5,6,7,8);
        System.out.println(result);
    }
    //clone satarting with 3 Dot (...)
    public static double nums(double ...nums){
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }
}
