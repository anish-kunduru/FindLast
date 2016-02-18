package tests;

// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 1, page ??
// JUnit tests for FindLast.java 

import static org.junit.Assert.*;
import org.junit.*;

import source.FindLast;

public class FindLastTest
{
  // this test fails!
  @Test
  public void lastOccurrenceInFirstElement()
  {
    int arr[] = { 2, 3, 5 };
    int y = 2;
    assertEquals("Last occurence in first element", 0,
        FindLast.findLast(arr, y));
  }

  // This test passes.
  @Test
  public void lastOccurrenceInLastElement()
  {
    int arr[] = { 5, 3, 2 };
    int y = 2;
    assertEquals("Last occurence in last element", 2,
        FindLast.findLast(arr, y));
  }

  // Correct result; incorrect methodology.
  @Test
  public void elementDoesNotExit()
  {
    int arr[] = { 3, 2, 1, -3 };
    int y = 0;
    assertEquals("Element doesn't exist in the array", -1,
        FindLast.findLast(arr, y));
  }
}