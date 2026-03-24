package android.hardware.hdmi;

@android.annotation.SystemApi
public final class HdmiRecordSources {
    public static final int DIGITAL_BROADCAST_TYPE_ARIB = 0;
    public static final int DIGITAL_BROADCAST_TYPE_ATSC = 1;
    public static final int DIGITAL_BROADCAST_TYPE_DVB = 2;
    public static final int DIGITAL_BROADCAST_TYPE_ARIB_BS = 8;
    public static final int DIGITAL_BROADCAST_TYPE_ARIB_CS = 9;
    public static final int DIGITAL_BROADCAST_TYPE_ARIB_T = 10;
    public static final int DIGITAL_BROADCAST_TYPE_ATSC_CABLE = 16;
    public static final int DIGITAL_BROADCAST_TYPE_ATSC_SATELLITE = 17;
    public static final int DIGITAL_BROADCAST_TYPE_ATSC_TERRESTRIAL = 18;
    public static final int DIGITAL_BROADCAST_TYPE_DVB_C = 24;
    public static final int DIGITAL_BROADCAST_TYPE_DVB_S = 25;
    public static final int DIGITAL_BROADCAST_TYPE_DVB_S2 = 26;
    public static final int DIGITAL_BROADCAST_TYPE_DVB_T = 27;
    public static final int ANALOGUE_BROADCAST_TYPE_CABLE = 0;
    public static final int ANALOGUE_BROADCAST_TYPE_SATELLITE = 1;
    public static final int ANALOGUE_BROADCAST_TYPE_TERRESTRIAL = 2;
    public static final int BROADCAST_SYSTEM_PAL_BG = 0;
    public static final int BROADCAST_SYSTEM_SECAM_LP = 1;
    public static final int BROADCAST_SYSTEM_PAL_M = 2;
    public static final int BROADCAST_SYSTEM_NTSC_M = 3;
    public static final int BROADCAST_SYSTEM_PAL_I = 4;
    public static final int BROADCAST_SYSTEM_SECAM_DK = 5;
    public static final int BROADCAST_SYSTEM_SECAM_BG = 6;
    public static final int BROADCAST_SYSTEM_SECAM_L = 7;
    public static final int BROADCAST_SYSTEM_PAL_DK = 8;
    public static final int BROADCAST_SYSTEM_PAL_OTHER_SYSTEM = 31;
    public static android.hardware.hdmi.HdmiRecordSources.OwnSource ofOwnSource() { return null; }
    public static android.hardware.hdmi.HdmiRecordSources.DigitalServiceSource ofDigitalChannelId(int p0, android.hardware.hdmi.HdmiRecordSources.DigitalChannelData p1) { return null; }
    public static android.hardware.hdmi.HdmiRecordSources.DigitalServiceSource ofArib(int p0, android.hardware.hdmi.HdmiRecordSources.AribData p1) { return null; }
    public static android.hardware.hdmi.HdmiRecordSources.DigitalServiceSource ofAtsc(int p0, android.hardware.hdmi.HdmiRecordSources.AtscData p1) { return null; }
    public static android.hardware.hdmi.HdmiRecordSources.DigitalServiceSource ofDvb(int p0, android.hardware.hdmi.HdmiRecordSources.DvbData p1) { return null; }
    public static android.hardware.hdmi.HdmiRecordSources.AnalogueServiceSource ofAnalogue(int p0, int p1, int p2) { return null; }
    public static android.hardware.hdmi.HdmiRecordSources.ExternalPlugData ofExternalPlug(int p0) { return null; }
    public static android.hardware.hdmi.HdmiRecordSources.ExternalPhysicalAddress ofExternalPhysicalAddress(int p0) { return null; }
    @android.annotation.SystemApi
    public static boolean checkRecordSource(byte[] p0) { return false; }

    @android.annotation.SystemApi
    public static final class AnalogueServiceSource extends android.hardware.hdmi.HdmiRecordSources.RecordSource {
        static final int EXTRA_DATA_SIZE = 4;
        AnalogueServiceSource() { super(0, 0); }
        int extraParamToByteArray(byte[] p0, int p1) { return 0; }
    }

    public static final class AribData implements android.hardware.hdmi.HdmiRecordSources.DigitalServiceIdentification {
        public AribData(int p0, int p1, int p2) {}
        public int toByteArray(byte[] p0, int p1) { return 0; }
    }

    public static final class AtscData implements android.hardware.hdmi.HdmiRecordSources.DigitalServiceIdentification {
        public AtscData(int p0, int p1) {}
        public int toByteArray(byte[] p0, int p1) { return 0; }
    }

    private static final class ChannelIdentifier {
    }

    public static final class DigitalChannelData implements android.hardware.hdmi.HdmiRecordSources.DigitalServiceIdentification {
        public static android.hardware.hdmi.HdmiRecordSources.DigitalChannelData ofTwoNumbers(int p0, int p1) { return null; }
        public static android.hardware.hdmi.HdmiRecordSources.DigitalChannelData ofOneNumber(int p0) { return null; }
        public int toByteArray(byte[] p0, int p1) { return 0; }
    }

    private static interface DigitalServiceIdentification {
        public int toByteArray(byte[] p0, int p1);
    }

    @android.annotation.SystemApi
    public static final class DigitalServiceSource extends android.hardware.hdmi.HdmiRecordSources.RecordSource {
        static final int EXTRA_DATA_SIZE = 7;
        DigitalServiceSource() { super(0, 0); }
        int extraParamToByteArray(byte[] p0, int p1) { return 0; }
    }

    public static final class DvbData implements android.hardware.hdmi.HdmiRecordSources.DigitalServiceIdentification {
        public DvbData(int p0, int p1, int p2) {}
        public int toByteArray(byte[] p0, int p1) { return 0; }
    }

    @android.annotation.SystemApi
    public static final class ExternalPhysicalAddress extends android.hardware.hdmi.HdmiRecordSources.RecordSource {
        static final int EXTRA_DATA_SIZE = 2;
        ExternalPhysicalAddress() { super(0, 0); }
        int extraParamToByteArray(byte[] p0, int p1) { return 0; }
    }

    @android.annotation.SystemApi
    public static final class ExternalPlugData extends android.hardware.hdmi.HdmiRecordSources.RecordSource {
        static final int EXTRA_DATA_SIZE = 1;
        ExternalPlugData() { super(0, 0); }
        int extraParamToByteArray(byte[] p0, int p1) { return 0; }
    }

    @android.annotation.SystemApi
    public static final class OwnSource extends android.hardware.hdmi.HdmiRecordSources.RecordSource {
        OwnSource() { super(0, 0); }
        int extraParamToByteArray(byte[] p0, int p1) { return 0; }
    }

    @android.annotation.SystemApi
    public static abstract class RecordSource {
        final int mSourceType = 0;
        final int mExtraDataSize = 0;
        RecordSource(int p0, int p1) {}
        abstract int extraParamToByteArray(byte[] p0, int p1);
        final int getDataSize(boolean p0) { return 0; }
        final int toByteArray(boolean p0, byte[] p1, int p2) { return 0; }
    }
}
