package com.example.h2physics.loginui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.h2physics.loginui.Class.Typefaces;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener{
    RelativeLayout relativeLayoutLabel;
    RelativeLayout relativeLayoutLogin;

    TextView textViewLabelInLabelLayout;
    TextView textViewLabelInLoginLayout;

    RelativeLayout optionLayout;
    Button buttonStartSignIn;
    Button buttonStartSignUp;

    RelativeLayout signInFormLayout;
    EditText editTextUsername;
    EditText editTextPassword;
    Button buttonSignIn;
    TextView textViewSignIn;

    RelativeLayout signUpFormLayout;
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
        relativeLayoutLogin = (RelativeLayout) rootView.findViewById(R.id.login_form_layout);

        textViewLabelInLabelLayout = (TextView) rootView.findViewById(R.id.textView_label_in_labelLayout);
        textViewLabelInLabelLayout.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Bold.ttf"));
        textViewLabelInLoginLayout = (TextView) rootView.findViewById(R.id.textView_label_in_loginLayout);
        textViewLabelInLoginLayout.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Bold.ttf"));

        optionLayout = (RelativeLayout) rootView.findViewById(R.id.option_layout);
        buttonStartSignIn = (Button) rootView.findViewById(R.id.button_startSignIn);
        buttonStartSignIn.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Light.ttf"));
        buttonStartSignUp = (Button) rootView.findViewById(R.id.button_startSignUp);
        buttonStartSignUp.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Light.ttf"));

        signInFormLayout = (RelativeLayout) rootView.findViewById(R.id.signIn_form_layout);
        editTextUsername = (EditText) rootView.findViewById(R.id.editText_username);
        editTextUsername.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Regular.ttf"));
        editTextPassword = (EditText) rootView.findViewById(R.id.editText_password);
        editTextPassword.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Regular.ttf"));
        buttonSignIn = (Button) rootView.findViewById(R.id.button_signIn);
        buttonSignIn.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Light.ttf"));
        textViewSignIn = (TextView) rootView.findViewById(R.id.textView_signIn);
        textViewSignIn.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Light.ttf"));

        signUpFormLayout = (RelativeLayout) rootView.findViewById(R.id.signUp_form_layout);
        editTextEmailSignUp = (EditText) rootView.findViewById(R.id.editText_signUp_email);
        editTextEmailSignUp.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Regular.ttf"));
        editTextUsernameSignUp = (EditText) rootView.findViewById(R.id.editText_signUp_username);
        editTextUsername.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Regular.ttf"));
        editTextPasswordSignUp = (EditText) rootView.findViewById(R.id.editText_signUp_password);
        editTextUsernameSignUp.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Regular.ttf"));
        buttonSignUp = (Button) rootView.findViewById(R.id.button_signUp);
        buttonSignUp.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Light.ttf"));
        textViewSignUp = (TextView) rootView.findViewById(R.id.textView_signUp);
        textViewSignUp.setTypeface(Typefaces.get(getActivity(), "Comfortaa-Light.ttf"));

        buttonStartSignIn.setOnClickListener(this);
        buttonStartSignUp.setOnClickListener(this);
        textViewSignIn.setOnClickListener(this);
        textViewSignUp.setOnClickListener(this);

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

    public void showSignInLayout(){
        relativeLayoutLogin.setVisibility(View.VISIBLE);

        startAnimationView(signInFormLayout, R.anim.slide_up_with_fade_in);
        startAnimationView(optionLayout, R.anim.slide_up_with_fade_out);
        startAnimationView(textViewLabelInLabelLayout, R.anim.slide_up_with_fade_out);
        startAnimationView(textViewLabelInLoginLayout, R.anim.slide_up_with_fade_in);

        signInFormLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                signInFormLayout.setVisibility(View.VISIBLE);
                relativeLayoutLabel.setVisibility(View.INVISIBLE);
                textViewLabelInLoginLayout.setVisibility(View.VISIBLE);
            }
        }, 300);
    }

    public void showSignUpLayout(){
        relativeLayoutLogin.setVisibility(View.VISIBLE);

        startAnimationView(signUpFormLayout, R.anim.slide_up_with_fade_in);
        startAnimationView(optionLayout, R.anim.slide_up_with_fade_out);
        startAnimationView(textViewLabelInLabelLayout, R.anim.slide_up_with_fade_out);
        startAnimationView(textViewLabelInLoginLayout, R.anim.slide_up_with_fade_in);

        signUpFormLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                signUpFormLayout.setVisibility(View.VISIBLE);
                relativeLayoutLabel.setVisibility(View.INVISIBLE);
                textViewLabelInLoginLayout.setVisibility(View.VISIBLE);
            }
        }, 300);
    }

    public void showSignInFromSignUp(){
        startAnimationView(signUpFormLayout, R.anim.fade_out);
        startAnimationView(signInFormLayout, R.anim.fade_in);
        signInFormLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                signUpFormLayout.setVisibility(View.INVISIBLE);
                signInFormLayout.setVisibility(View.VISIBLE);
            }
        }, 300);
    }

    public void showSignUpFromSignIn(){
        startAnimationView(signInFormLayout, R.anim.fade_out);
        startAnimationView(signUpFormLayout, R.anim.fade_in);
        signUpFormLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                signInFormLayout.setVisibility(View.INVISIBLE);
                signUpFormLayout.setVisibility(View.VISIBLE);
            }
        }, 300);
    }


    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.button_startSignIn:{
                showSignInLayout();
                break;
            }

            case R.id.button_startSignUp:{
                showSignUpLayout();
                break;
            }

            case R.id.textView_signUp:{
                showSignInFromSignUp();
                break;
            }

            case R.id.textView_signIn:{
                showSignUpFromSignIn();
                break;
            }
        }
    }
}
