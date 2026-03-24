package android.hardware.location;

@android.annotation.SystemApi
public class ContextHubInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.location.ContextHubInfo> CREATOR = null;
    public ContextHubInfo() {}
    public ContextHubInfo(android.hardware.contexthub.V1_0.ContextHub p0) {}
    public ContextHubInfo(android.hardware.contexthub.ContextHubInfo p0) {}
    public int getMaxPacketLengthBytes() { return 0; }
    public boolean supportsReliableMessages() { return false; }
    public int getId() { return 0; }
    public java.lang.String getName() { return null; }
    public java.lang.String getVendor() { return null; }
    public java.lang.String getToolchain() { return null; }
    public int getPlatformVersion() { return 0; }
    public int getStaticSwVersion() { return 0; }
    public int getToolchainVersion() { return 0; }
    public float getPeakMips() { return 0.0f; }
    public float getStoppedPowerDrawMw() { return 0.0f; }
    public float getSleepPowerDrawMw() { return 0.0f; }
    public float getPeakPowerDrawMw() { return 0.0f; }
    public int[] getSupportedSensors() { return null; }
    public android.hardware.location.MemoryRegion[] getMemoryRegions() { return null; }
    public long getChrePlatformId() { return 0L; }
    public byte getChreApiMajorVersion() { return 0; }
    public byte getChreApiMinorVersion() { return 0; }
    public short getChrePatchVersion() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public void dump(android.util.proto.ProtoOutputStream p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
