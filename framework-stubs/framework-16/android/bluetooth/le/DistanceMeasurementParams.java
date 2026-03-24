package android.bluetooth.le;

public final class DistanceMeasurementParams implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.bluetooth.le.DistanceMeasurementParams> CREATOR = null;
    public static final int REPORT_FREQUENCY_HIGH = 2;
    public static final int REPORT_FREQUENCY_LOW = 0;
    public static final int REPORT_FREQUENCY_MEDIUM = 1;
    DistanceMeasurementParams() {}
    public int describeContents() { return 0; }
    @android.annotation.Nullable
    public android.bluetooth.le.ChannelSoundingParams getChannelSoundingParams() { return null; }
    public static int getDefaultDurationSeconds() { return 0; }
    @android.annotation.NonNull
    public android.bluetooth.BluetoothDevice getDevice() { return null; }
    public int getDurationSeconds() { return 0; }
    public int getFrequency() { return 0; }
    public static int getMaxDurationSeconds() { return 0; }
    public int getMethodId() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.bluetooth.BluetoothDevice p0) {}
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementParams build() { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementParams.Builder setChannelSoundingParams(android.bluetooth.le.ChannelSoundingParams p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementParams.Builder setDurationSeconds(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementParams.Builder setFrequency(int p0) { return null; }
        @android.annotation.NonNull
        public android.bluetooth.le.DistanceMeasurementParams.Builder setMethodId(int p0) { return null; }
    }
}
