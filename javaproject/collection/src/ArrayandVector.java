import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Administrator on 2015/2/12.
 */
public class ArrayandVector {
    public  static void main(String[] args) {
       ArrayandVector list = new ArrayandVector();
        list.start();
    }

    public void start(){
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
       Vector<Integer> vector=new Vector<Integer>();
        int
                times=1000;
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
            vector.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--vector add");
        System.out.println("-------------------------");

        startTime=System.nanoTime();
        for (int i = 0; i < times; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--ArrayList get");

        // vector get
        startTime = System.nanoTime();

        for (int i = 0; i < times; i++) {
            vector.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--vector get");
        System.out.println("-------------------------");

        // ArrayList remove
        startTime = System.nanoTime();

        for (int i = times - 1; i >= 0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--ArrayList remove");

        //vector  remove
        startTime = System.nanoTime();

        for (int i = times - 1; i >= 0; i--) {
            vector.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println(duration + " <--vector remove");
    }
}
