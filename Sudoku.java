import java.util.*;
import java.io.*;


public class Sudoku{

   private int [][] board;
   private int [][] start;
   
   public Sudoku(int[][] board){
      //this.board = board;
      start = createBoard();
      this.board = solveBoard(board);
   
   }
   
   
   public int [][] createBoard(){
      
      int [][] array = new int [3][3];
      ArrayList <Integer> list = new ArrayList <Integer>();
      for(int i = 0; i < 3; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            int num = generate();
            boolean contains = true;
            while (contains)
            {
               boolean found = false;
               for(int each: list)
               {
                  if(each == num)
                  {
                     found = true;
                  }
               }
                        
               if(!found){
                  contains = false;
                  list.add(num);
               
               }
               else{
                  num = generate();
               }
            }
            array [i][j] = num;
                  
         }
      }
      return array;
   }


   public int[][] solveBoard(int[][] board){
      int array = board;
   
      for (int i = 0; i< 9; i++)
      {
         for (int j = 0; j<0; j++)
         {
            for(int k = 1; k <= 9; k++ )
            {
            if(array[i][j] == 0)
            {
            
            if(checkRow(array, k) && checkBox(array, k) && checkCol(array, k))
            
            return 
            
            }
            }             
         }
      }
   
   
   }
   
   
   
   
    public boolean checkRow(int[][] board, int num){
    return true;
   }
   
       public boolean checkCol(int[][] board, int num){
       return true;
   }
   
       public boolean checkBox(int[][] board, int num){
       return true;
   }
   
   public int generate()
   {
   
      return (int) Math.floor( Math.random() * ((9 - 1) + 1) + 1);
   
   }

   public String toString()
   {
      String a = "";
      for(int i = 0; i < 3; i++)
      {
         for(int j = 0; j < 3; j++)
         {
            a +=  start [i][j] + " "; 
         }
         a +="\n";
      }
      return a ;
   }


}
