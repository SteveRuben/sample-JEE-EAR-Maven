package com.redhat.sample;

import javax.ejb.Local;

@Local
public interface HelloSessionBeanLocal {
    String getLocalDateTime();
}
