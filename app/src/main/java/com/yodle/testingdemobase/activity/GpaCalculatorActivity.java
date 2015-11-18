package com.yodle.testingdemobase.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.yodle.testingdemobase.MainApp;
import com.yodle.testingdemobase.R;
import com.yodle.testingdemobase.controller.GpaCalculatorController;
import com.yodle.testingdemobase.model.Student;
import com.yodle.testingdemobase.view.GpaCalculatorView;

public class GpaCalculatorActivity extends AppCompatActivity implements GpaCalculatorController.GpaCalculatorActivityNavigator {
    private static final String STUDENT_EXTRA = "STUDENT";
    private GpaCalculatorView gpaCalculatorView;
    private GpaCalculatorController gpaCalculatorController;
    private MainApp mainApp;

    public static Intent getGpaIntentWithStudent(Context context, Student student) {
        Intent intent = new Intent(context, GpaCalculatorActivity.class);
        intent.putExtra(STUDENT_EXTRA, student);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gpaCalculatorView = new GpaCalculatorView(this);
        setContentView(gpaCalculatorView);

        mainApp = (MainApp) getApplication();
        gpaCalculatorController = new GpaCalculatorController(gpaCalculatorView, this);
        gpaCalculatorView.setGpaCalculatorController(gpaCalculatorController);
    }
}
