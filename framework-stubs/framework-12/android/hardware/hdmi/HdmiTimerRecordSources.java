package android.hardware.hdmi;

@android.annotation.SystemApi
public class HdmiTimerRecordSources {
    private static final java.lang.String TAG = "HdmiTimerRecordingSources";
    public static final int RECORDING_SEQUENCE_REPEAT_ONCE_ONLY = 0;
    public static final int RECORDING_SEQUENCE_REPEAT_SUNDAY = 1;
    public static final int RECORDING_SEQUENCE_REPEAT_MONDAY = 2;
    public static final int RECORDING_SEQUENCE_REPEAT_TUESDAY = 4;
    public static final int RECORDING_SEQUENCE_REPEAT_WEDNESDAY = 8;
    public static final int RECORDING_SEQUENCE_REPEAT_THURSDAY = 16;
    public static final int RECORDING_SEQUENCE_REPEAT_FRIDAY = 32;
    public static final int RECORDING_SEQUENCE_REPEAT_SATUREDAY = 64;
    private static final int RECORDING_SEQUENCE_REPEAT_MASK = 127;
    private static final int EXTERNAL_SOURCE_SPECIFIER_EXTERNAL_PLUG = 4;
    private static final int EXTERNAL_SOURCE_SPECIFIER_EXTERNAL_PHYSICAL_ADDRESS = 5;
    private HdmiTimerRecordSources() {}
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource ofDigitalSource(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.DigitalServiceSource p1) { return null; }
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource ofAnalogueSource(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.AnalogueServiceSource p1) { return null; }
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource ofExternalPlug(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.ExternalPlugData p1) { return null; }
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource ofExternalPhysicalAddress(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.ExternalPhysicalAddress p1) { return null; }
    private static void checkTimerRecordSourceInputs(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.RecordSource p1) {}
    public static android.hardware.hdmi.HdmiTimerRecordSources.Time timeOf(int p0, int p1) { return null; }
    private static void checkTimeValue(int p0, int p1) {}
    public static android.hardware.hdmi.HdmiTimerRecordSources.Duration durationOf(int p0, int p1) { return null; }
    private static void checkDurationValue(int p0, int p1) {}
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo timerInfoOf(int p0, int p1, android.hardware.hdmi.HdmiTimerRecordSources.Time p2, android.hardware.hdmi.HdmiTimerRecordSources.Duration p3, int p4) { return null; }
    @android.annotation.SystemApi
    public static boolean checkTimerRecordSource(int p0, byte[] p1) { return false; }

    @android.annotation.SystemApi
    public static final class Duration extends android.hardware.hdmi.HdmiTimerRecordSources.TimeUnit {
        private Duration(int p0, int p1) { super(0, 0); }
    }

    private static class ExternalSourceDecorator extends android.hardware.hdmi.HdmiRecordSources.RecordSource {
        private final android.hardware.hdmi.HdmiRecordSources.RecordSource mRecordSource = null;
        private final int mExternalSourceSpecifier = 0;
        private ExternalSourceDecorator(android.hardware.hdmi.HdmiRecordSources.RecordSource p0, int p1) { super(0, 0); }
        int extraParamToByteArray(byte[] p0, int p1) { return 0; }
    }

    @android.annotation.SystemApi
    public static final class Time extends android.hardware.hdmi.HdmiTimerRecordSources.TimeUnit {
        private Time(int p0, int p1) { super(0, 0); }
    }

    static class TimeUnit {
        final int mHour = 0;
        final int mMinute = 0;
        TimeUnit(int p0, int p1) {}
        int toByteArray(byte[] p0, int p1) { return 0; }
        static byte toBcdByte(int p0) { return 0; }
    }

    @android.annotation.SystemApi
    public static final class TimerInfo {
        private static final int DAY_OF_MONTH_SIZE = 1;
        private static final int MONTH_OF_YEAR_SIZE = 1;
        private static final int START_TIME_SIZE = 2;
        private static final int DURATION_SIZE = 2;
        private static final int RECORDING_SEQUENCE_SIZE = 1;
        private static final int BASIC_INFO_SIZE = 7;
        private final int mDayOfMonth = 0;
        private final int mMonthOfYear = 0;
        private final android.hardware.hdmi.HdmiTimerRecordSources.Time mStartTime = null;
        private final android.hardware.hdmi.HdmiTimerRecordSources.Duration mDuration = null;
        private final int mRecordingSequence = 0;
        private TimerInfo(int p0, int p1, android.hardware.hdmi.HdmiTimerRecordSources.Time p2, android.hardware.hdmi.HdmiTimerRecordSources.Duration p3, int p4) {}
        int toByteArray(byte[] p0, int p1) { return 0; }
        int getDataSize() { return 0; }
    }

    @android.annotation.SystemApi
    public static final class TimerRecordSource {
        private final android.hardware.hdmi.HdmiRecordSources.RecordSource mRecordSource = null;
        private final android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo mTimerInfo = null;
        private TimerRecordSource(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.RecordSource p1) {}
        int getDataSize() { return 0; }
        int toByteArray(byte[] p0, int p1) { return 0; }
    }
}
