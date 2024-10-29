import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MacronutrientTest {

    @Test
    void getCarbsFactory() {
        Macronutrient macronutrient = new Macronutrient();
        Macronutrient.CarbsFactory carbsFactory = macronutrient.getCarbsFactory("NoRestrictions");
        assertNotNull(carbsFactory);
    }

    @Test
    void getProteinFactory() {
        Macronutrient macronutrient = new Macronutrient();
        Macronutrient.ProteinFactory proteinFactory = macronutrient.getProteinFactory("NoRestrictions");
        assertNotNull(proteinFactory);
    }

    @Test
    void getFatsFactory() {
        Macronutrient macronutrient = new Macronutrient();
        Macronutrient.FatsFactory fatsFactory = macronutrient.getFatsFactory("NoRestrictions");
        assertNotNull(fatsFactory);
    }
}