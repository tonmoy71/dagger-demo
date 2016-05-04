package co.gobd.dagger2demo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Inject
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App) getApplication()).getComponent().inject(this);

        if (preferences != null) {
            Log.i(TAG, "Shared preferences is not null");
        }

        ProHelper proHelper = new ProHelperImpl();
        Toast.makeText(getApplicationContext(), "Is pro? :  " + proHelper.isPro(), Toast.LENGTH_LONG).show();

    }
}
