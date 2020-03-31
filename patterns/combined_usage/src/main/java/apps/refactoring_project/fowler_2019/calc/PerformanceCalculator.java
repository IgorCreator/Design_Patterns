package apps.refactoring_project.fowler_2019.calc;

import apps.refactoring_project.fowler_2019.db.dto.PerformanceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;

public class PerformanceCalculator {

    protected PerformanceDTO performance;
    protected PlayDTO play;

    public PerformanceCalculator(PerformanceDTO performance, PlayDTO play) {
        this.performance = performance;
        this.play = play;
    }

    public int getAmount() {
        throw new IllegalStateException("Unknown type: " + this.play.getType());
    }

    public int getVolumeCredits() {
        return Math.max(performance.getAudience() - 30, 0);
    }

    public PlayDTO getPlay() {
        return play;
    }

}
