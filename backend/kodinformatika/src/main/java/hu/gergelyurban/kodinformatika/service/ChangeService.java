package hu.gergelyurban.kodinformatika.service;

import org.springframework.stereotype.Service;

@Service
public class ChangeService {
    private double rate = 330;

    public double change(Double amount, String to, String from){
        if(to.contentEquals("EUR") && from.contains("HUF")){
            amount /= rate;
        }

        if(to.contentEquals("HUF") && from.contentEquals("EUR")){
            amount *= rate;
        }

        return amount;
    }
}
