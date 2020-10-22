package hu.gergelyurban.kodinformatika.controller;

import hu.gergelyurban.kodinformatika.service.ChangeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ChangeController {
    ChangeService changeService;

    @Autowired
    public void setChangeService(ChangeService changeService) {
        this.changeService = changeService;
    }

    @RequestMapping(path = "/symbols", method = RequestMethod.GET)
    public List<String> getSymbols(){
        List<String> symbols = new ArrayList<>();
        symbols.add("EUR");
        symbols.add("HUF");
        return symbols;
    }

    @RequestMapping(path = "/convert", method = RequestMethod.GET)
    public double convert(@PathVariable("from") String from, @PathVariable("to") String to, @PathVariable("amount") double amount){
        return changeService.change(amount, to, from);
    }
}
