package edu.ucsb.cs56.pconrad.rational;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;
import org.junit.Before;

public class RationalTest {

    private Rational r_5_15;
    private Rational r_24_6;
    private Rational r_3_7;  
    private Rational r_13_4;
    private Rational r_20_25;
    private Rational r_25_20;
    private Rational r_0_1; 
    
    @Before public void setUp() {
	r_5_15 = new Rational(5,15);
	r_24_6 = new Rational(24,6);
	r_3_7  = new Rational(3,7);
	r_13_4 = new Rational(13,4);
	r_20_25 = new Rational(20,25);
	r_0_1 = new Rational(0,1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_denom_zero() {
	Rational r = new Rational(1,0);
    }
    
    @Test
    public void test_getNumerator_20_25() {
	assertEquals(4, r_20_25.getNumerator());
    }
    
    @Test
    public void test_getNumerator_13_4() {
	assertEquals(13, r_13_4.getNumerator());
    }
    
    @Test
    public void test_getDenominator_20_25() {
	assertEquals(5, r_20_25.getDenominator());
    }
    
    @Test
    public void test_getDenominator_13_4() {
	assertEquals(4, r_13_4.getDenominator());
    }

    @Test
    public void test_toString_5_15() {
	assertEquals("1/3",r_5_15.toString());
    }

    @Test
    public void test_toString_24_6() {
	assertEquals("4",r_24_6.toString());
    }

    @Test
    public void test_toString_3_7() {
	assertEquals("3/7",r_3_7.toString());
    }
    
    @Test
    public void test_toString_20_25() {
	assertEquals("4/5",r_20_25.toString());
    }

    @Test
    public void test_toString_0_1() {
	assertEquals("0",r_0_1.toString());
    }

    @Test
    public void test_gcd_5_15() {
		assertEquals(5, Rational.gcd(5,15));
    }

    @Test
    public void test_gcd_15_5() {
		assertEquals(5, Rational.gcd(15,5));
    }

    @Test
    public void test_gcd_24_6() {
		assertEquals(6, Rational.gcd(24,6));
    }

    @Test
    public void test_gcd_17_5() {
		assertEquals(1, Rational.gcd(17,5));
    }
    
    @Test
    public void test_gcd_1_1() {
		assertEquals(1, Rational.gcd(1,1));
    }

    @Test
    public void test_gcd_20_25() {
		assertEquals(5, Rational.gcd(20,25));
    }

    @Test
    public void test_gcd_1_0() {
		assertEquals(1, Rational.gcd(1,0));
    }

	
    @Test
    public void test_rational_m10_m5() {
		Rational r = new Rational(-10,-5);
	assertEquals("2",r.toString());
    }

    @Test
    public void test_rational_m5_6() {
		Rational r = new Rational(-5,6);
	assertEquals("-5/6",r.toString());
    }

    @Test
    public void test_rational_7_m8() {
	Rational r = new Rational(7,-8);
	assertEquals("-7/8",r.toString());
    }

    @Test
    public void test_r_5_15_times_r_3_7() {
	Rational r = r_5_15.times(r_3_7);
	assertEquals("1/7",r.toString());
    }

    @Test
    public void test_r_3_7_times_r_13_4() {
	Rational r = r_3_7.times(r_13_4);
	assertEquals("39/28",r.toString());
    }

    @Test
    public void test_r_m3_1_times_1_m3() {
	Rational r_m3_1 = new Rational(-3,1);
	Rational r_1_m3 = new Rational(1,-3);
	Rational r = r_m3_1.times(r_1_m3);
	assertEquals("1",r.toString());
    }

   @Test
    public void test_product_of_r_5_15_and_r_3_7() {
       Rational r = Rational.product(r_5_15,r_3_7);
       assertEquals("1/7",r.toString());
    }

    @Test
    public void test_product_of_r_3_7_and_r_13_4() {
	Rational r = Rational.product(r_3_7,r_13_4);
	assertEquals("39/28",r.toString());
    }

    @Test
    public void test_product_of_r_m3_1_and_1_m3() {
	Rational r_m3_1 = new Rational(-3,1);
	Rational r_1_m3 = new Rational(1,-3);
	Rational r = Rational.product(r_m3_1,r_1_m3);
	assertEquals("1",r.toString());
    }
 
    @Test
    public void test_a_equals_a() {
		Rational a = new Rational(2,3);
		assertTrue(a.equals(a));
    }

	
    @Test
    public void test_equals_1() {
	Rational a = new Rational(2,3);
	Rational b = new Rational(2,3);
	assertTrue(a.equals(b));
    }
 
    @Test
    public void test_equals_2() {
	Rational a = new Rational(2,3);
	Rational b = new Rational(-2,-3);
	assertTrue(a.equals(b));
    }


    @Test
    public void test_equals_3() {
	Rational a = new Rational(1,3);
	Rational b = new Rational(3,9);
	assertTrue(a.equals(b));
    }


    @Test
    public void test_equals_4() {
	Rational a = new Rational(-1,3);
	Rational b = new Rational(1,-3);
	assertTrue(a.equals(b));
    }

    @Test
    public void test_equals_5() {
	Rational a = new Rational(2,3);
	Rational b = new Rational(4,5);
	assertFalse(a.equals(b));
    }

    
    @Test
    public void test_hashCode_1() {
	Rational a = new Rational(2,3);
	Rational b = new Rational(2,3);
	assertTrue(a.hashCode()==b.hashCode());
    }
 
    @Test
    public void test_hashCode_2() {
	Rational a = new Rational(2,3);
	Rational b = new Rational(-2,-3);
	assertTrue(a.hashCode()==b.hashCode());
    }


    @Test
    public void test_hashCode_3() {
	Rational a = new Rational(1,3);
	Rational b = new Rational(3,9);
	assertTrue(a.hashCode()==b.hashCode());
    }


    @Test
    public void test_hashCode_4() {
	Rational a = new Rational(-1,3);
	Rational b = new Rational(1,-3);
	assertTrue(a.hashCode()==b.hashCode());
    }

    @Test
    public void test_lt_1() {
	Rational a = new Rational(1,3);
	Rational b = new Rational(1,3);
	assertFalse(a.lt(b));
	assertFalse(b.lt(a));
    }

    @Test
    public void test_lt_2() {
	Rational a = new Rational(1,3);
	Rational b = new Rational(2,3);
	assertTrue(a.lt(b));
	assertFalse(b.lt(a));
    }

    @Test
    public void test_lt_3() {
	Rational a = new Rational(1,4);
	Rational b = new Rational(1,3);
	assertTrue(a.lt(b));
	assertFalse(b.lt(a));
    }

    @Test
    public void test_lt_4() {
	Rational a = new Rational(-1,1);
	Rational b = new Rational(0,1);
	assertTrue(a.lt(b));
	assertFalse(b.lt(a));
    }

    @Test
    public void test_lt_5() {
	Rational a = new Rational(-2,1);
	Rational b = new Rational(-1,1);
	assertTrue(a.lt(b));
	assertFalse(b.lt(a));
    }

    @Test
    public void test_lt_6() {
	Rational a = new Rational(-1,3);
	Rational b = new Rational(-1,4);
	assertTrue(a.lt(b));
	assertFalse(b.lt(a));
    }

    @Test
    public void test_lcm_21_6() {
	assertEquals(42,Rational.lcm(21,6));
    }
    
    @Test
    public void test_lcm_4_6() {
	assertEquals(12,Rational.lcm(4,6));
    }
    
    @Test
    public void test_lcm_5_7() {
	assertEquals(35,Rational.lcm(5,7));
    }
    
    @Test
    public void test_le_1() {
	Rational a = new Rational(1,3);
	Rational b = new Rational(1,3);
	assertTrue(a.le(b));
	assertTrue(b.le(a));
    }

    @Test
    public void test_le_2() {
	Rational a = new Rational(1,3);
	Rational b = new Rational(2,3);
	assertTrue(a.le(b));
	assertFalse(b.le(a));
    }

    @Test
    public void test_le_3() {
	Rational a = new Rational(1,4);
	Rational b = new Rational(1,3);
	assertTrue(a.le(b));
	assertFalse(b.le(a));
    }

    @Test
    public void test_le_4() {
	Rational a = new Rational(-1,1);
	Rational b = new Rational(0,1);
	assertTrue(a.le(b));
	assertFalse(b.le(a));
    }

    @Test
    public void test_le_5() {
	Rational a = new Rational(-2,1);
	Rational b = new Rational(-1,1);
	assertTrue(a.le(b));
	assertFalse(b.le(a));
    }

    @Test
    public void test_le_6() {
	Rational a = new Rational(-1,3);
	Rational b = new Rational(-1,4);
	assertTrue(a.le(b));
	assertFalse(b.le(a));
    }

    @Test
    public void test_Rational_default_constructor() {
	Rational expected = new Rational();
	Rational actual = new Rational(1,1);
	assertEquals(expected,actual);
    }
	
    @Test
    public void test_Rational_String_constructor_1() {
	Rational expected = new Rational(2,3);
	Rational actual = new Rational("2/3");
	assertEquals(expected,actual);
    }
    
    @Test
    public void test_Rational_String_constructor_2() {
	Rational expected = new Rational(-22,3);
	Rational actual = new Rational("-22/3");
	assertEquals(expected,actual);
    }

    @Test
    public void test_Rational_String_constructor_3() {
	Rational expected = new Rational(-152,263);
	Rational actual = new Rational(" 456 / -789 ");
	assertEquals(expected,actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Rational_String_constructor_bad0() {
	Rational actual = new Rational("1/0");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Rational_String_constructor_bad1() {
	Rational actual = new Rational("1/3x");
    }

	
    @Test(expected = IllegalArgumentException.class)
    public void test_Rational_String_constructor_bad2() {
	Rational actual = new Rational("1/3/5");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Rational_String_constructor_bad3() {
	Rational actual = new Rational("13");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_Rational_String_constructor_bad4() {
	Rational actual = new Rational("x/3");
    }

	@Test
	public void test_markdownTable_3_4() {
		String newline = System.lineSeparator();
		String expected =
			"| |1|2|3|4|" + newline +
			"|-|-|-|-|-|" + newline +
			"|1|1|2|3|4|" + newline +
			"|2|1/2|1|3/2|2|" + newline +
			"|3|1/3|2/3|1|4/3|" + newline;
		assertEquals(expected,Rational.markdownTable(3,4));		
    }

	@Test
	public void test_markdownTable_3_4_latexFormatter() {
		String newline = System.lineSeparator();
		String expected =
			"| |1|2|3|4|" + newline +
			"|-|-|-|-|-|" + newline +
			"|1|1|2|3|4|" + newline +
			"|2|$$\\frac{1}{2}$$|1|$$\\frac{3}{2}$$|2|" + newline +
			"|3|$$\\frac{1}{3}$$|$$\\frac{2}{3}$$|1|$$\\frac{4}{3}$$|" + newline;
		String actual = Rational.markdownTable(3,4, Rational.latexFormatter);
		assertEquals(expected,actual);		
    }

	
}
