package com.integ.integCours.service;

import com.integ.integCours.commons.Band;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BandService {

    public ArrayList<Band> getBands(){
        ArrayList<Band> bands = new ArrayList<>();
        Band band1 = new Band(0,"Ivyllines","MetalCore Djent");
        bands.add(band1);
        Band band2 = new Band(1,"Lorna Shore","DeathCore");
        bands.add(band2);
        Band band3 = new Band(2,"Dimmu Borgir","BlackMetal");
        bands.add(band3);
        return bands;
    }
}
