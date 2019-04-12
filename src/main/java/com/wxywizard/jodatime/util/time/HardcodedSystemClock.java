package com.wxywizard.jodatime.util.time;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.joda.time.DateMidnight;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;


public class HardcodedSystemClock implements SystemClock {
  
  /**
   * Hardcode the date time here. It will be used as the "Sytem Time"
   * for all code that use the SystemClock interface, where this implementation
   * is the one returned by SystemFactory.getClock().
   */
  // This instance set to 9/6/2009 8:00am
  private static final DateTime theDateTime = new DateTime(2009, 9, 6, 14, 30, 0, 0);

  @Override
  public DateTime getDateTime() {
    return theDateTime;
  }

  @Override
  public long getTimeInMillis() {
    return theDateTime.getMillis();
  }

  @Override
  public DateMidnight getDateMidnight() {
    return theDateTime.toDateMidnight();
  }

  @Override
  public LocalDate getLocalDate() {
    return theDateTime.toLocalDate();
  }

  @Override
  public LocalTime getLocalTime() {
    return theDateTime.toLocalTime();
  }

  @Override
  public Calendar getCalendar() {
    return theDateTime.toCalendar(Locale.getDefault());
  }

  @Override
  public Date getDate() {
    return theDateTime.toDate();
  }

}
