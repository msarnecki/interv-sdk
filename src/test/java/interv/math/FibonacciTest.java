package interv.math;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThat;

/**
 * @author Marek Sarnecki : msarneck@gmail.com
 */
public class FibonacciTest {

    @Test
    public void shouldCountFifthNumber(){
        //given
        Fibonacci fibonacci = new Fibonacci();
        int input = 5;
        int expected = 5;

        //when
        int result = fibonacci.fibonacci(input);

        //then
        assertThat(result,is(expected));
    }

    @Test
    public void shouldCountFifthNumberRecursively(){
        //given
        Fibonacci fibonacci = new Fibonacci();
        int input = 5;
        int expected = 5;

        //when
        int result = fibonacci.recursiveFibonacci(input);

        //then
        assertThat(result,is(expected));
    }

    @Test
    public void shouldCountFirstNumber(){
        //given
        Fibonacci fibonacci = new Fibonacci();
        int input = 1;
        int expected = 1;

        //when
        int result = fibonacci.fibonacci(input);

        //then
        assertThat(result,is(expected));
    }

    @Test
    public void shouldCountFirstNumberRecursively(){
        //given
        Fibonacci fibonacci = new Fibonacci();
        int input = 1;
        int expected = 1;

        //when
        int result = fibonacci.recursiveFibonacci(input);

        //then
        assertThat(result,is(expected));
    }

    @Test
    public void shouldCountEleventhNumber(){
        //given
        Fibonacci fibonacci = new Fibonacci();
        int input = 11;
        int expected = 89;

        //when
        int result = fibonacci.fibonacci(input);

        //then
        assertThat(result,is(expected));
    }

    @Test
    public void shouldCountEleventhNumberRecursively(){
        //given
        Fibonacci fibonacci = new Fibonacci();
        int input = 11;
        int expected = 89;

        //when
        int result = fibonacci.recursiveFibonacci(input);

        //then
        assertThat(result,is(expected));
    }
}
