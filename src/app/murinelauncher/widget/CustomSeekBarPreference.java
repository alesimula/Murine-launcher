/*
 * Copyright (C) 2016-2025 crDroid Android Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package app.murinelauncher.widget;

import static android.view.HapticFeedbackConstants.CLOCK_TICK;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import java.util.Arrays;
import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import androidx.preference.Preference;
import androidx.preference.PreferenceViewHolder;

import com.android.launcher3.R;
import com.android.settingslib.widget.SliderPreference;

import com.google.android.material.slider.LabelFormatter;
import com.google.android.material.slider.Slider;

public class CustomSeekBarPreference extends SliderPreference {

    private static final String SETTINGS_NS = "http://schemas.android.com/apk/res/com.android.settings";
    private static final String ANDROIDNS = "http://schemas.android.com/apk/res/android";

    private boolean mShowSign;
    @Nullable
    private String mUnits = "";
    @Nullable
    private String mDefaultValueText;
    private boolean mDefaultValueTextExists;
    private boolean mDefaultValueExists;
    private int mDefaultValue;

    private boolean mShowIncrementButtons = true;
    private boolean mShowTicks = false;
    private int mTickInterval = 1;
    private boolean mAbsoluteTickInterval = false;
    private int[] mCustomTickPositions = null;
    private String mCustomTickPositions_parseError = null;
    private boolean mShouldDrawTicksManually = false;

    private CharSequence mUserSummary;

    private boolean mInUserDrag = false;

    public CustomSeekBarPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        readLegacyAttrs(context, attrs);
        initDefaults();
        mUserSummary = super.getSummary();
        updateSummaryNow();
    }

    public CustomSeekBarPreference(Context context) {
        super(context, null);
        initDefaults();
        mUserSummary = super.getSummary();
        updateSummaryNow();
    }

    private void initDefaults() {
        setShowSliderValue(true);
        setHapticFeedbackMode(HAPTIC_FEEDBACK_MODE_ON_TICKS);
        setLabelFormater(new LabelFormatter() {
            @Override public String getFormattedValue(float value) {
                return formatValueForSummary((int) value);
            }
        });
    }

    private void readLegacyAttrs(Context c, AttributeSet attrs) {
        if (attrs == null) return;
        final TypedArray a = c.obtainStyledAttributes(attrs, R.styleable.CustomSeekBarPreference);
        try {
            mShowSign = a.getBoolean(R.styleable.CustomSeekBarPreference_showSign, false);
            final String units = a.getString(R.styleable.CustomSeekBarPreference_units);
            if (units != null) mUnits = units;

            final boolean continuous = a.getBoolean(
                    R.styleable.CustomSeekBarPreference_continuousUpdates, false);
            setUpdatesContinuously(continuous);

            mDefaultValueText = a.getString(
                    R.styleable.CustomSeekBarPreference_defaultValueText);
            mDefaultValueTextExists = mDefaultValueText != null && !mDefaultValueText.isEmpty();

            String defaultValue = attrs.getAttributeValue(ANDROIDNS, "defaultValue");
            if (defaultValue == null) {
                defaultValue = attrs.getAttributeValue(SETTINGS_NS, "defaultValue");
            }
            if (defaultValue != null && !defaultValue.isEmpty()) {
                try {
                    mDefaultValue = Integer.parseInt(defaultValue);
                    mDefaultValueExists = true;
                } catch (NumberFormatException ignored) {
                    mDefaultValueExists = false;
                }
            }

            // Explicitly read android:min if not handled by parent correctly
            int minAttr = attrs.getAttributeIntValue(ANDROIDNS, "min", -1);
            if (minAttr == -1) {
                minAttr = attrs.getAttributeIntValue(SETTINGS_NS, "min", -1);
            }
            if (minAttr != -1) setMin(minAttr);

            // Guard against improper slider increment
            int min = getMin();
            int max = getMax();
            int span = Math.max(0, max - min);

            int interval = a.getInt(R.styleable.CustomSeekBarPreference_interval, 0);
            if (interval <= 0) {
                interval = attrs.getAttributeIntValue(SETTINGS_NS, "interval", 0);
            }
            if (interval <= 0) {
                interval = attrs.getAttributeIntValue(ANDROIDNS, "interval", 0);
            }
            if (interval > 0) setSliderIncrement(interval);
            int actualInterval = Math.max(1, interval);

            mShowIncrementButtons = a.getBoolean(
                    R.styleable.CustomSeekBarPreference_showIncrementButtons, true);
            mShowTicks = a.getBoolean(R.styleable.CustomSeekBarPreference_showTicks,
                    a.hasValue(R.styleable.CustomSeekBarPreference_tickInterval) ||
                            a.hasValue(R.styleable.CustomSeekBarPreference_customTickPositions));
            mTickInterval = a.getInt(
                    R.styleable.CustomSeekBarPreference_tickInterval, actualInterval);
            if (mTickInterval < 1) mTickInterval = actualInterval;
            mAbsoluteTickInterval = a.getBoolean(
                    R.styleable.CustomSeekBarPreference_absoluteTickInterval, false);

            String customTicks = a.getString(
                    R.styleable.CustomSeekBarPreference_customTickPositions);
            if (customTicks != null && !customTicks.trim().isEmpty()) try {
                mCustomTickPositions = Arrays.stream(customTicks.split("\\s*,\\s*", -1))
                        .mapToInt(Integer::parseInt).toArray();
            } catch (Exception e) {
                mCustomTickPositions_parseError = customTicks;
            }

            mShouldDrawTicksManually = (mTickInterval != actualInterval || (mAbsoluteTickInterval && min % mTickInterval != 0))
                    || (mCustomTickPositions != null && mCustomTickPositions.length > 0);

            int step = getSliderIncrement();
            if (step <= 0 || span == 0) {
                setSliderIncrement(1); // Always use discrete steps for CustomSeekBarPreference
            } else if ((span % step) != 0) {
                int gcd = gcd(span, step);
                if (gcd <= 0) gcd = 1;
                setSliderIncrement(gcd);
            }
        } catch (Throwable ignored) {
            // keep safe defaults
        } finally {
            a.recycle();
        }
    }

    @Override
    public void setSummary(CharSequence summary) {
        mUserSummary = summary;
        updateSummaryNow();
    }

    @Override
    public void setValue(int sliderValue) {
        super.setValue(sliderValue);
        if (!mInUserDrag) updateSummaryNow();
    }

    private void updateSummaryNow() {
        CharSequence composed = composeSummary(mUserSummary, getValue());
        super.setSummary(composed);
    }

    private String formatValueForSummary(int v) {
        if (mDefaultValueExists && mDefaultValueTextExists && v == mDefaultValue) {
            return mDefaultValueText;
        }
        String s = String.valueOf(v);
        if (mShowSign && v > 0) s = "+" + s;
        if (mUnits != null && !mUnits.isEmpty()) s = s + " " + mUnits;
        return s;
    }

    private CharSequence composeSummary(CharSequence userSummary, int v) {
        final String valueText = formatValueForSummary(v);
        if (userSummary == null || userSummary.length() == 0) return valueText;
        return valueText + " \u2022 " + userSummary;
    }

    @Override
    public void setDefaultValue(Object defaultValue) {
        if (defaultValue instanceof Integer) {
            mDefaultValueExists = true;
            mDefaultValue = (Integer) defaultValue;
        }
        super.setDefaultValue(defaultValue);
        updateSummaryNow();
    }

    @Override
    public void onBindViewHolder(@NonNull PreferenceViewHolder holder) {
        if (mCustomTickPositions != null && mCustomTickPositions.length > 0 && mTickInterval > 1)
            throw new IllegalArgumentException("tickInterval and customTickPositions incompatible");
        if (mCustomTickPositions_parseError != null)
            throw new IllegalArgumentException("could not parse custom customTickPositions: " + mCustomTickPositions_parseError);

        // Sanitize persisted value so it is a valid step for the Slider.
        // This prevents crashes when the interval/stepSize changes between
        // app versions and the old persisted value is no longer on a valid step.
        int sliderStep = Math.max(1, getSliderIncrement());
        int min = getMin();
        int max = getMax();
        int current = getValue();
        int offset = current - min;
        if (offset < 0 || (sliderStep > 1 && offset % sliderStep != 0)) {
            int snapped = min + Math.round((float) offset / sliderStep) * sliderStep;
            snapped = Math.max(min, Math.min(snapped, max));
            setValueInternal(snapped, false);
        }

        super.onBindViewHolder(holder);

        final TextView summaryView = (TextView) holder.findViewById(android.R.id.summary);
        if (summaryView != null) {
            summaryView.setText(composeSummary(mUserSummary, getValue()));
        }

        final TextView titleView = (TextView) holder.findViewById(android.R.id.title);
        if (titleView != null) {
            titleView.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            attachResetIcon(titleView);
        }

        final View labelFrame = holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.label_frame);
        final TextView startText = (TextView) holder.findViewById(android.R.id.text1);
        final TextView endText = (TextView) holder.findViewById(android.R.id.text2);

        if (labelFrame != null) {
            boolean hasStart = startText != null && startText.getText() != null
                    && startText.getText().length() > 0;
            boolean hasEnd = endText != null && endText.getText() != null
                    && endText.getText().length() > 0;
            boolean parentWantsLabels = hasStart || hasEnd;

            labelFrame.setVisibility(parentWantsLabels ? View.VISIBLE : View.GONE);
        }

        ViewGroup minusFrame = (ViewGroup) holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.icon_start_frame);
        ImageView minusIcon = (ImageView) holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.icon_start);

        ViewGroup plusFrame = (ViewGroup) holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.icon_end_frame);
        ImageView plusIcon = (ImageView) holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.icon_end);

        final Slider slider = (Slider) holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.slider);

        if (slider != null && mShowIncrementButtons) slider.setOnTouchListener(new View.OnTouchListener() {
            private boolean mIgnoreGesture = false;

            @Override public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    float x = event.getX();
                    // 12dp threshold to avoid accidental jumps when clicking +/- buttons
                    float threshold = 12 * v.getResources().getDisplayMetrics().density;
                    mIgnoreGesture = (x < threshold || x > v.getWidth() - threshold);
                }

                if (mIgnoreGesture) {
                    if (event.getAction() == MotionEvent.ACTION_UP || event.getAction() == MotionEvent.ACTION_CANCEL) {
                        mIgnoreGesture = false;
                    }
                    return true; // Consume the event and block Slider's internal logic
                }
                return false;
            }
        });

        int stepForClicks = Math.max(1, getSliderIncrement());

        if (minusFrame != null && minusIcon != null && mShowIncrementButtons) {
            minusFrame.setVisibility(View.VISIBLE);
            minusIcon.setImageResource(R.drawable.ic_custom_seekbar_minus);
            minusFrame.setOnClickListener(v -> {
                if (!isEnabled()) return;
                v.performHapticFeedback(CLOCK_TICK);
                int base = slider != null ? Math.round(slider.getValue()) : getValue();
                int newVal = Math.max(getMin(), base - stepForClicks);
                applyUserValue(newVal, slider);
                updatePlusMinusEnabledStates(holder);
            });
        }
        else if (minusFrame != null) minusFrame.setVisibility(View.GONE);

        if (plusFrame != null && plusIcon != null && mShowIncrementButtons) {
            plusFrame.setVisibility(View.VISIBLE);
            plusIcon.setImageResource(R.drawable.ic_custom_seekbar_plus);
            plusFrame.setOnClickListener(v -> {
                if (!isEnabled()) return;
                v.performHapticFeedback(CLOCK_TICK);
                int base = slider != null ? Math.round(slider.getValue()) : getValue();
                int newVal = Math.min(getMax(), base + stepForClicks);
                applyUserValue(newVal, slider);
                updatePlusMinusEnabledStates(holder);
            });
        }
        else if (plusFrame != null) plusFrame.setVisibility(View.GONE);

        updatePlusMinusEnabledStates(holder);

        if (slider != null) {
            if (mShowTicks) applyTickOverlay(slider);
            slider.setContinuousModeTickCount(4);
            if (summaryView != null) {
                slider.addOnChangeListener((s, value, fromUser) -> {
                    if (fromUser) {
                        summaryView.setText(composeSummary(mUserSummary, (int) value));
                        updatePlusMinusEnabledStates(holder);
                    }
                });
            }
            slider.addOnSliderTouchListener(new Slider.OnSliderTouchListener() {
                @Override
                public void onStartTrackingTouch(@NonNull Slider s) {
                    mInUserDrag = true;
                }

                @Override
                public void onStopTrackingTouch(@NonNull Slider s) {
                    mInUserDrag = false;
                    applyUserValue(Math.round(s.getValue()), s);
                    updatePlusMinusEnabledStates(holder);
                }
            });
        }
    }

    @Override
    public void onDependencyChanged(@NonNull Preference dependency, boolean disableDependent) {
        super.onDependencyChanged(dependency, disableDependent);
        notifyChanged();
    }

    private void applyUserValue(int newVal, @Nullable Slider slider) {
        if (newVal == getValue()) return;
        if (!callChangeListener(newVal)) {
            if (slider != null) slider.setValue(getValue());
            return;
        }
        setValue(newVal);
        updateSummaryNow();
        notifyChanged();
    }

    private static int gcd(int a, int b) {
        a = Math.abs(a); b = Math.abs(b);
        if (a == 0) return b;
        if (b == 0) return a;
        while (b != 0) {
            int t = b; b = a % b; a = t;
        }
        return a;
    }

    private void updatePlusMinusEnabledStates(PreferenceViewHolder holder) {
        View minusFrame = holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.icon_start_frame);
        ImageView minusIcon = (ImageView) holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.icon_start);
        View plusFrame = holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.icon_end_frame);
        ImageView plusIcon = (ImageView) holder.findViewById(
                com.android.settingslib.widget.preference.slider.R.id.icon_end);
        boolean enabled = isEnabled();
        int value = getValue();

        if (minusFrame != null && minusIcon != null) {
            int min = getMin();
            minusFrame.setEnabled(enabled && (value > min));
            minusIcon.setEnabled(enabled && (value > min));
        }
        if (plusFrame  != null && plusIcon != null) {
            int max = getMax();
            plusFrame.setEnabled(enabled && (value < max));
            plusIcon.setEnabled(enabled && (value < max));
        }
    }

    private void attachResetIcon(TextView tv) {
        if (!mDefaultValueExists) {
            tv.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, null, null);
            tv.setOnTouchListener(null);
            tv.setClickable(false);
            return;
        }

        final Drawable icon = ResourcesCompat.getDrawable(
                tv.getResources(), R.drawable.ic_custom_seekbar_reset, tv.getContext().getTheme());
        if (icon == null) return;

        tv.setCompoundDrawablesRelativeWithIntrinsicBounds(null, null, icon, null);
        tv.setCompoundDrawablePadding(dp(tv, 6));
        tv.setClickable(isEnabled());
        tv.setFocusable(isEnabled());

        final int tapSlop = dp(tv, 8);

        tv.setOnTouchListener((v, ev) -> {
            if (!isEnabled() || ev.getAction() != MotionEvent.ACTION_UP) return false;

            final boolean isRtl = ViewCompat.getLayoutDirection(tv) == ViewCompat.LAYOUT_DIRECTION_RTL;
            final Drawable[] drs = tv.getCompoundDrawablesRelative();
            final Drawable end = drs[2];
            if (end == null) return false;

            final int iconW = end.getIntrinsicWidth();
            final int x = (int) ev.getX();

            if (!isRtl) {
                final int left = tv.getWidth() - ViewCompat.getPaddingEnd(tv) - iconW - tapSlop;
                if (x >= left) {
                    v.performHapticFeedback(CLOCK_TICK);
                    performReset();
                    return true;
                }
            } else {
                final int right = ViewCompat.getPaddingStart(tv) + iconW + tapSlop;
                if (x <= right) {
                    v.performHapticFeedback(CLOCK_TICK);
                    performReset();
                    return true;
                }
            }
            return false;
        });
    }

    private void applyTickOverlay(final Slider slider) {
        if (!mShowTicks) {
            slider.setTickVisible(false);
            return;
        } else if (!mShouldDrawTicksManually) {
            slider.setTickVisible(true);
            return;
        }

        // Custom tick drawing required
        slider.setTickVisible(false);
        final Drawable dotDrawable = new Drawable() {
            private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

            @Override
            public void draw(@NonNull Canvas canvas) {
                float from = slider.getValueFrom();
                float to = slider.getValueTo();
                float range = to - from;
                if (range <= 0) return;

                int trackLeft = slider.getTrackSidePadding();
                int trackWidth = slider.getTrackWidth();
                float thumbVal = slider.getValue();
                float radius = slider.getResources().getDimensionPixelSize(
                        com.android.settingslib.widget.preference.slider.R.dimen
                                .settingslib_expressive_slider_tick_radius);
                float cy = slider.getHeight() / 2f;

                // Exclusion zone around thumb, same as BaseSlider
                float thumbX = trackLeft + ((thumbVal - from) / range) * trackWidth;
                float exclusion = slider.getThumbWidth() / 2f + slider.getThumbTrackGapSize();

                int activeColor = getTrackColor(slider, true);
                int inactiveColor = getTrackColor(slider, false);

                if (mCustomTickPositions != null && mCustomTickPositions.length > 0) {
                    for (int pos : mCustomTickPositions) {
                        if (pos < from || pos > to) continue;
                        float fraction = (pos - from) / range;
                        float cx = trackLeft + fraction * trackWidth;
                        if (Math.abs(cx - thumbX) < exclusion) continue;
                        boolean inActive = pos < thumbVal;
                        mPaint.setColor(inActive ? inactiveColor : activeColor);
                        canvas.drawCircle(cx, cy, radius, mPaint);
                    }
                } else {
                    int tickStep = Math.max(1, mTickInterval);
                    float start;
                    if (mAbsoluteTickInterval) {
                        // First tick at the smallest multiple of tickStep >= from
                        start = (float) (Math.ceil(from / tickStep) * tickStep);
                    } else {
                        start = from;
                    }
                    for (float val = start; val <= to; val += tickStep) {
                        float fraction = (val - from) / range;
                        float cx = trackLeft + fraction * trackWidth;
                        if (Math.abs(cx - thumbX) < exclusion) continue;
                        boolean inActive = val < thumbVal;
                        mPaint.setColor(inActive ? inactiveColor : activeColor);
                        canvas.drawCircle(cx, cy, radius, mPaint);
                    }
                }
            }

            @Override public void setAlpha(int alpha) {}
            @Override public void setColorFilter(android.graphics.ColorFilter cf) {}
            @Override public int getOpacity() { return android.graphics.PixelFormat.TRANSLUCENT; }
        };

        slider.getOverlay().add(dotDrawable);
        slider.addOnLayoutChangeListener((v, l, t, r, b, ol, ot, or2, ob) -> {
            dotDrawable.setBounds(0, 0, slider.getWidth(), slider.getHeight());
            dotDrawable.invalidateSelf();
        });
        slider.addOnChangeListener((s, value, fromUser) -> dotDrawable.invalidateSelf());
    }

    private static int getTrackColor(Slider slider, boolean active) {
        ColorStateList csl = active ? slider.getTrackActiveTintList() : slider.getTrackInactiveTintList();
        return csl != null ? csl.getDefaultColor() : 0xFF888888;
    }

    private void performReset() {
        if (mDefaultValueExists) {
            applyUserValue(mDefaultValue, null);
        }
    }

    private static int dp(TextView v, int dp) {
        return Math.round(dp * v.getResources().getDisplayMetrics().density);
    }
}
