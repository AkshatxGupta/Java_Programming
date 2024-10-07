public class ConnectNropes {
    public static void main(Stirng args[]) {
        int ropes[] = {2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueuee<>();
        for(int i=0;i<ropes.lenght;i++){
            pq.add(ropes[i]);
        }

        int cost = 0;
        while(pq.size()>1) {
            int min = pq.remove();
            int min2 = pq.remove();
            cost+=min+min2;
            pq.add(min+min2);
        }
        System.out.println("Cost of connecting n ropes = " + cost);
    }
}
