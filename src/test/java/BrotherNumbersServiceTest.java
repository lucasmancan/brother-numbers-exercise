import br.com.lucasmancan.BrotherNumbersService;
import br.com.lucasmancan.exceptions.InvalidValueException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BrotherNumbersServiceTest {

    private BrotherNumbersService brotherNumbersService;

    @Before
    public void init(){
        brotherNumbersService = new BrotherNumbersService();
    }

    @Test
    public void shouldGetMaxNumberCorrectly() throws InvalidValueException {
        int firstResult = brotherNumbersService.getBiggestBrother(213);
        int secondResult = brotherNumbersService.getBiggestBrother(553);

        assertEquals(321, firstResult);
        assertEquals(553, secondResult);
    }

    @Test
    public void shouldNotGetBiggestBrotherNumberIfBiggerThan9Digits() throws InvalidValueException {
        int result = brotherNumbersService.getBiggestBrother(1231231231);
        assertEquals( -1, result);
    }

    @Test(expected = InvalidValueException.class)
    public void shouldNotWorkWithNegativeNumber() throws InvalidValueException {
       brotherNumbersService.getBiggestBrother(-5);
    }

    @Test
    public void shouldGetMaxNumberCorrectlyUsingStreamApi() throws InvalidValueException {
        int firstResult = brotherNumbersService.getBiggestBrotherUsingStreamApi(213);
        int secondResult = brotherNumbersService.getBiggestBrotherUsingStreamApi(553);

        assertEquals(321, firstResult);
        assertEquals(553, secondResult);
    }

    @Test
    public void shouldNotGetBiggestBrotherNumberIfBiggerThan9DigitsUsingStreamApi() throws InvalidValueException {
        int result = brotherNumbersService.getBiggestBrotherUsingStreamApi(1231231231);
        assertEquals( -1, result);
    }

    @Test(expected = InvalidValueException.class)
    public void shouldNotWorkWithNegativeNumberUsingStreamApi() throws InvalidValueException {
        brotherNumbersService.getBiggestBrotherUsingStreamApi(-5);
    }

}
