package be.axxes.demo.controller;

import be.axxes.demo.model.ImmutableSimpleDto;
import be.axxes.demo.model.SimpleDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/unsecured")
public class UnsecuredController {

    @GetMapping
    public SimpleDto notSecured() {
        return ImmutableSimpleDto.of("Successfully called UNSECURED endpoint!");
    }
}
