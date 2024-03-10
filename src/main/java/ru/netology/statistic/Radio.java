package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int stationsAmount = 10;

    public Radio(int stationsAmount) {
        this.stationsAmount = stationsAmount;
    }
    public Radio() {

    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < stationsAmount) {
            if (newStation >= 0) {
                currentStation = newStation;
            }
        }
    }

    public void next() {
        if (currentStation == stationsAmount - 1) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsAmount - 1;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
