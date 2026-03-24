package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualMouseRelativeEvent implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualMouseRelativeEvent> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public float getRelativeX() { return 0.0f; }
    public float getRelativeY() { return 0.0f; }

    public static final class Builder {
        public Builder() {}
        public android.hardware.input.VirtualMouseRelativeEvent build() { return null; }
        public android.hardware.input.VirtualMouseRelativeEvent.Builder setRelativeX(float p0) { return null; }
        public android.hardware.input.VirtualMouseRelativeEvent.Builder setRelativeY(float p0) { return null; }
    }
}
