package interv.string;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

/**
 * @author Marek Sarnecki : msarneck@gmail.com
 */
public class ReplaceTest {

    @Test
    public void shouldReplaceQuestionMarks() {
        //given
        Replace replace = new Replace();
        String toReplace = "som?thin?";

        //when
        String result = replace.replaceQuestionMarksByRandomChar(toReplace);
        //then
        assertThat(result, not(toReplace));
        assertFalse(result.contains("?"));
    }

    @Test
    public void shouldDoNothing() {
        //given
        Replace replace = new Replace();
        String toReplace = "something";

        //when
        String result = replace.replaceQuestionMarksByRandomChar(toReplace);
        //then
        assertThat(result, is(toReplace));
    }
}
