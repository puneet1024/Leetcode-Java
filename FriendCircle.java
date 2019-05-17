//Leetcode 547

public class FriendCircle {
    public int findCircleNum(int[][] M) {
        //Consider each friend as a node of the graph and vertex between them as a relationship
        /*
        1---2
            |        1-2-3 makes a group and 4 is left as another group
        4   3

        What I am thinking is we will keep track of the visited friends by keeping an array so that we don not visit them again

        Every node will be a friend of itself
        1    2    3               0  1  2  3
     1  1    1    0        visit  0  0  0  0
     2  1    1    0
     3  0    0    0

        */

        //edge cases
        if(M.length==0 || M==null)
            return 0;
        int count = 0;
        int[] visit = new int[M.length];
        for (int i=0;i<M.length;i++){
            if(visit[i] == 0){
                dfs(M,visit,i);
                count++;
            }
        }
        return count;
    }

    private void dfs(int[][] M, int[] visit, int i){
        for(int j=0;j<M.length;j++){
            if(M[i][j] == 1 && visit[j]!=1){
                visit[j]=1;
                dfs(M,visit,j);
            }
        }
    }
}
