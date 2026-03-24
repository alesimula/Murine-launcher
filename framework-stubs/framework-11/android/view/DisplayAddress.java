package android.view;

public abstract class DisplayAddress implements android.os.Parcelable {
    public DisplayAddress() {}
    public static android.view.DisplayAddress.Physical fromPhysicalDisplayId(long p0) { return null; }
    public static android.view.DisplayAddress.Physical fromPortAndModel(byte p0, java.lang.Long p1) { return null; }
    public static android.view.DisplayAddress.Network fromMacAddress(java.lang.String p0) { return null; }
    public int describeContents() { return 0; }

    public static final class Network extends android.view.DisplayAddress {
        private final java.lang.String mMacAddress = null;
        public static final android.os.Parcelable.Creator<android.view.DisplayAddress.Network> CREATOR = null;
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private Network(java.lang.String p0) { super(); }
    }

    public static final class Physical extends android.view.DisplayAddress {
        private static final long UNKNOWN_MODEL = 0L;
        private static final int MODEL_SHIFT = 8;
        private final long mPhysicalDisplayId = 0L;
        public static final android.os.Parcelable.Creator<android.view.DisplayAddress.Physical> CREATOR = null;
        public long getPhysicalDisplayId() { return 0L; }
        public byte getPort() { return 0; }
        public java.lang.Long getModel() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        private Physical(long p0) { super(); }
        private Physical(byte p0, java.lang.Long p1) { super(); }
    }
}
