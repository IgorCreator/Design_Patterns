package apps.refactoring_project.fowler_2019.pojo;

import apps.refactoring_project.fowler_2019.db.dto.PerformanceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;

public class Performance {

    String playID;
    int audience;

    PlayDTO play;
    int amount;
    int volumeCredits;

    public Performance(PerformanceDTO perf) {
        this.playID = perf.getPlayID();
        this.audience = perf.getAudience();
    }

    public String getPlayID() {
        return playID;
    }

    public void setPlayID(String playID) {
        this.playID = playID;
    }

    public int getAudience() {
        return audience;
    }

    public void setAudience(int audience) {
        this.audience = audience;
    }

    public PlayDTO getPlay() {
        return play;
    }

    public void setPlay(PlayDTO play) {
        this.play = play;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getVolumeCredits() {
        return volumeCredits;
    }

    public void setVolumeCredits(int volumeCredits) {
        this.volumeCredits = volumeCredits;
    }
}
