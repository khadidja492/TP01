package ConditionCoverageTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Anagram;
public class Exo22Test {

    // Test 1 : Vérifier la nullité des chaînes
    @Test
    void testNullString() {
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(null, "chien")); // Condition 1 (s1 == null)
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram("chien", null)); // Condition 2 (s2 == null)
    }

    // Test 2 : Vérifier que les chaînes ont des longueurs différentes
    @Test
    void testDifferentLengths() {
        assertFalse(Anagram.isAnagram("chien", "chiennn")); // Condition 3 (s1.length() != s2.length())
    }

    // Test 3 : Vérifier que les chaînes sont des anagrammes
    @Test
    void testValidAnagram() {
        assertTrue(Anagram.isAnagram("chien", "niche")); // Condition 4 : les lettres correspondent
    }

    // Test 4 : Vérifier que les chaînes ne sont pas des anagrammes
    @Test
    void testNotAnagram() {
        assertFalse(Anagram.isAnagram("chien", "chat")); // Condition 5 : les lettres ne correspondent pas
    }
}

