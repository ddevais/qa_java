import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class AnimalParameterizedTest {
private final String animalKind;
public AnimalParameterizedTest(String animalKind){
    this.animalKind = animalKind;
}

    @Parameterized.Parameters
    public static Collection<Object[]> getAnimalKind(){
    return Arrays.asList(new Object[][]{
            {"Травядное"},
            {"Хищниик"},
            {"Всеядное"}
    });
}
@Test(expected = Exception.class)
  public void getFoodInvalidAnimalKindReturnException() throws Exception {
    Animal animal = new Animal();
    animal.getFood(animalKind);
   }

}
