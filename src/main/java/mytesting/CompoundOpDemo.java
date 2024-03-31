package mytesting;

public class CompoundOpDemo {
    public static void main(String[] args) {
        // number will equal 5, then number + 3 = 8
        int number=5;
        number=number+3;

        //shorthand way to write number=number+3 would be:  number += 3 will now add 3 to 8 from above, totaling 11
        number += 3;

        //now if we wanted to do 11 x 2, it now total 22
        number *= 2;

        //to divide 22 enter the following and the result is 11
        number /= 2;

        //we can also use the module operator to give you the remainder of 11, which is 1
        number %= 2;
        System.out.println(number);

    }
}
