import java.util.ArrayList;
import java.util.NoSuchElementException;

public class StringIterator implements Iterator{

    private ArrayList<String> stringList;
    private int position = 0;

    public StringIterator(ArrayList<String> stringList){
        this.stringList = stringList;
    }

    @Override
    public boolean hasNext() {
       return position < stringList.size();
    }

    @Override

    public String getNext(){
        if (stringList == null){
            throw new NoSuchElementException();
        } else{
            String item = stringList.get(position);
            position++;
            return item;
        }
    }
}
