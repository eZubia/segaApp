package uach.arquitectura.segaapp.activities.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import uach.arquitectura.segaapp.R;

/**
 * Created by Edgar on 25/05/2015.
 */
public class fragment_horario extends Fragment {

    Button btnLunes;
    Button btnMartes;
    Button btnMiercoles;
    Button btnJueves;
    Button btnSabado;
    Button btnViernes;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_horario, container, false);
        return rootView;
        //btnLunes = (Button) this.ge.btnLunes);
        //btnMartes = (Button) getActivity().findViewById(R.id.btnMartes);
        //btnMiercoles = (Button) getActivity().findViewById(R.id.btnMiercoles);
        //btnJueves = (Button) getActivity().findViewById(R.id.btnJueves);
        //btnViernes = (Button) getActivity().findViewById(R.id.btnViernes);
        //btnSabado = (Button) getActivity().findViewById(R.id.btnSabado);
    }

}
