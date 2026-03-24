package android.hardware.power;

public class GpuHeadroomParams implements android.os.Parcelable {
    public byte calculationType;
    public int calculationWindowMillis;
    public static final android.os.Parcelable.Creator<android.hardware.power.GpuHeadroomParams> CREATOR = null;
    public GpuHeadroomParams() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }

    public static @interface CalculationType {
        public static final byte MIN = 0;
        public static final byte AVERAGE = 1;
    }
}
