package mytesting;

public class NestedForLoops5MultiplicationTable {
    public static void main(String[] args) {

        for(int i = 1; i <=10; i++){  // this represents rows
            for(int j = 1; j <= 10; j++)  // this represents columns
                System.out.print((i * j) + " ");

            System.out.println();


        }

    }
}
