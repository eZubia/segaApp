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
import java.util.Arrays;
import java.util.List;

import uach.arquitectura.segaapp.R;
import uach.arquitectura.segaapp.models.Alumno;
import uach.arquitectura.segaapp.models.Calificacion;
import uach.arquitectura.segaapp.servicios.ReadJSON;

/**
 * Created by Edgar on 25/05/2015.
 */
public class fragment_calificaciones extends Fragment {
    String matricula;
    List<Calificacion> calificaciones = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_calificaciones, container, false);

        matricula = this.getArguments().getString("matricula");
        System.out.println("Matricula cal = " + matricula   );
        //getCalificaciones(matricula);
        //System.out.println(calificaciones.toString());
        return rootView;
    }



    public void getCalificaciones(String matricula) {
        ConectarServer server = new ConectarServer(this.getArguments().getString("matricula"));
        server.execute();
        String isOk = "null";
        try {
            isOk = server.get();
            Gson gson = new Gson();
            Type calificaciones2 = new TypeToken<ArrayList<Calificacion>>() {
            }.getType();
            gson.fromJson(isOk, calificaciones2);
            calificaciones = (List<Calificacion>) calificaciones2;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private class ConectarServer extends AsyncTask<Void, Integer, String> {

        private String matricula;


        public ConectarServer(String matricula) {
            this.matricula = matricula;
        }

        @Override
        protected String doInBackground(Void... arg0) {
            String valor = ReadJSON.leerJSON(String.format(
                    "/calificaciones/%s", matricula));

            return valor;
        }
    }
}
