package chapterSeventeen;

public class MultiThreading extends Thread{


    private int threadNumber;

    public MultiThreading(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }

    }

    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            MultiThreading m = new MultiThreading(i);
            m.start();
        }
        throw new RuntimeException();
    }
}
