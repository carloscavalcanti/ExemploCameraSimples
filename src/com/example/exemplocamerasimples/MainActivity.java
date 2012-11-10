package com.example.exemplocamerasimples;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	
	private Button botao;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		botao = (Button) findViewById(R.id.botao);
		botao.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
		startActivity(intent);
	}
    
}
