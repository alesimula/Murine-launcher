package android.uwb;

public final class UwbActivityEnergyInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.uwb.UwbActivityEnergyInfo> CREATOR = null;
    UwbActivityEnergyInfo() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public long getTimeSinceBootMillis() { return 0L; }
    public int getStackState() { return 0; }
    public long getControllerTxDurationMillis() { return 0L; }
    public long getControllerRxDurationMillis() { return 0L; }
    public long getControllerIdleDurationMillis() { return 0L; }
    public long getControllerWakeCount() { return 0L; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.uwb.UwbActivityEnergyInfo.Builder setTimeSinceBootMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.UwbActivityEnergyInfo.Builder setStackState(int p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.UwbActivityEnergyInfo.Builder setControllerTxDurationMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.UwbActivityEnergyInfo.Builder setControllerRxDurationMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.UwbActivityEnergyInfo.Builder setControllerIdleDurationMillis(long p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.UwbActivityEnergyInfo.Builder setControllerWakeCount(long p0) { return null; }
        @android.annotation.NonNull
        public android.uwb.UwbActivityEnergyInfo build() { return null; }
    }
}
