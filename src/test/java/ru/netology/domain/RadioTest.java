package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    public void numberStation(){
        int expected = 4;
        radio.setNumStation(expected);
        assertEquals(expected,radio.getNumStation());
    }

    @Test
    public void minNumberStation(){
        int expected = 0;
        radio.setNumStation(expected);
        assertEquals(expected,radio.getNumStation());
    }

    @Test
    public void maxNumberStation(){
        int expected = 9;
        radio.setNumStation(expected);
        assertEquals(expected,radio.getNumStation());
    }

    @Test
    public void upLimitNumberStation(){
        int expected = 10;
        radio.setNumStation(expected);
        assertEquals(0,radio.getNumStation());
    }

    @Test
    public void downLimitNumberStation(){
        int expected = -1;
        radio.setNumStation(expected);
        assertEquals(0,radio.getNumStation());
    }


    @Test
    public void upLimitNextStation(){
        radio.setNumStation(9);
        int expected = 0;
        radio.setNextStation();
        assertEquals(expected,radio.getNumStation());
    }

    @Test
    public void nextStation(){
        radio.setNumStation(0);
        int expected = 1;
        radio.setNextStation();
        assertEquals(expected,radio.getNumStation());
    }

    @Test
    public void downLimitPrevStation(){
        radio.setNumStation(0);
        int expected = 9;
        radio.setPrevStation();
        assertEquals(expected,radio.getNumStation());
    }

    @Test
    public void prevStation(){
        radio.setNumStation(9);
        int expected = 8;
        radio.setPrevStation();
        assertEquals(expected,radio.getNumStation());
    }

    @Test
    public void levelVolume(){
        int expected = 5;
        radio.setVolumeStation(5);
        assertEquals(expected,radio.getVolume());
    }

    @Test
    public void minBorderVolume(){
        int expected = 0;
        radio.setVolumeStation(-1);
        assertEquals(expected,radio.getVolume());
    }

    @Test
    public void maxBorderVolume(){
                int expected = 10;
        radio.setVolumeStation(11);
        assertEquals(expected,radio.getVolume());
    }
    @Test
    public void minLevelVolume(){
        radio.setVolumeStation(0);
        int expected = 0;

        radio.setMinLevelVolume();
        assertEquals(expected,radio.getVolume());
    }

    @Test
    public void downLevelVolume(){
        radio.setVolumeStation(6);
        int expected = 5;

        radio.setMinLevelVolume();
        assertEquals(expected,radio.getVolume());
    }

    @Test
    public void maxLevelVolume(){
        radio.setVolumeStation(11);
        int expected = 10;

        radio.setMaxLevelVolume();
        assertEquals(expected,radio.getVolume());
    }

    @Test
    public void upLevelVolume(){
        radio.setVolumeStation(5);
        int expected = 6;

        radio.setMaxLevelVolume();
        assertEquals(expected,radio.getVolume());
    }


}