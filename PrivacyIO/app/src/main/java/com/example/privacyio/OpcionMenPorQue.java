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
import android.widget.Toast;

import com.example.privacyio.databinding.FragmentOpcionMenPorQueBinding;

public class OpcionMenPorQue extends Fragment implements View.OnClickListener{

    private FragmentOpcionMenPorQueBinding binding;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentOpcionMenPorQueBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnReason1.setOnClickListener(this);
        binding.txtReason1.setVisibility(View.GONE);
        binding.btnReason2.setOnClickListener(this);
        binding.txtReason2.setVisibility(View.GONE);
        binding.btnReason3.setOnClickListener(this);
        binding.txtReason3.setVisibility(View.GONE);
        binding.btnReason4.setOnClickListener(this);
        binding.txtReason4.setVisibility(View.GONE);
        binding.layWhy.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        //Toast.makeText(binding.getRoot().getContext(), "onviewCrea", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View view) {
        int v=0;
        switch (view.getId()){
            case R.id.btn_Reason1:
                v =(binding.txtReason1.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(binding.layWhy, new AutoTransition());
                binding.txtReason1.setVisibility(v);
                break;
            case R.id.btn_Reason2:
                v =(binding.txtReason2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(binding.layWhy, new AutoTransition());
                binding.txtReason2.setVisibility(v);
                break;
            case R.id.btn_Reason3:
                v =(binding.txtReason3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(binding.layWhy, new AutoTransition());
                binding.txtReason3.setVisibility(v);
                break;
            case R.id.btn_Reason4:
                v =(binding.txtReason4.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
                TransitionManager.beginDelayedTransition(binding.layWhy, new AutoTransition());
                binding.txtReason4.setVisibility(v);
                break;

        }
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}