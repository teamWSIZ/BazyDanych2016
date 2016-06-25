package service;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

/**
 * Created on 25.06.16, at 09:37
 */
public class AbcServiceTest {
    AbcService testee;  //klasa którą będziemy testowali

    @Before
    public void setUp() throws Exception {
        testee = new AbcService();
    }

    @Test
    public void testSimpleAddition() throws Exception {
        assertThat(testee.dodaj(1,5)).isEqualTo(6);
        assertThat(testee.dodaj(1,-1)).isEqualTo(0);
        assertThat(testee.dodaj(1,1000000)).isEqualTo(1000001);
    }

    @Test
    public void testOverflow() throws Exception {
        try {
            testee.dodaj(2000000000,2000000000);
            fail("Miał wyrzucić wyjątek: overflow");
        } catch (RuntimeException e) {
            //ok
        }

    }

}