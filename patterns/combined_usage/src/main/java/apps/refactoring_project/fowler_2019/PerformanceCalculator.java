package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.db.dto.PerformanceDTO;
import apps.refactoring_project.fowler_2019.pojo.Play;

public class PerformanceCalculator {

    private PerformanceDTO performance;
    private Play play;

    public PerformanceCalculator(PerformanceDTO performanceDTO) {
        this.performance = performanceDTO;
    }

    public PerformanceCalculator(PerformanceDTO performanceDTO, Play play) {
        this.performance = performanceDTO;
        this.play = play;
    }

    public Play getPlay() {
        return play;
    }

    public void setPlay(Play play) {
        this.play = play;
    }
}
