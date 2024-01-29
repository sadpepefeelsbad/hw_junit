package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ScrambliesTest {

    @Test
    public void testScramble_validArgument_success() {
        // given:
        final String original = "rkqodlw";
        final String target = "world";

        // when:
        final boolean result = Scramblies.scramble(original, target);

        // then:
        Assertions.assertTrue(result);
    }

    @Test
    public void testScramble_validArgument_failure() {
        // given:
        final String original = "failure";
        final String target = "success";

        // when:
        final boolean result = Scramblies.scramble(original, target);

        // then:
        Assertions.assertFalse(result);
    }

    @Test
    public void testScramble_emptyString_originalString() {
        // given:
        final String original = "";
        final String target = "netology";

        // when:
        final boolean result = Scramblies.scramble(original, target);

        // then:
        Assertions.assertFalse(result);
    }

    @Test
    public void testScramble_emptyString_targetString() {
        // given:
        final String original = "ksvsd";
        final String target = "";

        // when:
        final boolean result = Scramblies.scramble(original, target);

        // then:
        Assertions.assertTrue(result);
    }
}