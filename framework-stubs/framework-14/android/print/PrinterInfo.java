package android.print;

public final class PrinterInfo implements android.os.Parcelable {
    public static final int STATUS_IDLE = 1;
    public static final int STATUS_BUSY = 2;
    public static final int STATUS_UNAVAILABLE = 3;
    public static final android.os.Parcelable.Creator<android.print.PrinterInfo> CREATOR = null;
    public android.print.PrinterId getId() { return null; }
    public android.graphics.drawable.Drawable loadIcon(android.content.Context p0) { return null; }
    public boolean getHasCustomPrinterIcon() { return false; }
    public java.lang.String getName() { return null; }
    public int getStatus() { return 0; }
    public java.lang.String getDescription() { return null; }
    public android.app.PendingIntent getInfoIntent() { return null; }
    public android.print.PrinterCapabilitiesInfo getCapabilities() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equalsIgnoringStatus(android.print.PrinterInfo p0) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder(android.print.PrinterId p0, java.lang.String p1, int p2) {}
        public Builder(android.print.PrinterInfo p0) {}
        public android.print.PrinterInfo.Builder setStatus(int p0) { return null; }
        public android.print.PrinterInfo.Builder setIconResourceId(int p0) { return null; }
        public android.print.PrinterInfo.Builder setHasCustomPrinterIcon(boolean p0) { return null; }
        public android.print.PrinterInfo.Builder setName(java.lang.String p0) { return null; }
        public android.print.PrinterInfo.Builder setDescription(java.lang.String p0) { return null; }
        public android.print.PrinterInfo.Builder setInfoIntent(android.app.PendingIntent p0) { return null; }
        public android.print.PrinterInfo.Builder setCapabilities(android.print.PrinterCapabilitiesInfo p0) { return null; }
        public android.print.PrinterInfo build() { return null; }
        public android.print.PrinterInfo.Builder incCustomPrinterIconGen() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Status {
    }
}
