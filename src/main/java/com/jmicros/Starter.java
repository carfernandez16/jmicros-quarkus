package com.jmicros;

import io.quarkus.runtime.Startup;

import javax.enterprise.context.ApplicationScoped;

@Startup
@ApplicationScoped
public class Starter {
    Starter(){
        System.out.println("calling at startup time.....");
    }
}
