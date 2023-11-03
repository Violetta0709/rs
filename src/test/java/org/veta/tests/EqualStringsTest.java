package org.veta.tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.veta.methods.EqualStrings.findSameStrings;

public class EqualStringsTest {
    @Owner("V.Yuzykhovich")
    @DisplayName("Finding equal strings")
    @Test
    public void testFindEqualStrings() {
        String[] array = new String[]{"klo", "nmo", "molk", "lok", "A", "AA", "b", "dfe", "b"};
        String expectedResult = "b = 6, 8 klo = 0, 3";
        String actualResult = findSameStrings(array);
        assert actualResult != null;
        Assertions.assertEquals(expectedResult.length(), actualResult.length());
        char[] expected = expectedResult.toCharArray();
        char[] actual = actualResult.toCharArray();
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], actual[i], "mismatch at " + i);
        }
    }
}
