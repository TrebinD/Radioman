package ru.netology.domain;

public class Radio {

    private int numStation;
    private int volume;
    private int maxNumberStation = 9;
    private final int minNumberStation = 0;
    private final int minVolume = 0;
    private final int maxVolume = 100;


    public Radio() {
    }

    public Radio(int maxNumberStation) {
        this.maxNumberStation = maxNumberStation - 1;
    }

    public int getNumStation() {
        return numStation;
    }

    public void setNumStation(int numStation) {
        if (numStation > maxNumberStation) {
            this.numStation = maxNumberStation;
            return;
        }
        if (numStation < minNumberStation) {
            return;
        }
        this.numStation = numStation;
    }

    public void setNextStation() {
        if (numStation >= maxNumberStation) {
            numStation = minNumberStation;
            return;
        }
        numStation++;

    }

    public void setPrevStation() {
        if (numStation <= minNumberStation) {
            numStation = maxNumberStation;
            return;
        }
        numStation--;

    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume > maxVolume) {
            this.volume = maxVolume;
            return;
        }
        if (volume < minVolume) {
            this.volume = minVolume;
            return;
        }
        this.volume = volume;
    }


    public void setMinLevelVolume() {
        if (volume == minVolume) {
            return;
        }
        this.volume--;
    }

    public void setMaxLevelVolume() {
        if (volume == maxVolume) {
            return;
        }
        volume++;
    }


}
