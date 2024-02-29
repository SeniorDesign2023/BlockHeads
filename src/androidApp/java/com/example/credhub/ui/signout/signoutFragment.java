package com.example.credhub.ui.signout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.example.credhub.R;
import com.example.credhub.mainload; // Assuming MainLoad is your activity class for the main page

public class signoutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_signout, container, false);

        // Assuming you have a button named signout_button in your fragment's layout
        view.findViewById(R.id.signout_button).setOnClickListener(v -> {
            // Navigate to MainLoad activity when sign-out button is clicked
            startActivity(new Intent(getActivity(), mainload.class));
            // Finish the current activity if necessary
            getActivity().finish();
        });

        return view;
    }
}
