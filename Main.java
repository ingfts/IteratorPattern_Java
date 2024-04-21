

public class Main {
    public static void main(String[] args) {
        StringCollection stringCollection = new StringCollection();
        stringCollection.addItems("cake");
        stringCollection.addItems("car");
        stringCollection.addItems("toy");
        stringCollection.addItems("chair");
        stringCollection.addItems("bottle");
        stringCollection.addItems("table");
        stringCollection.addItems("phone");
        stringCollection.addItems("dog");



        Iterator stringIterator = stringCollection.iterator();



        while (stringIterator.hasNext()){
            System.out.println(stringIterator.getNext());

        }

//        System.out.println(stringIterator.getNext());


    }
}
