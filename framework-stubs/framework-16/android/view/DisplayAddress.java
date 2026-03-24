package android.view;

public abstract class DisplayAddress implements android.os.Parcelable {
    public DisplayAddress() {}
    @android.annotation.NonNull
    public static android.view.DisplayAddress.Physical fromPhysicalDisplayId(long p0) { return null; }
    @android.annotation.NonNull
    public static android.view.DisplayAddress.Physical fromPortAndModel(int p0, java.lang.Long p1) { return null; }
    @android.annotation.NonNull
    public static android.view.DisplayAddress.Network fromMacAddress(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }

    public static final class Network extends android.view.DisplayAddress {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.DisplayAddress.Network> CREATOR = null;
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class Physical extends android.view.DisplayAddress {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.DisplayAddress.Physical> CREATOR = null;
        public long getPhysicalDisplayId() { return 0L; }
        public int getPort() { return 0; }
        @android.annotation.Nullable
        public java.lang.Long getModel() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public static boolean isPortMatch(android.view.DisplayAddress p0, android.view.DisplayAddress p1) { return false; }
    }
}
