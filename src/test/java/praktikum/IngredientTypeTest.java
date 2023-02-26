package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {
    private final String ingredientType;

    public IngredientTypeTest(String ingredientType) {
        this.ingredientType = ingredientType;
    }

    @Parameterized.Parameters(name = "Type of ingredient {0}")
    public static Object[] getIngredientTypeData() {
        return new Object[][]{
                {"SAUCE"},
                {"FILLING"}
        };
    }

    @Test
    public void ingredientTypeValueOfExpectedReturnValueTest() {
        assertEquals(IngredientType.valueOf(ingredientType).toString(), ingredientType);
    }


}
