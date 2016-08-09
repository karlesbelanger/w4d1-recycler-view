package ca.kgb.simplerecylerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<String> arrayList;
    private LibuAdapter mLibuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        arrayList = new ArrayList<String>();
        arrayList.add("Karles");
        arrayList.add("Mike");
        arrayList.add("Chris");
        arrayList.add("Aldo");
        arrayList.add("Edwin");
        arrayList.add("Libu");

        mLibuAdapter = new LibuAdapter(arrayList);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setAdapter(mLibuAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
