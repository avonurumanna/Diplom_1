package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    @Mock
    public Bun bun;
    @Mock
    public Ingredient firstIngredient;
    @Mock
    public Ingredient secondIngredient;
    @Spy
    Burger burger = new Burger();


    @Test
    public void burgerAddIngredientExpectedIngredientAdded() {
        burger.addIngredient(firstIngredient);
        assertEquals(1, burger.ingredients.size());
    }

    @Test
    public void burgerRemoveIngredientExpectedIngredientRemoved() {
        burger.addIngredient(firstIngredient);
        burger.removeIngredient(0);
        assertEquals(0, burger.ingredients.size());
    }

    @Test
    public void burgerMoveIngredientExpectedIngredientMoved() {
        burger.addIngredient(firstIngredient);
        burger.addIngredient(secondIngredient);
        burger.moveIngredient(0, 1);
        assertTrue(burger.ingredients.get(0).equals(secondIngredient) && burger.ingredients.get(1).equals(firstIngredient));
    }

    @Test
    public void burgerGetPriceExpectedReturnPrice() {
        burger.setBuns(bun);
        burger.addIngredient(firstIngredient);
        burger.addIngredient(secondIngredient);
        Mockito.when(bun.getPrice()).thenReturn(100F);
        Mockito.when(firstIngredient.getPrice()).thenReturn(200F);
        Mockito.when(secondIngredient.getPrice()).thenReturn(300F);
        assertEquals(700F, burger.getPrice(), 0.0);
    }

    @Test
    public void burgerGetReceiptExpectedReturnReceipt() {
        burger.setBuns(bun);
        burger.addIngredient(firstIngredient);
        burger.addIngredient(secondIngredient);
        Mockito.when(bun.getName()).thenReturn("black bun");
        Mockito.when(firstIngredient.getName()).thenReturn("sour cream");
        Mockito.when(secondIngredient.getName()).thenReturn("sausage");
        Mockito.when(firstIngredient.getType()).thenReturn(IngredientType.SAUCE);
        Mockito.when(secondIngredient.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(burger.getPrice()).thenReturn(700F);
        assertEquals(("(==== black bun ====)\r\n= sauce sour cream =\r\n= filling sausage =\r\n(==== black bun ====)\r\n\r\nPrice: 700,000000\r\n"), burger.getReceipt());
    }
}





