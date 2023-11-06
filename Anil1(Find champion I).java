class Solution {
    public int findChampion(int[][] grid) {
        for(int i = 0; i<grid.length; i++){
            boolean Champion = true;
            for(int j = 0; j<grid.length; j++){
                if(i!=j && grid[j][i] == 1){
                        Champion = false;
                        break;
                }
            }
            if(Champion){
                return i;
            }
        }
        return -1;
    }
}
