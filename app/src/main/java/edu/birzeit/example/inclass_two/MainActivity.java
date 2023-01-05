package edu.birzeit.example.inclass_two;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

import java.util.ArrayList;

import edu.birzeit.example.inclass_two.model.Employee;
import edu.birzeit.example.inclass_two.model.EmployeeData;

public class MainActivity extends AppCompatActivity {

    public Spinner spinner ;
    public EditText txt_name ;
    public EditText txt_salary;
    public Button btnAdd ;
    ListView list ;

    EmployeeData dataEmp = new EmployeeData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();

        ArrayList<String> t = new ArrayList<>();
        t.add("FullTime");
        t.add("PartTime");
        ArrayAdapter<String> item = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1 ,t);
        spinner.setAdapter(item);


        // spinner
    }


    private void setup() {
        spinner = findViewById(R.id.spinner);
        txt_name = findViewById(R.id.txt_name);
        txt_salary = findViewById(R.id.txt_salary);
        btnAdd = findViewById(R.id.btnAdd);
        list = findViewById(R.id.list);


    }

    public void btn_Add(View view) {


        String name = txt_name.getText().toString().trim();
       // double salary = Double.parseDouble(txt_name.getText().toString().trim());
        double salary=0 ;
        String type = spinner.getSelectedItem().toString().trim();
       // String type = "FullTime" ;

        dataEmp.addEmp(name,salary,type);

        // add on list ...
        ArrayList allEmp = dataEmp.AllEmp();
        ArrayAdapter<Employee> emp = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1 ,allEmp);
        list.setAdapter(emp);



    }
}