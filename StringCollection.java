import java.util.ArrayList;

public class StringCollection {
    private ArrayList<String> stringArrayList;

    public StringCollection (){
        this.stringArrayList = new ArrayList<>();
    }

    public void addItems (String item){
        stringArrayList.add(item);

    }

    public Iterator iterator(){
        return new StringIterator(stringArrayList);
    }


}
