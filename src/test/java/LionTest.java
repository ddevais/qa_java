import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeSexFemaleFalse() throws Exception {
        MockitoAnnotations.openMocks(this);
        Lion lion = new Lion("Самка", feline);
        boolean mane = lion.doesHaveMane();

        assertFalse(mane);
    }
    @Test
    public void doesHaveManeSexMaleTrue() throws Exception {
        MockitoAnnotations.openMocks(this);
        Lion lion = new Lion("Самец", feline);
        boolean mane = lion.doesHaveMane();

        assertTrue(mane);
    }

    @Test
    public void getKittensReturnTwo() throws Exception {
        MockitoAnnotations.openMocks(this);
        Lion lion = new Lion("Самец", feline);
        Mockito.when(lion.getKittens()).thenReturn(2);
    }
    @Test
    public void getFoodLionReturnListOfPredatorFood() throws Exception {
        MockitoAnnotations.openMocks(this);
        Lion lion = new Lion("Самец", feline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(lion.getFood()).thenReturn(expected);
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }
    @Test(expected = Exception.class)
    public void invalidLionSexReturnException() throws Exception {
        Lion lion = new Lion("df", feline);
    }


}
