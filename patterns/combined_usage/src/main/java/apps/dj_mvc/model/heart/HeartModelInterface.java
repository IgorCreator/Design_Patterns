package apps.dj_mvc.model.heart;

import apps.dj_mvc.model.BPMObserver;
import apps.dj_mvc.model.BeatObserver;

public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
