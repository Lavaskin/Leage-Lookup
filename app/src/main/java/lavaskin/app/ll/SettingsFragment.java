package lavaskin.app.ll;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

import com.app.ll.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.prefs);
    }
}
