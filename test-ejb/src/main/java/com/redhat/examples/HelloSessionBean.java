package com.redhat.examples;

import com.redhat.sample.HelloSessionBeanLocal;
import com.redhat.sample.HelloSessionBeanRemote;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Stateless
@LocalBean
public class HelloSessionBean implements HelloSessionBeanLocal, HelloSessionBeanRemote {
    public String getLocalDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
}
