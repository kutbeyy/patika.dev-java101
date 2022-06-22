package MineSweeper;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MineSweeper mine = new MineSweeper(5, 5);
        
        System.out.println(Arrays.deepToString(mine.mayinKoor));

        mine.run();


    }
}
