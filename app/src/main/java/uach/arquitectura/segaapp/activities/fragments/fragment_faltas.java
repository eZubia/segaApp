package uach.arquitectura.segaapp.activities.fragments;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import uach.arquitectura.segaapp.R;
import uach.arquitectura.segaapp.models.Calificacion;
import uach.arquitectura.segaapp.models.Falta;
import uach.arquitectura.segaapp.servicios.ReadJSON;

/**
 * Created by Edgar on 25/05/2015.
 */
public class fragment_faltas extends Fragment {
    String matricula;
    List<Falta> faltas = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        matricula = this.getArguments().getString("matricula");
        System.out.println("Matricula fal = " + matricula   );
        faltas = getFaltas(matricula);
        System.out.println(faltas.toString());
        View rootView = inflater.inflate(R.layout.fragment_faltas, container, false);
        return rootView;
    }

    public List<Falta> getFaltas(String matricula) {
        ConectarServer server = new ConectarServer(this.getArguments().getString("matricula"));
        server.execute();
        String isOk = "null";
        try {
            isOk = server.get();
            Gson gson = new Gson();
            Type calificaciones2 = new TypeToken<ArrayList<Calificacion>>() {
            }.getType();
            List<Falta> faltas =gson.fromJson(isOk, calificaciones2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return faltas;

    }

    private class ConectarServer extends AsyncTask<Void, Integer, String> {

        private String matricula;


        public ConectarServer(String matricula) {
            this.matricula = matricula;
        }

        @Override
        protected String doInBackground(Void... arg0) {
            String valor = ReadJSON.leerJSON(String.format(
                    "/faltas/faltasalumnos/%s", matricula));

            return valor;
        }
    }
}
