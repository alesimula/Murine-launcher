package android.hardware.hdmi;

@android.annotation.SystemApi
public class HdmiTimerRecordSources {
    public static final int RECORDING_SEQUENCE_REPEAT_ONCE_ONLY = 0;
    public static final int RECORDING_SEQUENCE_REPEAT_SUNDAY = 1;
    public static final int RECORDING_SEQUENCE_REPEAT_MONDAY = 2;
    public static final int RECORDING_SEQUENCE_REPEAT_TUESDAY = 4;
    public static final int RECORDING_SEQUENCE_REPEAT_WEDNESDAY = 8;
    public static final int RECORDING_SEQUENCE_REPEAT_THURSDAY = 16;
    public static final int RECORDING_SEQUENCE_REPEAT_FRIDAY = 32;
    public static final int RECORDING_SEQUENCE_REPEAT_SATUREDAY = 64;
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource ofDigitalSource(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.DigitalServiceSource p1) { return null; }
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource ofAnalogueSource(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.AnalogueServiceSource p1) { return null; }
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource ofExternalPlug(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.ExternalPlugData p1) { return null; }
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerRecordSource ofExternalPhysicalAddress(android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo p0, android.hardware.hdmi.HdmiRecordSources.ExternalPhysicalAddress p1) { return null; }
    public static android.hardware.hdmi.HdmiTimerRecordSources.Time timeOf(int p0, int p1) { return null; }
    public static android.hardware.hdmi.HdmiTimerRecordSources.Duration durationOf(int p0, int p1) { return null; }
    public static android.hardware.hdmi.HdmiTimerRecordSources.TimerInfo timerInfoOf(int p0, int p1, android.hardware.hdmi.HdmiTimerRecordSources.Time p2, android.hardware.hdmi.HdmiTimerRecordSources.Duration p3, int p4) { return null; }
    @android.annotation.SystemApi
    public static boolean checkTimerRecordSource(int p0, byte[] p1) { return false; }

    @android.annotation.SystemApi
    public static final class Duration extends android.hardware.hdmi.HdmiTimerRecordSources.TimeUnit {
        Duration() { super(0, 0); }
    }

    private static class ExternalSourceDecorator extends android.hardware.hdmi.HdmiRecordSources.RecordSource {
        ExternalSourceDecorator() { super(0, 0); }
        int extraParamToByteArray(byte[] p0, int p1) { return 0; }
    }

    @android.annotation.SystemApi
    public static final class Time extends android.hardware.hdmi.HdmiTimerRecordSources.TimeUnit {
        Time() { super(0, 0); }
    }

    @android.annotation.SystemApi
    public static final class TimerInfo {
        int toByteArray(byte[] p0, int p1) { return 0; }
        int getDataSize() { return 0; }
    }

    @android.annotation.SystemApi
    public static final class TimerRecordSource {
        int getDataSize() { return 0; }
        int toByteArray(byte[] p0, int p1) { return 0; }
    }

    static class TimeUnit {
        final int mHour = 0;
        final int mMinute = 0;
        TimeUnit(int p0, int p1) {}
        int toByteArray(byte[] p0, int p1) { return 0; }
        static byte toBcdByte(int p0) { return 0; }
    }
}
