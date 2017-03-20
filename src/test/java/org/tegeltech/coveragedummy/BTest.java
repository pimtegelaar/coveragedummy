package org.tegeltech.coveragedummy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class BTest {

    private B b;

    @Before
    public void setUp() throws Exception {
        b = new B();
    }

    @Test
    public void isItTrue() throws Exception {
        boolean result = b.isItTrue();

        assertThat(result, is(true));
    }

}