package android.media.audio.common;

public final class AudioHalCapCriterionV2 implements android.os.Parcelable {
    public static final int availableInputDevices = 0;
    public static final int availableOutputDevices = 1;
    public static final int availableInputDevicesAddresses = 2;
    public static final int availableOutputDevicesAddresses = 3;
    public static final int telephonyMode = 4;
    public static final int forceConfigForUse = 5;
    public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapCriterionV2> CREATOR = null;
    public AudioHalCapCriterionV2() {}
    public int getTag() { return 0; }
    public static android.media.audio.common.AudioHalCapCriterionV2 availableInputDevices(android.media.audio.common.AudioHalCapCriterionV2.AvailableDevices p0) { return null; }
    public android.media.audio.common.AudioHalCapCriterionV2.AvailableDevices getAvailableInputDevices() { return null; }
    public void setAvailableInputDevices(android.media.audio.common.AudioHalCapCriterionV2.AvailableDevices p0) {}
    public static android.media.audio.common.AudioHalCapCriterionV2 availableOutputDevices(android.media.audio.common.AudioHalCapCriterionV2.AvailableDevices p0) { return null; }
    public android.media.audio.common.AudioHalCapCriterionV2.AvailableDevices getAvailableOutputDevices() { return null; }
    public void setAvailableOutputDevices(android.media.audio.common.AudioHalCapCriterionV2.AvailableDevices p0) {}
    public static android.media.audio.common.AudioHalCapCriterionV2 availableInputDevicesAddresses(android.media.audio.common.AudioHalCapCriterionV2.AvailableDevicesAddresses p0) { return null; }
    public android.media.audio.common.AudioHalCapCriterionV2.AvailableDevicesAddresses getAvailableInputDevicesAddresses() { return null; }
    public void setAvailableInputDevicesAddresses(android.media.audio.common.AudioHalCapCriterionV2.AvailableDevicesAddresses p0) {}
    public static android.media.audio.common.AudioHalCapCriterionV2 availableOutputDevicesAddresses(android.media.audio.common.AudioHalCapCriterionV2.AvailableDevicesAddresses p0) { return null; }
    public android.media.audio.common.AudioHalCapCriterionV2.AvailableDevicesAddresses getAvailableOutputDevicesAddresses() { return null; }
    public void setAvailableOutputDevicesAddresses(android.media.audio.common.AudioHalCapCriterionV2.AvailableDevicesAddresses p0) {}
    public static android.media.audio.common.AudioHalCapCriterionV2 telephonyMode(android.media.audio.common.AudioHalCapCriterionV2.TelephonyMode p0) { return null; }
    public android.media.audio.common.AudioHalCapCriterionV2.TelephonyMode getTelephonyMode() { return null; }
    public void setTelephonyMode(android.media.audio.common.AudioHalCapCriterionV2.TelephonyMode p0) {}
    public static android.media.audio.common.AudioHalCapCriterionV2 forceConfigForUse(android.media.audio.common.AudioHalCapCriterionV2.ForceConfigForUse p0) { return null; }
    public android.media.audio.common.AudioHalCapCriterionV2.ForceConfigForUse getForceConfigForUse() { return null; }
    public void setForceConfigForUse(android.media.audio.common.AudioHalCapCriterionV2.ForceConfigForUse p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class AvailableDevices implements android.os.Parcelable {
        public android.media.audio.common.AudioDeviceDescription[] values;
        public byte logic;
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapCriterionV2.AvailableDevices> CREATOR = null;
        public AvailableDevices() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class AvailableDevicesAddresses implements android.os.Parcelable {
        public android.media.audio.common.AudioDeviceAddress[] values;
        public byte logic;
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapCriterionV2.AvailableDevicesAddresses> CREATOR = null;
        public AvailableDevicesAddresses() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static class ForceConfigForUse implements android.os.Parcelable {
        public android.media.audio.common.AudioPolicyForceUse[] values;
        public android.media.audio.common.AudioPolicyForceUse defaultValue;
        public byte logic;
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapCriterionV2.ForceConfigForUse> CREATOR = null;
        public ForceConfigForUse() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }

    public static @interface LogicalDisjunction {
        public static final byte EXCLUSIVE = 0;
        public static final byte INCLUSIVE = 1;
    }

    public static @interface Tag {
        public static final int availableInputDevices = 0;
        public static final int availableOutputDevices = 1;
        public static final int availableInputDevicesAddresses = 2;
        public static final int availableOutputDevicesAddresses = 3;
        public static final int telephonyMode = 4;
        public static final int forceConfigForUse = 5;
    }

    public static class TelephonyMode implements android.os.Parcelable {
        public int[] values;
        public int defaultValue;
        public byte logic;
        public static final android.os.Parcelable.Creator<android.media.audio.common.AudioHalCapCriterionV2.TelephonyMode> CREATOR = null;
        public TelephonyMode() {}
        public final int getStability() { return 0; }
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }
}
