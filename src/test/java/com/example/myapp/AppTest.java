package com.example.myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void healthzReturnsOk() {
        App.HealthController controller = new App.HealthController();
        assertEquals("OK", controller.healthz());
    }

    @Test
    void homeReturnsRunningMessage() {
        App.HealthController controller = new App.HealthController();
        assertEquals("myapp is running", controller.home());
    }
}
