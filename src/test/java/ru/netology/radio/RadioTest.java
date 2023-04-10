package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSmallerMinVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-50);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMoreMaxVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(150);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.increaseVolume();
        int expected = 6;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxVolume100() {
        Radio volume = new Radio();
        volume.setCurrentVolume(100);
        volume.increaseVolume();
        int expected = 100;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void volumeDownTest() {
        Radio volume = new Radio();
        volume.setCurrentVolume(5);
        volume.downVolume();
        int expected = 4;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinVolume0() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.downVolume();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }







    @Test
    public void shouldNewRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldRadioStationMoreMax() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldRadioStationSmallerMin() {
        Radio station = new Radio();
        station.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMaxRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(9);
        station.next();
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationMoreMax2() {
        Radio station = new Radio();
        station.setCurrentRadioStation(10);
        station.next();
        int expected = 1;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldMinRadioStation() {
        Radio station = new Radio();
        station.setCurrentRadioStation(0);
        station.prev();
        int expected = 9;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldRadioStationSmallerMin2() {
        Radio station = new Radio();
        station.setCurrentRadioStation(5);
        station.prev();
        int expected = 4;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRadioStationOver10() {
        Radio station = new Radio(30);
        station.setCurrentRadioStation(29);
        station.next();
        int expected = 0;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldRadioStation5() {
        Radio station = new Radio(5);
        station.setCurrentRadioStation(0);
        station.prev();
        int expected = 4;
        int actual = station.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
}
