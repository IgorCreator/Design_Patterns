package apps.refactoring_project.fowler_2019;

import apps.refactoring_project.fowler_2019.db.dto.PerformanceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;
import apps.refactoring_project.fowler_2019.pojo.Play;

public class PerformanceCalculator {

    private PerformanceDTO performance;
    private Play play;

    public PerformanceCalculator(PerformanceDTO performance, PlayDTO play) {
        this.performance = performance;
        this.play = new Play(play);
    }

    public int getAmount() {
        int result;
        switch (this.play.getType()) {
            case "tragedy":
                result = 40000;
                if (performance.getAudience() > 30) {
                    result += 1000 * (this.performance.getAudience() - 30);
                }
                break;
            case "comedy":
                result = 30000;
                if (performance.getAudience() > 20) {
                    result += 10000 + 500 * (this.performance.getAudience() - 20);
                }
                result += 300 * this.performance.getAudience();
                break;
            default:
                throw new IllegalStateException("Unknown type: " + this.play.getType());
        }
        return result;
    }

    public int getVolumeCredits() {
        int result = 0;
        // add volume credits
        result += Math.max(performance.getAudience() - 30, 0);
        // add extra credit for every ten comedy attendees
        if ("comedy" == this.play.getType())
            result += Math.floor(performance.getAudience() / 5);
        return result;
    }

    public Play getPlay() {
        return play;
    }

}
