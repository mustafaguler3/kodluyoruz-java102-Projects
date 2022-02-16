import java.util.ArrayList;

public class OddNumber implements Runnable{

    private ArrayList<Integer> temp;
    private ArrayList<Integer> odds = new ArrayList<>();

    public OddNumber(ArrayList<Integer> temp) {
        this.temp = temp;
    }

    @Override
    public void run() {
        for (int i = 0; i < temp.size() ; i++) {
            if(temp.get(i) % 2 == 1) {
                odds.add(temp.get(i));
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(odds);
    }


}
