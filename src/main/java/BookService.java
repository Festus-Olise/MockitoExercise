import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookService {

    private BookInterface bk;
    public BookService(BookInterface bk) {
        this.bk = bk;
    }

    public List<String> retrieveData(){
        List<String> filtered = new ArrayList<>();
        List<String> books = bk.retrieveTodos();

        for(String bks:books) {
            if(bks.contains("Java")){
                filtered.add(bks);
            }
        }

        return filtered;
    }

    public HashMap<String, Double> Discount() {

        List<String> books = bk.retrieveTodos();
        double price = 0;
        double nPrice = 0;

        HashMap<String, Double> map2 = new HashMap<String, Double>();

        for (String bks: books){
            if(bks.contains("Java")) {
                price = bk.getPrice(bks);
                nPrice = price - (price * 0.1);
                map2.put(bks, nPrice);
            }
        }

        return  map2;
    }
}
