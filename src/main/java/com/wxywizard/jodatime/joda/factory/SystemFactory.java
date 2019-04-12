package com.wxywizard.jodatime.joda.factory;

import com.wxywizard.jodatime.util.time.HardcodedSystemClock;
import com.wxywizard.jodatime.util.time.SystemClock;

/**
 * A simple factory for retrieving system objects.
 * 
 * @author steve
 *
 */
public final class SystemFactory {
  /**
   * Return an implementation of SystemClock to represent the system
   * clock for application code.
   * 
   * @return SystemClock - an implementation of SystemClock.
   */
  public static SystemClock getClock() {
    // Currently set to HardcodedSystemClock...
    return new HardcodedSystemClock();
  }
}
