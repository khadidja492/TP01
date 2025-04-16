package LineCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Anagram;
public class Exo222Test {

    // Test 1 : Vérifier la nullité des chaînes (ligne 4 et 5)
    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "chien"));
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("chien", null));
    }

    // Test 2 : Vérifier la longueur des chaînes (ligne 6 à 8)
    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("chien", "chiennn"));
    }

    // Test 3 : Vérifier que les chaînes sont des anagrammes (ligne 11 à 18)
    @Test
    void testValidAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche"));
    }

    // Test 4 : Vérifier que les chaînes ne sont pas des anagrammes (ligne 18 à 20)
    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("chien", "chat"));
    }
}
