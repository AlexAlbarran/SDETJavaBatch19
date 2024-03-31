package mytesting;

public class NestedForLoops3 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++){
            System.out.println("It's cold outside!");
            }

        System.out.println("----------");

        String[] colors = {"Red", "Blue", "Green"};

        for(int i = 0; i < 3; i++){
            System.out.println(colors[i]);
        }

        System.out.println("----------");

        String [] [] fancyColors = {{"Red", "Blue", "Green"}, // row 0
                                   {"Cyan", "Magenta", "Turquoise"}  // row 1
        };

        for(int row = 0; row < 2; row++) {
           for (int column = 0; column < 3; column++){
               System.out.println(fancyColors[row][column]);
           }
        }
    }
}
