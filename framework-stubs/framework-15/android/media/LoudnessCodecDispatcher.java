package android.media;

public class LoudnessCodecDispatcher implements android.media.CallbackUtil.DispatcherStub {
    public LoudnessCodecDispatcher(android.media.IAudioService p0) {}
    public void register(boolean p0) {}
    public void addLoudnessCodecListener(android.media.LoudnessCodecController p0, java.util.concurrent.Executor p1, android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener p2) {}
    public void removeLoudnessCodecListener(android.media.LoudnessCodecController p0) {}
    public void startLoudnessCodecUpdates(int p0) {}
    public void stopLoudnessCodecUpdates(int p0) {}
    public void addLoudnessCodecInfo(int p0, int p1, android.media.LoudnessCodecInfo p2) {}
    public void removeLoudnessCodecInfo(int p0, android.media.LoudnessCodecInfo p1) {}
    public android.os.Bundle getLoudnessCodecParams(android.media.LoudnessCodecInfo p0) { return null; }

    private static final class LoudnessCodecUpdatesDispatcherStub extends android.media.ILoudnessCodecUpdatesDispatcher.Stub {
        public static synchronized android.media.LoudnessCodecDispatcher.LoudnessCodecUpdatesDispatcherStub getInstance() { return null; }
        public void dispatchLoudnessCodecParameterChange(int p0, android.os.PersistableBundle p1) {}
        void addLoudnessCodecListener(android.media.CallbackUtil.DispatcherStub p0, android.media.LoudnessCodecController p1, java.util.concurrent.Executor p2, android.media.LoudnessCodecController.OnLoudnessCodecUpdateListener p3) {}
        void removeLoudnessCodecListener(android.media.LoudnessCodecController p0) {}
    }
}
