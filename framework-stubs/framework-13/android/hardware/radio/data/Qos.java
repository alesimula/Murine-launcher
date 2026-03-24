package android.hardware.radio.data;

public final class Qos implements android.os.Parcelable {
    public static final int noinit = 0;
    public static final int eps = 1;
    public static final int nr = 2;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.Qos> CREATOR = null;
    public Qos() {}
    public int getTag() { return 0; }
    public static android.hardware.radio.data.Qos noinit(boolean p0) { return null; }
    public boolean getNoinit() { return false; }
    public void setNoinit(boolean p0) {}
    public static android.hardware.radio.data.Qos eps(android.hardware.radio.data.EpsQos p0) { return null; }
    public android.hardware.radio.data.EpsQos getEps() { return null; }
    public void setEps(android.hardware.radio.data.EpsQos p0) {}
    public static android.hardware.radio.data.Qos nr(android.hardware.radio.data.NrQos p0) { return null; }
    public android.hardware.radio.data.NrQos getNr() { return null; }
    public void setNr(android.hardware.radio.data.NrQos p0) {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    public static @interface Tag {
        public static final int noinit = 0;
        public static final int eps = 1;
        public static final int nr = 2;
    }
}
