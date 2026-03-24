package android.app;

public final class PictureInPictureUiState implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.PictureInPictureUiState> CREATOR = null;
    PictureInPictureUiState(android.os.Parcel p0) {}
    public PictureInPictureUiState(boolean p0) {}
    public boolean isStashed() { return false; }
    @android.annotation.FlaggedApi("android.app.enable_pip_ui_state_callback_on_entering")
    public boolean isTransitioningToPip() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("android.app.enable_pip_ui_state_callback_on_entering")
    public static final class Builder {
        public Builder() {}
        public android.app.PictureInPictureUiState.Builder setStashed(boolean p0) { return null; }
        public android.app.PictureInPictureUiState.Builder setTransitioningToPip(boolean p0) { return null; }
        public android.app.PictureInPictureUiState build() { return null; }
    }
}
