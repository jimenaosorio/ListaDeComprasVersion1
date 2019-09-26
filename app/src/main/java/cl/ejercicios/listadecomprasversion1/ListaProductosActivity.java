package cl.ejercicios.listadecomprasversion1;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.ejercicios.listadecomprasversion1.modelo.Producto;


public class ListaProductosActivity extends ListActivity {

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        cargarLista();
    }

    public void cargarLista()
    {
        lista=getListView();
        ArrayAdapter<Producto> listaAdapter= new ArrayAdapter<Producto>(this,
                android.R.layout.simple_expandable_list_item_1,Producto.productos);
        lista.setAdapter(listaAdapter);
    }

    @Override
    public void onListItemClick(ListView listView, View view, int posicion, long id)
    {
        Intent intent=new Intent(ListaProductosActivity.this,DetallesActivity.class);
        intent.putExtra("idProducto",(int)id);
        startActivity(intent);
    }
}
