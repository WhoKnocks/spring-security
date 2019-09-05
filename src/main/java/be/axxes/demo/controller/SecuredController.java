package be.axxes.demo.controller;

import be.axxes.demo.model.ImmutableSimpleDto;
import be.axxes.demo.model.SimpleDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/secured")
public class SecuredController {

    @GetMapping
    public SimpleDto securedUser() {
        return ImmutableSimpleDto.of("Successfully called SECURED endpoint for USERS!");
    }

    @GetMapping("/admin")
    public SimpleDto securedAdmin() {
        return ImmutableSimpleDto.of("Successfully called SECURED endpoint for ADMINS!");
    }

    @GetMapping("/username")
    public SimpleDto getUserName() {
        return ImmutableSimpleDto.of("Not yet implemented.");
    }
}
