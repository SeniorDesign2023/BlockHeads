package com.example.credhub.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.credhub.R;
import com.example.credhub.ageValidated;
import com.example.credhub.databinding.FragmentHomeBinding;
import com.example.credhub.degree_validated;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Find your buttons by their IDs
        Button degreeButton = root.findViewById(R.id.degreebutton);
        Button ageButton = root.findViewById(R.id.agebutton);

        // Set OnClickListener for degreeButton
        degreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle degreeButton click
                navigateToDegreeValidatedActivity();
            }
        });

        // Set OnClickListener for ageButton
        ageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle ageButton click
                navigateToMainActivity();
            }
        });

        return root;
    }

    // Method to navigate to activity_degree_validated
    private void navigateToDegreeValidatedActivity() {
        Intent intent = new Intent(requireContext(), degree_validated.class);
        startActivity(intent);
    }

    // Method to navigate to MainActivity
    private void navigateToMainActivity() {
        Intent intent = new Intent(requireContext(), ageValidated.class);
        startActivity(intent);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
