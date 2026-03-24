package android.hardware.hdmi;

@android.annotation.SystemApi
public abstract class HdmiRecordListener {
    public HdmiRecordListener() {}
    public abstract android.hardware.hdmi.HdmiRecordSources.RecordSource onOneTouchRecordSourceRequested(int p0);
    public void onOneTouchRecordResult(int p0, int p1) {}
    public void onTimerRecordingResult(int p0, android.hardware.hdmi.HdmiRecordListener.TimerStatusData p1) {}
    public void onClearTimerRecordingResult(int p0, int p1) {}

    @android.annotation.SystemApi
    public static class TimerStatusData {
        private boolean mOverlapped;
        private int mMediaInfo;
        private boolean mProgrammed;
        private int mProgrammedInfo;
        private int mNotProgrammedError;
        private int mDurationHour;
        private int mDurationMinute;
        private int mExtraError;
        static android.hardware.hdmi.HdmiRecordListener.TimerStatusData parseFrom(int p0) { return null; }
        private static int bcdByteToInt(byte p0) { return 0; }
        private TimerStatusData() {}
        public boolean isOverlapped() { return false; }
        public int getMediaInfo() { return 0; }
        public boolean isProgrammed() { return false; }
        public int getProgrammedInfo() { return 0; }
        public int getNotProgammedError() { return 0; }
        public int getDurationHour() { return 0; }
        public int getDurationMinute() { return 0; }
        public int getExtraError() { return 0; }
    }
}
