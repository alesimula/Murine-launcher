package android.service.chooser;

public final class ChooserAction implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.service.chooser.ChooserAction> CREATOR = null;
    @android.annotation.NonNull
    public java.lang.CharSequence getLabel() { return null; }
    @android.annotation.NonNull
    public android.graphics.drawable.Icon getIcon() { return null; }
    @android.annotation.NonNull
    public android.app.PendingIntent getAction() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(android.graphics.drawable.Icon p0, java.lang.CharSequence p1, android.app.PendingIntent p2) {}
        @android.annotation.NonNull
        public android.service.chooser.ChooserAction build() { return null; }
    }
}
