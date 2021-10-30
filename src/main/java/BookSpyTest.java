import java.util.ArrayList;

public class BookSpyTest {

    ArrayList<String> aList = new ArrayList<String>();

    public ArrayList<String> getALIst() {
        return aList;
    }

    public void setAList(ArrayList<String> aList) {
        this.aList = aList;

    }

    BookSpyTest() {
        //initialize an ArrayList with add()
        aList.add("PHP");
        aList.add("Java for Dummies");
        aList.add("Java for Experts");
    }

    public void addToArray(String x) {
        aList.add(x);
    }
}
