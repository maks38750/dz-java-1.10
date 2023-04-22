package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;

        }
    }

    public void next() {
     if (currentStation != 9) {
         currentStation++;
     }
     else {
         currentStation = 0;
     }
    }
    public void previous() {
        if(currentStation !=0) {
            currentStation--;
        }else{
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
         currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }
}