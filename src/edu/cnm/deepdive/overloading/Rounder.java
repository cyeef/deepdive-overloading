/**
 * 
 */
package edu.cnm.deepdive.overloading;

/**
 * @author cyeef
 *
 */
public class Rounder {
  /**
   * Round a double to a long
   * 
   * @param a number to round
   * @return rounded number
   */
  public static long round(double a) {
    return Math.round(a);
  }

  public static int round(float a) {
    return (int) round((double) a);
  }

  /**
   * Round a number to the nearest multiple of a factor
   * 
   * @param a the number
   * @param factor
   * @return the nearest multiple
   */
  public static double round(double a, double factor) {
    double result = a + Math.abs(factor) / 2.0;
    result -= result % factor;
    return result;
  }

  /**
   * Round a number to the nearest multiple of a factor
   * 
   * @param a the number
   * @param factor
   * @return the nearest multiple
   */
  public static float round(float a, float factor) {
    // return ((a + multiple/2) /multiple) * multiple;
    float result = a + Math.abs(factor) / 2.0f;
    result -= result % factor;
    return result;
  }

  /**
   * Round a number to the nearest multiple of a factor
   * 
   * @param a the number
   * @param factor
   * @return the nearest multiple
   */
  public static int round(int a, int factor) {
    // return ((a + multiple/2) /multiple) * multiple;
    double result = a + Math.abs(factor) / 2.0;
    result -= result % factor;
    return (int) result;
  }

  /**
   * Round a number to the nearest multiple of a factor
   * 
   * @param a the number
   * @param factor
   * @return the nearest multiple
   */
  public static long round(long a, long factor) {
    // return ((a + multiple/2) /multiple) * multiple;
    double result = a + Math.abs(factor) / 2;
    result -= result % factor;
    return (long) result;
  }

  /**
   * @param args
   */
  // TODO Auto-generated method stub

  public static void main(String[] args) {
    System.out.println(round(Math.PI));
    System.out.println(round(Math.PI, 0.0001));
    System.out.println(round(Math.PI, -0.0001));
    System.out.println(round((float) Math.PI, -0.0001f));
    System.out.println(round(17, 5));
    System.out.println(round(Math.E, 0.5));


  }

}


