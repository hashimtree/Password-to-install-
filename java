public void onCreate(Bundle savedInstanceState)
    { 
        setContentView(R.layout.activity_login);
        final EditText passWord = (EditText) findViewById(R.id.editpassword);
        final Button loginButton = (Button) findViewById(R.id.btn_submit);
        loginButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(passWord.getText().toString().equals("123456")) {
                    final Intent myIntent = new Intent();
                    myIntent.setComponent(new ComponentName(LoginActivity.this,your new activity.class));
                    startActivity(myIntent);
                    finish();
                }
            }
        });
    }
