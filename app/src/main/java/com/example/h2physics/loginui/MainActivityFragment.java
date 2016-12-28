package com.example.h2physics.loginui;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment{
    RelativeLayout relativeLayoutLabel;
    RelativeLayout relativeLayoutSignIn;
    RelativeLayout relativeLayoutSignUp;

    TextView textViewLabelInLabelLayout;
    TextView textViewLabelInSignInLayout;
    TextView textViewLabelInSignUpLayout;

    RelativeLayout optionLayout;
    Button buttonStartSignIn;
    Button buttonStartSignUp;

    EditText editTextUsername;
    EditText editTextPassword;
    Button buttonSignIn;
    TextView textViewSignIn;

    EditText editTextEmailSignUp;
    EditText editTextUsernameSignUp;
    EditText editTextPasswordSignUp;
    Button buttonSignUp;
    TextView textViewSignUp;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        relativeLayoutLabel = (RelativeLayout) rootView.findViewById(R.id.label_layout);
        relativeLayoutSignIn = (RelativeLayout) rootView.findViewById(R.id.signIn_layout);
        relativeLayoutSignUp = (RelativeLayout) rootView.findViewById(R.id.signUp_layout);

        textViewLabelInLabelLayout = (TextView) rootView.findViewById(R.id.textView_label_in_labelLayout);
        textViewLabelInSignInLayout = (TextView) rootView.findViewById(R.id.textView_label_in_signInLayout);
        textViewLabelInSignUpLayout = (TextView) rootView.findViewById(R.id.textView_label_in_signUpLayout);

        optionLayout = (RelativeLayout) rootView.findViewById(R.id.option_layout);
        buttonStartSignIn = (Button) rootView.findViewById(R.id.button_startSignIn);
        buttonStartSignUp = (Button) rootView.findViewById(R.id.button_startSignUp);

        editTextUsername = (EditText) rootView.findViewById(R.id.editText_username);
        editTextPassword = (EditText) rootView.findViewById(R.id.editText_password);
        buttonSignIn = (Button) rootView.findViewById(R.id.button_signIn);
        textViewSignIn = (TextView) rootView.findViewById(R.id.textView_signIn);
        
        editTextEmailSignUp = (EditText) rootView.findViewById(R.id.editText_signUp_email);
        editTextUsernameSignUp = (EditText) rootView.findViewById(R.id.editText_signUp_username);
        editTextPasswordSignUp = (EditText) rootView.findViewById(R.id.editText_signUp_password);
        buttonSignUp = (Button) rootView.findViewById(R.id.button_signUp);
        textViewSignUp = (TextView) rootView.findViewById(R.id.textView_signUp);

        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();

        startAnimationView(optionLayout, R.anim.slide_up);
        startAnimationView(textViewLabelInLabelLayout, R.anim.slide_down);

    }

    public void startAnimationView(View v, int id){
        Animation animation = AnimationUtils.loadAnimation(getActivity(), id);

        v.startAnimation(animation);
    }


}
