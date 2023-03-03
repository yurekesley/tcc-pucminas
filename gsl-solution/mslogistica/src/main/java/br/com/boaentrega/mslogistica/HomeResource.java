package br.com.boaentrega.mslogistica;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeResource {

    @GetMapping("/")
    public ResponseEntity ok() {
        return ResponseEntity.ok("ok");
    }
}
