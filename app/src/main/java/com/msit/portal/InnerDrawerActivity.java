package com.msit.portal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.msit.portal.R;

public class InnerDrawerActivity extends Activity {

    // declare properties
    private String[] mNavigationDrawerItemTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrawerList;

    private ActionBarDrawerToggle mDrawerToggle;

    // nav drawer title
    private CharSequence mDrawerTitle;

    // used to store app title
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_drawer);

        // for proper titles
        mTitle = mDrawerTitle = getTitle();

        // initialize properties
        mNavigationDrawerItemTitles = getResources().getStringArray(R.array.navigation_drawer_items_array2);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);

        // list the drawer items
        ObjectInnerDrawerItem[] drawerItem = new ObjectInnerDrawerItem[11];

        drawerItem[0] = new ObjectInnerDrawerItem(R.drawable.ic_action_copy, "Home");
        drawerItem[1] = new ObjectInnerDrawerItem(R.drawable.ic_action_refresh, "My Area");
        drawerItem[2] = new ObjectInnerDrawerItem(R.drawable.ic_action_share, "My Attendance");
        drawerItem[3] = new ObjectInnerDrawerItem(R.drawable.ic_action_copy, "Marksheet");
        drawerItem[4] = new ObjectInnerDrawerItem(R.drawable.ic_action_copy, "Reminders");
        drawerItem[5] = new ObjectInnerDrawerItem(R.drawable.ic_action_refresh, "Syllabus");
        drawerItem[6] = new ObjectInnerDrawerItem(R.drawable.ic_action_share, "Notice Board");
        drawerItem[7] = new ObjectInnerDrawerItem(R.drawable.ic_action_copy, "Assignments");
        drawerItem[8] = new ObjectInnerDrawerItem(R.drawable.ic_action_share, "Events");
        drawerItem[9] = new ObjectInnerDrawerItem(R.drawable.ic_action_share, "Complaints");
        drawerItem[10] = new ObjectInnerDrawerItem(R.drawable.ic_action_share, "Logout");

        // Pass the folderData to our ListView adapter
        InnerDrawerItemCustomAdapter adapter = new InnerDrawerItemCustomAdapter(this, R.layout.listview_item_row, drawerItem);

        // Set the adapter for the list view
        mDrawerList.setAdapter(adapter);

        // set the item click listener
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());





        // for app icon control for nav drawer
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = new ActionBarDrawerToggle(
                this,                  /* host Activity */
                mDrawerLayout,         /* DrawerLayout object */
                R.drawable.ic_drawer,  /* nav drawer icon to replace 'Up' caret */
                R.string.drawer_open,  /* "open drawer" description */
                R.string.drawer_close  /* "close drawer" description */
        ) {

            /** Called when a drawer has settled in a completely closed state. */
            public void onDrawerClosed(View view) {
                super.onDrawerClosed(view);
                getActionBar().setTitle(mTitle);
            }

            /** Called when a drawer has settled in a completely open state. */
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                getActionBar().setTitle(mDrawerTitle);
            }
        };

        // Set the drawer toggle as the DrawerListener
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        // enable ActionBar app icon to behave as action to toggle nav drawer
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);



        if (savedInstanceState == null) {
            // on first time display view for first nav item
            selectItem(0);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_inner_drawer, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // The action bar home/up action should open or close the drawer.
        // ActionBarDrawerToggle will take care of this.
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // to change up caret
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }


    // navigation drawer click listener
    private class DrawerItemClickListener implements ListView.OnItemClickListener {

        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }

    }

    private void selectItem(int position) {

        // update the main content by replacing fragments

        Fragment fragment = null;

        switch (position) {
            case 0:
                fragment = new HomeFragment();
                break;
            case 1:
                fragment = new ReadFragment();
                break;
            case 2:
                Intent c = new Intent(InnerDrawerActivity.this,AttendanceActivity.class);
                startActivity(c);
                break;
            case 3:
                Intent a = new Intent(InnerDrawerActivity.this,ResultActivity.class);
                startActivity(a);
                break;
            case 4:
                fragment = new ReminderFragment();
                break;
            case 5:
                fragment = new SyllabusFragment();
                break;
            case 6:
                fragment = new HelpFragment();
                break;
            case 7:
                fragment = new CreateFragment();
                break;
            case 8:
                fragment = new ReadFragment();
                break;
            case 9:
                fragment = new ComplaintFragment();
                break;
            case 10:
                Toast.makeText(getApplicationContext(), "Logged out.", Toast.LENGTH_SHORT).show();

                Intent b = new Intent(InnerDrawerActivity.this,MainActivity.class);
                startActivity(b);

            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.content_frame, fragment).commit();

            // update selected item and title, then close the drawer
            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);
            setTitle(mNavigationDrawerItemTitles[position]);
            mDrawerLayout.closeDrawer(mDrawerList);

        } else {
            // error in creating fragment
            Log.e("InnerDrawerActivity", "Error in creating fragment");
        }
    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getActionBar().setTitle(mTitle);
    }
}