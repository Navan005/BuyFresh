package com.example.buyfresh;

import android.os.Bundle;
import android.preference.SwitchPreference;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;

public class SettingsActivity extends AppCompatActivity {

    public SwitchPreference testPref;
    public static final String switch_preferences = "switch_preference";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.settings, new SettingsFragment())
                .commit();

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    public static class SettingsFragment extends PreferenceFragmentCompat {



        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);



            EditTextPreference signaturePreference = findPreference("signature");
            if (signaturePreference != null) {
                Toast.makeText(getActivity().getApplicationContext(),"Signature already set.",Toast.LENGTH_SHORT).show();
            }


            final androidx.preference.SwitchPreference onOffRandomColor = (androidx.preference.SwitchPreference) findPreference(SettingsActivity.switch_preferences);
            onOffRandomColor.setOnPreferenceChangeListener(new androidx.preference.SwitchPreference.OnPreferenceChangeListener() {
                @Override
                public boolean onPreferenceChange(Preference preference, Object newValue) {
                    if(onOffRandomColor.isChecked()){
                        Toast.makeText(getActivity().getApplicationContext(),"Notifications are OFF",Toast.LENGTH_SHORT).show();

                        // Checked the switch programmatically
                        onOffRandomColor.setChecked(false);
                    }else {
                        Toast.makeText(getActivity().getApplicationContext(),"Notifications are ON",Toast.LENGTH_SHORT).show();

                        // Unchecked the switch programmatically
                        onOffRandomColor.setChecked(true);
                    }
                    return false;

                }
            });



        }
    }
}