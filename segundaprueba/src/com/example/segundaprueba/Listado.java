package com.example.segundaprueba;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Listado extends Activity{
	ListView lista;
	ArrayAdapter<String> adaptador;
	ArrayList<String> datos;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listado);
        
        datos= new ArrayList<String>();
        llenarlista();
        lista = (ListView)findViewById(R.id.listaSimple);
       
        adaptador=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,datos);
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener (new AdapterView.OnItemClickListener(){
        	
        	

			@Override
			public void onItemClick(AdapterView<?> arg0, View vista,
					int posicion, long arg3) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplication(),""+(String)((TextView)vista).getText(),Toast.LENGTH_LONG).show();
			}
        });
        
         
        
    }
	private void llenarlista() {
		// TODO Auto-generated method stub
		datos.add("Java");
    	datos.add("Python");
    	datos.add("Php");
    	datos.add("Ruby");
    	datos.add("JavaScrip");
    	datos.add("Perl");
	}
}
