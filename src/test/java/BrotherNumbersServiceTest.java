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

        assertEquals(firstResult, 321);
        assertEquals(secondResult, 553);
    }

    @Test
    public void shouldNotGetBiggestBrotherNumberIfBiggerThan9Digits() throws InvalidValueException {
        int firstResult = brotherNumbersService.getBiggestBrother(1231231231);
        assertEquals(firstResult, -1);
    }

    @Test(expected = InvalidValueException.class)
    public void shouldNotWorkWithNegativeNumber() throws InvalidValueException {
       brotherNumbersService.getBiggestBrother(-5);
    }

}
