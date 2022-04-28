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

import com.example.privacyio.databinding.FragmentOpcionMenSoftBinding;


public class OpcionMenSoft extends Fragment implements View.OnClickListener{

    private FragmentOpcionMenSoftBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentOpcionMenSoftBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnSoft1.setOnClickListener(this);
        binding.txtSoft1.setVisibility(View.GONE);
        binding.btnSoft2.setOnClickListener(this);
        binding.txtSoft2.setVisibility(View.GONE);
        binding.btnSoft3.setOnClickListener(this);
        binding.txtSoft3.setVisibility(View.GONE);
        binding.btnSoft4.setOnClickListener(this);
        binding.txtSoft4.setVisibility(View.GONE);
        binding.btnSoft5.setOnClickListener(this);
        binding.txtSoft5.setVisibility(View.GONE);
        binding.btnSoft6.setOnClickListener(this);
        binding.txtSoft6.setVisibility(View.GONE);
        binding.laySofts.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
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
            case R.id.btn_soft1:
                v = (binding.txtSoft1.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.laySofts, new AutoTransition());
                binding.txtSoft1.setVisibility(v);
                break;
            case R.id.btn_soft2:
                v = (binding.txtSoft2.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.laySofts, new AutoTransition());
                binding.txtSoft2.setVisibility(v);
                break;
            case R.id.btn_soft3:
                v = (binding.txtSoft3.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.laySofts, new AutoTransition());
                binding.txtSoft3.setVisibility(v);
                break;
            case R.id.btn_soft4:
                v = (binding.txtSoft4.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.laySofts, new AutoTransition());
                binding.txtSoft4.setVisibility(v);
                break;
            case R.id.btn_soft5:
                v = (binding.txtSoft5.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.laySofts, new AutoTransition());
                binding.txtSoft5.setVisibility(v);
                break;
            case R.id.btn_soft6:
                v = (binding.txtSoft6.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
                TransitionManager.beginDelayedTransition(binding.laySofts, new AutoTransition());
                binding.txtSoft6.setVisibility(v);
                break;
        }
    }
}