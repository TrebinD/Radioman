package ru.netology.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(55);

    @ParameterizedTest
    @CsvSource(value = {" 'Number Station',4,4",
            " 'Min Number Station',0,0",
            " 'Max Number Station',54,54",
            " 'Up Limit Number Station', 55,54",
            " 'Down Limit Number Station', -1,0"})
    public void numberStation(String name, int incomingData, int expected) {
        radio.setNumStation(incomingData);
        int actual = radio.getNumStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value = {" 'Up Limit Next Station',54,0",
            " 'Next Station',24,25 "})
    public void nextStation(String name, int incomingData, int expected) {
        radio.setNumStation(incomingData);
        radio.setNextStation();
        int actual = radio.getNumStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {" 'Prev Station',9,8",
            " 'Down Limit Next Station',0,54 "})
    public void prevStation(String name, int incomingData, int expected) {
        radio.setNumStation(incomingData);
        radio.setPrevStation();
        int actual = radio.getNumStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {" 'Level Volume',5,5",
            " 'Min Border Volume',-1,0",
            " 'Max Border Volume',101,100",
    })
    public void levelVolume(String name, int incomingData, int expected) {
        radio.setVolume(incomingData);
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value = {" 'Min Level Volume',0,0",
            " 'Down Level Volume',6,5"
    })
    public void downLevelVolume(String name, int incomingData, int expected) {
        radio.setVolume(incomingData);
        radio.setMinLevelVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {" 'Max Level Volume',100,100",
            " 'Up Level Volume',21,22",
    })
    public void upLevelVolume(String name, int incomingData, int expected) {
        radio.setVolume(incomingData);
        radio.setMaxLevelVolume();
        int actual = radio.getVolume();
        assertEquals(expected, actual);
    }

    Radio defaultOnly = new Radio();

    @ParameterizedTest
    @CsvSource(value = {" 'Number Station Default',4,4",
            " 'Min Number Station Default',0,0",
            " 'Max Number Station Default',9,9",
            " 'Up Limit Number Station Default', 10,9",
            " 'Down Limit Number Station Default', -1,0"})
    public void WithoutSettingNumberStation(String name, int incomingData, int expected) {
        defaultOnly.setNumStation(incomingData);
        int actual = defaultOnly.getNumStation();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value = {" 'Up Limit Next Station Default',10,0",
            " 'Next Station Default',0,1 "})
    public void WithoutSettingNextStation(String name, int incomingData, int expected) {
        defaultOnly.setNumStation(incomingData);
        defaultOnly.setNextStation();
        int actual = defaultOnly.getNumStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {" 'Prev Station Default',9,8",
            " 'Down Limit Next Station Default',0,9 "})
    public void WithoutSettingPrevStation(String name, int incomingData, int expected) {
        defaultOnly.setNumStation(incomingData);
        defaultOnly.setPrevStation();
        int actual = defaultOnly.getNumStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {" 'Level Volume Default',5,5",
            " 'Min Border Volume Default',-1,0",
            " 'Max Border Volume Default',101,100",
    })
    public void WithoutSettingLevelVolume(String name, int incomingData, int expected) {
        defaultOnly.setVolume(incomingData);
        int actual = defaultOnly.getVolume();
        assertEquals(expected, actual);
    }


    @ParameterizedTest
    @CsvSource(value = {" 'Min Level Volume Default',0,0",
            " 'Down Level Volume Default',6,5"
    })
    public void WithoutSettingDownLevelVolume(String name, int incomingData, int expected) {
        defaultOnly.setVolume(incomingData);
        defaultOnly.setMinLevelVolume();
        int actual = defaultOnly.getVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {" 'Max Level Volume Default',100,100",
            " 'Up Level Volume Default',21,22",
    })
    public void WithoutSettingUpLevelVolume(String name, int incomingData, int expected) {
        defaultOnly.setVolume(incomingData);
        defaultOnly.setMaxLevelVolume();
        int actual = defaultOnly.getVolume();
        assertEquals(expected, actual);
    }

}
