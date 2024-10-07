import java.util.*;

public class Nearbycars {
    public static class Point implements Comparator<Point> {
        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x , int y, int distSq,int idx) {
            this.x = x;
            this.y =y;
            this.distSq = distSq;
            this.idx = idx;
        }
        @Override
        public int compareTo(Point p2) {
            return this.distSq-p2.distSq;
        }
    }
    public static void main(String args[]) {
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;

        PriorityQueuee<Point> pq = new PriorityQueuee<>();
        for(int i=0; i<pts.length; i++){
            int distSq = pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new Point(pts[i][0],pts[i][1],distSq,i));
        }
        //nearest k cars
        for(int i=0;i<pts.length;i++) {
            System.out.println("c"+pq.remove().idx);
        }
    }
}