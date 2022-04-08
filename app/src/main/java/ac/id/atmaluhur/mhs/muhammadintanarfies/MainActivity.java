package ac.id.atmaluhur.mhs.muhammadintanarfies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText kolom1;
    EditText kolom2;
    EditText kolom3;
    EditText kolom4;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kolom1 = (EditText) findViewById(R.id.kolom1);
        kolom2 = (EditText) findViewById(R.id.kolom2);
        kolom3 = (EditText) findViewById(R.id.kolom3);
        kolom4 = (EditText) findViewById(R.id.kolom4);
        hasil = (TextView) findViewById(R.id.hasil);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void hitung (View View){
        Integer a = Integer.parseInt(kolom1.getText().toString());
        Integer b = Integer.parseInt(kolom2.getText().toString());
        Integer c = Integer.parseInt(kolom3.getText().toString());
        Integer d = Integer.parseInt(kolom4.getText().toString());
        Integer e = a * 10/100 + b * 20/100 + c * 30/100 + d * 40/100;
        hasil.setText("HASIL NILAI AKHIR ANDA ADALAH = "+e);
    }
}