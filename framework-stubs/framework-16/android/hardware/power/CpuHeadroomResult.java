package android.hardware.power;

public final class CpuHeadroomResult implements android.os.Parcelable {
    public static final int globalHeadroom = 0;
    public static final android.os.Parcelable.Creator<android.hardware.power.CpuHeadroomResult> CREATOR = null;
    public CpuHeadroomResult() {}
    public int getTag() { return 0; }
    public static android.hardware.power.CpuHeadroomResult globalHeadroom(float p0) { return null; }
    public float getGlobalHeadroom() { return 0.0f; }
    public void setGlobalHeadroom(float p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static @interface Tag {
        public static final int globalHeadroom = 0;
    }
}
