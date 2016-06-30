package com.example.cice.apppruebasnavigatorview;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;



/**
 * Created by cice on 21/6/16.
 */
public class NavigationMenuListener {

    /**
     * Created by vale on 4/06/16.
     */
    public class NavigationMenuListener implements NavigationView.OnNavigationItemSelectedListener {

        private Context context;

        public NavigationMenuListener (Context context)
        {
            this.context = context;
        }

        @Override
        public boolean onNavigationItemSelected(MenuItem item) {

            String menu = item.getTitle().toString();

            Log.d(getClass().getCanonicalName(), "Ha tocado la opción " + menu);

            TextView texto = (TextView) ((Activity)context).findViewById(R.id.textView);
            texto.setText(menu);

            MainActivity activity = (MainActivity)context;
            activity.cierramenu();

            return true;

        }
    }




}
