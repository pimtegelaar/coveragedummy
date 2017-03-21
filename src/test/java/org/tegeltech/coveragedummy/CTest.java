package org.tegeltech.coveragedummy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CTest {

    private C c;

    @Before
    public void setUp() throws Exception {
        c = new C();
    }

    @Test
    public void isItTrue() throws Exception {
        boolean result = c.isItTrue();

        assertThat(result, is(false));
    }

}