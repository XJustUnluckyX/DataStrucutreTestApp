package com.example.datastructuretestapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import graphgenerator.GraphGenerator;
import graphgenerator.Node;
import structures.DataStructure;
import structures.ItemsHashMap;

public class MainActivity extends AppCompatActivity {

    private DataStructure<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ADD HERE
        lvItems = (ListView) findViewById(R.id.lvItems);
        items = new ItemsHashMap<>();
        itemsAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, items.getList());
        lvItems.setAdapter(itemsAdapter);

        setupListViewListener();

        gr = new GraphGenerator();
    }

    //Deletion
    private void setupListViewListener() {
        lvItems.setOnItemLongClickListener(
                (adapter, item, pos, id) -> {

                    // Remove the item within datastructures
                    items.removeItem(itemsAdapter.getItem(pos));

                    itemsAdapter.remove(itemsAdapter.getItem(pos));

                    Node n = new Node("remove", items);
                    if(gr.is_empty())
                        gr.addN(n);

                    else{

                        Node pre = gr.getLastNode();
                        gr.addN(n);
                        gr.addE(pre, n);
                    }

                    // Refresh the adapter
                    itemsAdapter.notifyDataSetChanged();

                    System.out.println(gr);

                    // Return true consumes the long click event (marks it handled)
                    return true;
                });
    }

    //End_Insert
    public void onAddItem(View v) {
        EditText etNewItem = (EditText) findViewById(R.id.etNewItem);
        String itemText = etNewItem.getText().toString();
        itemsAdapter.add(itemText);

        items.insertEnd(itemText);

        Node n = new Node("add", items);
        n.getVariables().add(itemText);

        if(gr.is_empty()) {
            Node root = new Node("root", items);
            gr.addN(root);

            gr.addN(n);

            gr.addE(root, n);
        }

        else{

            Node pre = gr.getLastNode();
            gr.addN(n);
            gr.addE(pre, n);
        }

        etNewItem.setText("");

        System.out.println(gr);
    }

    private GraphGenerator gr;
}