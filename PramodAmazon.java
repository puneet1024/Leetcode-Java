import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.*;

public class PramodAmazon {
    int[] min = new int[1];
    int[][] dist;

    public int minimumDistance(int numRows, int numColumns, List<List<Integer>> area) {
        int ans = 0;
        min[0] = 0;
        dist = new int[numRows][numColumns];
        for(int i=0;i<numRows;i++){
            Arrays.fill(dist[i],Integer.MAX_VALUE);
        }
        dfs(numRows, numColumns, area, 0, 0, 0);
        for(int i=0;i<numRows;i++) for(int j=0;j<numColumns;j++) if(area.get(i).get(j) == 9) {
            ans = dist[i][j];
        }
        return ans == Integer.MAX_VALUE? -1:ans;
    }

    private void dfs(int numRows, int numColumns, List<List<Integer>> area, int i, int j, int count) {
        /*if (i < 0 || i >= numRows || j < 0 || j >= numColumns || area.get(i).get(j) == 0)
            return 0;
        if (area.get(i).get(j) == 9) {
            if (count < dist[i][j]) {
                dist[i][j] = count;
                min[0] = count;
                return count;
            }
        }else {
            int temp = area.get(i).get(j);
            area.get(i).set(j, 0);
            dfs(numRows, numColumns, area, i + 1, j, count + 1);
            dfs(numRows, numColumns, area, i - 1, j, count + 1);
            dfs(numRows, numColumns, area, i, j + 1, count + 1);
            dfs(numRows, numColumns, area, i, j - 1, count + 1);
            area.get(i).set(j, temp);
            return dist[i][j];
        }
        return 0;*/

        if(i < 0 || j < 0 || i == numRows || j == numColumns || area.get(i).get(j) == 0) return;
        if(count < dist[i][j]) {
            dist[i][j] = count;
            dfs(numRows,numColumns,area,i+1,j,count+1);
            dfs(numRows,numColumns,area,i-1,j,count+1);
            dfs(numRows,numColumns,area,i,j+1,count+1);
            dfs(numRows,numColumns,area,i,j-1,count+1);
        }

    }

    public static void main(String[] args) {
        PramodAmazon ti = new PramodAmazon();

        List<List<Integer>> area = new ArrayList<>();
//        List<List<Integer>> area = asList (asList (1, 1, 1,1), asList (0, 1, 1,1), asList(0,1, 0, 1), asList(1,1, 9, 1), asList(0,0, 1, 1));
        for(int i=0;i<50;i++) {
            area.add(new ArrayList<Integer>());
            for (int j = 0; j < 50; j++) {
                area.get(i).add(j);
            }
        }
//        for(int j=0;j<100;j++){
//            area.get(0).set(j,1);
//        }
        for(int i=0;i<50;i++){
            for(int j=0;j<50;j++){
                area.get(i).set(j,1);
            }
        }


        area.get(25).set(25,9);

//        List<List<Integer>> area = asList (asList (1, 1, 1), asList (1, 9, 1), asList(1,1, 1));
        int steps = ti.minimumDistance(50, 50, area);
        System.out.println(steps);
    }
}
