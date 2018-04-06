package com.treehouse.monkeybug34.shelteroverseer;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.util.Arrays;

public class MainMenuActivity extends AppCompatActivity {

    private String[] dwellerNames = {"blue"};
    private Dweller dweller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        populateListView();
        registerClickCallback();
    }

    /*private void assembleArrays() {
        dwellerNames = new String[dwellers.length];
        for (int i = 0; i < dwellers.length; i++){
            dwellerNames[i] = dwellers[i].getName();
        }
    }*/

    public void onClick(View thisButton){
        Intent newPage = new Intent(this, CharacterCardActivity.class);
        dwellerNames = Arrays.copyOf(dwellerNames, dwellerNames.length + 1);
        dwellerNames[dwellerNames.length - 1] = "New Character #" + (dwellerNames.length - 1);
        startActivityForResult(newPage, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1){
            dweller = (Dweller)data.getSerializableExtra("dweller");
            dwellerNames[dwellerNames.length - 1] = dweller.getName();
            populateListView();
            Toast.makeText(getApplicationContext(), "" + dweller.getName(), Toast.LENGTH_SHORT).show();
        }
    }

    private void populateListView() {
        //create list of items


        //build adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.menu_item, dwellerNames);
        //                                                       context      layout to use       content

        //configure listview
        ListView list = (ListView) findViewById(R.id.listViewCharacterMenu);
        list.setAdapter(adapter);
    }

    private void registerClickCallback() {
        ListView list = (ListView) findViewById(R.id.listViewCharacterMenu);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int arrayPosition, long idOfClicked) {
                TextView menuItem = (TextView) viewClicked;
                String message = "You clicked #" + arrayPosition + " Which is string: " + menuItem.getText().toString();
                Toast.makeText(MainMenuActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

//Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();