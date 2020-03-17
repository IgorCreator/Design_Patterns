package apps.dj_mvc.model.beat;

import apps.dj_mvc.model.BPMObserver;
import apps.dj_mvc.model.BeatObserver;

public interface BeatModelInterface {
    public void initialize();
    public void on();
    public void off();
    public void setBPM(int bpm);
    public int getBPM();

    public void registerObserver(BeatObserver o);
    public void removeObserver(BeatObserver o);

    public void registerObserver(BPMObserver o);
    public void removeObserver(BPMObserver o);
}
