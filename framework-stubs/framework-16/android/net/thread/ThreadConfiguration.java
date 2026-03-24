package android.net.thread;

@android.annotation.FlaggedApi("com.android.net.thread.flags.configuration_enabled")
public final class ThreadConfiguration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.thread.ThreadConfiguration> CREATOR = null;
    ThreadConfiguration() {}
    public int describeContents() { return 0; }
    public boolean isNat64Enabled() { return false; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("com.android.net.thread.flags.set_nat64_configuration_enabled")
    public static final class Builder {
        @android.annotation.FlaggedApi("com.android.net.thread.flags.set_nat64_configuration_enabled")
        public Builder() {}
        @android.annotation.FlaggedApi("com.android.net.thread.flags.set_nat64_configuration_enabled")
        public Builder(android.net.thread.ThreadConfiguration p0) {}
        @android.annotation.FlaggedApi("com.android.net.thread.flags.set_nat64_configuration_enabled")
        @android.annotation.NonNull
        public android.net.thread.ThreadConfiguration build() { return null; }
        @android.annotation.FlaggedApi("com.android.net.thread.flags.set_nat64_configuration_enabled")
        @android.annotation.NonNull
        public android.net.thread.ThreadConfiguration.Builder setNat64Enabled(boolean p0) { return null; }
    }
}
