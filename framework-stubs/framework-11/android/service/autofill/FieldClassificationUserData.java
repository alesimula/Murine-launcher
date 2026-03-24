package android.service.autofill;

public interface FieldClassificationUserData {
    public java.lang.String getFieldClassificationAlgorithm();
    public android.os.Bundle getDefaultFieldClassificationArgs();
    public java.lang.String getFieldClassificationAlgorithmForCategory(java.lang.String p0);
    public android.util.ArrayMap<java.lang.String, java.lang.String> getFieldClassificationAlgorithms();
    public android.util.ArrayMap<java.lang.String, android.os.Bundle> getFieldClassificationArgs();
    public java.lang.String[] getCategoryIds();
    public java.lang.String[] getValues();
}
