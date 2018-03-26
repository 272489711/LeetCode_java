package _803;

//Example 1:
//Input:
//grid = [[1,0,0,0],[1,1,1,0]]
//hits = [[1,0]]
//Output: [2]
//Explanation:
//If we erase the brick at (1, 0), the brick at (1, 1) and (1, 2) will drop. So we should return 2.
//
//Example 2:
//Input:
//grid = [[1,0,0,0],[1,1,0,0]]
//hits = [[1,1],[1,0]]
//Output: [0,0]
//Explanation:
//When we erase the brick at (1, 0), the brick at (1, 1) has already disappeared due to the last move.
//So each erasure will cause no bricks dropping.  Note that the erased brick (1, 0) will not be counted as a dropped brick.

public class _803Solution {
    public int[] hitBricks(int[][] grid, int[][] hits) {
        int[] result=null;

        for(int i=0;i<hits.length;i++){
            try {
                int line=hits[i][0];
                int col=hits[i][1];
                if(grid[line][col]==1)
                    ;
            }catch (NullPointerException e){
                System.out.print("数组越界--"+ e.getMessage());
            }
        }

        for(int i=0;i<grid.length;++i){
            for(int j=0;j<grid[i].length;++j){

            }
        }


        return result;
    }
}
