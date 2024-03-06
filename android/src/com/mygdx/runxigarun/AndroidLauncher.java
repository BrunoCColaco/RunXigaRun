package com.mygdx.runxigarun;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.mygdx.game.tools.GameScreensManager;

public class AndroidLauncher extends AndroidApplication {
	private FirebaseAuth mAuth;
	private FirebaseFirestore db;
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		mAuth = FirebaseAuth.getInstance();
		db = FirebaseFirestore.getInstance();

		initialize(new GameScreensManager(), config);
	}
}
