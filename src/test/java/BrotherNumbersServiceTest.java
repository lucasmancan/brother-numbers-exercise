import br.com.lucasmancan.BrotherNumbersService;
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
    public void shouldGetMaxNumberCorrectly(){

        int firstResult = brotherNumbersService.getBiggestBrother(213);
        int secondResult = brotherNumbersService.getBiggestBrother(553);


        assertEquals(firstResult, 321);
        assertEquals(secondResult, 553);

    }

    @Test
    @Ignore
    public void shouldNotGetBiggestBrotherNumberIfBiggerThan100000000(){

        int firstResult = brotherNumbersService.getBiggestBrother(123456789);

        assertEquals(firstResult, -1);
    }

}
