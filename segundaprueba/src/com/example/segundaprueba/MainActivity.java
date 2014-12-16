package com.example.segundaprueba;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public void validarlogin(View v){
    	EditText txtLogin = (EditText)findViewById(R.id.etuser);
    	EditText txtClave = (EditText)findViewById(R.id.etuser);
    	
    	if (txtLogin.getText().toString().equals("Christian")&& txtClave.getText().toString().equals("123")){
    		Intent intent= new Intent(this, Listado.class);
    		//intent.putExtra("RESULTADO",txtLogin.getText().toString());
    		startActivity(intent);	
    	}else{
    		Toast.makeText(getBaseContext(),"USUARIO INCORRECTO",Toast.LENGTH_SHORT).show();
    	}
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
