package android.app.appsearch.observer;

public final class ObserverSpec implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.observer.ObserverSpec> CREATOR = null;
    ObserverSpec() {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.String> getFilterSchemas() { return null; }
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.app.appsearch.observer.ObserverSpec.Builder addFilterSchemas(java.lang.String... p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.observer.ObserverSpec.Builder addFilterSchemas(java.util.Collection<java.lang.String> p0) { return null; }
        @android.annotation.NonNull
        public android.app.appsearch.observer.ObserverSpec build() { return null; }
    }
}
