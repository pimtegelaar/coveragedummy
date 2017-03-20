package org.tegeltech.coveragedummy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ATest {

    private A a;

    @Before
    public void setUp() throws Exception {
        a = new A();
    }

    @Test
    public void sayHello() throws Exception {
        String result = a.sayHello("John");
        assertThat(result, is("Hello John"));
    }

}