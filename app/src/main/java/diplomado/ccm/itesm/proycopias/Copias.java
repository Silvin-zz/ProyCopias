package diplomado.ccm.itesm.proycopias;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Copias extends Activity {

    private EditText etFrom;
    private EditText etTo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copias);
        etFrom   = (EditText) findViewById(R.id.textSource);
        etTo     = (EditText) findViewById(R.id.textDestiny);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_copias, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void copyText(View vw){
        Log.d("test", "Iniciando el copiado de los datos");
        etTo.setText(etFrom.getText().toString());
        etFrom.setText("");
        Log.d("text", "Finalizamos el copiado de los datos");
        /*TextView txtSource  = (TextView) findViewById(R.id.textSource);
        TextView txtDestiny = (TextView) findViewById(R.id.textDestiny);
        txtDestiny.setText(txtSource.getText());
        */

    }
}
