package apps.refactoring_project.fowler_2019.calc;

import apps.refactoring_project.fowler_2019.db.dto.PerformanceDTO;
import apps.refactoring_project.fowler_2019.db.dto.PlayDTO;

public class TragedyCalculator extends PerformanceCalculator {

    public TragedyCalculator(PerformanceDTO performance, PlayDTO play) {
        super(performance, play);
    }

    @Override
    public int getAmount() {
        int result = 40000;
        if (this.performance.getAudience() > 30) {
            result += 1000 * (this.performance.getAudience() - 30);
        }
        return result;
    }
}
