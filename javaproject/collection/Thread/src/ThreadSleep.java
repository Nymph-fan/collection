/**
 * Created by Administrator on 2015/2/12.
 */
public class ThreadSleep implements Runnable  {
    public void run(){
        for(int i=0;i<3;i++){
            try {
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
    public static void main(String[] args){
        ThreadSleep he=new ThreadSleep();
        Thread demo=new Thread(he,"线程");
        demo.start();
    }

}
