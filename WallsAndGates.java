//286. Walls and Gates
public class WallsAndGates {
    private void wallsAndGates(int[][] rooms) {
        for (int i=0;i<rooms.length;i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                if(rooms[i][j] == 0){
                    dfsHelper(rooms,i,j,0);
                }
            }
        }
        for(int[] row: rooms){
            for(int col : row){
                System.out.print(col);
            }
        }

    }

    private void dfsHelper(int[][] rooms, int i, int j, int count) {
        if(i<0 || i>=rooms.length || j<0 || j>=rooms[0].length || rooms[i][j] < count)
            return;

        rooms[i][j] = count;
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        for(int[] dir:dirs) {
            int newRow = i + dir[0];
            int newCol = j + dir[1];
            dfsHelper(rooms,newRow,newCol,count+1);
        }
    }

    public static void main(String[] args) {
        WallsAndGates wag =new WallsAndGates();
        int[][] a = {{2147483647,-1,0,2147483647}, {2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
        wag.wallsAndGates(a);
    }
}
