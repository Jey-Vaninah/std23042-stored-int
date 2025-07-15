package com.my.stored.endpoint.rest.controller.health;

import com.my.stored.service.StoredIntService;
import java.nio.file.Path;
import java.nio.file.Paths;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StoredIntController {
  private final StoredIntService storedIntService;
  private static final Path FILE_PATH = Paths.get("/tmp/stored-int.txt");

  @GetMapping("/stored-int")
  public String storedInt() {
    return storedIntService.apply();
  }
}
