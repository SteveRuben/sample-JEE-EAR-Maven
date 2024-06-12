package com.redhat.sample;

import javax.ejb.Remote;

@Remote
public interface HelloSessionBeanRemote {
    String getLocalDateTime();
}
