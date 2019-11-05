package com.integ.integCours.api;

import com.integ.integCours.commons.Band;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BandRestServiceTest {

    @Test
    void getBands() {
        ArrayList<Band> bands = new ArrayList<>();
        Band band1 = new Band(0,"Ivyllines","MetalCore Djent");
        bands.add(band1);
        Band band2 = new Band(1,"Lorna Shore","DeathCore");
        bands.add(band2);
        Band band3 = new Band(2,"Dimmu Borgir","BlackMetal");
        bands.add(band3);

        assertTrue(bands.size() == 3);
    }
}