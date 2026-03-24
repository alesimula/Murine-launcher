package android.media.audio.common;

public final class AudioHalCapParameter implements android.os.Parcelable {
    public static final int selectedStrategyDevice = 0;
    public static final int selectedInputSourceDevice = 1;
    public static final int strategyDeviceAddress = 2;
    public static final int streamVolumeProfile = 3;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter> CREATOR = null;
    public AudioHalCapParameter() {}
    public int getTag() { return 0; }
    public static android.media.audio.common.AudioHalCapParameter selectedStrategyDevice(android.media.audio.common.AudioHalCapParameter.StrategyDevice p0) { return null; }
    public android.media.audio.common.AudioHalCapParameter.StrategyDevice getSelectedStrategyDevice() { return null; }
    public void setSelectedStrategyDevice(android.media.audio.common.AudioHalCapParameter.StrategyDevice p0) {}
    public static android.media.audio.common.AudioHalCapParameter selectedInputSourceDevice(android.media.audio.common.AudioHalCapParameter.InputSourceDevice p0) { return null; }
    public android.media.audio.common.AudioHalCapParameter.InputSourceDevice getSelectedInputSourceDevice() { return null; }
    public void setSelectedInputSourceDevice(android.media.audio.common.AudioHalCapParameter.InputSourceDevice p0) {}
    public static android.media.audio.common.AudioHalCapParameter strategyDeviceAddress(android.media.audio.common.AudioHalCapParameter.StrategyDeviceAddress p0) { return null; }
    public android.media.audio.common.AudioHalCapParameter.StrategyDeviceAddress getStrategyDeviceAddress() { return null; }
    public void setStrategyDeviceAddress(android.media.audio.common.AudioHalCapParameter.StrategyDeviceAddress p0) {}
    public static android.media.audio.common.AudioHalCapParameter streamVolumeProfile(android.media.audio.common.AudioHalCapParameter.StreamVolumeProfile p0) { return null; }
    public android.media.audio.common.AudioHalCapParameter.StreamVolumeProfile getStreamVolumeProfile() { return null; }
    public void setStreamVolumeProfile(android.media.audio.common.AudioHalCapParameter.StreamVolumeProfile p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class InputSourceDevice implements android.os.Parcelable {
        public android.media.audio.common.AudioDeviceDescription device;
        public int inputSource;
        public boolean isSelected;
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter.InputSourceDevice> CREATOR = null;
        public InputSourceDevice() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class StrategyDevice implements android.os.Parcelable {
        public android.media.audio.common.AudioDeviceDescription device;
        public int id;
        public boolean isSelected;
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter.StrategyDevice> CREATOR = null;
        public StrategyDevice() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class StrategyDeviceAddress implements android.os.Parcelable {
        public android.media.audio.common.AudioDeviceAddress deviceAddress;
        public int id;
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter.StrategyDeviceAddress> CREATOR = null;
        public StrategyDeviceAddress() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class StreamVolumeProfile implements android.os.Parcelable {
        public int stream;
        public int profile;
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapParameter.StreamVolumeProfile> CREATOR = null;
        public StreamVolumeProfile() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static @interface Tag {
        public static final int selectedStrategyDevice = 0;
        public static final int selectedInputSourceDevice = 1;
        public static final int strategyDeviceAddress = 2;
        public static final int streamVolumeProfile = 3;
    }
}
