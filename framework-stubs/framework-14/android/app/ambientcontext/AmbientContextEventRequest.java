package android.app.ambientcontext;

@android.annotation.SystemApi
public final class AmbientContextEventRequest implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.ambientcontext.AmbientContextEventRequest> CREATOR = null;
    public java.util.Set<java.lang.Integer> getEventTypes() { return null; }
    public android.os.PersistableBundle getOptions() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.app.ambientcontext.AmbientContextEventRequest.Builder addEventType(int p0) { return null; }
        public android.app.ambientcontext.AmbientContextEventRequest.Builder setOptions(android.os.PersistableBundle p0) { return null; }
        public android.app.ambientcontext.AmbientContextEventRequest build() { return null; }
    }
}
