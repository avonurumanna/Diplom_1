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
    public void ingredientGetNameExpectedReturnName() {
        assertEquals(ingredientName, ingredient.getName());
    }

    @Test
    public void ingredientGetPriceExpectedReturnPrice() {
        assertEquals(ingredientPrice, ingredient.getPrice(), 0);
    }

    @Test
    public void ingredientGetIngredientTypeExpectedReturnIngredientType() {
        assertEquals(ingredient.getType(), ingredientType);
    }


}