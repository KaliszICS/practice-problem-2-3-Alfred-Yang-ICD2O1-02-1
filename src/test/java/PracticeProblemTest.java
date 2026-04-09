import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class PracticeProblemTest {

   @Test
   void testExample() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }
   @Test
   void test1(){
      assertEquals(Math.PI * 16, PracticeProblem.circleArea(4));
   }
   @Test
   void test2(){
   assertEquals(Math.PI * 36, PracticeProblem.circleArea(-6));
   }
   @Test
   void test3(){
   assertEquals(Math.PI * 0, PracticeProblem.circleArea(0));
   }
   @Test
   void test4(){
   assertEquals(Math.PI * 1575025, PracticeProblem.circleArea(1255));
   }
   @Test
   void test5(){
   assertEquals(Math.PI * 6.25, PracticeProblem.circleArea(2.5));
   }
   @Test
   void timeTest1(){
      assertEquals("3 hours and 0 minutes", PracticeProblem.minutesToHours(180));
   }
   @Test
   void timeTest2(){
      assertEquals("2 hours and 40 minutes", PracticeProblem.minutesToHours(160));
   }
   @Test
   void timeTest3(){
      assertEquals("0 hours and 0 minutes", PracticeProblem.minutesToHours(0));
   }
   @Test
   void timeTest4(){
      assertEquals("-3 hours and -20 minutes", PracticeProblem.minutesToHours(-200));
   }
   @Test
   void timeTest5(){
      assertEquals("166666 hours and 40 minutes", PracticeProblem.minutesToHours(10000000));
   }
   @Test
   void intrestTest1(){
      assertEquals(5 * (24/100.0) * 67, PracticeProblem.simpleInterest(5,24,67));
   }
   @Test
   void intrestTest2(){
      assertEquals(5654 * (55/100.0) * 6938917, PracticeProblem.simpleInterest(5654, 55, 6938917));
   }
   @Test
   void intrestTest3(){
      assertEquals(0 * (1/100.0) * 0, PracticeProblem.simpleInterest(0, 1, 0));
   }
   @Test
   void intrestTest4(){
      assertEquals(-15 * (-3/100.0) * 45, PracticeProblem.simpleInterest(-15, -3, 45));
   }
   @Test
   void intrestTest5(){
      assertEquals(-15.7 * (5.5/100.0) * -5, PracticeProblem.simpleInterest(-15.7, 5.5, -5));
   }
   @Test
   void hypeTest1(){
      assertEquals(0, PracticeProblem.hypotenuse(0, 0));
   }
   @Test
   void hypeTest2(){
      assertEquals(Math.sqrt(6.7*6.7 + 32*32), PracticeProblem.hypotenuse(6.7, 32));
   }
   @Test
   void hypeTest3(){
      assertEquals(0, PracticeProblem.hypotenuse(0, 0));
   }
   @Test
   void hypeTest4(){
      assertEquals(Math.sqrt(2), PracticeProblem.hypotenuse(1, 1));
   }
   @Test
   void hypeTest5(){
      assertEquals(Math.sqrt(1234*1234+9876*9876), PracticeProblem.hypotenuse(9876, 1234));
   }
   }





