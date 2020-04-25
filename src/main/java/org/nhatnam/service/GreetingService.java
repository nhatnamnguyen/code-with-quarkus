package org.nhatnam.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
    public String greeting(final String name) {
        return "hello " + name;
    }
}
