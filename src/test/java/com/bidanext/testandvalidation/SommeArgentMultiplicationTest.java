package com.bidanext.testandvalidation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SommeArgentMultiplicationTest {

    @ParameterizedTest
    @CsvSource({
      "10, EUR, 2, 20",
      "5, USD, 3, 15",
      "0, EUR, 10, 0"
    })
    void testMultiplier(int montant, String devise, int facteur, int resultatAttendu) {
      SommeArgent somme = new SommeArgent(montant, devise);
      SommeArgent resultat = somme.multiplier(facteur);
      assertEquals(new SommeArgent(resultatAttendu, devise), resultat);
    }
}