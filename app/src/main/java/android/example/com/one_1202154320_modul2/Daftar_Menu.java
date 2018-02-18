package android.example.com.one_1202154320_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Daftar_Menu extends AppCompatActivity {
    private List<list> daftarMenu = new ArrayList<>();  //buat list array, diambil dari kelas list
    private RecyclerView recyclerView; //buat recycler view
    private Menu_Adapter mAdapter; //buat adapter, penghubung , menu dan list

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar__menu);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view); //ngambil layout recycler view

        mAdapter = new Menu_Adapter(this, daftarMenu);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        list list = new list(R.drawable.luti, "Luti", "Rp. 3.000", R.string.luti);
        daftarMenu.add(list);
        list = new list(R.drawable.bihungoreng, "Bihun Goreng", "Rp. 13.000", R.string.bigor);
        daftarMenu.add(list);
        list = new list(R.drawable.miegoreng, "Mie Goreng", "Rp. 10.000", R.string.miegoreng);
        daftarMenu.add(list);
        list = new list(R.drawable.mierebus, "Mie Rebus", "Rp. 10.000", R.string.mierebus);
        daftarMenu.add(list);
        list = new list(R.drawable.nasgor_kampung, "Nasi Goreng Kampung", "Rp. 15.000", R.string.naskam);
        daftarMenu.add(list);
        list = new list(R.drawable.nasgor_seafood, "Nasi Goreng Seafood", "Rp. 18.000", R.string.nasea);
        daftarMenu.add(list);
        list = new list(R.drawable.satepadang, "Sate Padang", "Rp. 18.000", R.string.satepadang);
        daftarMenu.add(list);
        list = new list(R.drawable.tarempagoreng, "Tarempa Goreng", "Rp. 17.000", R.string.targor);
        daftarMenu.add(list);
        list = new list(R.drawable.tarempalembab, "Tarempa Lembab", "Rp. 17.000", R.string.tarbap);
        daftarMenu.add(list);
    }
}
