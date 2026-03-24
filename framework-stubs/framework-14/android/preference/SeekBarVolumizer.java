package android.preference;

@java.lang.Deprecated
public class SeekBarVolumizer implements android.widget.SeekBar.OnSeekBarChangeListener, android.os.Handler.Callback {
    public SeekBarVolumizer(android.content.Context p0, int p1, android.net.Uri p2, android.preference.SeekBarVolumizer.Callback p3) {}
    @android.annotation.RequiresPermission("android.permission.READ_DEVICE_CONFIG")
    public SeekBarVolumizer(android.content.Context p0, int p1, android.net.Uri p2, android.preference.SeekBarVolumizer.Callback p3, boolean p4) {}
    public void setSeekBar(android.widget.SeekBar p0) {}
    protected void updateSeekBar() {}
    public boolean handleMessage(android.os.Message p0) { return false; }
    public void stop() {}
    public void start() {}
    public void revertVolume() {}
    public void onProgressChanged(android.widget.SeekBar p0, int p1, boolean p2) {}
    public void onStartTrackingTouch(android.widget.SeekBar p0) {}
    public void onStopTrackingTouch(android.widget.SeekBar p0) {}
    public boolean isSamplePlaying() { return false; }
    public void startSample() {}
    public void stopSample() {}
    public android.widget.SeekBar getSeekBar() { return null; }
    public void changeVolumeBy(int p0) {}
    public void muteVolume() {}
    public void onSaveInstanceState(android.preference.VolumePreference.VolumeStore p0) {}
    public void onRestoreInstanceState(android.preference.VolumePreference.VolumeStore p0) {}

    public static interface Callback {
        public void onSampleStarting(android.preference.SeekBarVolumizer p0);
        public void onProgressChanged(android.widget.SeekBar p0, int p1, boolean p2);
        public void onMuted(boolean p0, boolean p1);
        public void onStartTrackingTouch(android.preference.SeekBarVolumizer p0);
        default public void onStopTrackingTouch(android.preference.SeekBarVolumizer p0) {}
    }

    private final class H extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
        public void postUpdateSlider(int p0, int p1, boolean p2) {}
    }

    private final class Observer extends android.database.ContentObserver {
        public Observer(android.preference.SeekBarVolumizer p0, android.os.Handler p1) { super(null); }
        public void onChange(boolean p0) {}
    }

    private final class Receiver extends android.content.BroadcastReceiver {
        public void setListening(boolean p0) {}
        public void onReceive(android.content.Context p0, android.content.Intent p1) {}
    }

    private class VolumeHandler extends android.os.Handler {
        public void handleMessage(android.os.Message p0) {}
    }
}
