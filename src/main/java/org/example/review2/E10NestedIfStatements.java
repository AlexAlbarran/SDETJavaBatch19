package org.example.review2;

public interface E10NestedIfStatements {
    public static void main(String[] args) {

        boolean haveCoupon = true;
        int coupon = 30;
        System.out.println(1);
        if (haveCoupon) {
            System.out.println(2);
            if (coupon == 10) {
                System.out.println(3);
            } else if (coupon == 20) {
                System.out.println(4);
            } else {
                System.out.println(5);
            }

                System.out.println(6);
            }
            System.out.println(7);
        }
    }

