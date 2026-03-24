package com.android.internal.alsa;

public class AlsaDevicesParser {
    private static final java.lang.String TAG = "AlsaDevicesParser";
    protected static final boolean DEBUG = false;
    private static final java.lang.String kDevicesFilePath = "/proc/asound/devices";
    private static final int kIndex_CardDeviceField = 5;
    private static final int kStartIndex_CardNum = 6;
    private static final int kEndIndex_CardNum = 8;
    private static final int kStartIndex_DeviceNum = 9;
    private static final int kEndIndex_DeviceNum = 11;
    private static final int kStartIndex_Type = 14;
    private static com.android.internal.alsa.LineTokenizer mTokenizer;
    private boolean mHasCaptureDevices;
    private boolean mHasPlaybackDevices;
    private boolean mHasMIDIDevices;
    public static final int SCANSTATUS_NOTSCANNED = -1;
    public static final int SCANSTATUS_SUCCESS = 0;
    public static final int SCANSTATUS_FAIL = 1;
    public static final int SCANSTATUS_EMPTY = 2;
    private int mScanStatus;
    private final java.util.ArrayList<com.android.internal.alsa.AlsaDevicesParser.AlsaDeviceRecord> mDeviceRecords = null;
    public AlsaDevicesParser() {}
    public int getDefaultDeviceNum(int p0) { return 0; }
    public boolean hasPlaybackDevices(int p0) { return false; }
    public boolean hasCaptureDevices(int p0) { return false; }
    public boolean hasMIDIDevices(int p0) { return false; }
    private boolean isLineDeviceRecord(java.lang.String p0) { return false; }
    public int scan() { return 0; }
    public int getScanStatus() { return 0; }
    private void Log(java.lang.String p0) {}

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
