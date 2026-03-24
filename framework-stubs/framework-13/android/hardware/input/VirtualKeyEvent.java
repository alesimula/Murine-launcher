package android.hardware.input;

@android.annotation.SystemApi
public final class VirtualKeyEvent implements android.os.Parcelable {
    public static final int ACTION_UNKNOWN = -1;
    public static final int ACTION_DOWN = 0;
    public static final int ACTION_UP = 1;
    public static final android.os.Parcelable.Creator<android.hardware.input.VirtualKeyEvent> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public int getKeyCode() { return 0; }
    public int getAction() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Action {
    }

    public static final class Builder {
        public Builder() {}
        public android.hardware.input.VirtualKeyEvent build() { return null; }
        public android.hardware.input.VirtualKeyEvent.Builder setKeyCode(int p0) { return null; }
        public android.hardware.input.VirtualKeyEvent.Builder setAction(int p0) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SupportedKeycode {
    }
}
