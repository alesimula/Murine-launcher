package android.hardware.radio.sim;

public class CarrierRestrictions implements android.os.Parcelable {
    public android.hardware.radio.sim.Carrier[] allowedCarriers;
    public android.hardware.radio.sim.Carrier[] excludedCarriers;
    public boolean allowedCarriersPrioritized;
    public int status;
    public static final android.os.Parcelable.Creator<android.hardware.radio.sim.CarrierRestrictions> CREATOR = null;
    public CarrierRestrictions() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    public static @interface CarrierRestrictionStatus {
        public static final int UNKNOWN = 0;
        public static final int NOT_RESTRICTED = 1;
        public static final int RESTRICTED = 2;
    }
}
