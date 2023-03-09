package praktikum;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    private final String ingredientName = "black bun";
    private final float ingredientPrice = 100F;


    Ingredient ingredient;
    @Mock
    IngredientType ingredientType;

    @Before
    public void setUp() throws Exception {
        ingredient = new Ingredient(ingredientType, ingredientName, ingredientPrice);
    }

    @Test
    public void ingredientGetNameExpectedReturnNameTest() {
        assertEquals(ingredientName, ingredient.getName());
    }

    @Test
    public void ingredientGetPriceExpectedReturnPriceTest() {
        assertEquals(ingredientPrice, ingredient.getPrice(), 0);
    }

    @Test
    public void ingredientGetIngredientTypeExpectedReturnIngredientTypeTest() {
        assertEquals(ingredient.getType(), ingredientType);
    }


}