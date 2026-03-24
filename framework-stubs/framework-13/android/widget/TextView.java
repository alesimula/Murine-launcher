package android.widget;

@android.widget.RemoteViews.RemoteView
public class TextView extends android.view.View implements android.view.ViewTreeObserver.OnPreDrawListener {
    static final java.lang.String LOG_TAG = "TextView";
    static final boolean DEBUG_EXTRACT = false;
    static final boolean DEBUG_CURSOR = false;
    static final int VERY_WIDE = 1048576;
    static final int ACCESSIBILITY_ACTION_PROCESS_TEXT_START_ID = 268435712;
    static final int ACCESSIBILITY_ACTION_SMART_START_ID = 268439552;
    public static final int PROCESS_TEXT_REQUEST_CODE = 100;
    public static final long BORINGLAYOUT_FALLBACK_LINESPACING = 210923482L;
    public static final long STATICLAYOUT_FALLBACK_LINESPACING = 37756858L;
    static long sLastCutCopyOrTextChangedTime;
    android.widget.TextView.Drawables mDrawables;
    int mHighlightColor;
    int mCursorDrawableRes;
    int mTextSelectHandleLeftRes;
    int mTextSelectHandleRightRes;
    int mTextSelectHandleRes;
    int mTextEditSuggestionItemLayout;
    int mTextEditSuggestionContainerLayout;
    int mTextEditSuggestionHighlightStyle;
    public static final int AUTO_SIZE_TEXT_TYPE_NONE = 0;
    public static final int AUTO_SIZE_TEXT_TYPE_UNIFORM = 1;
    public static final android.text.BoringLayout.Metrics UNKNOWN_BORING = null;
    static final int ID_SELECT_ALL = 16908319;
    static final int ID_UNDO = 16908338;
    static final int ID_REDO = 16908339;
    static final int ID_CUT = 16908320;
    static final int ID_COPY = 16908321;
    static final int ID_PASTE = 16908322;
    static final int ID_SHARE = 16908341;
    static final int ID_PASTE_AS_PLAIN_TEXT = 16908337;
    static final int ID_REPLACE = 16908340;
    static final int ID_ASSIST = 16908353;
    static final int ID_AUTOFILL = 16908355;
    public static void preloadFontCache() {}
    public TextView(android.content.Context p0) { super((android.content.Context)null); }
    public TextView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public TextView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public TextView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public void setAutoSizeTextTypeWithDefaults(int p0) {}
    public void setAutoSizeTextTypeUniformWithConfiguration(int p0, int p1, int p2, int p3) {}
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] p0, int p1) {}
    public int getAutoSizeTextType() { return 0; }
    public int getAutoSizeStepGranularity() { return 0; }
    public int getAutoSizeMinTextSize() { return 0; }
    public int getAutoSizeMaxTextSize() { return 0; }
    public int[] getAutoSizeTextAvailableSizes() { return null; }
    public void onActivityResult(int p0, int p1, android.content.Intent p2) {}
    @android.view.RemotableViewMethod
    public void setEnabled(boolean p0) {}
    public void setTypeface(android.graphics.Typeface p0, int p1) {}
    protected boolean getDefaultEditable() { return false; }
    protected android.text.method.MovementMethod getDefaultMovementMethod() { return null; }
    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getText() { return null; }
    public int length() { return 0; }
    public android.text.Editable getEditableText() { return null; }
    public java.lang.CharSequence getTransformed() { return null; }
    public int getLineHeight() { return 0; }
    public final android.text.Layout getLayout() { return null; }
    final android.text.Layout getHintLayout() { return null; }
    public final android.content.UndoManager getUndoManager() { return null; }
    public final android.widget.Editor getEditorForTesting() { return null; }
    public final void setUndoManager(android.content.UndoManager p0, java.lang.String p1) {}
    public final android.text.method.KeyListener getKeyListener() { return null; }
    public void setKeyListener(android.text.method.KeyListener p0) {}
    public final android.text.method.MovementMethod getMovementMethod() { return null; }
    public final void setMovementMethod(android.text.method.MovementMethod p0) {}
    public final android.text.method.TransformationMethod getTransformationMethod() { return null; }
    public final void setTransformationMethod(android.text.method.TransformationMethod p0) {}
    public int getCompoundPaddingTop() { return 0; }
    public int getCompoundPaddingBottom() { return 0; }
    public int getCompoundPaddingLeft() { return 0; }
    public int getCompoundPaddingRight() { return 0; }
    public int getCompoundPaddingStart() { return 0; }
    public int getCompoundPaddingEnd() { return 0; }
    public int getExtendedPaddingTop() { return 0; }
    public int getExtendedPaddingBottom() { return 0; }
    public int getTotalPaddingLeft() { return 0; }
    public int getTotalPaddingRight() { return 0; }
    public int getTotalPaddingStart() { return 0; }
    public int getTotalPaddingEnd() { return 0; }
    public int getTotalPaddingTop() { return 0; }
    public int getTotalPaddingBottom() { return 0; }
    public void setCompoundDrawables(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3) {}
    @android.view.RemotableViewMethod
    public void setCompoundDrawablesWithIntrinsicBounds(int p0, int p1, int p2, int p3) {}
    @android.view.RemotableViewMethod
    public void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3) {}
    @android.view.RemotableViewMethod
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3) {}
    @android.view.RemotableViewMethod
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int p0, int p1, int p2, int p3) {}
    @android.view.RemotableViewMethod
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1, android.graphics.drawable.Drawable p2, android.graphics.drawable.Drawable p3) {}
    public android.graphics.drawable.Drawable[] getCompoundDrawables() { return null; }
    public android.graphics.drawable.Drawable[] getCompoundDrawablesRelative() { return null; }
    @android.view.RemotableViewMethod
    public void setCompoundDrawablePadding(int p0) {}
    public int getCompoundDrawablePadding() { return 0; }
    public void setCompoundDrawableTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getCompoundDrawableTintList() { return null; }
    public void setCompoundDrawableTintMode(android.graphics.PorterDuff.Mode p0) {}
    public void setCompoundDrawableTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getCompoundDrawableTintMode() { return null; }
    public android.graphics.BlendMode getCompoundDrawableTintBlendMode() { return null; }
    public void setPadding(int p0, int p1, int p2, int p3) {}
    public void setPaddingRelative(int p0, int p1, int p2, int p3) {}
    public void setFirstBaselineToTopHeight(int p0) {}
    public void setLastBaselineToBottomHeight(int p0) {}
    public int getFirstBaselineToTopHeight() { return 0; }
    public int getLastBaselineToBottomHeight() { return 0; }
    public final int getAutoLinkMask() { return 0; }
    @android.view.RemotableViewMethod
    public void setTextSelectHandle(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    public void setTextSelectHandle(int p0) {}
    public android.graphics.drawable.Drawable getTextSelectHandle() { return null; }
    @android.view.RemotableViewMethod
    public void setTextSelectHandleLeft(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    public void setTextSelectHandleLeft(int p0) {}
    public android.graphics.drawable.Drawable getTextSelectHandleLeft() { return null; }
    @android.view.RemotableViewMethod
    public void setTextSelectHandleRight(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod
    public void setTextSelectHandleRight(int p0) {}
    public android.graphics.drawable.Drawable getTextSelectHandleRight() { return null; }
    public void setTextCursorDrawable(android.graphics.drawable.Drawable p0) {}
    public void setTextCursorDrawable(int p0) {}
    public android.graphics.drawable.Drawable getTextCursorDrawable() { return null; }
    public void setTextAppearance(int p0) {}
    @java.lang.Deprecated
    public void setTextAppearance(android.content.Context p0, int p1) {}
    public java.util.Locale getTextLocale() { return null; }
    public android.os.LocaleList getTextLocales() { return null; }
    public void setTextLocale(java.util.Locale p0) {}
    public void setTextLocales(android.os.LocaleList p0) {}
    protected void onConfigurationChanged(android.content.res.Configuration p0) {}
    @android.view.ViewDebug.ExportedProperty(category="text")
    public float getTextSize() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="text")
    public float getScaledTextSize() { return 0.0f; }
    @android.view.ViewDebug.ExportedProperty(category="text", mapping={@android.view.ViewDebug.IntToString(from=0, to="NORMAL"), @android.view.ViewDebug.IntToString(from=1, to="BOLD"), @android.view.ViewDebug.IntToString(from=2, to="ITALIC"), @android.view.ViewDebug.IntToString(from=3, to="BOLD_ITALIC")})
    public int getTypefaceStyle() { return 0; }
    @android.view.RemotableViewMethod
    public void setTextSize(float p0) {}
    public void setTextSize(int p0, float p1) {}
    public int getTextSizeUnit() { return 0; }
    public float getTextScaleX() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setTextScaleX(float p0) {}
    public void setTypeface(android.graphics.Typeface p0) {}
    public android.graphics.Typeface getTypeface() { return null; }
    public void setElegantTextHeight(boolean p0) {}
    public void setFallbackLineSpacing(boolean p0) {}
    public boolean isFallbackLineSpacing() { return false; }
    boolean isFallbackLineSpacingForStaticLayout() { return false; }
    public boolean isElegantTextHeight() { return false; }
    public float getLetterSpacing() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setLetterSpacing(float p0) {}
    public java.lang.String getFontFeatureSettings() { return null; }
    public java.lang.String getFontVariationSettings() { return null; }
    public void setBreakStrategy(int p0) {}
    public int getBreakStrategy() { return 0; }
    public void setHyphenationFrequency(int p0) {}
    public int getHyphenationFrequency() { return 0; }
    public void setLineBreakStyle(int p0) {}
    public void setLineBreakWordStyle(int p0) {}
    public int getLineBreakStyle() { return 0; }
    public int getLineBreakWordStyle() { return 0; }
    public android.text.PrecomputedText.Params getTextMetricsParams() { return null; }
    public void setTextMetricsParams(android.text.PrecomputedText.Params p0) {}
    @android.view.RemotableViewMethod
    public void setJustificationMode(int p0) {}
    public int getJustificationMode() { return 0; }
    @android.view.RemotableViewMethod
    public void setFontFeatureSettings(java.lang.String p0) {}
    public boolean setFontVariationSettings(java.lang.String p0) { return false; }
    @android.view.RemotableViewMethod
    public void setTextColor(int p0) {}
    @android.view.RemotableViewMethod
    public void setTextColor(android.content.res.ColorStateList p0) {}
    public final android.content.res.ColorStateList getTextColors() { return null; }
    public final int getCurrentTextColor() { return 0; }
    @android.view.RemotableViewMethod
    public void setHighlightColor(int p0) {}
    public int getHighlightColor() { return 0; }
    @android.view.RemotableViewMethod
    public final void setShowSoftInputOnFocus(boolean p0) {}
    public final boolean getShowSoftInputOnFocus() { return false; }
    public void setShadowLayer(float p0, float p1, float p2, int p3) {}
    public float getShadowRadius() { return 0.0f; }
    public float getShadowDx() { return 0.0f; }
    public float getShadowDy() { return 0.0f; }
    public int getShadowColor() { return 0; }
    public android.text.TextPaint getPaint() { return null; }
    @android.view.RemotableViewMethod
    public final void setAutoLinkMask(int p0) {}
    @android.view.RemotableViewMethod
    public final void setLinksClickable(boolean p0) {}
    public final boolean getLinksClickable() { return false; }
    public android.text.style.URLSpan[] getUrls() { return null; }
    @android.view.RemotableViewMethod
    public final void setHintTextColor(int p0) {}
    public final void setHintTextColor(android.content.res.ColorStateList p0) {}
    public final android.content.res.ColorStateList getHintTextColors() { return null; }
    public final int getCurrentHintTextColor() { return 0; }
    @android.view.RemotableViewMethod
    public final void setLinkTextColor(int p0) {}
    public final void setLinkTextColor(android.content.res.ColorStateList p0) {}
    public final android.content.res.ColorStateList getLinkTextColors() { return null; }
    @android.view.RemotableViewMethod
    public void setGravity(int p0) {}
    public int getGravity() { return 0; }
    public int getPaintFlags() { return 0; }
    @android.view.RemotableViewMethod
    public void setPaintFlags(int p0) {}
    public void setHorizontallyScrolling(boolean p0) {}
    public final boolean isHorizontallyScrollable() { return false; }
    public boolean getHorizontallyScrolling() { return false; }
    @android.view.RemotableViewMethod
    public void setMinLines(int p0) {}
    public int getMinLines() { return 0; }
    @android.view.RemotableViewMethod
    public void setMinHeight(int p0) {}
    public int getMinHeight() { return 0; }
    @android.view.RemotableViewMethod
    public void setMaxLines(int p0) {}
    public int getMaxLines() { return 0; }
    @android.view.RemotableViewMethod
    public void setMaxHeight(int p0) {}
    public int getMaxHeight() { return 0; }
    @android.view.RemotableViewMethod
    public void setLines(int p0) {}
    @android.view.RemotableViewMethod
    public void setHeight(int p0) {}
    @android.view.RemotableViewMethod
    public void setMinEms(int p0) {}
    public int getMinEms() { return 0; }
    @android.view.RemotableViewMethod
    public void setMinWidth(int p0) {}
    public int getMinWidth() { return 0; }
    @android.view.RemotableViewMethod
    public void setMaxEms(int p0) {}
    public int getMaxEms() { return 0; }
    @android.view.RemotableViewMethod
    public void setMaxWidth(int p0) {}
    public int getMaxWidth() { return 0; }
    @android.view.RemotableViewMethod
    public void setEms(int p0) {}
    @android.view.RemotableViewMethod
    public void setWidth(int p0) {}
    public void setLineSpacing(float p0, float p1) {}
    public float getLineSpacingMultiplier() { return 0.0f; }
    public float getLineSpacingExtra() { return 0.0f; }
    @android.view.RemotableViewMethod
    public void setLineHeight(int p0) {}
    public final void append(java.lang.CharSequence p0) {}
    public void append(java.lang.CharSequence p0, int p1, int p2) {}
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    public android.os.Parcelable onSaveInstanceState() { return null; }
    void removeMisspelledSpans(android.text.Spannable p0) {}
    public void onRestoreInstanceState(android.os.Parcelable p0) {}
    @android.view.RemotableViewMethod
    public void setFreezesText(boolean p0) {}
    public boolean getFreezesText() { return false; }
    public final void setEditableFactory(android.text.Editable.Factory p0) {}
    public final void setSpannableFactory(android.text.Spannable.Factory p0) {}
    @android.view.RemotableViewMethod
    public final void setText(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public final void setTextKeepState(java.lang.CharSequence p0) {}
    public void setText(java.lang.CharSequence p0, android.widget.TextView.BufferType p1) {}
    public final void setText(char[] p0, int p1, int p2) {}
    public final void setTextKeepState(java.lang.CharSequence p0, android.widget.TextView.BufferType p1) {}
    @android.view.RemotableViewMethod
    public final void setText(int p0) {}
    public final void setText(int p0, android.widget.TextView.BufferType p1) {}
    @android.view.RemotableViewMethod
    public final void setHint(java.lang.CharSequence p0) {}
    @android.view.RemotableViewMethod
    public final void setHint(int p0) {}
    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getHint() { return null; }
    public boolean isSingleLine() { return false; }
    java.lang.CharSequence removeSuggestionSpans(java.lang.CharSequence p0) { return null; }
    public void setInputType(int p0) {}
    boolean hasPasswordTransformationMethod() { return false; }
    public boolean isAnyPasswordInputType() { return false; }
    static boolean isPasswordInputType(int p0) { return false; }
    public void setRawInputType(int p0) {}
    public java.lang.String[] getAutofillHints() { return null; }
    public int getInputType() { return 0; }
    public void setImeOptions(int p0) {}
    public int getImeOptions() { return 0; }
    public void setImeActionLabel(java.lang.CharSequence p0, int p1) {}
    public java.lang.CharSequence getImeActionLabel() { return null; }
    public int getImeActionId() { return 0; }
    public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener p0) {}
    public void onEditorAction(int p0) {}
    public void setPrivateImeOptions(java.lang.String p0) {}
    public java.lang.String getPrivateImeOptions() { return null; }
    public void setInputExtras(int p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public android.os.Bundle getInputExtras(boolean p0) { return null; }
    public void setImeHintLocales(android.os.LocaleList p0) {}
    public android.os.LocaleList getImeHintLocales() { return null; }
    public java.lang.CharSequence getError() { return null; }
    @android.view.RemotableViewMethod
    public void setError(java.lang.CharSequence p0) {}
    public void setError(java.lang.CharSequence p0, android.graphics.drawable.Drawable p1) {}
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    public void setFilters(android.text.InputFilter[] p0) {}
    public android.text.InputFilter[] getFilters() { return null; }
    int getVerticalOffset(boolean p0) { return 0; }
    void invalidateCursorPath() {}
    void invalidateCursor() {}
    void invalidateRegion(int p0, int p1, boolean p2) {}
    public boolean onPreDraw() { return false; }
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindowInternal() {}
    public void onScreenStateChanged(int p0) {}
    protected boolean isPaddingOffsetRequired() { return false; }
    protected int getLeftPaddingOffset() { return 0; }
    protected int getTopPaddingOffset() { return 0; }
    protected int getBottomPaddingOffset() { return 0; }
    protected int getRightPaddingOffset() { return 0; }
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public boolean hasOverlappingRendering() { return false; }
    public boolean isTextSelectable() { return false; }
    public void setTextIsSelectable(boolean p0) {}
    protected int[] onCreateDrawableState(int p0) { return null; }
    public int getHorizontalOffsetForDrawables() { return 0; }
    protected void onDraw(android.graphics.Canvas p0) {}
    public void getFocusedRect(android.graphics.Rect p0) {}
    public int getLineCount() { return 0; }
    public int getLineBounds(int p0, android.graphics.Rect p1) { return 0; }
    public int getBaseline() { return 0; }
    int getBaselineOffset() { return 0; }
    protected int getFadeTop(boolean p0) { return 0; }
    protected int getFadeHeight(boolean p0) { return 0; }
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    public boolean onKeyPreIme(int p0, android.view.KeyEvent p1) { return false; }
    public boolean handleBackInTextActionModeIfNeeded(android.view.KeyEvent p0) { return false; }
    public boolean onKeyDown(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onKeyMultiple(int p0, int p1, android.view.KeyEvent p2) { return false; }
    public void resetErrorChangedFlag() {}
    public void hideErrorIfUnchanged() {}
    public boolean onKeyUp(int p0, android.view.KeyEvent p1) { return false; }
    public boolean onCheckIsTextEditor() { return false; }
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo p0) { return null; }
    public boolean extractText(android.view.inputmethod.ExtractedTextRequest p0, android.view.inputmethod.ExtractedText p1) { return false; }
    static void removeParcelableSpans(android.text.Spannable p0, int p1, int p2) {}
    public void setExtractedText(android.view.inputmethod.ExtractedText p0) {}
    public void setExtracting(android.view.inputmethod.ExtractedTextRequest p0) {}
    public void onCommitCompletion(android.view.inputmethod.CompletionInfo p0) {}
    public void onCommitCorrection(android.view.inputmethod.CorrectionInfo p0) {}
    public void beginBatchEdit() {}
    public void endBatchEdit() {}
    public void onBeginBatchEdit() {}
    public void onEndBatchEdit() {}
    public void onPerformSpellCheck() {}
    public boolean onPrivateIMECommand(java.lang.String p0, android.os.Bundle p1) { return false; }
    public void nullLayouts() {}
    public void makeNewLayout(int p0, int p1, android.text.BoringLayout.Metrics p2, android.text.BoringLayout.Metrics p3, int p4, boolean p5) {}
    public boolean useDynamicLayout() { return false; }
    protected android.text.Layout makeSingleLayout(int p0, android.text.BoringLayout.Metrics p1, int p2, android.text.Layout.Alignment p3, boolean p4, android.text.TextUtils.TruncateAt p5, boolean p6) { return null; }
    public void setIncludeFontPadding(boolean p0) {}
    public boolean getIncludeFontPadding() { return false; }
    protected void onMeasure(int p0, int p1) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public boolean bringPointIntoView(int p0) { return false; }
    public boolean moveCursorToVisibleOffset() { return false; }
    public void computeScroll() {}
    int viewportToContentHorizontalOffset() { return 0; }
    int viewportToContentVerticalOffset() { return 0; }
    public void debug(int p0) {}
    @android.view.ViewDebug.ExportedProperty(category="text")
    public int getSelectionStart() { return 0; }
    @android.view.ViewDebug.ExportedProperty(category="text")
    public int getSelectionEnd() { return 0; }
    public boolean hasSelection() { return false; }
    java.lang.String getSelectedText() { return null; }
    public void setSingleLine() {}
    @android.view.RemotableViewMethod
    public void setAllCaps(boolean p0) {}
    public boolean isAllCaps() { return false; }
    @android.view.RemotableViewMethod
    public void setSingleLine(boolean p0) {}
    public void setEllipsize(android.text.TextUtils.TruncateAt p0) {}
    public void setMarqueeRepeatLimit(int p0) {}
    public int getMarqueeRepeatLimit() { return 0; }
    @android.view.ViewDebug.ExportedProperty
    public android.text.TextUtils.TruncateAt getEllipsize() { return null; }
    @android.view.RemotableViewMethod
    public void setSelectAllOnFocus(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setCursorVisible(boolean p0) {}
    public void setImeConsumesInput(boolean p0) {}
    public boolean isCursorVisible() { return false; }
    public boolean isCursorVisibleFromAttr() { return false; }
    protected void startMarquee() {}
    protected void stopMarquee() {}
    protected void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    protected void onSelectionChanged(int p0, int p1) {}
    public void addTextChangedListener(android.text.TextWatcher p0) {}
    public void removeTextChangedListener(android.text.TextWatcher p0) {}
    void removeAdjacentSuggestionSpans(int p0) {}
    void sendOnTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    void sendAfterTextChanged(android.text.Editable p0) {}
    public void notifyContentCaptureTextChanged() {}
    void updateAfterEdit() {}
    void handleTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    void spanChange(android.text.Spanned p0, java.lang.Object p1, int p2, int p3, int p4, int p5) {}
    protected void onFocusChanged(boolean p0, int p1, android.graphics.Rect p2) {}
    public void onWindowFocusChanged(boolean p0) {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}
    public void onVisibilityAggregated(boolean p0) {}
    public void clearComposingText() {}
    public void setSelected(boolean p0) {}
    boolean isFromPrimePointer(android.view.MotionEvent p0, boolean p1) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    protected void onCreateContextMenu(android.view.ContextMenu p0) {}
    public boolean showContextMenu() { return false; }
    public boolean showContextMenu(float p0, float p1) { return false; }
    boolean isTextEditable() { return false; }
    public boolean didTouchFocusSelect() { return false; }
    public void cancelLongPress() {}
    public boolean onTrackballEvent(android.view.MotionEvent p0) { return false; }
    public void setScroller(android.widget.Scroller p0) {}
    protected float getLeftFadingEdgeStrength() { return 0.0f; }
    protected float getRightFadingEdgeStrength() { return 0.0f; }
    protected int computeHorizontalScrollRange() { return 0; }
    protected int computeVerticalScrollRange() { return 0; }
    protected int computeVerticalScrollExtent() { return 0; }
    public void findViewsWithText(java.util.ArrayList<android.view.View> p0, java.lang.CharSequence p1, int p2) {}
    public static android.content.res.ColorStateList getTextColors(android.content.Context p0, android.content.res.TypedArray p1) { return null; }
    public static int getTextColor(android.content.Context p0, android.content.res.TypedArray p1, int p2) { return 0; }
    public boolean onKeyShortcut(int p0, android.view.KeyEvent p1) { return false; }
    boolean canSelectText() { return false; }
    boolean textCanBeSelected() { return false; }
    @android.annotation.RequiresPermission("android.permission.INTERACT_ACROSS_USERS_FULL")
    public final void setTextOperationUser(android.os.UserHandle p0) {}
    final android.view.textservice.TextServicesManager getTextServicesManagerForUser() { return null; }
    final android.content.ClipboardManager getClipboardManagerForUser() { return null; }
    final android.view.textclassifier.TextClassificationManager getTextClassificationManagerForUser() { return null; }
    final <T extends java.lang.Object> T getServiceManagerForUser(java.lang.String p0, java.lang.Class<T> p1) { return null; }
    void startActivityAsTextOperationUserIfNecessary(android.content.Intent p0) {}
    public java.util.Locale getTextServicesLocale() { return null; }
    public boolean isInExtractedMode() { return false; }
    protected boolean supportsAutoSizeText() { return false; }
    public java.util.Locale getSpellCheckerLocale() { return null; }
    void onLocaleChanged() {}
    public android.text.method.WordIterator getWordIterator() { return null; }
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected void onProvideStructure(android.view.ViewStructure p0, int p1, int p2) {}
    boolean canRequestAutofill() { return false; }
    public void autofill(android.view.autofill.AutofillValue p0) {}
    public int getAutofillType() { return 0; }
    public android.view.autofill.AutofillValue getAutofillValue() { return null; }
    public void onInitializeAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void addExtraDataToAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    public void populateCharacterBounds(android.view.inputmethod.CursorAnchorInfo.Builder p0, int p1, int p2, float p3, float p4) {}
    public boolean isPositionVisible(float p0, float p1) { return false; }
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }
    public void sendAccessibilityEventInternal(int p0) {}
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent p0) {}
    boolean isVisibleToAccessibility() { return false; }
    void sendAccessibilityEventTypeViewTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
    void sendAccessibilityEventTypeViewTextChanged(java.lang.CharSequence p0, int p1, int p2) {}
    public boolean isInputMethodTarget() { return false; }
    public boolean onTextContextMenuItem(int p0) { return false; }
    java.lang.CharSequence getTransformedText(int p0, int p1) { return null; }
    public boolean performLongClick() { return false; }
    protected void onScrollChanged(int p0, int p1, int p2, int p3) {}
    public boolean isSuggestionsEnabled() { return false; }
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback p0) {}
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() { return null; }
    public void setCustomInsertionActionModeCallback(android.view.ActionMode.Callback p0) {}
    public android.view.ActionMode.Callback getCustomInsertionActionModeCallback() { return null; }
    public void setTextClassifier(android.view.textclassifier.TextClassifier p0) {}
    public android.view.textclassifier.TextClassifier getTextClassifier() { return null; }
    android.view.textclassifier.TextClassifier getTextClassificationSession() { return null; }
    android.view.textclassifier.TextClassificationContext getTextClassificationContext() { return null; }
    boolean usesNoOpTextClassifier() { return false; }
    public boolean requestActionMode(android.view.textclassifier.TextLinks.TextLinkSpan p0) { return false; }
    public boolean handleClick(android.view.textclassifier.TextLinks.TextLinkSpan p0) { return false; }
    protected void stopTextActionMode() {}
    public void hideFloatingToolbar(int p0) {}
    boolean canUndo() { return false; }
    boolean canRedo() { return false; }
    boolean canCut() { return false; }
    boolean canCopy() { return false; }
    boolean canReplace() { return false; }
    boolean canShare() { return false; }
    boolean isDeviceProvisioned() { return false; }
    boolean canPaste() { return false; }
    boolean canPasteAsPlainText() { return false; }
    boolean canProcessText() { return false; }
    boolean canSelectAllText() { return false; }
    boolean selectAllText() { return false; }
    public int getOffsetForPosition(float p0, float p1) { return 0; }
    float convertToLocalHorizontalCoordinate(float p0) { return 0.0f; }
    int getLineAtCoordinate(float p0) { return 0; }
    int getLineAtCoordinateUnclamped(float p0) { return 0; }
    int getOffsetAtCoordinate(int p0, float p1) { return 0; }
    public boolean onDragEvent(android.view.DragEvent p0) { return false; }
    boolean isInBatchEditMode() { return false; }
    public void onRtlPropertiesChanged(int p0) {}
    public android.text.TextDirectionHeuristic getTextDirectionHeuristic() { return null; }
    public void onResolveDrawables(int p0) {}
    protected void resetResolvedDrawables() {}
    protected void viewClicked(android.view.inputmethod.InputMethodManager p0) {}
    protected void deleteText_internal(int p0, int p1) {}
    protected void replaceText_internal(int p0, int p1, java.lang.CharSequence p2) {}
    protected void setSpan_internal(java.lang.Object p0, int p1, int p2, int p3) {}
    protected void setCursorPosition_internal(int p0, int p1) {}
    public java.lang.CharSequence getIterableTextForAccessibility() { return null; }
    public android.view.AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(int p0) { return null; }
    public int getAccessibilitySelectionStart() { return 0; }
    public boolean isAccessibilitySelectionExtendable() { return false; }
    public void prepareForExtendedAccessibilitySelection() {}
    public int getAccessibilitySelectionEnd() { return 0; }
    public void setAccessibilitySelection(int p0, int p1) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public void onInputConnectionOpenedInternal(android.view.inputmethod.InputConnection p0, android.view.inputmethod.EditorInfo p1, android.os.Handler p2) {}
    public void onInputConnectionClosedInternal() {}
    public android.view.ContentInfo onReceiveContent(android.view.ContentInfo p0) { return null; }
    public void onCreateViewTranslationRequest(int[] p0, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AutoSizeTextType {
    }

    public static enum BufferType {
        NORMAL,
        SPANNABLE,
        EDITABLE;
    }

    private class ChangeWatcher implements android.text.TextWatcher, android.text.SpanWatcher {
        public void beforeTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void onTextChanged(java.lang.CharSequence p0, int p1, int p2, int p3) {}
        public void afterTextChanged(android.text.Editable p0) {}
        public void onSpanChanged(android.text.Spannable p0, java.lang.Object p1, int p2, int p3, int p4, int p5) {}
        public void onSpanAdded(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
        public void onSpanRemoved(android.text.Spannable p0, java.lang.Object p1, int p2, int p3) {}
    }

    private static class CharWrapper implements java.lang.CharSequence, android.text.GetChars, android.text.GraphicsOperations {
        CharWrapper(char[] p0, int p1, int p2) {}
        void set(char[] p0, int p1, int p2) {}
        public int length() { return 0; }
        public char charAt(int p0) { return 0; }
        public java.lang.String toString() { return null; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public void getChars(int p0, int p1, char[] p2, int p3) {}
        public void drawText(android.graphics.BaseCanvas p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
        public void drawTextRun(android.graphics.BaseCanvas p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
        public float measureText(int p0, int p1, android.graphics.Paint p2) { return 0.0f; }
        public int getTextWidths(int p0, int p1, float[] p2, android.graphics.Paint p3) { return 0; }
        public float getTextRunAdvances(int p0, int p1, int p2, int p3, boolean p4, float[] p5, int p6, android.graphics.Paint p7) { return 0.0f; }
        public int getTextRunCursor(int p0, int p1, boolean p2, int p3, int p4, android.graphics.Paint p5) { return 0; }
    }

    static class Drawables {
        static final int LEFT = 0;
        static final int TOP = 1;
        static final int RIGHT = 2;
        static final int BOTTOM = 3;
        static final int DRAWABLE_NONE = -1;
        static final int DRAWABLE_RIGHT = 0;
        static final int DRAWABLE_LEFT = 1;
        final android.graphics.Rect mCompoundRect = null;
        final android.graphics.drawable.Drawable[] mShowing = null;
        android.content.res.ColorStateList mTintList;
        android.graphics.BlendMode mBlendMode;
        boolean mHasTint;
        boolean mHasTintMode;
        android.graphics.drawable.Drawable mDrawableStart;
        android.graphics.drawable.Drawable mDrawableEnd;
        android.graphics.drawable.Drawable mDrawableError;
        android.graphics.drawable.Drawable mDrawableTemp;
        android.graphics.drawable.Drawable mDrawableLeftInitial;
        android.graphics.drawable.Drawable mDrawableRightInitial;
        boolean mIsRtlCompatibilityMode;
        boolean mOverride;
        int mDrawableSizeTop;
        int mDrawableSizeBottom;
        int mDrawableSizeLeft;
        int mDrawableSizeRight;
        int mDrawableSizeStart;
        int mDrawableSizeEnd;
        int mDrawableSizeError;
        int mDrawableSizeTemp;
        int mDrawableWidthTop;
        int mDrawableWidthBottom;
        int mDrawableHeightLeft;
        int mDrawableHeightRight;
        int mDrawableHeightStart;
        int mDrawableHeightEnd;
        int mDrawableHeightError;
        int mDrawableHeightTemp;
        int mDrawablePadding;
        int mDrawableSaved;
        public Drawables(android.content.Context p0) {}
        public boolean hasMetadata() { return false; }
        public boolean resolveWithLayoutDirection(int p0) { return false; }
        public void setErrorDrawable(android.graphics.drawable.Drawable p0, android.widget.TextView p1) {}
    }

    private static final class Marquee {
        Marquee(android.widget.TextView p0) {}
        void tick() {}
        void stop() {}
        void start(int p0) {}
        float getGhostOffset() { return 0.0f; }
        float getScroll() { return 0.0f; }
        float getMaxFadeScroll() { return 0.0f; }
        boolean shouldDrawLeftFade() { return false; }
        boolean shouldDrawGhost() { return false; }
        boolean isRunning() { return false; }
        boolean isStopped() { return false; }
    }

    public static interface OnEditorActionListener {
        public boolean onEditorAction(android.widget.TextView p0, int p1, android.view.KeyEvent p2);
    }

    public static class SavedState extends android.view.View.BaseSavedState {
        int selStart;
        int selEnd;
        java.lang.CharSequence text;
        boolean frozenWithFocus;
        java.lang.CharSequence error;
        android.os.ParcelableParcel editorState;
        public static final android.os.Parcelable.Creator<android.widget.TextView.SavedState> CREATOR = null;
        SavedState(android.os.Parcelable p0) { super((android.os.Parcel)null); }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
    }

    private static class TextAppearanceAttributes {
        int mTextColorHighlight;
        android.content.res.ColorStateList mTextColor;
        android.content.res.ColorStateList mTextColorHint;
        android.content.res.ColorStateList mTextColorLink;
        int mTextSize;
        int mTextSizeUnit;
        android.os.LocaleList mTextLocales;
        java.lang.String mFontFamily;
        android.graphics.Typeface mFontTypeface;
        boolean mFontFamilyExplicit;
        int mTypefaceIndex;
        int mTextStyle;
        int mFontWeight;
        boolean mAllCaps;
        int mShadowColor;
        float mShadowDx;
        float mShadowDy;
        float mShadowRadius;
        boolean mHasElegant;
        boolean mElegant;
        boolean mHasFallbackLineSpacing;
        boolean mFallbackLineSpacing;
        boolean mHasLetterSpacing;
        float mLetterSpacing;
        java.lang.String mFontFeatureSettings;
        java.lang.String mFontVariationSettings;
        boolean mHasLineBreakStyle;
        boolean mHasLineBreakWordStyle;
        int mLineBreakStyle;
        int mLineBreakWordStyle;
        public java.lang.String toString() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface XMLTypefaceAttr {
    }
}
