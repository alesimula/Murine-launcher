package android.companion.virtual;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.companion.virtualdevice.flags.activity_control_api")
public final class ActivityPolicyExemption implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.ActivityPolicyExemption> CREATOR = null;
    @android.annotation.Nullable
    public android.content.ComponentName getComponentName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getPackageName() { return null; }
    public int getDisplayId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.activity_control_api")
    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.companion.virtual.ActivityPolicyExemption.Builder setComponentName(android.content.ComponentName p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ActivityPolicyExemption.Builder setPackageName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ActivityPolicyExemption.Builder setDisplayId(int p0) { return null; }
        @android.annotation.NonNull
        public android.companion.virtual.ActivityPolicyExemption build() { return null; }
    }
}
