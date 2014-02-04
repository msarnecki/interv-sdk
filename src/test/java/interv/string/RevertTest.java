package interv.string;

import junit.framework.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author Marek Sarnecki : msarneck@gmail.com
 */
public class RevertTest {

    @Test
    public void shouldRevert() {
        //given
        Revert revert = new Revert();
        String toRevert = "123456789";
        String expected = "987654321";

        //when
        toRevert = revert.revert(toRevert);

        //then
        assertThat(toRevert, is(expected));
    }

    @Test
    public void shouldRevertSingleCharString() {
        //given
        Revert revert = new Revert();
        String toRevert = "1";
        String expected = "1";

        //when
        toRevert = revert.revert(toRevert);

        //then
        assertThat(toRevert, is(expected));
    }

    @Test
    public void shouldRevertEmptyString() {
        //given
        Revert revert = new Revert();
        String toRevert = "";
        String expected = "";

        //when
        toRevert = revert.revert(toRevert);

        //then
        assertThat(toRevert, is(expected));
    }

}
