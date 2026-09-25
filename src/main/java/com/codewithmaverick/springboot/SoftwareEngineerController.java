package com.codewithmaverick.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Emmanuel",
                        "Damba",
                        "dambaemmanuel5@gmail.com",
                        "0123456",
                        "Developer",
                        Collections.singletonList("java, cshap, goolang")
                ),
                new SoftwareEngineer(
                        2,
                        "Aspect",
                        "Moyo",
                        "aspect@gmail.com",
                        "0123456",
                        "Developer",
                        Collections.singletonList("js, node, react, tailwindcss")
                ),
                new SoftwareEngineer(
                        3,
                        "Bridget",
                        "Sibanda",
                        "bridget@gmail.com",
                        "0123456",
                        "Developer",
                        Collections.singletonList("js, node, react, tailwindcss")
                )
        );
    }
}
