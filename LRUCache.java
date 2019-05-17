import java.util.*;

public class LRUCache {
    private Deque<Integer> queue;
    private HashSet<Integer> hash;
    private int k;
    public LRUCache(int capacity) {
        hash = new HashSet<>();
        queue = new LinkedList<>();
        k = capacity;
    }

    public void refer(int key) {
        if (!hash.contains(key)){
            if(queue.size() == k) {
                int drop = queue.removeLast();
                hash.remove(drop);
            }
        }
        else {
            Iterator<Integer> itr = queue.iterator();
            int index=0,i=0;
            while(itr.hasNext()){
                if(itr.next() == key)
                    index = i;
                i++;
            }
            queue.remove(index);
        }
        queue.push(key);
        hash.add(key);
    }

    public void display()
    {
        Iterator<Integer> itr = queue.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }


    public static void main(String[] args) {
        LRUCache ca=new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }
}

