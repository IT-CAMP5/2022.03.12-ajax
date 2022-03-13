package pl.camp.it.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.camp.it.model.SimpleModel;

@RestController
public class RController {

    @RequestMapping(value = "/endpoint", method = RequestMethod.POST)
    public SimpleModel endpoint(@RequestBody SimpleModel simpleModel) {
        System.out.println(simpleModel.getName());
        System.out.println(simpleModel.getSurname());
        System.out.println(simpleModel.isCos());

        simpleModel.setName("Jan");
        simpleModel.setSurname("Kowalski");
        simpleModel.setCos(false);

        return simpleModel;
    }
}
