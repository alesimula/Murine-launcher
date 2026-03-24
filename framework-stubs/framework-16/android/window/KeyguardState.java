package android.window;

public final class KeyguardState implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.KeyguardState> CREATOR = null;
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean getKeyguardShowing() { return false; }
    public boolean getAodShowing() { return false; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.window.KeyguardState.Builder setKeyguardShowing(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.window.KeyguardState.Builder setAodShowing(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.window.KeyguardState build() { return null; }
    }
}
