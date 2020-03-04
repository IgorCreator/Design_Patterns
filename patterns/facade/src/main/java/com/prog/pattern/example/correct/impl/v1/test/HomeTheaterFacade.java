package com.prog.pattern.example.correct.impl.v1.test;

import com.prog.pattern.example.correct.impl.v1.test.pojo.*;

public class HomeTheaterFacade {
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

        popper.on();
        popper.pop();

        theaterLights.dim(10);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setSurroundSound();
        amp.setVolume(5);

        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down.");

        popper.off();
        theaterLights.on();
        screen.up();
        projector.off();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        theaterLights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cdPlayer);
        amp.setStereoSound();
        cdPlayer.on();
        cdPlayer.play(cdTitle);
    }

    public void endCd() {
        System.out.println("Shutting down CD...");
        amp.off();
        amp.setCd(cdPlayer);
        cdPlayer.eject();
        cdPlayer.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}
