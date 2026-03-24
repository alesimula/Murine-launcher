package com.android.internal.alsa;

public class AlsaDevicesParser {
    protected static final boolean DEBUG = false;
    public static final int SCANSTATUS_NOTSCANNED = -1;
    public static final int SCANSTATUS_SUCCESS = 0;
    public static final int SCANSTATUS_FAIL = 1;
    public static final int SCANSTATUS_EMPTY = 2;
    public AlsaDevicesParser() {}
    public int getDefaultDeviceNum(int p0) { return 0; }
    public boolean hasPlaybackDevices(int p0) { return false; }
    public boolean hasCaptureDevices(int p0) { return false; }
    public boolean hasMIDIDevices(int p0) { return false; }
    public int scan() { return 0; }
    public int getScanStatus() { return 0; }

    public class AlsaDeviceRecord {
        public static final int kDeviceType_Unknown = -1;
        public static final int kDeviceType_Audio = 0;
        public static final int kDeviceType_Control = 1;
        public static final int kDeviceType_MIDI = 2;
        public static final int kDeviceDir_Unknown = -1;
        public static final int kDeviceDir_Capture = 0;
        public static final int kDeviceDir_Playback = 1;
        int mCardNum;
        int mDeviceNum;
        int mDeviceType;
        int mDeviceDir;
        public AlsaDeviceRecord(com.android.internal.alsa.AlsaDevicesParser p0) {}
        public boolean parse(java.lang.String p0) { return false; }
        public java.lang.String textFormat() { return null; }
    }
}
