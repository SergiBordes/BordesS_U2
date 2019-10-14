package es.upv.bordess_u2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTabHost;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText entrada;
    private TextView salida;

    private FragmentTabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada = (EditText) findViewById(R.id.entrada);
        salida = (TextView) findViewById(R.id.salida);

        tabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        tabHost.setup(this,
                getSupportFragmentManager(),android.R.id.tabcontent);
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("Lengüeta 1"),
                Tab1.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("Lengüeta 2"),
                Tab2.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("Lengüeta 3"),
                Tab3.class, null);
        tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator("Lengüeta 4"),
                Tab4.class, null);

    }

    public void sePulsa(View view){
        Toast.makeText(this, "Pulsado", Toast.LENGTH_SHORT).show();
    }

    public void sePulsaPts(View view){
        salida.setText(String.valueOf(
                Float.parseFloat(entrada.getText().toString())*(166.386)));
    }


    public void sePulsaNum(View view){
        entrada.setText(entrada.getText()+(String)view.getTag());
    }


}
