package apps.dj_mvc;

import apps.dj_mvc.controller.BeatController;
import apps.dj_mvc.controller.ControllerInterface;
import apps.dj_mvc.controller.HeartController;
import apps.dj_mvc.model.beat.BeatModel;
import apps.dj_mvc.model.beat.BeatModelInterface;
import apps.dj_mvc.model.heart.HeartModel;

public class TestDrive {
    public static void main(String[] args) {
        TestDrive testDrive = new TestDrive();
//        testDrive.test_beat_v1();
        testDrive.test_heartBeat_v2();
    }

    private void test_beat_v1() {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }

    private void test_heartBeat_v2() {
        HeartModel heartModel = new HeartModel();
        ControllerInterface model = new HeartController(heartModel);
    }
}
