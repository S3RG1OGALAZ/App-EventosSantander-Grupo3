package com.isunican.eventossantander.view.eventsdetail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.isunican.eventossantander.R;
import com.isunican.eventossantander.model.Event;
import com.squareup.picasso.Picasso;

public class EventsDetailActivity extends AppCompatActivity {

    public static final String INTENT_EVENT = "INTENT_EVENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events_detail);

        // Link to view elements
        TextView eventTitleText = findViewById(R.id.event_detail_title);
        TextView eventDateText = findViewById(R.id.event_detail_date);

        // Get Event from the intent that triggered this activity
        Event event = getIntent().getExtras().getParcelable(INTENT_EVENT);

        // Set information
        eventTitleText.setText(event.getNombre());
        eventDateText.setText(event.getFecha());
    }
}