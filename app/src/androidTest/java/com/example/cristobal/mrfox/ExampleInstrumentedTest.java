package com.example.cristobal.mrfox;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase;
import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

import org.junit.runner.RunWith;


@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<MyLogin> {
    private Button btn;
    private EditText username;
    private EditText password;
    private MyLogin actividad;

    public ExampleInstrumentedTest() {
        super(MyLogin.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        btn = actividad.findViewById(R.id.idBTN);
        username = actividad.findViewById(R.id.idUserName);
        password = actividad.findViewById(R.id.idPasswd);

    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    private static final String USERNAME = "Cristobal";
    private static final String PASSWORD = "Revelles";

    public void testLoginSignup() {
        TouchUtils.tapView(this, username);
        getInstrumentation().sendStringSync(USERNAME);

        TouchUtils.tapView(this, password);
        getInstrumentation().sendStringSync(PASSWORD);

        TouchUtils.clickView(this, btn);

    }

}
