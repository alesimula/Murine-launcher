package android.gui;

public class BoxShadowSettings implements android.os.Parcelable {
    public android.gui.BoxShadowSettings.BoxShadowParams[] boxShadows;
    public static final android.os.Parcelable.Creator<android.gui.BoxShadowSettings> CREATOR = null;
    public BoxShadowSettings() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static class BoxShadowParams implements android.os.Parcelable {
        public float blurRadius;
        public float spreadRadius;
        public int color;
        public float offsetX;
        public float offsetY;
        public static final android.os.Parcelable.Creator<android.gui.BoxShadowSettings.BoxShadowParams> CREATOR = null;
        public BoxShadowParams() {}
        public final void writeToParcel(android.os.Parcel p0, int p1) {}
        public final void readFromParcel(android.os.Parcel p0) {}
        public int describeContents() { return 0; }
    }
}
