package android.hardware.radio.ims;

public class ImsService implements android.os.Parcelable {
    public int serviceType;
    public int roamingType;
    public static final android.os.Parcelable.Creator<android.hardware.radio.ims.ImsService> CREATOR = null;
    public ImsService() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static @interface RoamingType {
        public static final int ANY = 0;
        public static final int HOME_ONLY = 1;
    }
}
