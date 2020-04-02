package au.edu.unsw.infs3634.cryptobag;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

public class DetailActivity extends AppCompatActivity {
    Coin coin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String jsonMyObject;
        Intent i = getIntent();
        if(i.getExtras() != null) {
            Bundle extras = i.getExtras();
            jsonMyObject = extras.getString("crypto");
            coin = new Gson().fromJson(jsonMyObject, CoinService.class);

        }

        if (savedInstanceState == null) {
            Bundle arguments = new Bundle();
            arguments.putString(DetailFragment.ARG_ITEM_ID, getIntent().getStringExtra(DetailFragment.ARG_ITEM_ID));
            DetailFragment fragment = new DetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.detail_container, fragment)
                    .commit();
        }
    }
}
