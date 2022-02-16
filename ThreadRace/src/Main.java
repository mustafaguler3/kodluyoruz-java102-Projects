import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(25);
        ArrayList<Integer> list2 = new ArrayList<>(25);
        ArrayList<Integer> list3 = new ArrayList<>(25);
        ArrayList<Integer> list4 = new ArrayList<>(25);

        for(int i=1; i<=100; i++){
            list.add(i);
        }

        OddNumber odd = new OddNumber(list1);
        odd.run();
        Thread t1 = new Thread(odd);
        t1.start();

        EvenNumber even = new EvenNumber(list1);
        even.run();
        Thread t2 = new Thread(even);
        t2.start();






    }
}
