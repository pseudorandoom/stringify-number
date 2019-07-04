package com.flopez;

import static com.flopez.App.stringifyNumber;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldConvertNumber() {
        assertThat(stringifyNumber(0), CoreMatchers.is("Zero"));
        assertThat(stringifyNumber(1), CoreMatchers.is("One"));
        assertThat(stringifyNumber(11), CoreMatchers.is("Eleven"));
        assertThat(stringifyNumber(22), CoreMatchers.is("Twenty two"));
        assertThat(stringifyNumber(34), CoreMatchers.is("Thirty four"));
        assertThat(stringifyNumber(45), CoreMatchers.is("Forty five"));
        assertThat(stringifyNumber(56), CoreMatchers.is("Fifty six"));
        assertThat(stringifyNumber(67), CoreMatchers.is("Sixty seven"));
        assertThat(stringifyNumber(78), CoreMatchers.is("Seventy eight"));
        assertThat(stringifyNumber(89), CoreMatchers.is("Eighty nine"));
        assertThat(stringifyNumber(82), CoreMatchers.is("Eighty two"));
        assertThat(stringifyNumber(90), CoreMatchers.is("Ninety"));
        assertThat(stringifyNumber(97), CoreMatchers.is("Ninety seven"));
        assertThat(stringifyNumber(102), CoreMatchers.is("One hundred and two"));
        assertThat(stringifyNumber(112), CoreMatchers.is("One hundred and twelve"));
        assertThat(stringifyNumber(100), CoreMatchers.is("One hundred"));
        assertThat(stringifyNumber(200), CoreMatchers.is("Two hundred"));
        assertThat(stringifyNumber(206), CoreMatchers.is("Two hundred and six"));
        assertThat(stringifyNumber(1200), CoreMatchers.is("One thousand two hundred"));
        assertThat(stringifyNumber(2000), CoreMatchers.is("Two thousand"));
        assertThat(stringifyNumber(2001), CoreMatchers.is("Two thousand one"));
        assertThat(stringifyNumber(2021), CoreMatchers.is("Two thousand twenty one"));
        assertThat(stringifyNumber(2203), CoreMatchers.is("Two thousand two hundred and three"));
        assertThat(stringifyNumber(2291), CoreMatchers.is("Two thousand two hundred and ninety one"));
        assertThat(stringifyNumber(5237), CoreMatchers.is("Five thousand two hundred and thirty seven"));
        assertThat(stringifyNumber(55_666), CoreMatchers.is("Fifty five thousand six hundred and sixty six"));
        assertThat(stringifyNumber(955_237), CoreMatchers.is("Nine hundred and fifty five thousand two hundred and thirty seven"));
        assertThat(stringifyNumber(1_000_000), CoreMatchers.is("One million"));
        assertThat(stringifyNumber(1_001_030), CoreMatchers.is("One million one thousand thirty"));
        assertThat(stringifyNumber(1_002_020), CoreMatchers.is("One million two thousand twenty"));
        assertThat(stringifyNumber(147_483_613), CoreMatchers.is("One hundred and forty seven million four hundred and eighty three thousand six hundred and thirteen"));
        assertThat(stringifyNumber(Integer.MAX_VALUE), CoreMatchers.is("Two billion one hundred and forty seven million four hundred and eighty three thousand six hundred and forty seven"));
        assertThat(stringifyNumber(Integer.MIN_VALUE), CoreMatchers.is("Minus two billion one hundred and forty seven million four hundred and eighty three thousand six hundred and forty eight"));
        assertThat(stringifyNumber(-1), CoreMatchers.is("Minus one"));
        assertThat(stringifyNumber(-11), CoreMatchers.is("Minus eleven"));
        assertThat(stringifyNumber(-82), CoreMatchers.is("Minus eighty two"));
        assertThat(stringifyNumber(-97), CoreMatchers.is("Minus ninety seven"));
        assertThat(stringifyNumber(-102), CoreMatchers.is("Minus one hundred and two"));
        assertThat(stringifyNumber(-112), CoreMatchers.is("Minus one hundred and twelve"));
        assertThat(stringifyNumber(-100), CoreMatchers.is("Minus one hundred"));
        assertThat(stringifyNumber(-200), CoreMatchers.is("Minus two hundred"));
        assertThat(stringifyNumber(-2000), CoreMatchers.is("Minus two thousand"));
        assertThat(stringifyNumber(-2001), CoreMatchers.is("Minus two thousand one"));
        assertThat(stringifyNumber(-2021), CoreMatchers.is("Minus two thousand twenty one"));
        assertThat(stringifyNumber(-2203), CoreMatchers.is("Minus two thousand two hundred and three"));
        assertThat(stringifyNumber(-2291), CoreMatchers.is("Minus two thousand two hundred and ninety one"));
        assertThat(stringifyNumber(-5237), CoreMatchers.is("Minus five thousand two hundred and thirty seven"));
        assertThat(stringifyNumber(-55_666), CoreMatchers.is("Minus fifty five thousand six hundred and sixty six"));
        assertThat(stringifyNumber(-955_237), CoreMatchers.is("Minus nine hundred and fifty five thousand two hundred and thirty seven"));
        assertThat(stringifyNumber(-147_483_647), CoreMatchers.is("Minus one hundred and forty seven million four hundred and eighty three thousand six hundred and forty seven"));
    }
}
