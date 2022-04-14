package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @ParameterizedTest
    @CsvSource(value = {" 'Number Station',4,4",
            " 'Min Number Station',0,0",
            " 'Max Number Station',9,9",
            " 'Up Limit Number Station', 10,0",
            " 'Down Limit Number Station', -1,0"})
    public void numberStation(String name, int incomingData, int expected) {
        radio.setNumStation(incomingData);
        int actual = radio.getNumStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value = {" 'Up Limit Next Station',9,0",
            " 'NextStation',0,1 "})
    public void nextStation(String name, int incomingData, int expected) {
        radio.setNumStation(incomingData);
        radio.setNextStation();
        int actual = radio.getNumStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {" 'PrevStation',9,8",
            " 'Down Limit Next Station',0,9 "})
    public void prevStation(String name, int incomingData, int expected) {
        radio.setNumStation(incomingData);
        radio.setPrevStation();
        int actual = radio.getNumStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {" 'Level Volume',5,5",
            " 'Min Border Volume',-1,0",
            " 'Max Border Volume',11,10",
    })
    public void levelVolume(String name, int incomingData, int expected) {
        radio.setVolumeStation(incomingData);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value = {" 'Min Level Volume',0,0",
            " 'Down Level Volume',6,5"
    })
    public void minLevelVolume(String name, int incomingData, int expected) {
        radio.setVolumeStation(incomingData);
        radio.setMinLevelVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {" 'Max Level Volume',11,10",
            " 'Up Level Volume',5,6"
    })
    public void maxLevelVolume(String name, int incomingData, int expected) {
        radio.setVolumeStation(incomingData);
        radio.setMaxLevelVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }
}
