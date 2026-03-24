package android.app.ondeviceintelligence;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.app.ondeviceintelligence.flags.enable_on_device_intelligence")
public final class Feature implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.ondeviceintelligence.Feature> CREATOR = null;
    Feature(int p0, java.lang.String p1, java.lang.String p2, int p3, int p4, android.os.PersistableBundle p5) {}
    public int getId() { return 0; }
    @android.annotation.Nullable
    public java.lang.String getName() { return null; }
    @android.annotation.Nullable
    public java.lang.String getModelName() { return null; }
    public int getType() { return 0; }
    public int getVariant() { return 0; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getFeatureParams() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    Feature(android.os.Parcel p0) {}

    public static final class Builder {
        public Builder(int p0) {}
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.Feature.Builder setName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.Feature.Builder setModelName(java.lang.String p0) { return null; }
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.Feature.Builder setType(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.Feature.Builder setVariant(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.Feature.Builder setFeatureParams(android.os.PersistableBundle p0) { return null; }
        @android.annotation.NonNull
        public android.app.ondeviceintelligence.Feature build() { return null; }
    }
}
