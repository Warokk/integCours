package com.integ.integCours.api;

import com.integ.integCours.commons.Band;
import com.integ.integCours.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BandRestService {

    @Autowired
    BandService bandService;

    @RequestMapping("/bands")
    public String getBands (){
        String bands = "";
        for(Band band : this.bandService.getBands()){
            bands += band.toString();
        }
        return bands;
    }
}
