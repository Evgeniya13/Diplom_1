import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class IngredientTest {

    private final IngredientType ingredientType;
    private final String name;
    private final float price;
    private Ingredient ingredient;
    public IngredientTest(IngredientType ingredientType, String name, float price) {
        this.ingredientType = ingredientType;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { IngredientType.SAUCE, "Кетчуп", 0.5f },
                { IngredientType.FILLING, "Мясо", 2.5f },
        });
    }

    @Before
    public void setUp() {
        ingredient = new Ingredient(ingredientType, name, price);
    }

    @Test
    public void testGetType() {
        assertEquals(ingredientType, ingredient.getType());
    }

    @Test
    public void testGetName() {
        assertEquals(name, ingredient.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(price, ingredient.getPrice(), 0.0f);
    }
}
