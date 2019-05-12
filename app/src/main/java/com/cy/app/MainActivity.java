package com.cy.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import org.wangchenlong.datescroller.widget.DateScrollerDialog;
import org.wangchenlong.datescroller.widget.data.Type;
import org.wangchenlong.datescroller.widget.listener.OnDateSetListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import static org.wangchenlong.datescroller.widget.data.Type.HOURS_MINS;

public class MainActivity extends AppCompatActivity
{
    private static final long HUNDRED_YEARS = 100L * 365 * 1000 * 60 * 60 * 24L; // 100年
    private TextView mTvTime;
    private TextView mTvTime1;
    private TextView mTvTime2;
    private TextView mTvTime3;
    private TextView mTvTime4;
    private TextView mTvTime5;
    private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ENGLISH);
    private SimpleDateFormat sf1 = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
    private SimpleDateFormat sf2 = new SimpleDateFormat("HH:mm", Locale.ENGLISH);
    private SimpleDateFormat sf3 = new SimpleDateFormat("MM-dd HH:mm", Locale.ENGLISH);
    private SimpleDateFormat sf4 = new SimpleDateFormat("yyyy-MM", Locale.ENGLISH);
    private SimpleDateFormat sf5 = new SimpleDateFormat("yyyy", Locale.ENGLISH);
    private long mLastTime = System.currentTimeMillis(); // 上次设置的时间
    private long mLastTime1 = System.currentTimeMillis(); // 上次设置的时间
    private long mLastTime2 = System.currentTimeMillis(); // 上次设置的时间
    private long mLastTime3 = System.currentTimeMillis(); // 上次设置的时间
    private long mLastTime4 = System.currentTimeMillis(); // 上次设置的时间
    private long mLastTime5 = System.currentTimeMillis(); // 上次设置的时间

    // 数据的回调
    private OnDateSetListener mOnDateSetListener = new OnDateSetListener() {
        @Override
        public void onDateSet(DateScrollerDialog timePickerView, long milliseconds) {
            mLastTime = milliseconds;
            String text = getDateToString(milliseconds);
            mTvTime.setText(text);
        }
    };

    // 数据的回调
    private OnDateSetListener mOnDateSetListener1 = new OnDateSetListener() {
        @Override
        public void onDateSet(DateScrollerDialog timePickerView, long milliseconds1) {
            mLastTime = milliseconds1;
            String text = getDateToString1(milliseconds1);
            mTvTime1.setText(text);
        }
    };


    // 数据的回调
    private OnDateSetListener mOnDateSetListener2 = new OnDateSetListener() {
        @Override
        public void onDateSet(DateScrollerDialog timePickerView, long milliseconds2) {
            mLastTime = milliseconds2;
            String text = getDateToString2(milliseconds2);
            mTvTime2.setText(text);
        }
    };


    // 数据的回调
    private OnDateSetListener mOnDateSetListener3 = new OnDateSetListener() {
        @Override
        public void onDateSet(DateScrollerDialog timePickerView, long milliseconds3) {
            mLastTime = milliseconds3;
            String text = getDateToString3(milliseconds3);
            mTvTime3.setText(text);
        }
    };


    // 数据的回调
    private OnDateSetListener mOnDateSetListener4 = new OnDateSetListener() {
        @Override
        public void onDateSet(DateScrollerDialog timePickerView, long milliseconds4) {
            mLastTime = milliseconds4;
            String text = getDateToString4(milliseconds4);
            mTvTime4.setText(text);
        }
    };


    // 数据的回调
    private OnDateSetListener mOnDateSetListener5 = new OnDateSetListener() {
        @Override
        public void onDateSet(DateScrollerDialog timePickerView, long milliseconds5) {
            mLastTime = milliseconds5;
            String text = getDateToString5(milliseconds5);
            mTvTime5.setText(text);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView(); // 初始化View
        clickEvent();
    }

    private void clickEvent() {
        mTvTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 出生日期
                DateScrollerDialog dialog = new DateScrollerDialog.Builder()
                        .setType(Type.ALL)
                        .setTitleStringId("请选择年月日时分")
                        .setMinMilliseconds(System.currentTimeMillis() - HUNDRED_YEARS)
                        .setMaxMilliseconds(System.currentTimeMillis())
                        .setCurMilliseconds(mLastTime)
                        .setCallback(mOnDateSetListener)
                        .build();
                if (dialog != null) {
                    if (!dialog.isAdded()) {

                        dialog.show(getSupportFragmentManager(), "year_month_day");
                    }
                }

            }
        });

        mTvTime1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 出生日期
                DateScrollerDialog dialog = new DateScrollerDialog.Builder()
                        .setType(Type.YEAR_MONTH_DAY)
                        .setTitleStringId("请选择年月日")
                        .setMinMilliseconds(System.currentTimeMillis() - HUNDRED_YEARS)
                        .setMaxMilliseconds(System.currentTimeMillis())
                        .setCurMilliseconds(mLastTime1)
                        .setCallback(mOnDateSetListener1)
                        .build();
                if (dialog != null) {
                    if (!dialog.isAdded()) {
                        dialog.show(getSupportFragmentManager(), "year_month_day");
                    }
                }

            }
        });

        mTvTime2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 出生日期
                DateScrollerDialog dialog = new DateScrollerDialog.Builder()
                        .setType(Type.HOURS_MINS)
                        .setTitleStringId("请选择时分")
                        .setMinMilliseconds(System.currentTimeMillis() - HUNDRED_YEARS)
                        .setMaxMilliseconds(System.currentTimeMillis())
                        .setCurMilliseconds(mLastTime2)
                        .setCallback(mOnDateSetListener2)
                        .build();
                if (dialog != null) {
                    if (!dialog.isAdded()) {
                        dialog.show(getSupportFragmentManager(), "year_month_day");
                    }
                }
            }
        });


        mTvTime3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 出生日期
                DateScrollerDialog dialog = new DateScrollerDialog.Builder()
                        .setType(Type.MONTH_DAY_HOUR_MIN)
                        .setTitleStringId("请选择月日时分")
                        .setMinMilliseconds(System.currentTimeMillis() - HUNDRED_YEARS)
                        .setMaxMilliseconds(System.currentTimeMillis())
                        .setCurMilliseconds(mLastTime3)
                        .setCallback(mOnDateSetListener3)
                        .build();
                if (dialog != null) {
                    if (!dialog.isAdded()) {
                        dialog.show(getSupportFragmentManager(), "year_month_day");
                    }
                }

            }
        });

        mTvTime4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // 出生日期
                DateScrollerDialog dialog = new DateScrollerDialog.Builder()
                        .setType(Type.YEAR_MONTH)
                        .setTitleStringId("请选择年月")
                        .setMinMilliseconds(System.currentTimeMillis() - HUNDRED_YEARS)
                        .setMaxMilliseconds(System.currentTimeMillis())
                        .setCurMilliseconds(mLastTime4)
                        .setCallback(mOnDateSetListener4)
                        .build();
                if (dialog != null) {
                    if (!dialog.isAdded()) {
                        dialog.show(getSupportFragmentManager(), "year_month_day");
                    }
                }

            }
        });

        mTvTime5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 出生日期
                DateScrollerDialog dialog = new DateScrollerDialog.Builder()
                        .setType(Type.YEAR)
                        .setTitleStringId("请选择年份")
                        .setMinMilliseconds(System.currentTimeMillis() - HUNDRED_YEARS)
                        .setMaxMilliseconds(System.currentTimeMillis())
                        .setCurMilliseconds(mLastTime5)
                        .setCallback(mOnDateSetListener5)
                        .build();
                if (dialog != null) {
                    if (!dialog.isAdded()) {
                        dialog.show(getSupportFragmentManager(), "year_month_day");
                    }
                }

            }
        });
    }


    // 初始化视图
    private void initView()
    {
        mTvTime = (TextView) findViewById(R.id.tv_time);
        mTvTime1 = (TextView) findViewById(R.id.tv_time1);
        mTvTime2 = (TextView) findViewById(R.id.tv_time2);
        mTvTime3 = (TextView) findViewById(R.id.tv_time3);
        mTvTime4 = (TextView) findViewById(R.id.tv_time4);
        mTvTime5 = (TextView) findViewById(R.id.tv_time5);
    }

    public String getDateToString(long time)
    {
        Date d = new Date(time);
        return sf.format(d);
    }

    public String getDateToString1(long time)
    {
        Date d = new Date(time);
        return sf1.format(d);
    }
    public String getDateToString2(long time)
    {
        Date d = new Date(time);
        return sf2.format(d);
    }

    public String getDateToString3(long time)
    {
        Date d = new Date(time);
        return sf3.format(d);
    }
    public String getDateToString4(long time)
    {
        Date d = new Date(time);
        return sf4.format(d);
    }

    public String getDateToString5(long time)
    {
        Date d = new Date(time);
        return sf5.format(d);
    }
}
