package android.hardware.radio.network;

public class NrVopsInfo implements android.os.Parcelable {
    public byte vopsSupported;
    public byte emcSupported;
    public byte emfSupported;
    public static final android.os.Parcelable.Creator<android.hardware.radio.network.NrVopsInfo> CREATOR = null;
    public static final byte EMC_INDICATOR_NOT_SUPPORTED = 0;
    public static final byte EMC_INDICATOR_NR_CONNECTED_TO_5GCN = 1;
    public static final byte EMC_INDICATOR_EUTRA_CONNECTED_TO_5GCN = 2;
    public static final byte EMC_INDICATOR_BOTH_NR_EUTRA_CONNECTED_TO_5GCN = 3;
    public static final byte EMF_INDICATOR_NOT_SUPPORTED = 0;
    public static final byte EMF_INDICATOR_NR_CONNECTED_TO_5GCN = 1;
    public static final byte EMF_INDICATOR_EUTRA_CONNECTED_TO_5GCN = 2;
    public static final byte EMF_INDICATOR_BOTH_NR_EUTRA_CONNECTED_TO_5GCN = 3;
    public static final byte VOPS_INDICATOR_VOPS_NOT_SUPPORTED = 0;
    public static final byte VOPS_INDICATOR_VOPS_OVER_3GPP = 1;
    public static final byte VOPS_INDICATOR_VOPS_OVER_NON_3GPP = 2;
    public NrVopsInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
