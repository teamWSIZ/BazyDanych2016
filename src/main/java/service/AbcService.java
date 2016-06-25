package service;

/**
 * Serwis do testowania testów (testy jednostkowe w /src/test/java; Ctrl+Shift+T)
 */
public class AbcService {
    int dodaj(int a, int b) {
        //obsługa overflow
        long wynik = (long)a + (long)b;
        if (wynik > Integer.MAX_VALUE || wynik < Integer.MIN_VALUE) {
            throw new RuntimeException("Overflow in addition occurred");
        }
        return a+b;
    }
}
