package io.getarrayus.Demo.api;

import io.getarrayus.Demo.model.Person;
import io.getarrayus.Demo.service.PersonService;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    public void addPerson(Person person) {
        personService.addPerson(person);
    }
}
