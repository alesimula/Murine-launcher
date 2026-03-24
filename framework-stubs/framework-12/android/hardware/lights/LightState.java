package android.hardware.lights;

public final class LightState implements android.os.Parcelable {
    private final int mColor = 0;
    private final int mPlayerId = 0;
    public static final android.os.Parcelable.Creator<android.hardware.lights.LightState> CREATOR = null;
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public LightState(int p0) {}
    public LightState(int p0, int p1) {}
    private LightState(android.os.Parcel p0) {}
    public int getColor() { return 0; }
    public int getPlayerId() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        private int mValue;
        private boolean mIsForPlayerId;
        public Builder() {}
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.hardware.lights.LightState.Builder setColor(int p0) { return null; }
        @android.annotation.SuppressLint("MissingGetterMatchingBuilder")
        public android.hardware.lights.LightState.Builder setPlayerId(int p0) { return null; }
        public android.hardware.lights.LightState build() { return null; }
    }
}
