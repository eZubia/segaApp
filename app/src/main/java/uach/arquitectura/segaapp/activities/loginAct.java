package uach.arquitectura.segaapp.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import uach.arquitectura.segaapp.R;

public class loginAct extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);                    //setContentView es quien lanza el .xml de su respectiva clase .java.
        Button btnLogin = (Button) findViewById(R.id.btnLogin);     //Creamos un objeto Boton.
        btnLogin.setOnClickListener(new View.OnClickListener() {    //Le asignamos un ClickListener.
            @Override
            public void onClick(View v) {
                String Matricula = ((EditText) findViewById(R.id.txtMatricula)).getText().toString();       //Creamos variables para
                String Contrasenia = ((EditText) findViewById(R.id.txtContrasenia)).getText().toString();   //gardar valores de
                                                                                                            //matricula y contraseña.

                if( Matricula.equals("admin") && Contrasenia.equals("admin"))
                {
                    Intent OpenMenu = new Intent(loginAct.this,MenuAct.class);
                    startActivity(OpenMenu);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Error de identificacion", Toast.LENGTH_LONG).show(); //Toast manda un mensaje de error
                }                                                                                                //al usuario en forma de globo
                                                                                                                 //emergente.
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
}
