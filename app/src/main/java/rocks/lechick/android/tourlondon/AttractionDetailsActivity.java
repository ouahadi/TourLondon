package rocks.lechick.android.tourlondon;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AttractionDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attraction_details);

        Intent intent = getIntent();
        if (null != intent) {
            TextView attractionName = (TextView) findViewById(R.id.attraction_name);
            attractionName.setText(intent.getStringExtra("LocationName"));

            TextView workingHours = (TextView) findViewById(R.id.working_hours);
            workingHours.setText(intent.getStringExtra("ExtraBit"));

            TextView summary = (TextView) findViewById(R.id.summary);
            summary.setText(intent.getStringExtra("LocationSummary"));

            ImageView attractionImage = (ImageView) findViewById(R.id.attraction_image);
            attractionImage.setImageResource(intent.getIntExtra("Image", R.drawable.ldn));

        }

        Bundle extras = getIntent().getExtras();
        ImageView website = (ImageView) findViewById(R.id.website);
        if (extras.containsKey("LocationWebsite")) {
            website.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = getIntent();
                    Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(intent.getStringExtra("LocationWebsite")));
                    startActivity(i);
                }
            });
        }
        else{
            website.setVisibility(View.GONE);
        }

        ImageView pin = (ImageView) findViewById(R.id.pin);
        pin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(intent.getStringExtra("LocationLink")));
                startActivity(i);
            }
        });

        ImageView phone = (ImageView) findViewById(R.id.phone);
        if (extras.containsKey("LocationWebsite")) {
            phone.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = getIntent();
                    Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + intent.getStringExtra("LocationPhone")));
                    startActivity(i);
                }
            });
        }
        else {
            phone.setVisibility(View.GONE);
        }
    }
}
