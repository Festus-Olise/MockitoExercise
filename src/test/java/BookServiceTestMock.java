import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;


import javax.swing.text.html.HTML;
import java.util.Arrays;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class BookServiceTestMock {
    @Mock
    BookInterface bs;
    @InjectMocks
    BookService bb;
    @Captor
    ArgumentCaptor<String> ss;


    @Test
    public void retrieveBooks() {
        List<String> bks = Arrays.asList("PHP", "Java for Dummies", "Java for Experts", " HTML ");
        Mockito.when(bs.retrieveTodos()).thenReturn(bks);

        List<String> ff = bb.retrieveData();

        Assertions.assertEquals(2, ff.size());
    }

//    @Test
//    public void retrieveBooksEmpty() {
//        List<String> bks = Arrays.asList();
//        Mockito.when(bs.retrieveTodos().thenReturn(bks));
//
//        List<String> ff = bb.retrieveData();
//
//        Assertions.assertEquals(0, ff.size());

//    }

    @Test
    public void computeTest() {

        List<String> bks = Arrays.asList("PHP", "Java for Dummies", "Java for Experts", "HTML");
        Mockito.when(bs.retrieveTodos()).thenReturn(bks);

        bb.Discount();

        verify(bs).getPrice("Java for Dummies");
        verify(bs, times(1)).getPrice("Java for Experts");
        verify(bs,never()).getPrice("PHP");
    }

    @Test
    public void BookWithArgs() {

        List<String> bks = Arrays.asList("PHP", "Java for Dummies", "Java for Experts", "HTML");
        Mockito.when(bs.retrieveTodos()).thenReturn(bks);

        bb.Discount();
        verify(bs, times(2)).getPrice(ss.capture());

        Assertions.assertEquals("Java for Experts", ss.getValue());
    }
}
