// This is q36 Leetcode on Java lang with 2 approach
class Solution {
    public boolean isValidSudoku(char[][] board) {

    //     HashSet<Character>[] rows  = new HashSet[9];
    //     HashSet<Character>[] cols = new HashSet[9];
    //     HashSet<Character>[] boxes = new HashSet[9];

    //     for(int i = 0 ; i < 9 ; i++){
    //         rows[i] = new HashSet<>();
    //         cols[i] = new HashSet<>();
    //         boxes[i] = new HashSet<>();
    //     }

    //     for(int r = 0 ; r < 9 ; r++){
    //         for(int c = 0 ; c < 9 ; c++){
    //             char val = board[r][c];
    //             if(val == '.') continue;

    //             int boxIndex = (r / 3) * 3 + (c / 3);

    //             if (rows[r].contains(val) || cols[c].contains   (val) || boxes [boxIndex].contains(val)) {
    //                 return false;
    //             }
    //              rows[r].add(val);
    //              cols[c].add(val);
    //              boxes[boxIndex].add(val);

    //         }        
    //     }
    //     return true;
    // }
    HashSet<Character>[] rowsset = new HashSet[9];
    HashSet<Character>[] colmset = new HashSet[9];
    HashSet<Character>[] gridset = new HashSet[9];

    for(int i=0;i<9;i++){
        rowsset[i] = new HashSet<>();
        colmset[i] = new HashSet<>();
        gridset[i] = new HashSet<>();
    }

    for(int i =0;i<9;i++){
        for(int j=0;j<9;j++){
            int gridnum = (j/3)+(i/3)*3;

            if(board[i][j] != '.'){
                boolean isPresentInRow = rowsset[i].contains(board[i][j]);
                boolean isPresentInColm = colmset[j].contains(board[i][j]);
                boolean isPresentInGrid = gridset[gridnum].contains(board[i][j]);

                if(isPresentInRow  || isPresentInColm || isPresentInGrid){
                    return false;
                }
                rowsset[i].add(board[i][j]);
                colmset[j].add(board[i][j]);
                gridset[gridnum].add(board[i][j]);
            }   
        }
    }
    return true;
}
}