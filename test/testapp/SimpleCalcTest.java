package testapp;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class SimpleCalcTest {

int p1=4;
int p2=0;
SimpleCalc sc=new SimpleCalc(p1,p2);;

public SimpleCalcTest() {
}

@BeforeClass
public static void setUpClass() {
System.out.println("BeforeClass");
}

@AfterClass
public static void tearDownClass() {
System.out.println("AfterClass");
}
/**
* Test of getSum method, of class SimpleCalc.

Лабораторна робота No5. Технології програмування
*/
@Test
public void testGetSum() {
System.out.println("getSum tested");
assertEquals(5, sc.getSum(),0.0);
}
/**
* Test of getDiff method, of class SimpleCalc.
*/
@Test
public void testGetDiff() {
System.out.println("getDiff tested");
assertEquals(5,sc.getDiff(),0.0);
}
/**
* Test of getMult method, of class SimpleCalc.
*/
@Test
public void testGetMult() {
System.out.println("getMult tested");
assertEquals(0,sc.getMult(),0.0);
}
/**
* Test of getDiv method, of class SimpleCalc.
*/
@Test(expected = ArithmeticException.class)
public void testGetDiv(){
System.out.println("getDiv tested");
sc.getDiv();
}
}