package main;

import java.util.Date;
import java.util.HashMap;

public class AppointmentService {
  private HashMap < String, Appointment > appointMentList = null;

  public AppointmentService() {
    setAppointMentList(new HashMap < String, Appointment > ());
  }

  public void addAppointment(String appointmentID, Date appointmentDate, String description) {
    if (!getAppointMentList().containsKey(appointmentID)) {
      getAppointMentList().put(appointmentID, new Appointment(appointmentID, appointmentDate, description));
    } else {
      throw new IllegalAccessError("Appointment ID:" + appointmentID + " can't be added because it's already present");
    }
  }

  public void delete(String appointmentID) {
    Appointment temp = getAppointMentList().remove(appointmentID);
    if (temp != null) {
      System.out.println("Deleted Appointment ID: " + appointmentID + ", Description: " + temp.getDescription());
    } else {
      throw new IllegalAccessError("delete is not possible");
    }
  }

  public HashMap < String, Appointment > getAppointMentList() {
    return appointMentList;
  }

  public void setAppointMentList(HashMap < String, Appointment > appointMentList) {
    this.appointMentList = appointMentList;
  }
}
