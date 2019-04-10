//given a sorted array, convert it into a BST tree


public class SortedArrayIntoTree {
    public TreeNode minimalTree(int[] array){
        return arraytoBST(array,0,array.length-1);
    }
    private TreeNode arraytoBST(int[] array, int start, int end) {
        if(end < start)
            return null;
        int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(array[mid]);
        arraytoBST(array,0,mid-1);
        arraytoBST(array,mid+1,end);
        return node;
    }
    public static void main(String[] args){
        int[] arr = new int[]{2,4,5,8,10,12,15};
        SortedArrayIntoTree sait = new SortedArrayIntoTree();
        System.out.println(sait.minimalTree(arr));
    }
}
