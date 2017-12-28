package com.form3.payment.api.web.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Abderrazak BOUADMA
 * on 28/12/2017.
 */
@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/ping")
    ResponseEntity<String> ping() {
        return ResponseEntity.ok("ping");
    }
}
