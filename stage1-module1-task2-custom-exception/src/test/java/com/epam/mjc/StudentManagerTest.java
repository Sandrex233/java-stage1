package com.epam.mjc;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.junit.Test;


public class StudentManagerTest {
  StudentManager manager = new StudentManager();

  @Test(expected = IllegalArgumentException.class)
  public void findNotValid() throws IllegalArgumentException {
    manager.find(1000);
  }

  @Test
  public void findValidStudent() {
    try {
      assertNotNull(manager.find(1));
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testExceptionMessage() {
    try {
      assertNotNull(manager.find(1000));
    } catch (IllegalArgumentException e) {
      assertEquals("Could not find student with ID 1000", e.getMessage());
    }
  }

  @Test
  public void testIDsNotChangedV1() {
    try {
      assertNull("Student enum should be have only 10 values.", manager.find(11));
    } catch (IllegalArgumentException e) {
      e.printStackTrace();
    }
  }

  @Test
  public void testIDsNotChangedV2() {
    assertEquals(Student.ARTUR, manager.find(Arrays.stream(Student.values()).map(Student::getId).max(Long::compare).get()));

  }

}