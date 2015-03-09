import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2015/2/13.
 */
public class TestSet {
    public static void main(String[] args){
        int N=1000000;
        Set<Double> treeset=new TreeSet<Double>();
        Set<Double> hashset=new HashSet<Double>();
        long start,end;

        start=System.nanoTime();
        for(int i=0; i<N; i++) {
            treeset.add(Math.random());
        }
        end = System.nanoTime();
        System.out.println("TreeSet set: " + (end - start));


        start = System.nanoTime();
        for(int i=0; i<N; i++) {
            hashset.add(Math.random());
        }
        end = System.nanoTime();
        System.out.println("HashSet set: " + (end - start));

        start = System.nanoTime();
        for(int i=0; i<N; i++) {
            treeset.contains(Math.random());
        }
        end = System.nanoTime();
        System.out.println("TreeSet get: " + (end - start));

        start = System.nanoTime();
        for(int i=0; i<N; i++) {
            hashset.contains(Math.random());
        }
        end = System.nanoTime();
        System.out.println("HashSet get: " + (end - start));

    }
}
