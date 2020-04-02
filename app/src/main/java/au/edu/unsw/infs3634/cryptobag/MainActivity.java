package au.edu.unsw.infs3634.cryptobag;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.List;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private boolean mTwoPane;
    List<Coin> coins;
    Boolean inWide;
    String data = coinAPI();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinlore.net/api/tickers/?start=100&limit=100")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Gson gson = new Gson();

        CoinService service = retrofit.create(CoinService.class);

        Call<CoinLoreResponse> coinCall;
        Response<CoinLoreResponse> coinsResponse;
        List<Coin> coins = CoinsResponse.
        coins = list.getData();
        inWide = findViewById(R.id.detailContainer)!=null;
        Log.d(TAG, "boolean " + String.valueOf(inWide));
        if (findViewById(R.id.detail_container) != null) {
            mTwoPane = true;
        }

        RecyclerView mRecyclerView = findViewById(R.id.rvList);
        mRecyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        RecyclerView.Adapter mAdapter = new CoinAdapter(this, Coin.getCoins(), mTwoPane);
        mRecyclerView.setAdapter(mAdapter);

        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            Gson gson = new Gson();

            CoinLoreResponse list  =  gson.fromJson(data, CoinLoreResponse.class);
            coins = list.getData();
    }

        private void clickResponse(int position) {

            Coin coin = coins.get(position);


            if(!inWide){

                Intent intent = new Intent(this, DetailActivity.class);
                intent.putExtra("crypto", new Gson().toJson(coin));
                startActivity(intent);
            } else {

                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Fragment fragment = new DetailFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("crypto", coin);
                fragment.setArguments(bundle);
                transaction.replace(R.id.fragment_detail, fragment);
                transaction.commit();
            }




    }
}
