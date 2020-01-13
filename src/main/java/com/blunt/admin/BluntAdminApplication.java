package com.blunt.admin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
@Slf4j
public class BluntAdminApplication {

  public static void main(String[] args) {
    log.info("Starting Blunt Admin Application service");
    SpringApplication.run(BluntAdminApplication.class, args);
  }
}
