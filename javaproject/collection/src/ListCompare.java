/**
 * Created by Administrator on 2015/2/11.
 */
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Administrator on 2015/2/11.
 */
public class ListCompare {
    public  static void main(String[] args){
        ListCompare list=new ListCompare();
        list.start();
    }

    public void start(){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        LinkedList<Integer> linkedList=new LinkedList<Integer>();
        int
                times=10*1000;
        System.out.println("Test times = " + times);
        System.out.println("-------------------------");

        long startTime=System.nanoTime();

        for (int i=0;i<times;i++){
            arrayList.add(times);

        }
        long endTime=System.nanoTime();
        long duration=endTime-startTime;
        System.out.println(duration+"<--ArrayList add");


        startTime=System.nanoTime();
        for (int i = 0; i < times; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--LinkedList add");
        System.out.println("-------------------------");

        startTime=System.nanoTime();
        for (int i = 0; i < times; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--ArrayList get");

        // LinkedList get
        startTime = System.nanoTime();

        for (int i = 0; i < times; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--LinkedList get");
        System.out.println("-------------------------");

        // ArrayList remove
        startTime = System.nanoTime();

        for (int i = times - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--ArrayList remove");

        // LinkedList remove
        startTime = System.nanoTime();

        for (int i = times - 1; i >= 0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--LinkedList remove");
    }
}


