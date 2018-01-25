package com.ocnyang.pushlibrary;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

/*******************************************************************
 *    * * * *   * * * *   *     *       Created by OCN.Yang
 *    *     *   *         * *   *       Time:2018/1/15 16:03.
 *    *     *   *         *   * *       Email address:ocnyang@gmail.com
 *    * * * *   * * * *   *     *.Yang  Web site:www.ocnyang.com
 *******************************************************************/

public class TimeIntervalDialog extends Dialog implements TimePicker.OnTimeChangedListener {

    private TimeIntervalInterface mTimeIntervalInterface;
    private Context mContext;
    private TimePicker mStartTimePicker, mEndTimePicker;
    private int mStartHour, mStartMinute, mEndHour, mEndMinute;

    private Button.OnClickListener clickListener = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            int i = v.getId();
            if (i == R.id.btn_apply) {
                dismiss();
                mTimeIntervalInterface.apply(mStartHour, mStartMinute, mEndHour, mEndMinute);

            } else if (i == R.id.btn_cancel) {
                dismiss();
                mTimeIntervalInterface.cancel();

            }
        }
    };

    public TimeIntervalDialog(Context context, TimeIntervalInterface timeIntervalInterface,
                              int startHour, int startMinute, int endHour, int endMinute) {
        super(context);
        mContext = context;
        this.mTimeIntervalInterface = timeIntervalInterface;
        this.mStartHour = startHour;
        this.mStartMinute = startMinute;
        this.mEndHour = endHour;
        this.mEndMinute = endMinute;
    }

    public TimeIntervalDialog(Context context, TimeIntervalInterface timeIntervalInterface) {
        this(context, timeIntervalInterface, 0, 0, 23, 59);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.set_time_dialog);
        setCancelable(true);
        setTitle(mContext.getString(R.string.set_accept_time));
        mStartTimePicker = (TimePicker) findViewById(R.id.startTimePicker);
        mStartTimePicker.setIs24HourView(true);
        mStartTimePicker.setCurrentHour(mStartHour);
        mStartTimePicker.setCurrentMinute(mStartMinute);
        mStartTimePicker.setOnTimeChangedListener(this);
        mEndTimePicker = (TimePicker) findViewById(R.id.endTimePicker);
        mEndTimePicker.setIs24HourView(true);
        mEndTimePicker.setCurrentHour(mEndHour);
        mEndTimePicker.setCurrentMinute(mEndMinute);
        mEndTimePicker.setOnTimeChangedListener(this);
        Button applyBtn = (Button) findViewById(R.id.btn_apply);
        applyBtn.setOnClickListener(clickListener);
        Button cancelBtn = (Button) findViewById(R.id.btn_cancel);
        cancelBtn.setOnClickListener(clickListener);
    }

    @Override
    public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
        if (view == mStartTimePicker) {
            mStartHour = hourOfDay;
            mStartMinute = minute;
        } else if (view == mEndTimePicker) {
            mEndHour = hourOfDay;
            mEndMinute = minute;
        }
    }

    interface TimeIntervalInterface {
        void apply(int startHour, int startMin, int endHour, int endMin);

        void cancel();
    }
}

