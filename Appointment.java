package main;

import java.util.Date;


public class Appointment {
	  private String appointmentID;
	  private Date appointmentDate;
	  private String description;

	  public Appointment(String appointmentID, Date appointmentDate, String description) {
	    if (appointmentID == null) {
	      throw new IllegalArgumentException("The appointment ID shall not be null .");
	    } else if (appointmentID.length() > 10) {
	      throw new IllegalArgumentException("The appointment ID cannot be longer than 10 characters.");
	    } else {
	      this.appointmentID = appointmentID;
	    }
	    setAppointmentDate(appointmentDate);
	    setDescription(description);
	  }

	  public Date getAppointmentDate() {
	    return appointmentDate;
	  }

	  public void setAppointmentDate(Date appointmentDate) {
	    if (appointmentDate == null) {
	      throw new IllegalArgumentException("The appointment Date field shall not be null.");
	    }
	    this.appointmentDate = appointmentDate;
	  }

	  public String getDescription() {
	    return description;
	  }

	  public void setDescription(String description) {
	    if (description == null) {
	      throw new IllegalArgumentException("The description field shall not be null.");
	    } else if (description.length() > 50) {
	      throw new IllegalArgumentException("The description  cannot be longer than 50 characters..");

	    }
	    this.description = description;
	  }
	}