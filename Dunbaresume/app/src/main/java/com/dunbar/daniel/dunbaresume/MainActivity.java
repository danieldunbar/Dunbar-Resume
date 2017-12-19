package com.dunbar.daniel.dunbaresume;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dunbar.daniel.dunbaresume.Fragments.ContactFragment;
import com.dunbar.daniel.dunbaresume.Fragments.CoursesFragment;
import com.dunbar.daniel.dunbaresume.Fragments.EducationFragment;
import com.dunbar.daniel.dunbaresume.Fragments.HomeFragment;
import com.dunbar.daniel.dunbaresume.Fragments.ProjectFragment;
import com.dunbar.daniel.dunbaresume.Fragments.SkillsFragment;
import com.dunbar.daniel.dunbaresume.Fragments.WorkFragment;
import com.dunbar.daniel.dunbaresume.Fragments.dummy.DummyContent;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        HomeFragment.OnFragmentInteractionListener,
        EducationFragment.OnListFragmentInteractionListener,
        WorkFragment.OnListFragmentInteractionListener,
        ProjectFragment.OnListFragmentInteractionListener,
        SkillsFragment.OnListFragmentInteractionListener,
        CoursesFragment.OnListFragmentInteractionListener,
        ContactFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        HomeFragment firstFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, firstFragment).commit();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;

        if (id == R.id.nav_home) {
            fragment = new HomeFragment();
        } else if (id == R.id.nav_education) {
            fragment = new EducationFragment();
        } else if (id == R.id.nav_work) {
            fragment = new WorkFragment();
            Toast.makeText(this.getBaseContext(), "Work selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_projects) {
            fragment = new ProjectFragment();
            Toast.makeText(this.getBaseContext(), "Projects selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_skills) {
            fragment = new SkillsFragment();
            Toast.makeText(this.getBaseContext(), "Skills selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_courses) {
            fragment = new CoursesFragment();
            Toast.makeText(this.getBaseContext(), "Courses selected", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.nav_contact) {
            fragment = new ContactFragment();
            Toast.makeText(this.getBaseContext(), "Contact selected", Toast.LENGTH_SHORT).show();
        }

        if(fragment != null) {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction transaction = fm.beginTransaction();
            transaction.replace(R.id.fragment_container, fragment);
            transaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
