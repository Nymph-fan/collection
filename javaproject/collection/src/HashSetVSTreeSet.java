import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2015/2/13.
 */
public class HashSetVSTreeSet {
    public static int num=1000000;
    private static Set<Integer> treeset=new TreeSet<Integer>();
    private static Set<Integer> hashset=new HashSet<Integer>();

    private static void setTreeset() {
        for (int i = 0; i < num; i++) {
            treeset.add(i);
        }

        for (int i = 0; i < num; i++) {
            treeset.contains(i);
        }
    }

    private static void setHashset() {
        for (int i = 0; i < num; i++) {
            hashset.add(i);
        }
        for (int i = 0; i < num; i++) {
            hashset.contains(i);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        setTreeset();
        setHashset();
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");

        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long start1 = System.currentTimeMillis();
                   setTreeset();
                    long end1 = System.currentTimeMillis();
                    System.out.println("setTreeset = " + (end1 - start1) + "ms");
                }
            }).start();


            new Thread(new Runnable() {
                @Override
                public void run() {
                    long start2 = System.currentTimeMillis();
                    setHashset();
                    long end2 = System.currentTimeMillis();
                    System.out.println("sethashset=" + (end2 - start2) + "ms");
                }
            }).start();
        }
    }

}
