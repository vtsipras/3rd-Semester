import java.util.HashMap;

public class Marks {
    private HashMap<Integer, Integer> mark1;
    public Marks(){
       mark1 = new HashMap<>();
    }

    public void addMark(int aem, int mark){
        if(!mark1.containsKey(aem)){
            mark1.put(aem,mark);
        }
        else {
            System.out.println("AEM already exists");
        }

    }
    public double meanMark(){
        double pl=0;
        for(int aem : mark1.keySet()){
            pl+=mark1.get(aem);
        }
        return pl / mark1.size();
    }

    public void showStatistics(){
        int i;
        double pos;
        for(i=0;i<=10;i++){
            int pl=0;
            for(int aem : mark1.keySet()){
                if(mark1.get(aem)==i){
                    pl++;
                }
            }
            pos = ((double)pl/mark1.size()) *100;
            System.out.printf("The %.2f percent was graded with %d\n",pos,i);
        }

    }

}
