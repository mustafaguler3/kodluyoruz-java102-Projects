import java.util.ArrayList;

public class EvenNumber implements Runnable{

    private ArrayList<Integer> temp;
    private ArrayList<Integer> evens = new ArrayList<>();

    public EvenNumber(ArrayList<Integer> temp) {
        this.temp = temp;
    }

    @Override
    public void run() {
        for (int i = 0; i < temp.size() ; i++) {
            if(temp.get(i) % 2 == 0) {
                evens.add(temp.get(i));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(evens);
    }

}
