package com.example.privacyio;

import android.animation.LayoutTransition;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.privacyio.databinding.FragmentOpcionMenPpasosBinding;
import com.example.privacyio.databinding.FragmentTrackBinding;

public class OpcionMenTrack extends Fragment implements View.OnClickListener{

    private FragmentTrackBinding binding;

    public OpcionMenTrack() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentTrackBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnTrack1.setOnClickListener(this);
        binding.txtTrack1.setVisibility(View.GONE);
        binding.btnTrack2.setOnClickListener(this);
        binding.txtTrack2.setVisibility(View.GONE);
        binding.btnTrack3.setOnClickListener(this);
        binding.txtTrack3.setVisibility(View.GONE);
        binding.btnTrack4.setOnClickListener(this);
        binding.txtTrack4.setVisibility(View.GONE);
        binding.btnTrack5.setOnClickListener(this);
        binding.txtTrack5.setVisibility(View.GONE);
        binding.layTracks.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //Toast.makeText(binding.getRoot().getContext(), "onviewCrea", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onClick(View view) {
        int v = 0;
        switch (view.getId()) {
            case R.id.btn_track1:
                v = (binding.txtTrack1.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layTracks, new AutoTransition());
                binding.txtTrack1.setVisibility(v);
                break;
            case R.id.btn_track2:
                v = (binding.txtTrack2.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layTracks, new AutoTransition());
                binding.txtTrack2.setVisibility(v);
                break;
            case R.id.btn_track3:
                v = (binding.txtTrack3.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layTracks, new AutoTransition());
                binding.txtTrack3.setVisibility(v);
                break;
            case R.id.btn_track4:
                v = (binding.txtTrack4.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layTracks, new AutoTransition());
                binding.txtTrack4.setVisibility(v);
                break;
            case R.id.btn_track5:
                v = (binding.txtTrack5.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layTracks, new AutoTransition());
                binding.txtTrack5.setVisibility(v);
                break;
            
        }
    }
}