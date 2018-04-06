package com.treehouse.monkeybug34.shelteroverseer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class CharacterCardActivity extends AppCompatActivity {

    private CheckBox checkBoxS, checkBoxP, checkBoxE, checkBoxC, checkBoxI, checkBoxA, checkBoxL;
    private SeekBar seekBarMajorLevel, seekBarS, seekBarP, seekBarE, seekBarC, seekBarI, seekBarA, seekBarL;
    private TextView textViewMajorLvl, textViewS, textViewP, textViewE, textViewC, textViewI, textViewA, textViewL;
    private EditText editTextName;
    private Dweller dweller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_card);

        declareObjects();
        generateListeners();
        populateFromDweller(dweller);

    }



    private void declareObjects(){
        //Character
        Random rng = new Random();
        dweller = new Dweller(rng.nextInt(51), "Bob Ross", rng.nextInt(11),rng.nextInt(11),rng.nextInt(11),rng.nextInt(11),rng.nextInt(11),rng.nextInt(11),rng.nextInt(11), 'P');

        //EditText
        editTextName = (EditText) findViewById(R.id.editTextName);

        //SeeBars
        seekBarMajorLevel = (SeekBar) findViewById(R.id.seekBarMajorLevel);
        seekBarS = (SeekBar) findViewById(R.id.seekBarS);
        seekBarP = (SeekBar) findViewById(R.id.seekBarP);
        seekBarE = (SeekBar) findViewById(R.id.seekBarE);
        seekBarC = (SeekBar) findViewById(R.id.seekBarC);
        seekBarI = (SeekBar) findViewById(R.id.seekBarI);
        seekBarA = (SeekBar) findViewById(R.id.seekBarA);
        seekBarL = (SeekBar) findViewById(R.id.seekBarL);

        //TextViews
        textViewMajorLvl = (TextView) findViewById(R.id.textViewMajorLvl);
        textViewS = (TextView) findViewById(R.id.textViewS);
        textViewP = (TextView) findViewById(R.id.textViewP);
        textViewE = (TextView) findViewById(R.id.textViewE);
        textViewC = (TextView) findViewById(R.id.textViewC);
        textViewI = (TextView) findViewById(R.id.textViewI);
        textViewA = (TextView) findViewById(R.id.textViewA);
        textViewL = (TextView) findViewById(R.id.textViewL);

        //CheckBoxes
        checkBoxS = (CheckBox) findViewById(R.id.checkBoxS);
        checkBoxP = (CheckBox) findViewById(R.id.checkBoxP);
        checkBoxE = (CheckBox) findViewById(R.id.checkBoxE);
        checkBoxC = (CheckBox) findViewById(R.id.checkBoxC);
        checkBoxI = (CheckBox) findViewById(R.id.checkBoxI);
        checkBoxA = (CheckBox) findViewById(R.id.checkBoxA);
        checkBoxL = (CheckBox) findViewById(R.id.checkBoxL);
    }

    private void generateListeners() {

        //EditText
        editTextName.setOnEditorActionListener(new EditText.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE)
                    editTextName.setCursorVisible(false);
                return false;
            }
            public void fold(){/*this makes the code fold nicely*/}
        });

        //SeekBars
        seekBarMajorLevel.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textViewMajorLvl.setText("" + progress);
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                //Auto-generated method stub
                textViewMajorLvl.setTextColor(getResources().getColor(R.color.colorAccent));
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewMajorLvl.setTextColor(getResources().getColor(R.color.textBase));
                //Toast.makeText(getApplicationContext(),  "Character Level is: " + seekBar.getProgress(), Toast.LENGTH_SHORT).show();
            }
        });
        seekBarS.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    textViewS.setText("" + progress);
                }
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                textViewS.setTextColor(getResources().getColor(R.color.colorAccent));
                textViewS.setText("" + seekBar.getProgress());
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewS.setTextColor(getResources().getColor(R.color.textBase));
                textViewS.setText("S");
            }
        });
        seekBarP.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    textViewP.setText("" + progress);
                }
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                textViewP.setTextColor(getResources().getColor(R.color.colorAccent));
                textViewP.setText("" + seekBar.getProgress());
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewP.setTextColor(getResources().getColor(R.color.textBase));
                textViewP.setText("P");
            }
        });
        seekBarE.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    textViewE.setText("" + progress);
                }
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                textViewE.setTextColor(getResources().getColor(R.color.colorAccent));
                textViewE.setText("" + seekBar.getProgress());
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewE.setTextColor(getResources().getColor(R.color.textBase));
                textViewE.setText("E");
            }
        });
        seekBarC.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    textViewC.setText("" + progress);
                }
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                textViewC.setTextColor(getResources().getColor(R.color.colorAccent));
                textViewC.setText("" + seekBar.getProgress());
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewC.setTextColor(getResources().getColor(R.color.textBase));
                textViewC.setText("C");
            }
        });
        seekBarI.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    textViewI.setText("" + progress);
                }
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                textViewI.setTextColor(getResources().getColor(R.color.colorAccent));
                textViewI.setText("" + seekBar.getProgress());
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewI.setTextColor(getResources().getColor(R.color.textBase));
                textViewI.setText("I");
            }
        });
        seekBarA.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    textViewA.setText("" + progress);
                }
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                textViewA.setTextColor(getResources().getColor(R.color.colorAccent));
                textViewA.setText("" + seekBar.getProgress());
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewA.setTextColor(getResources().getColor(R.color.textBase));
                textViewA.setText("A");
            }
        });
        seekBarL.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser) {
                    textViewL.setText("" + progress);
                }
            }
            public void onStartTrackingTouch(SeekBar seekBar) {
                textViewL.setTextColor(getResources().getColor(R.color.colorAccent));
                textViewL.setText("" + seekBar.getProgress());
            }
            public void onStopTrackingTouch(SeekBar seekBar) {
                textViewL.setTextColor(getResources().getColor(R.color.textBase));
                textViewL.setText("L");
            }
        });
    }

    private void populateFromDweller(Dweller dweller){
        editTextName.setText(dweller.getName());
        textViewMajorLvl.setText("" + dweller.getMajorLevel());
        seekBarMajorLevel.setProgress(dweller.getMajorLevel());

        seekBarS.setProgress(dweller.getSkillLevel('s'));
        seekBarP.setProgress(dweller.getSkillLevel('p'));
        seekBarE.setProgress(dweller.getSkillLevel('e'));
        seekBarC.setProgress(dweller.getSkillLevel('c'));
        seekBarI.setProgress(dweller.getSkillLevel('i'));
        seekBarA.setProgress(dweller.getSkillLevel('a'));
        seekBarL.setProgress(dweller.getSkillLevel('l'));

        Toast.makeText(getApplicationContext(), "" + dweller.getTraining(), Toast.LENGTH_SHORT).show();

        switch (dweller.getTraining()){
            case 'S':
                checkBoxS.setChecked(true);
                break;
            case 'P':
                checkBoxP.setChecked(true);
                break;
            case 'E':
                checkBoxE.setChecked(true);
                break;
            case 'C':
                checkBoxC.setChecked(true);
                break;
            case 'I':
                checkBoxI.setChecked(true);
                break;
            case 'A':
                checkBoxA.setChecked(true);
                break;
            case 'L':
                checkBoxL.setChecked(true);
                break;
        }
    }

    private Dweller generateDweller(){
        int     level = seekBarMajorLevel.getProgress(),
                statS = seekBarS.getProgress(),
                statP = seekBarP.getProgress(),
                statE = seekBarE.getProgress(),
                statC = seekBarC.getProgress(),
                statI = seekBarI.getProgress(),
                statA = seekBarA.getProgress(),
                statL = seekBarL.getProgress();

        char training;
        if (checkBoxS.isChecked())
            training =  'S';
        else if (checkBoxP.isChecked())
            training =  'P';
        else if (checkBoxE.isChecked())
            training =  'E';
        else if (checkBoxC.isChecked())
            training =  'C';
        else if (checkBoxI.isChecked())
            training =  'I';
        else if (checkBoxA.isChecked())
            training =  'A';
        else
            training =  'L';

        String name = editTextName.getText().toString();

        return (new Dweller(level, name, statS, statS, statS, statS, statS, statS, statS, training));
    }

    public void skillSelect(View view){
        CheckBox selected = (CheckBox) view;
        checkBoxS.setChecked(false);
        checkBoxP.setChecked(false);
        checkBoxE.setChecked(false);
        checkBoxC.setChecked(false);
        checkBoxI.setChecked(false);
        checkBoxA.setChecked(false);
        checkBoxL.setChecked(false);
        selected.setChecked(true);
    }

    public void showCursor(View view){
        editTextName.setCursorVisible(true);
    }

    public void onPicClick(View view) {
        Intent newPage = new Intent(this, CharacterCardActivity.class);

        Toast.makeText(getApplicationContext(), "oh no you dont!\nNO ESCAPE!", Toast.LENGTH_SHORT).show();
        startActivity(newPage);
    }

    @Override
    public void onBackPressed() {
        Intent finalDweller = new Intent();
        finalDweller.putExtra("dweller", generateDweller());
        setResult (RESULT_OK, finalDweller);
        super.onBackPressed();
    }
}

//Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();