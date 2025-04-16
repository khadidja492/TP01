package BranchCoverageTest;
// TP1/LineCoverageTest/Exo2Test.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Anagram;


public class Exo2Test {

    // Test 1 : Vérifier la nullité des chaînes
    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "chien")); // Branche 1 : NullPointerException
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("chien", null)); // Branche 2 : NullPointerException
    }

    // Test 2 : Vérifier que les chaînes ont des longueurs différentes
    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("chien", "chiennn")); // Branche 3 : Longueur différente
    }

    // Test 3 : Vérifier que les chaînes sont des anagrammes
    @Test
    void testValidAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche")); // Branche 4 : Anagramme valide
    }

    // Test 4 : Vérifier que les chaînes ne sont pas des anagrammes
    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("chien", "chat")); // Branche 5 : Non-anagramme
    }
}
