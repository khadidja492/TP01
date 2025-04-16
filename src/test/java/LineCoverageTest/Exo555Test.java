package LineCoverageTest;



import org.example.RomanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo555Test {

    @Test
    public void testToRoman() {
        // Test avec plusieurs symboles
        assertEquals("III", RomanNumeral.toRoman(3));   // III
        assertEquals("IV", RomanNumeral.toRoman(4));    // IV
        assertEquals("IX", RomanNumeral.toRoman(9));    // IX
        assertEquals("LVIII", RomanNumeral.toRoman(58));  // LVIII
        assertEquals("XC", RomanNumeral.toRoman(90));   // XC
        assertEquals("CXXIII", RomanNumeral.toRoman(123)); // CXXIII
        assertEquals("CDXLIV", RomanNumeral.toRoman(444)); // CDXLIV
        assertEquals("DCCCXLV", RomanNumeral.toRoman(845)); // DCCCXLV
        assertEquals("MMMCMXCIX", RomanNumeral.toRoman(3999)); // MMMCMXCIX
    }

    @Test
    public void testInvalidRange() {
        // Test des valeurs invalides
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(0);  // Moins que 1
        });
        assertThrows(IllegalArgumentException.class, () -> {
            RomanNumeral.toRoman(4000); // Plus que 3999
        });
    }
}
