package android.location;

public class Address implements android.os.Parcelable {
    private java.util.Locale mLocale;
    private java.lang.String mFeatureName;
    private java.util.HashMap<java.lang.Integer, java.lang.String> mAddressLines;
    private int mMaxAddressLineIndex;
    private java.lang.String mAdminArea;
    private java.lang.String mSubAdminArea;
    private java.lang.String mLocality;
    private java.lang.String mSubLocality;
    private java.lang.String mThoroughfare;
    private java.lang.String mSubThoroughfare;
    private java.lang.String mPremises;
    private java.lang.String mPostalCode;
    private java.lang.String mCountryCode;
    private java.lang.String mCountryName;
    private double mLatitude;
    private double mLongitude;
    private boolean mHasLatitude;
    private boolean mHasLongitude;
    private java.lang.String mPhone;
    private java.lang.String mUrl;
    private android.os.Bundle mExtras;
    public static final android.os.Parcelable.Creator<android.location.Address> CREATOR = null;
    public Address(java.util.Locale p0) {}
    public java.util.Locale getLocale() { return null; }
    public int getMaxAddressLineIndex() { return 0; }
    public java.lang.String getAddressLine(int p0) { return null; }
    public void setAddressLine(int p0, java.lang.String p1) {}
    public java.lang.String getFeatureName() { return null; }
    public void setFeatureName(java.lang.String p0) {}
    public java.lang.String getAdminArea() { return null; }
    public void setAdminArea(java.lang.String p0) {}
    public java.lang.String getSubAdminArea() { return null; }
    public void setSubAdminArea(java.lang.String p0) {}
    public java.lang.String getLocality() { return null; }
    public void setLocality(java.lang.String p0) {}
    public java.lang.String getSubLocality() { return null; }
    public void setSubLocality(java.lang.String p0) {}
    public java.lang.String getThoroughfare() { return null; }
    public void setThoroughfare(java.lang.String p0) {}
    public java.lang.String getSubThoroughfare() { return null; }
    public void setSubThoroughfare(java.lang.String p0) {}
    public java.lang.String getPremises() { return null; }
    public void setPremises(java.lang.String p0) {}
    public java.lang.String getPostalCode() { return null; }
    public void setPostalCode(java.lang.String p0) {}
    public java.lang.String getCountryCode() { return null; }
    public void setCountryCode(java.lang.String p0) {}
    public java.lang.String getCountryName() { return null; }
    public void setCountryName(java.lang.String p0) {}
    public boolean hasLatitude() { return false; }
    public double getLatitude() { return 0.0; }
    public void setLatitude(double p0) {}
    public void clearLatitude() {}
    public boolean hasLongitude() { return false; }
    public double getLongitude() { return 0.0; }
    public void setLongitude(double p0) {}
    public void clearLongitude() {}
    public java.lang.String getPhone() { return null; }
    public void setPhone(java.lang.String p0) {}
    public java.lang.String getUrl() { return null; }
    public void setUrl(java.lang.String p0) {}
    public android.os.Bundle getExtras() { return null; }
    public void setExtras(android.os.Bundle p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}
