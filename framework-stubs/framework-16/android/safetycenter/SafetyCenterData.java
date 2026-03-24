package android.safetycenter;

public final class SafetyCenterData implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.safetycenter.SafetyCenterData> CREATOR = null;
    public SafetyCenterData(android.safetycenter.SafetyCenterStatus p0, java.util.List<android.safetycenter.SafetyCenterIssue> p1, java.util.List<android.safetycenter.SafetyCenterEntryOrGroup> p2, java.util.List<android.safetycenter.SafetyCenterStaticEntryGroup> p3) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.SafetyCenterIssue> getDismissedIssues() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.SafetyCenterEntryOrGroup> getEntriesOrGroups() { return null; }
    @android.annotation.NonNull
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.SafetyCenterIssue> getIssues() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.safetycenter.SafetyCenterStaticEntryGroup> getStaticEntryGroups() { return null; }
    @android.annotation.NonNull
    public android.safetycenter.SafetyCenterStatus getStatus() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.safetycenter.SafetyCenterData p0) {}
        public Builder(android.safetycenter.SafetyCenterStatus p0) {}
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder addDismissedIssue(android.safetycenter.SafetyCenterIssue p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder addEntryOrGroup(android.safetycenter.SafetyCenterEntryOrGroup p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder addIssue(android.safetycenter.SafetyCenterIssue p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder addStaticEntryGroup(android.safetycenter.SafetyCenterStaticEntryGroup p0) { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData build() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder clearDismissedIssues() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder clearEntriesOrGroups() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder clearExtras() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder clearIssues() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder clearStaticEntryGroups() { return null; }
        @android.annotation.NonNull
        public android.safetycenter.SafetyCenterData.Builder setExtras(android.os.Bundle p0) { return null; }
    }
}
