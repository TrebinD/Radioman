package ru.netology.domain;

public class Radio {

    private int numStation;
    private int volume;


    public int getNumStation() {
        return numStation;
    }

    public void setNumStation(int numStation) {
        if (numStation < 0) {
            numStation = 0;
            return;
        }
        if (numStation > 9) {
            numStation = 0;
            return;
        }
        this.numStation = numStation;
    }

    public void setNextStation() {
        if (numStation == 9) {
            numStation = 0;
            return;
        }
        numStation++;

    }

    public void setPrevStation() {
        if (numStation == 0) {
            numStation = 9;
            return;
        }
        numStation--;

    }


    public int getVolume() {
        return volume;
    }

    public void setVolumeStation(int volume) {
        if (volume > 10) {
            this.volume = 10;
            return;
        }
        if (volume < 0) {
            this.volume = 0;
            return;
        }
        this.volume = volume;

    }

    public void setMinLevelVolume() {
        if (this.volume == 0) {
            return;
        }
        this.volume--;
    }

    public void setMaxLevelVolume() {
        if (this.volume == 10) {
            this.volume = 10;
            return;
        }
        this.volume++;
    }


}
