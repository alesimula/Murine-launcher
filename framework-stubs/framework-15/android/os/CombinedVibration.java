package android.os;

public abstract class CombinedVibration implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.os.CombinedVibration> CREATOR = null;
    CombinedVibration() {}
    @android.annotation.NonNull
    public static android.os.CombinedVibration createParallel(android.os.VibrationEffect p0) { return null; }
    @android.annotation.NonNull
    public static android.os.CombinedVibration.ParallelCombination startParallel() { return null; }
    @android.annotation.NonNull
    public static android.os.CombinedVibration.SequentialCombination startSequential() { return null; }
    public int describeContents() { return 0; }
    public abstract long getDuration();
    public boolean isHapticFeedbackCandidate() { return false; }
    public abstract void validate();
    public abstract <ParamT extends java.lang.Object> android.os.CombinedVibration transform(android.os.VibrationEffect.Transformation<ParamT> p0, ParamT p1);
    public abstract android.os.CombinedVibration adapt(android.os.CombinedVibration.VibratorAdapter p0);
    public abstract boolean hasVibrator(int p0);
    public abstract java.lang.String toDebugString();

    public static final class Mono extends android.os.CombinedVibration {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.os.CombinedVibration.Mono> CREATOR = null;
        Mono(android.os.Parcel p0) { super(); }
        Mono(android.os.VibrationEffect p0) { super(); }
        @android.annotation.NonNull
        public android.os.VibrationEffect getEffect() { return null; }
        public long getDuration() { return 0L; }
        public boolean isHapticFeedbackCandidate() { return false; }
        public void validate() {}
        public <ParamT extends java.lang.Object> android.os.CombinedVibration transform(android.os.VibrationEffect.Transformation<ParamT> p0, ParamT p1) { return null; }
        public android.os.CombinedVibration adapt(android.os.CombinedVibration.VibratorAdapter p0) { return null; }
        public boolean hasVibrator(int p0) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public java.lang.String toDebugString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class ParallelCombination {
        ParallelCombination() {}
        @android.annotation.NonNull
        public android.os.CombinedVibration.ParallelCombination addVibrator(int p0, android.os.VibrationEffect p1) { return null; }
        @android.annotation.NonNull
        public android.os.CombinedVibration combine() { return null; }
    }

    public static final class Sequential extends android.os.CombinedVibration {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.os.CombinedVibration.Sequential> CREATOR = null;
        Sequential(android.os.Parcel p0) { super(); }
        Sequential(java.util.List<android.os.CombinedVibration> p0, java.util.List<java.lang.Integer> p1) { super(); }
        @android.annotation.NonNull
        public java.util.List<android.os.CombinedVibration> getEffects() { return null; }
        @android.annotation.NonNull
        public java.util.List<java.lang.Integer> getDelays() { return null; }
        public long getDuration() { return 0L; }
        public boolean isHapticFeedbackCandidate() { return false; }
        public void validate() {}
        public <ParamT extends java.lang.Object> android.os.CombinedVibration transform(android.os.VibrationEffect.Transformation<ParamT> p0, ParamT p1) { return null; }
        public android.os.CombinedVibration adapt(android.os.CombinedVibration.VibratorAdapter p0) { return null; }
        public boolean hasVibrator(int p0) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public java.lang.String toDebugString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class SequentialCombination {
        SequentialCombination() {}
        @android.annotation.NonNull
        public android.os.CombinedVibration.SequentialCombination addNext(int p0, android.os.VibrationEffect p1) { return null; }
        @android.annotation.NonNull
        public android.os.CombinedVibration.SequentialCombination addNext(int p0, android.os.VibrationEffect p1, int p2) { return null; }
        @android.annotation.NonNull
        public android.os.CombinedVibration.SequentialCombination addNext(android.os.CombinedVibration p0) { return null; }
        @android.annotation.NonNull
        public android.os.CombinedVibration.SequentialCombination addNext(android.os.CombinedVibration p0, int p1) { return null; }
        @android.annotation.NonNull
        public android.os.CombinedVibration combine() { return null; }
    }

    public static final class Stereo extends android.os.CombinedVibration {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.os.CombinedVibration.Stereo> CREATOR = null;
        Stereo(android.os.Parcel p0) { super(); }
        Stereo(android.util.SparseArray<android.os.VibrationEffect> p0) { super(); }
        @android.annotation.NonNull
        public android.util.SparseArray<android.os.VibrationEffect> getEffects() { return null; }
        public long getDuration() { return 0L; }
        public boolean isHapticFeedbackCandidate() { return false; }
        public void validate() {}
        public <ParamT extends java.lang.Object> android.os.CombinedVibration transform(android.os.VibrationEffect.Transformation<ParamT> p0, ParamT p1) { return null; }
        public android.os.CombinedVibration adapt(android.os.CombinedVibration.VibratorAdapter p0) { return null; }
        public boolean hasVibrator(int p0) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public java.lang.String toDebugString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static interface VibratorAdapter {
        public int[] getAvailableVibratorIds();
        @android.annotation.NonNull
        public android.os.VibrationEffect adaptToVibrator(int p0, android.os.VibrationEffect p1);
    }
}
