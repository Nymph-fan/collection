import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator on 2015/2/12.
 */
public class HashMapVSHashTable {
    private static int num=1000000;
    private static void map(){
        Map<String,Integer> testMap=new HashMap<String, Integer>(16);
        for (int i=0;i<num;i++){
            testMap.get("test"+i);
        }
    }
    private static void table(){
        Hashtable<String,Integer> testTable=new Hashtable<String, Integer>(16);
        for (int i=0;i<num;i++){
            testTable.get("test"+i);
        }
    }
    public static void main(String[] args){
        long start=System.currentTimeMillis();
        table();
        map();
        long end=System.currentTimeMillis();
        System.out.println((end-start)+"ms");

        for (int i=0;i<10;i++){
            long start1 = System.currentTimeMillis();
            map();
            long end1 = System.currentTimeMillis();
            System.out.println("map = " + (end1-start1) + "ms");

            long start2 = System.currentTimeMillis();
            table();
            long end2 = System.currentTimeMillis();
            System.out.println("table = " + (end2-start2) + "ms");
        }

    }
}
