package net.xjcook.xposed.customaospa;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.os.Bundle;

public class SettingsActivity extends Activity 
							  implements OnSharedPreferenceChangeListener {
	
    public static final int ED_DISABLED = 0;
    public static final int ED_HIDE_NAVBAR = 1;
    public static final int ED_SEMI_IMMERSIVE = 2;
    public static final int ED_IMMERSIVE = 3;
    public static final int ED_IMMERSIVE_STATUSBAR = 4;
    public static final int ED_IMMERSIVE_NAVBAR = 5;
    public static final String ACTION_PREF_EXPANDED_DESKTOP_MODE_CHANGED = "gravitybox.intent.action.EXPANDED_DESKTOP_MODE_CHANGED";
    public static final String ACTION_PREF_NAVBAR_CHANGED = "gravitybox.intent.action.ACTION_NAVBAR_CHANGED";
    public static final String EXTRA_ED_MODE = "expandedDesktopMode";
    public static final String EXTRA_NAVBAR_HEIGHT = "navbarHeight";
    public static final String EXTRA_NAVBAR_HEIGHT_LANDSCAPE = "navbarHeightLandscape";
    public static final String EXTRA_NAVBAR_WIDTH = "navbarWidth";
	public static final String PREF_CAT_KEY_DISPLAY = "pref_cat_display";
    public static final String PREF_KEY_EXPANDED_DESKTOP = "pref_expanded_desktop";
    public static final String PREF_KEY_NAVBAR_OVERRIDE = "pref_navbar_override";
    public static final String PREF_KEY_NAVBAR_HEIGHT = "pref_navbar_height";
    public static final String PREF_KEY_NAVBAR_HEIGHT_LANDSCAPE = "pref_navbar_height_landscape";
    public static final String PREF_KEY_NAVBAR_WIDTH = "pref_navbar_width";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Display the fragment as the main content.
		getFragmentManager().beginTransaction()
        	.replace(android.R.id.content, new SettingsFragment())
        	.commit();
	}

	@Override
	public void onSharedPreferenceChanged(SharedPreferences sharedPreferences,
			String key) {
		if (key.equals(PREF_KEY_EXPANDED_DESKTOP)) {
			
		}
	}

}
