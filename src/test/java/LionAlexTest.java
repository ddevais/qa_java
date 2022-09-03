import com.example.Feline;
import com.example.LionAlex;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LionAlexTest {
    @Mock
    Feline feline;
    @Test
    public void getKittensReturnZero() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        int expected = 0;
        int actual = lionAlex.getKittens();
        assertEquals(expected, actual);
    }
    @Test
    public void getFriendsReturnAlexFriends() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        List<String> expected = Arrays.asList("Марти", "Глория", "Мелман");
        List<String> actual = lionAlex.getFriends();
        assertEquals(expected, actual);
    }
    @Test
    public void getPlaceOfLivingReturnPlaceOfLivingAlex() throws Exception {
        LionAlex lionAlex = new LionAlex(feline);
        String expected = "Нью-Йоркский зоопарк";
        String actual = lionAlex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }
}
