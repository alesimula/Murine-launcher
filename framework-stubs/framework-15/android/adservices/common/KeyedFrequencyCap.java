package android.adservices.common;

public final class KeyedFrequencyCap implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.adservices.common.KeyedFrequencyCap> CREATOR = null;
    KeyedFrequencyCap() {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public int getAdCounterKey() { return 0; }
    @android.annotation.NonNull
    public java.time.Duration getInterval() { return null; }
    public int getMaxCount() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(int p0, int p1, java.time.Duration p2) {}
        @android.annotation.NonNull
        public android.adservices.common.KeyedFrequencyCap build() { return null; }
        @android.annotation.NonNull
        public android.adservices.common.KeyedFrequencyCap.Builder setAdCounterKey(int p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.KeyedFrequencyCap.Builder setInterval(java.time.Duration p0) { return null; }
        @android.annotation.NonNull
        public android.adservices.common.KeyedFrequencyCap.Builder setMaxCount(int p0) { return null; }
    }
}
