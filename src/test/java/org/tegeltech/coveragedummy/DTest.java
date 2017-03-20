package org.tegeltech.coveragedummy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DTest {

    private D d;

    @Before
    public void setUp() throws Exception {
        d = new D();
    }

    @Test
    public void isItTrue() throws Exception {
        boolean result = d.isItTrue();

        assertThat(result, is(false));
    }

}