package problems.dsa.graph;

import java.util.*;

public class SparseDSU {
    public static void main(String[] args) {
        Scanner kbr = new Scanner(System.in);
        int cases = kbr.nextInt();
        while(cases-->0){
            int comms = kbr.nextInt();
            int bSquares = kbr.nextInt();
            kbr.nextLine();
            char[] line = kbr.nextLine().toCharArray();
            dsu curr = new dsu();
            while(bSquares-->0){curr.remove(kbr.nextInt());}
            long index = 1;
            for(char c:line){
                if(c=='A'){
                    index++;
                    curr.remove(index);
                } else if (c=='B') {
                    long pos = curr.find(index);
                    curr.remove(index);
                    index = pos;
                }
            }
        }
    }
}



     class dsu {
        private HashMap<Long, Long> parent  = new HashMap<>();

        long find(long x){
            Long p = parent.get(x);
            if(p==null) return x;

            Long cur = x;
            ArrayList<Long> chain = new ArrayList<>();
            while(true){
                Long nxt = parent.get(cur);
                if(nxt==null){
                    break;
                }
                chain.add(cur);
                cur = nxt;
            }
            Long root = cur;

            for(Long node : chain) parent.put(node, root);
            return root;
        }

        void union(long x, long y){
            long resX = find(x);
            long resY = find(y);
            if(resX==resY) return;
            parent.put(resX,resY);
        }

        void remove(long p){
            union(p,p+1);
        }
    }


