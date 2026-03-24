package android.os;

@android.annotation.SystemApi
public final class StatsDimensionsValue implements android.os.Parcelable {
    private static final java.lang.String TAG = "StatsDimensionsValue";
    public static final int STRING_VALUE_TYPE = 2;
    public static final int INT_VALUE_TYPE = 3;
    public static final int LONG_VALUE_TYPE = 4;
    public static final int BOOLEAN_VALUE_TYPE = 5;
    public static final int FLOAT_VALUE_TYPE = 6;
    public static final int TUPLE_VALUE_TYPE = 7;
    private final int mField = 0;
    private final int mValueType = 0;
    private final java.lang.Object mValue = null;
    public static final android.os.Parcelable.Creator<android.os.StatsDimensionsValue> CREATOR = null;
    public StatsDimensionsValue(android.os.Parcel p0) {}
    public int getField() { return 0; }
    public java.lang.String getStringValue() { return null; }
    public int getIntValue() { return 0; }
    public long getLongValue() { return 0L; }
    public boolean getBooleanValue() { return false; }
    public float getFloatValue() { return 0.0f; }
    public java.util.List<android.os.StatsDimensionsValue> getTupleValueList() { return null; }
    public int getValueType() { return 0; }
    public boolean isValueType(int p0) { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static boolean writeValueToParcel(int p0, java.lang.Object p1, android.os.Parcel p2, int p3) { return false; }
    private static java.lang.Object readValueFromParcel(int p0, android.os.Parcel p1) { return null; }
}
