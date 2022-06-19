package test;

import java.util.Date;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Appointment;
import main.AppointmentService;

class AppointmentServiceTest {
  static AppointmentService appService;
  @BeforeAll
  static void setUpBeforeClass() throws Exception {}
  @AfterAll
  static void tearDownAfterClass() throws Exception {}
  @BeforeEach
  void setUp() throws Exception {
    appService = new AppointmentService();
  }
  @AfterEach
  void tearDown() throws Exception {
    appService = null;
  }
  @Test
  void test01_add_appointment() {
    Appointment app = new Appointment("App12",/*adding new data to check*/  new Date(2021, 01, 02), "For Ortho Doctor");
    appService.addAppointment("App12", /*adding new data to check*/new Date(2021, 01, 02), "For Ortho Doctor");
    Assert.assertEquals(app.getDescription(), appService.getAppointMentList().get("App12").getDescription());
  }
  @Test
  void test02_delete_appointment() {
    Appointment app = new Appointment("App12",/*adding new data to check*/  new Date(2021, 01, 02), "For Ortho Doctor");
    Appointment app1 = new Appointment("App122",/*adding new data to check*/  new Date(2021, 01, 02), /*with date*/"For Sugeon Doctor");
    appService.addAppointment("App12",/*adding new data to check*/ new Date(2021, 01, 02),  /*with date*/"For Ortho Doctor");
    appService.addAppointment("App122", /*adding new data to check*/new Date(2021, 01, 02), /*with date*/"For Sugeon Doctor");
    Assert.assertEquals(app.getDescription(), appService.getAppointMentList().get("App12").getDescription());
    Assert.assertEquals(app1.getDescription(), appService.getAppointMentList().get("App122").getDescription());
    // delete
    appService.delete("App12");
    Assert.assertEquals(1, appService.getAppointMentList().size());
  }
  @Test
  void test03_add_appointment_whenID_is_already_present() {
    Appointment app = new Appointment("App12",/*adding new data to check*/  new Date(2021, 01, 02), "For Ortho Doctor");
    appService.addAppointment("App12", /*adding new data to check*/new Date(2021, 01, 02), "For Ortho Doctor");
    try {
      appService.addAppointment("App12",/*adding new data to check*/ new Date(2021, 01, 02), "For Ortho Doctor");
    } catch (IllegalAccessError ex) {
      Assert.assertEquals/*true if the message matches*/("Appointment ID:App12 can't be added because it's already present", ex.getMessage());
    }
  }
  @Test
  void test04_delete_appointment_when_AppointmentID_is_not_present() {
    Appointment app = new Appointment("App12",/*adding new data to check*/  new Date(2021, 01, 02), "For Ortho Doctor");
    appService.addAppointment("App12",/*adding new data to check*/ new Date(2021, 01, 02), "For Ortho Doctor");
    try {
      appService.delete("App128");
    } catch (IllegalAccessError ex) {
      Assert.assertEquals("delete is not possible", ex.getMessage());
    }
  }
}
