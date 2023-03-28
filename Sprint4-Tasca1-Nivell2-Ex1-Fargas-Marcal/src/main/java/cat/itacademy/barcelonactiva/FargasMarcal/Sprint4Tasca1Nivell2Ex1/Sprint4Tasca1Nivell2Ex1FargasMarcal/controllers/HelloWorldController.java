package cat.itacademy.barcelonactiva.FargasMarcal.Sprint4Tasca1Nivell2Ex1.Sprint4Tasca1Nivell2Ex1FargasMarcal.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/saluda")
    public String saluda(@RequestParam(value ="name" , defaultValue = "UNKNOWN") String name){
        return "Hello "+name+". Estàs executant un projecte Gradle";
    }


    @GetMapping(value={"/saluda2/{name}","/saluda2/"})
    public String saluda2(@PathVariable(required = false) String name){
        if (name != null) {
            return "Hello " + name + ". Estàs executant un projecte Gradle";
        } else {
            return "Hello UNKNOWN. Estàs executant un projecte Gradle";
        }
    }


}
