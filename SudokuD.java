import java.util.*;
import java.io.*;


public class SudokuD{
public static void main(String[] args){


  int [][] game = new int[] []
             { {6,5,9,0,1,0,2,8,0},
               {1,0,0,0,5,0,0,3,0},
               {2,0,0,8,0,0,0,1,0},
               {0,0,0,1,3,5,0,7,0},
               {8,0,0,9,0,0,0,0,2},
               {0,0,3,0,7,8,6,4,0},
               {3,0,2,0,0,9,0,0,4},
               {0,0,0,0,0,1,8,0,0},
               {0,0,8,7,6,0,0,0,0}};
 
   Sudoku ss = new Sudoku (game);
  // System.out.println(ss.solve());
}

}
