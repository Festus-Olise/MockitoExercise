import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceTest {

    @Test
    void retrieveData() {

        BookInterfaceImplement bb = new BookInterfaceImplement();
        BookService bk = new BookService(bb);

        List<String> fl = bk.retrieveData();

        assertEquals(2, fl.size());
    }

    @Test
    void computeTest(){
        BookInterfaceImplement bb = new BookInterfaceImplement();
        BookService bk = new BookService(bb);

        HashMap<String, Double> map = new HashMap<String, Double>();

        List<String> fl = bk.retrieveData();
        map = bk.Discount();

        assertEquals(2, (map.size()));

    }
}