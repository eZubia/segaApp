package uach.arquitectura.segaapp.views;

import android.os.AsyncTask;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

import uach.arquitectura.segaapp.R;
import uach.arquitectura.segaapp.models.Alumno;
import uach.arquitectura.segaapp.servicios.ReadJSON;

public class LogIn extends ActionBarActivity {

    EditText texMatricula;
    EditText textContrasena;
    Button btnEntrar;
    Alumno alumno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        texMatricula = (EditText) findViewById(R.id.txtMatricula);
        textContrasena = (EditText) findViewById(R.id.txtContrasena);
        btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Boolean b = verificarUsuario(texMatricula.getText().toString(), textContrasena.getText().toString());
                System.out.println(b);

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_log_in, menu);
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

    public boolean verificarUsuario(String usuario, String password) {
        ConectarServer server = new ConectarServer(usuario, password);
        server.execute();
        Alumno u = null;
        String isOk = "null";
        try {
            isOk = server.get();
            Gson gson =new Gson();
            u = gson.fromJson(isOk, Alumno.class);
            alumno = u;
        } catch (Exception e) {
            e.printStackTrace();
            return(false);
        }

	/*	if(usuario.equals("")){
			return false;
		}*/

        return u.getMatricula().toString().equals(usuario.toLowerCase());
    }

    private class ConectarServer extends AsyncTask<Void, Integer, String> {

        private String user;
        private String password;

        public ConectarServer(String user, String password) {
            this.user = user;
            this.password = password;
        }

        @Override
        protected String doInBackground(Void... arg0) {
            String valor = ReadJSON.leerJSON(String.format(
                    "/%s/%s", user,
                    password));

            return valor;
        }

    }

}
