package com.login_signup_screendesign_demo;

import java.io.UnsupportedEncodingException;

import com.login_signup_screendesign_demo.config.ServerConfig;
import com.login_signup_screendesign_demo.dto.PersonDTO;
import com.login_signup_screendesign_demo.dto.ResponseDTO;
import com.login_signup_screendesign_demo.dto.UserDTO;
import com.login_signup_screendesign_demo.enums.ResponseStatus;
import com.login_signup_screendesign_demo.ws.JsonHelper;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
import android.text.InputType;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.LinearLayout;


import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.entity.StringEntity;
import cz.msebera.android.httpclient.message.BasicHeader;
import cz.msebera.android.httpclient.protocol.HTTP;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class Login_Fragment extends Fragment implements OnClickListener {
	private  View view;

	private  EditText emailid, password;
	private  Button loginButton;
//	private static TextView forgotPassword, signUp;
	private  CheckBox show_hide_password;
	private  LinearLayout loginLayout;
	private static Animation shakeAnimation;
	private static FragmentManager fragmentManager;

	public Login_Fragment() throws UnsupportedEncodingException {

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.login_layout, container, false);
		initViews();
		setListeners();
		return view;
	}

	// Initiate Views
	private void initViews() {
		fragmentManager = getActivity().getFragmentManager();

		emailid = (EditText) view.findViewById(R.id.login_emailid);
		password = (EditText) view.findViewById(R.id.login_password);
		loginButton = (Button) view.findViewById(R.id.loginBtn);
//		forgotPassword = (TextView) view.findViewById(R.id.forgot_password);
//		signUp = (TextView) view.findViewById(R.id.createAccount);
		show_hide_password = (CheckBox) view
				.findViewById(R.id.show_hide_password);
		loginLayout = (LinearLayout) view.findViewById(R.id.login_layout);

		// Load ShakeAnimation
		shakeAnimation = AnimationUtils.loadAnimation(getActivity(),
				R.anim.shake);

		// Setting text selector over textviews
		@SuppressLint("ResourceType") XmlResourceParser xrp = getResources().getXml(R.drawable.text_selector);
		try {
			ColorStateList csl = ColorStateList.createFromXml(getResources(),
					xrp);

//			forgotPassword.setTextColor(csl);
			show_hide_password.setTextColor(csl);
//			signUp.setTextColor(csl);
		} catch (Exception e) {
		}
	}

	// Set Listeners
	private void setListeners() {
		loginButton.setOnClickListener(this);
//		forgotPassword.setOnClickListener(this);
//		signUp.setOnClickListener(this);

		// Set check listener over checkbox for showing and hiding password
		show_hide_password
				.setOnCheckedChangeListener(new OnCheckedChangeListener() {

					@Override
					public void onCheckedChanged(CompoundButton button,
							boolean isChecked) {

						// If it is checkec then show password else hide
						// password
						if (isChecked) {

							show_hide_password.setText(R.string.hide_pwd);// change
																			// checkbox
																			// text

							password.setInputType(InputType.TYPE_CLASS_TEXT);
							password.setTransformationMethod(HideReturnsTransformationMethod
									.getInstance());// show password
						} else {
							show_hide_password.setText(R.string.show_pwd);// change
																			// checkbox
																			// text

							password.setInputType(InputType.TYPE_CLASS_TEXT
									| InputType.TYPE_TEXT_VARIATION_PASSWORD);
							password.setTransformationMethod(PasswordTransformationMethod
									.getInstance());// hide password

						}

					}
				});
	}

	@SuppressLint("ResourceType")
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.loginBtn:
			try {
				checkValidation();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			break;

//		case R.id.forgot_password:
//
//			// Replace forgot password fragment with animation
//			fragmentManager
//					.beginTransaction()
//					.setCustomAnimations(R.anim.right_enter, R.anim.left_out)
//					.replace(R.id.frameContainer,
//							new ForgotPassword_Fragment(),
//							Utils.ForgotPassword_Fragment).commit();
//			break;
		case R.id.createAccount:

			// Replace signup frgament with animation
			fragmentManager
					.beginTransaction()
					.setCustomAnimations(R.anim.right_enter, R.anim.left_out)
					.replace(R.id.frameContainer, new SignUp_Fragment(),
							Utils.SignUp_Fragment).commit();
			break;
		}

	}

	// Check Validation before login
	private void checkValidation() throws UnsupportedEncodingException {

		final JsonHelper jsonHelper = new JsonHelper();
		AsyncHttpClient client = new AsyncHttpClient();

		StringEntity entity = new StringEntity(jsonHelper.generateRequest(new UserDTO( emailid.getText().toString() , password.getText().toString())));
		entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
		client.post(view.getContext() , ServerConfig.SERVER_ADRESS +"/security/userLogin", entity, "application/json", new AsyncHttpResponseHandler() {
			@Override
			public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
				String json = new String(responseBody);
				ResponseDTO<PersonDTO> person = jsonHelper.getPersonResponse(json);
				if (person.getStatus().equals(ResponseStatus.OK)){
					Toast.makeText(getActivity(), "Welcome", Toast.LENGTH_SHORT)
							.show();
					Intent intent = new Intent(getActivity(),MainMenu.class);
					startActivity(intent);
				}else{
					new CustomToast().Show_Toast(getActivity(), view,
							ErrorMassage.invalidUserName);
				}

			}
			@Override
			public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
				new CustomToast().Show_Toast(getActivity(), view, "Cannot login!");
			}
		});
	}

}
