package uach.arquitectura.segaapp.activities.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import uach.arquitectura.segaapp.R;

/**
 * Created by Edgar on 25/05/2015.
 */
public class fragment_horario extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_horario, container, false);
        return rootView;
    }

}
