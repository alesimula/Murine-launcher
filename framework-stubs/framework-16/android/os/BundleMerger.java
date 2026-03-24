package android.os;

public class BundleMerger implements android.os.Parcelable {
    public static final int STRATEGY_REJECT = 0;
    public static final int STRATEGY_FIRST = 1;
    public static final int STRATEGY_LAST = 2;
    public static final int STRATEGY_COMPARABLE_MIN = 3;
    public static final int STRATEGY_COMPARABLE_MAX = 4;
    public static final int STRATEGY_NUMBER_ADD = 10;
    public static final int STRATEGY_NUMBER_INCREMENT_FIRST = 20;
    public static final int STRATEGY_NUMBER_INCREMENT_FIRST_AND_ADD = 25;
    public static final int STRATEGY_BOOLEAN_AND = 30;
    public static final int STRATEGY_BOOLEAN_OR = 40;
    public static final int STRATEGY_ARRAY_APPEND = 50;
    public static final int STRATEGY_ARRAY_UNION = 55;
    public static final int STRATEGY_ARRAY_LIST_APPEND = 60;
    public static final int STRATEGY_STRING_APPEND = 70;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.BundleMerger> CREATOR = null;
    public BundleMerger() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public void setDefaultMergeStrategy(int p0) {}
    public void setMergeStrategy(java.lang.String p0, int p1) {}
    public int getMergeStrategy(java.lang.String p0) { return 0; }
    public java.util.function.BinaryOperator<android.os.Bundle> asBinaryOperator() { return null; }
    @android.annotation.Nullable
    public android.os.Bundle merge(android.os.Bundle p0, android.os.Bundle p1) { return null; }
    @android.annotation.Nullable
    public static java.lang.Object merge(int p0, java.lang.Object p1, java.lang.Object p2) { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Strategy {
    }
}
