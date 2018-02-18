package android.example.com.one_1202154320_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void pesantakeaway(View view) {
        Intent i = new Intent(this, Daftar_Menu.class); //supaya button bisa ke klik dan pindah ke kelas daftar_menu
        startActivity(i);
    }
}
