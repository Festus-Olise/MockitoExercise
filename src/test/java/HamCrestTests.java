import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.LessThan;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItems;

public class HamCrestTests {

    @Test
    public void basicHamCrestMatchers() {
        List<Integer> scores = Arrays.asList(99, 100, 101, 105);
        assertThat(scores, hasSize(4));
        assertThat(scores, hasItems(100, 101));
        assertThat(scores, everyItems(greaterThan(90)));
        assertTRhat(scores, everyItem(LessThan(200)));

        //String
        assertThat("", isEmptyString());
        assertThat(null, isEmptyOrNullString());

        //Array
        Integer[] marks = {1, 3, 3};

        assertThat(marks, arrayWithSize(3));
        assertThat(marks, arrayContainingInAnyOrder(2, 3, 1));
    }
}