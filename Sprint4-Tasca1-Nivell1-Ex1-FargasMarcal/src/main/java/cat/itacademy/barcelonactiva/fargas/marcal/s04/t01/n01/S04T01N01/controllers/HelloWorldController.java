package cat.itacademy.barcelonactiva.fargas.marcal.s04.t01.n01.S04T01N01.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/saluda")
    public String saluda(@RequestParam(value="name", defaultValue = "UNKNOWN") String name){
        return "Hello " + name + ". Estàs executant un projecte Maven";
    }

    @GetMapping(value = {"/saluda2/", "/saluda2/{name}"})
    public String saluda2(@PathVariable(required = false) String name){
        if (name != null) {
            return "Hello " + name + ". Estàs executant un projecte Maven";
        } else {
            return "Hello UNKNOWN. Estàs executant un projecte Maven";
        }
    }


}
