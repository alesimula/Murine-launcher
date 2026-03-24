package android.content;

public class RestrictionEntry implements android.os.Parcelable {
    public static final int TYPE_NULL = 0;
    public static final int TYPE_BOOLEAN = 1;
    public static final int TYPE_CHOICE = 2;
    public static final int TYPE_CHOICE_LEVEL = 3;
    public static final int TYPE_MULTI_SELECT = 4;
    public static final int TYPE_INTEGER = 5;
    public static final int TYPE_STRING = 6;
    public static final int TYPE_BUNDLE = 7;
    public static final int TYPE_BUNDLE_ARRAY = 8;
    private int mType;
    private java.lang.String mKey;
    private java.lang.String mTitle;
    private java.lang.String mDescription;
    private java.lang.String[] mChoiceEntries;
    private java.lang.String[] mChoiceValues;
    private java.lang.String mCurrentValue;
    private java.lang.String[] mCurrentValues;
    private android.content.RestrictionEntry[] mRestrictions;
    public static final android.os.Parcelable.Creator<android.content.RestrictionEntry> CREATOR = null;
    public RestrictionEntry(int p0, java.lang.String p1) {}
    public RestrictionEntry(java.lang.String p0, java.lang.String p1) {}
    public RestrictionEntry(java.lang.String p0, boolean p1) {}
    public RestrictionEntry(java.lang.String p0, java.lang.String[] p1) {}
    public RestrictionEntry(java.lang.String p0, int p1) {}
    private RestrictionEntry(java.lang.String p0, android.content.RestrictionEntry[] p1, boolean p2) {}
    public static android.content.RestrictionEntry createBundleEntry(java.lang.String p0, android.content.RestrictionEntry[] p1) { return null; }
    public static android.content.RestrictionEntry createBundleArrayEntry(java.lang.String p0, android.content.RestrictionEntry[] p1) { return null; }
    public void setType(int p0) {}
    public int getType() { return 0; }
    public java.lang.String getSelectedString() { return null; }
    public java.lang.String[] getAllSelectedStrings() { return null; }
    public boolean getSelectedState() { return false; }
    public int getIntValue() { return 0; }
    public void setIntValue(int p0) {}
    public void setSelectedString(java.lang.String p0) {}
    public void setSelectedState(boolean p0) {}
    public void setAllSelectedStrings(java.lang.String[] p0) {}
    public void setChoiceValues(java.lang.String[] p0) {}
    public void setChoiceValues(android.content.Context p0, int p1) {}
    public android.content.RestrictionEntry[] getRestrictions() { return null; }
    public void setRestrictions(android.content.RestrictionEntry[] p0) {}
    public java.lang.String[] getChoiceValues() { return null; }
    public void setChoiceEntries(java.lang.String[] p0) {}
    public void setChoiceEntries(android.content.Context p0, int p1) {}
    public java.lang.String[] getChoiceEntries() { return null; }
    public java.lang.String getDescription() { return null; }
    public void setDescription(java.lang.String p0) {}
    public java.lang.String getKey() { return null; }
    public java.lang.String getTitle() { return null; }
    public void setTitle(java.lang.String p0) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public RestrictionEntry(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}
