package apps.refactoring_project.fowler_2019.calc;

import apps.refactoring_project.fowler_2019.db.dto.PerformanceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;

public class ComedyCalculator extends PerformanceCalculator {

    public ComedyCalculator(PerformanceDTO performance, PlayDTO play) {
        super(performance, play);
    }

    @Override
    public int getAmount() {
        int result = 30000;
        if (performance.getAudience() > 20) {
            result += 10000 + 500 * (this.performance.getAudience() - 20);
        }
        result += 300 * this.performance.getAudience();
        return result;
    }

    @Override
    public int getVolumeCredits() {
        int result = super.getVolumeCredits();
        result += Math.floor(performance.getAudience() / 5);
        return result;
    }
}
