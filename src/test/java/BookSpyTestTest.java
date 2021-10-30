import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookSpyTestTest {

    @Test
    void addToArray(){
        BookSpyTest listSpy = spy(new BookSpyTest());

        listSpy.addToArray("Java for Experts");

        List<String> m = listSpy.getALIst();

        assertEquals(4, m.size());

            verify(listSpy, times(1)).addToArray("Java for Experts");
            assertEquals("Java for Experts", m.get(3));
    }
}
