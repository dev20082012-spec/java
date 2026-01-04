//                                                              ##BACKTRACKING IS ALL ABOUT *CHOICES*


public class backtracking { 

    public static void changearr(int arr[],int i, int val) {         // lc 3 
        // base case;
        if(i==arr.length) {
            printarr(arr);
            return;
        }
        // recurr (kaam);
        arr[i] = val;
        changearr(arr, i+1, val+1);
        arr[i] = val-2;
    }
    public static void printarr(int arr[]) {     /// random for all;
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static void findSubset(String str, String ans, int i ) {        // lc 5;
        // base 
        if(i==str.length()) {
            if(ans.length() == 0) {
                System.out.println("null");
            } else {
            System.out.println(ans);
             } return;
        }

        // recurssion
        // YES CHOICE
        findSubset(str, ans+str.charAt(i), i+1);
        // NO CHOICE 
        findSubset(str, ans, i+1);
    }

    public static void findpermutation(String str, String ans) {
        // base 
        if(str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0;i<str.length();i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String newstr = str.substring(0, i) + str.substring(i+1);
            findpermutation(newstr, ans+curr);
        }
    }


    public static int gridWays(int i, int j, int n, int m) {      // lc 13 grid ways 
        // base case
        if(i==n-1 && j == m-1 ) { // condn for last cell 
            return 1;
        } else if (i == n || j == m) { // boundary cross cond.
            return 0;
        }
        int W1 = gridWays(i+1, j, n, m);
        int W2 = gridWays(i, j+1, n, m);
        return W1 + W2;
    }
  

    public static boolean issafe(char board[][], int row, int col) {          // lc 8 N QUEENS
        // vertical up 
        for(int i = row-1; i >=0; i--) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for(int i=row-1, j= col-1; i>=0 && j>=0;i--,j--) {
            if(board[i][j]=='Q') {
                return false;
            }
        }

        // diagonal right up
        for(int i=row-1, j= col+1; i>=0 && j<board.length; i--,j++) {
            if(board[i][j]=='Q') {
                return false;
            }
        }
        return true;
    }

    // public static void NQueens(char board[][], int row) {    // lc 8 N QUEENS
    //     // base 
    //     if(row == board.length) {
    //        //  printboard(board);    == lc 8;
    //        count++; // lc 10;
    //          return;
    //     }
    //     // column loop
    //      for(int j=0;j<board.length;j++) {
    //     //     board[row][j] = 'Q';
    //     //     NQueens(board, row+1); // function call
    //     //     board[row][j] = 'x'; // backtracking step
    //     // this above is code without checking safe to place or not now below i write the code that is required to checking safe or not 
    //     if(issafe(board,row,j) ) {
    //         board[row][j] = 'Q';
    //         NQueens(board, row+1); // function call
    //         board[row][j] = 'x'; // backtracking step
    //         // the code is same as of above;
    //     }
    //     }
    // }

    public static boolean NQueens(char board[][], int row) {      // change     // lc 11 solution exist YES OR NO
        // base
        if(row == board.length) {
           //  printboard(board);    == lc 8;
             return true ; // change
        }

       // column loop
         for(int j=0;j<board.length;j++) {
         if(issafe(board,row,j) ) {
            board[row][j] = 'Q';
            if(NQueens(board, row+1)) { // function call
          return true;                                                     // CHANGE
        } 
        board[row][j] = 'x';  // backtracking step
            // the code is same as of above;
        }
        }

        return false;
    }
    public static void printboard(char board[][]) {
        System.out.println("-----------chess board-----------");
        for(int i = 0;i<board.length;i++) {
            for(int j = 0;j<board.length;j++) {
                System.out.print(board[i][j] + " ");
            } System.out.println();
        }
    }

    static int count = 0; // lc 10 N-QUEENS COUNT WAYS;     // lc 11;



    public static boolean isssafe(int sudoku[][], int row, int col, int digit) {    // LC -- 16
        // COLUMN
        for(int i = 0; i<9;i++) {
            if(sudoku[i][col] == digit) {
                return false;
            }
        }

        // ROW
        for(int j = 0; j<9;j++) {
            if(sudoku[row][j] == digit) {
                return false;
            }
        }

        // GRID CALCULATION
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        // 3*3 GRID
        for(int i= sr; i<sr+3;i++) {
            for(int j= sc; j<sc+3;j++) {
                if(sudoku[i][j]==digit) {
                    return false;
                }
            }
        } return true;
    }


    public static boolean sudokusolver(int sudoku[][], int row, int col) {
        // base case 
        if(row == 9) {
            return true;
        }
        

        // recurssion
        int nextrow = row, nextcol = col + 1;
        if(nextcol == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }
        if(sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextrow, nextcol);
        }

        for(int digit = 1; digit<=9; digit++) {
            if(isssafe(sudoku, row, col, digit)) {    // if return from this is true then
                sudoku[row][col] = digit;
                if(sudokusolver(sudoku, nextrow, nextcol)) {   // solution exist 
                    return true;
                }
                sudoku[row][col] = 0;
            }
        } return false;
    }


    public static void printsudoku(int sudoku[][]) {
        for(int i = 0; i<=8;i++) {
            for(int j = 0; j<=8;j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static void main(String args[]) {
        int arr[] = new int[5];
        // changearr(arr, 0, 1);       // lc 3
        // printarr(arr);
        // String str = "abjhcjhcvk654c";     // lc 5
        // findSubset(str,"",0);
        // String str = "abcde";         // lc 7 find permutation code
        // findpermutation(str,"");
        // int n = 3, m = 3;              // lc 13 grid problem
        // System.out.println(gridWays(0, 0, n, m));


        // int n = 4;
        // char board[][] = new char[n][n];
        // // initialize
        // for(int i = 0; i<n; i++) {                                   // LC - 8+9+10+11;
        //     for(int j = 0; j<n; j++) {
        //         board[i][j] = 'x';
        //     }
        // }

        // NQueens(board, 0); // this 0 is the no. of rows that is going to place queens with increasing no. of rows //  // lc - 8
        // System.out.println("Total ways to count N-ways of queens arrangement is "+count); // lc 10 N-QUEENS COUNT WAYS;

        // if(NQueens(board, 0)) {    // if the nqueens return true then
        //     System.out.println("solution is possible");
        //     printboard(board);
                                                                                        // LC 11
        // }  else {
        //     System.out.println("solution is not possible");
        // }


        int sudoku[][] = {{0,0,8,0,0,0,0,0,0}, 
        {4,9,0,1,5,7,0,0,2} , 
        {0,0,3,0,0,4,1,9,0} ,
        {1,8,5,0,6,0,0,2,0} , 
        {0,0,0,0,2,0,0,6,0} , 
        {9,6,0,4,0,5,3,0,0} , 
        {0,3,0,0,7,2,0,0,4} , 
        {0,4,9,0,3,0,0,5,7} , 
        {8,2,7,0,0,9,0,1,3} };

        if(sudokusolver(sudoku, 0,0)) {   /// if return statement is **true**
            System.out.println("solution exist");
           printsudoku(sudoku);
        }
        else {         /// if return statement is **false**
            System.out.println("solution does not exist");
        }
        
    }
}
