package com.my.stored.endpoint.rest.controller.health;

import com.my.stored.service.StoredIntService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class StoredIntController {
    private final StoredIntService storedIntService;

    @GetMapping("/stored-int")
    public String storedInt() {
        return storedIntService.apply();
    }
}
