package com.example.adila.resepmasakan;

import android.media.Image;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailResep extends AppCompatActivity {

    TextView judulDetail, bahanResep, pembuatanResep;
    ImageView gambarResep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int gambar = getIntent().getIntExtra("gambar_resep",0);
        String judul = getIntent().getStringExtra("text_judul");
        String bahan = getIntent().getStringExtra("text_bahan");
        String pembuatan = getIntent().getStringExtra("text_pembuatan");

        judulDetail = (TextView)findViewById(R.id.judul2);
        bahanResep = (TextView)findViewById(R.id.bahan);
        pembuatanResep = (TextView)findViewById(R.id.carapembuatan);
        gambarResep = (ImageView)findViewById(R.id.gambar2);

        judulDetail.setText(judul.toString());
        bahanResep.setText(bahan.toString());
        pembuatanResep.setText(pembuatan.toString());
        gambarResep.setImageResource(gambar);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
