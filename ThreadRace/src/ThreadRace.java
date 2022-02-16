import java.util.ArrayList;

public class ThreadRace implements Runnable{

    ArrayList<Integer> even= new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();
    ArrayList<Integer> list4 = new ArrayList<>();



    public void even() throws InterruptedException {
        for (int i = 0;i<2500;i++){
            if (i % 2 == 0){
                even.add(i);
                System.out.println("Even :"+i);
            }
            Thread.sleep(1000);
        }
    }

    public void odd() throws InterruptedException {
        for (int i = 0;i<2500;i++){
            if(i % 2 == 1){
                odd.add(i);
                System.out.println("Odd :"+i);
            }
            Thread.sleep(1000);
        }
    }

    public void list3() throws InterruptedException {
        for (int i = 0;i<2500;i++){
            list3.add(i);
            System.out.println("List3 :"+i);
            Thread.sleep(1000);
        }
    }

    public void list4() throws InterruptedException {
        for (int i = 0;i<2500;i++){
            list4.add(i);
            System.out.println("List4 :"+i);
            Thread.sleep(1000);
        }
    }

    public void lists() throws InterruptedException {
        even();
        odd();
        list3();
        list4();
    }

    @Override
    public void run() {

    }
}
