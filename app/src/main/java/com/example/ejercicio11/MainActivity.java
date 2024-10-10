package com.example.ejercicio11;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Product> productList = new ArrayList<>();
        productList.add(new Product("T-Shirt", "$20", R.drawable.tshirt));
        productList.add(new Product("Jeans", "$40", R.drawable.jeans));
        productList.add(new Product("Sneakers", "$60", R.drawable.sneakers));
        productList.add(new Product("Jacket", "$80", R.drawable.jacket));
        productList.add(new Product("Cap", "$15", R.drawable.cap));

        ProductAdapter adapter = new ProductAdapter(productList);
        recyclerView.setAdapter(adapter);
    }
}
