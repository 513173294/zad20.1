package com.example.demo;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class KalkulatorTest {

    private Kalkulator kalkulator;

    @Before
    public void stworz() {
        kalkulator = new Kalkulator();
    }

    @Test
    public void shouldReturn8For6() {
        //given
        int a = 6;

        //when
        int result = kalkulator.calculator(a);

        //then
        assertThat(result, is(8));
    }

    @Test
    public void shouldReturn23For10() {
        //given
        int a = 10;

        //when
        int result = kalkulator.calculator(a);

        //then
        assertThat(result, is(23));
    }


}