import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;



public class FelineTest {


    @Test
    public void getKittensReturnOne(){

        Feline feline = new Feline();
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
    @Test
    public void getFamilyReturnFelineFamily(){
        Feline feline = new Feline();
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void eatMeatReturnPredatorFood() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String>  actual = feline.eatMeat();
        assertEquals(expected, actual);
    }


}
