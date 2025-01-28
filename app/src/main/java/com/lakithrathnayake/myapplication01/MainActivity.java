package com.lakithrathnayake.myapplication01;

import android.annotation.SuppressLint;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ContentValues;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String msg = "Android: ";
    Button b1, b2, b3;

    /** Called when the activity is first created. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        Log.d(msg, "The onCreate() event");

//        Configuration config = getResources().getConfiguration();
//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//
//        if (config.orientation == Configuration.ORIENTATION_LANDSCAPE) {
//            /**
//             * Landscape mode of the device
//             */
//            LM_Fragment ls_fragment = new LM_Fragment();
//            fragmentTransaction.replace(android.R.id.content, ls_fragment);
//        }else{
//            /**
//             * Portrait mode of the device
//             */
//            PM_Fragment pm_fragment = new PM_Fragment();
//            fragmentTransaction.replace(android.R.id.content, pm_fragment);
//        }
//        fragmentTransaction.commit();
//    }


    /** Called when the activity is about to become visible. */
//    @Override
//    protected void onStart() {
//        super.onStart();
//        Log.d(msg, "The onStart() event");
//    }
//
//    /** Called when the activity has become visible. */
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.d(msg, "The onResume() event");
//    }
//
//    /** Called when another activity is taking focus. */
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.d(msg, "The onPause() event");
//    }
//
//    /** Called when the activity is no longer visible. */
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.d(msg, "The onStop() event");
//    }
//
//    /** Called just before the activity is destroyed. */
//    @Override
//    public void onDestroy() {
//        super.onDestroy();
//        Log.d(msg, "The onDestroy() event");
//    }
//
//    public void startService(View view) {
//        startService(new Intent(getBaseContext(), MyService.class));
//    }
//
//    public void stopService(View view) {
//        stopService(new Intent(getBaseContext(), MyService.class));
//    }
//
//    public void broadcastIntent(View view) {
//        Intent intent = new Intent();
//        intent.setAction("com.lakithrathnayake.CUSTOM_INTENT");
//        sendBroadcast(intent);
//    }

//    public void onClickAddName(View view) {
//        ContentValues values = new ContentValues();
//        values.put(StudentProvider.NAME, ((EditText)findViewById(R.id.editText2)).getText().toString());
//
//        values.put(StudentProvider.GRADE, ((EditText)findViewById(R.id.editText3)).getText().toString());
//
//        Uri uri = getContentResolver().insert(StudentProvider.CONTENT_URI, values);
//        Toast.makeText(getBaseContext(), uri.toString(), Toast.LENGTH_LONG).show();
//    }
//
//
//    @SuppressLint("Range")
//    public void onClickRetrieveStudents(View view) {
//        String URL = "content://com.lakithrathnayake.myapplication01.StudentProvider";
//
//        Uri students = Uri.parse(URL);
//        Cursor c = managedQuery(students, null, null, null, "name");
//
//        if (c.moveToFirst()) {
//            do{
//                Toast.makeText(this,
//                        c.getString(c.getColumnIndex(StudentProvider._ID)) +
//                                ", " +  c.getString(c.getColumnIndex( StudentProvider.NAME)) +
//                                ", " + c.getString(c.getColumnIndex( StudentProvider.GRADE)),
//                        Toast.LENGTH_SHORT).show();
//            } while (c.moveToNext());
//        }

        b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"));
                startActivity(i);
            }
        });

        b2 = findViewById(R.id.button2);
        b2.setOnClickListener(v -> {
            Intent i = new Intent("com.lakithrathnayake.myapplication01.LAUNCH",
                    Uri.parse("https://www.google.com"));
            startActivity(i);
        });

        b3 = findViewById(R.id.button3);
        b3.setOnClickListener(v -> {
            Intent i = new Intent("com.lakithrathnayake.myapplication01.LAUNCH",
                    Uri.parse("http://www.google.com"));
            startActivity(i);
        });
    }
}