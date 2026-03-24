package android.net.lowpan;

public class LowpanProvision implements android.os.Parcelable {
    private android.net.lowpan.LowpanIdentity mIdentity;
    private android.net.lowpan.LowpanCredential mCredential;
    public static final android.os.Parcelable.Creator<android.net.lowpan.LowpanProvision> CREATOR = null;
    private LowpanProvision() {}
    public android.net.lowpan.LowpanIdentity getLowpanIdentity() { return null; }
    public android.net.lowpan.LowpanCredential getLowpanCredential() { return null; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class Builder {
        private final android.net.lowpan.LowpanProvision provision = null;
        public Builder() {}
        public android.net.lowpan.LowpanProvision.Builder setLowpanIdentity(android.net.lowpan.LowpanIdentity p0) { return null; }
        public android.net.lowpan.LowpanProvision.Builder setLowpanCredential(android.net.lowpan.LowpanCredential p0) { return null; }
        public android.net.lowpan.LowpanProvision build() { return null; }
    }
}
