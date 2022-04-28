package com.example.privacyio;

import android.animation.LayoutTransition;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.privacyio.databinding.FragmentOpcionMenPpasosBinding;

public class OpcionMenPpasos extends Fragment implements View.OnClickListener {

    private FragmentOpcionMenPpasosBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentOpcionMenPpasosBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnConcepto1.setOnClickListener(this);
        binding.txtConcepto1.setVisibility(View.GONE);
        binding.btnConcepto2.setOnClickListener(this);
        binding.txtConcepto2.setVisibility(View.GONE);
        binding.btnConcepto3.setOnClickListener(this);
        binding.txtConcepto3.setVisibility(View.GONE);
        binding.btnConcepto4.setOnClickListener(this);
        binding.txtConcepto4.setVisibility(View.GONE);
        binding.btnConcepto5.setOnClickListener(this);
        binding.txtConcepto5.setVisibility(View.GONE);
        binding.btnConcepto6.setOnClickListener(this);
        binding.txtConcepto6.setVisibility(View.GONE);
        binding.btnConcepto7.setOnClickListener(this);
        binding.txtConcepto7.setVisibility(View.GONE);
        binding.btnConcepto8.setOnClickListener(this);
        binding.txtConcepto8.setVisibility(View.GONE);
        binding.btnConcepto9.setOnClickListener(this);
        binding.txtConcepto9.setVisibility(View.GONE);
        binding.btnConcepto10.setOnClickListener(this);
        binding.txtConcepto10.setVisibility(View.GONE);
        binding.btnConcepto11.setOnClickListener(this);
        binding.txtConcepto11.setVisibility(View.GONE);
        binding.btnConcepto12.setOnClickListener(this);
        binding.txtConcepto12.setVisibility(View.GONE);
        binding.layConceptos.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
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
            case R.id.btn_concepto1:
                v = (binding.txtConcepto1.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto1.setVisibility(v);
                break;
            case R.id.btn_concepto2:
                v = (binding.txtConcepto2.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto2.setVisibility(v);
                break;
            case R.id.btn_concepto3:
                v = (binding.txtConcepto3.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto3.setVisibility(v);
                break;
            case R.id.btn_concepto4:
                v = (binding.txtConcepto4.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto4.setVisibility(v);
                break;
            case R.id.btn_concepto5:
                v = (binding.txtConcepto5.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto5.setVisibility(v);
                break;
            case R.id.btn_concepto6:
                v = (binding.txtConcepto6.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto6.setVisibility(v);
                break;
            case R.id.btn_concepto7:
                v = (binding.txtConcepto7.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto7.setVisibility(v);
                break;
            case R.id.btn_concepto8:
                v = (binding.txtConcepto8.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto8.setVisibility(v);
                break;
            case R.id.btn_concepto9:
                v = (binding.txtConcepto9.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto9.setVisibility(v);
                break;
            case R.id.btn_concepto10:
                v = (binding.txtConcepto10.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto10.setVisibility(v);
                break;
            case R.id.btn_concepto11:
                v = (binding.txtConcepto11.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto11.setVisibility(v);
                break;
            case R.id.btn_concepto12:
                v = (binding.txtConcepto12.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.layConceptos, new AutoTransition());
                binding.txtConcepto12.setVisibility(v);
                break;
        }
    }
}