package test;

import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Appointment;

class AppointmentTest {

  static Appointment app;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {

  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {}

  @BeforeEach
  void setUp() throws Exception {}

  @AfterEach
  void tearDown() throws Exception {
    app = null;
  }

  @Test
  void test01_checkDescription() {
    app = new Appointment("App12", /*adding new data to check*/new Date(2021, 01, 02), /*with date*/ "For Ortho Doctor");
    Assert.assertEquals/*true if the desc matches*/("For Ortho Doctor", app.getDescription());
  }

  @Test
  void test02_checkDescription_lenmorethan50() {
    try {
      app = new Appointment("App12", new Date(2021, 01, 02), /*with date*/ "For Ortho Doctor,For Ortho Doctor,For Ortho Doctor,For Ortho Doctor,For Ortho Doctor,For Ortho Doctor");
    } catch (IllegalArgumentException ex) {
      Assert.assertEquals/*true if the message matches*/("The description  cannot be longer than 50 characters..", ex.getMessage());
    }
  }

  @Test
  void test03_checkDescription_null() {
    try {
      app = new Appointment("App12", /*adding new data to check*/new Date(2021, /*with date*/ 01, 02), null);
    } catch (IllegalArgumentException ex) {
      Assert.assertEquals/*true if the message matches*/("The description field shall not be null.", ex.getMessage());
    }
  }

  @Test
  void test04_checkAppDate() {
    app = new Appointment("App12", /*adding new data to check*/new Date(2021, 01, 02), /*with date*/"For Ortho Doctor");
    Assert.assertEquals(new Date(2021, 01, 02), app.getAppointmentDate());
  }

  @Test
  void test05_checkAppDate_whenDate_Null() {
    try {
      app = new Appointment("App12", null,
        "For Ortho Doctor");
    } catch (IllegalArgumentException ex) {
      Assert.assertEquals/*true if the message matches*/("The appointment Date field shall not be null.", ex.getMessage());
    }
  }
}
