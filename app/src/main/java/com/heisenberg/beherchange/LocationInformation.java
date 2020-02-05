package com.heisenberg.beherchange;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static com.heisenberg.beherchange.StartTrip.addresses;


/**
 * Created by ssaim on 27-09-2019.
 */

public class LocationInformation extends BottomSheetDialogFragment {
    View rootView;
    public LocationInformation() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_bottom_sheet_dialog, container, false);
        TextView name_ana = rootView.findViewById(R.id.name_ana);
        name_ana.setText(addresses.get(0).getAddressLine(0));
        return rootView;
    }
}
