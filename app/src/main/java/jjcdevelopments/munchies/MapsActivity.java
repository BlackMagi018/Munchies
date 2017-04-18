package jjcdevelopments.munchies;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener, GoogleMap.OnMarkerClickListener,GoogleMap.OnPoiClickListener {

    private GoogleMap Map;
    GoogleApiClient mGoogleApiClient;
    Location mLastLocation;
    Marker mCurrLocationMarker;
    LocationRequest mLocationRequest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    private ArrayList<Entries> GetEntries(){
        ArrayList<Entries> results = new ArrayList<Entries>();

        Entries Entry = new Entries();
        Entry.setName("Mancino's Pizza & Grinders");
        Entry.setAddr("4639 Lake Michigan Dr, Allendale, MI 49401");
        Entry.setType("Pizza & Sandwhiches");
        Entry.setPrice("$$");
        Entry.setLat(42.972696);
        Entry.setLng(-85.900018);
        LatLng latLng = new LatLng(Entry.getLat(),Entry.getLng());
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title(Entry.getName());
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        Map.addMarker(markerOptions);
        results.add(Entry);

        Entry = new Entries();

        Entry.setName("Main Street Pub");
        Entry.setAddr("11240 University Parkway,Allendale,MI 49401");
        Entry.setType("American Sitdown");
        Entry.setPrice("$$");
        Entry.setLat(42.973119);
        Entry.setLng(-85.906472);
        latLng = new LatLng(Entry.getLat(),Entry.getLng());
        markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title(Entry.getName());
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        Map.addMarker(markerOptions);
        results.add(Entry);

        Entry = new Entries();
        Entry.setName("Grand Coney");
        Entry.setAddr("6101 Lake Michigan Dr, Allendale, MI 49401");
        Entry.setType("American & Coneys");
        Entry.setPrice("$$");
        Entry.setLat(42.974009);
        Entry.setLng(-85.934936);
        latLng = new LatLng(Entry.getLat(),Entry.getLng());
        markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title(Entry.getName());
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        Map.addMarker(markerOptions);
        results.add(Entry);

        Entry = new Entries();
        Entry.setName("Aroy Thai");
        Entry.setAddr("11221 Commerce Dr, Allendale,MI 49401");
        Entry.setType("Thai");
        Entry.setPrice("$");
        Entry.setLat(42.972790);
        Entry.setLng(-85.921100);
        latLng = new LatLng(Entry.getLat(),Entry.getLng());
        markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title(Entry.getName());
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        Map.addMarker(markerOptions);
        results.add(Entry);

        Entry = new Entries();
        Entry.setName("Jimmy John's");
        Entry.setAddr("4814 Lake Michigan Dr, Allendale, MI 49401");
        Entry.setType("Sub & Club Sandwhiches");
        Entry.setPrice("$");
        Entry.setLat(42.971537);
        Entry.setLng(-85.904697);
        latLng = new LatLng(Entry.getLat(),Entry.getLng());
        markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title(Entry.getName());
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        Map.addMarker(markerOptions);;
        results.add(Entry);

        Entry = new Entries();
        Entry.setName("Burger King");
        Entry.setAddr("4842 Lake Michigan Drive, Allendale, MI 49401");
        Entry.setType("American Fast Food");
        Entry.setPrice("$");
        Entry.setLat(42.971904);
        Entry.setLng(-85.905397);
        latLng = new LatLng(Entry.getLat(),Entry.getLng());
        markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title(Entry.getName());
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        Map.addMarker(markerOptions);
        results.add(Entry);

        Entry = new Entries();
        Entry.setName("Taco Bell");
        Entry.setAddr("4989 Lake Michigan Dr, Allendale, MI 49401");
        Entry.setType("Mexican Fast Food");
        Entry.setPrice("$");
        Entry.setLat(42.972815);
        Entry.setLng(-85.909186);
        latLng = new LatLng(Entry.getLat(),Entry.getLng());
        markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title(Entry.getName());
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        Map.addMarker(markerOptions);
        results.add(Entry);

        Entry = new Entries();
        Entry.setName("El Aztecas Mexican Restaurant");
        Entry.setAddr("6031 Lake Michigan Dr, Allendale, MI 49401");
        Entry.setType("Mexican");
        Entry.setPrice("$$");
        Entry.setLat(42.972780);
        Entry.setLng(-85.934764);
        latLng = new LatLng(Entry.getLat(),Entry.getLng());
        markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title(Entry.getName());
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        Map.addMarker(markerOptions);
        results.add(Entry);

        Entry = new Entries();
        Entry.setName("Peppino's Pizzeria & Sports Grille");
        Entry.setAddr("5065 Lake Michigan Dr, Allendale, MI 49401");
        Entry.setType("Italian");
        Entry.setPrice("$$");
        Entry.setLat(42.972816);
        Entry.setLng(-85.911117);
        latLng = new LatLng(Entry.getLat(),Entry.getLng());
        markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title(Entry.getName());
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        Map.addMarker(markerOptions);
        results.add(Entry);

        return results;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        Map = googleMap;
        Map.setOnPoiClickListener(this);
        //Initialize Google Play Services
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED) {
                buildGoogleApiClient();
                Map.setMyLocationEnabled(true);
            }
        }
        else {
            buildGoogleApiClient();
            Map.setMyLocationEnabled(true);
        }

        ArrayList<Entries> Entries = GetEntries();

        final ListView LV = (ListView) findViewById(R.id.listView);
        LV.setAdapter(new EntriesAdapter(this, Entries));

        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = LV.getItemAtPosition(position);
                Entries Ob = (Entries) o;
                LatLng latLng = new LatLng(Ob.getLat(),Ob.getLng());
                Map.moveCamera(CameraUpdateFactory.newLatLng(latLng));
                Map.animateCamera(CameraUpdateFactory.zoomTo(17));
            }
        });

        Map.setOnMarkerClickListener(this);
    }

    protected synchronized void buildGoogleApiClient() {
        mGoogleApiClient = new GoogleApiClient.Builder(this)
                .addConnectionCallbacks(this)
                .addOnConnectionFailedListener(this)
                .addApi(LocationServices.API)
                .build();
        mGoogleApiClient.connect();
    }

    @Override
    public void onConnected(Bundle bundle) {

        mLocationRequest = new LocationRequest();
        mLocationRequest.setInterval(1000);
        mLocationRequest.setFastestInterval(1000);
        mLocationRequest.setPriority(LocationRequest.PRIORITY_BALANCED_POWER_ACCURACY);
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            LocationServices.FusedLocationApi.requestLocationUpdates(mGoogleApiClient, mLocationRequest, this);
        }

    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onLocationChanged(Location location) {

        mLastLocation = location;
        if (mCurrLocationMarker != null) {
            mCurrLocationMarker.remove();
        }

        //Place current location marker
        LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title("Current Position");
        markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        mCurrLocationMarker = Map.addMarker(markerOptions);

        //move map camera
        Map.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        Map.animateCamera(CameraUpdateFactory.zoomTo(15));

        //stop location updates
        if (mGoogleApiClient != null) {
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
        }

    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

    public static final int MY_PERMISSIONS_REQUEST_LOCATION = 99;
    public boolean checkLocationPermission(){
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            // Asking user if explanation is needed
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {

                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

                //Prompt the user once explanation has been shown
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);


            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        MY_PERMISSIONS_REQUEST_LOCATION);
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted. Do the
                    // contacts-related task you need to do.
                    if (ContextCompat.checkSelfPermission(this,
                            Manifest.permission.ACCESS_FINE_LOCATION)
                            == PackageManager.PERMISSION_GRANTED) {

                        if (mGoogleApiClient == null) {
                            buildGoogleApiClient();
                        }
                        Map.setMyLocationEnabled(true);
                    }

                } else {

                    // Permission denied, Disable the functionality that depends on this permission.
                    Toast.makeText(this, "permission denied", Toast.LENGTH_LONG).show();
                }
                return;
            }

            // other 'case' lines to check for other permissions this app might request.
            // You can add here other case statements according to your requirement.
        }
    }

    @Override
    public boolean onMarkerClick(Marker marker) {
        LatLng locale = marker.getPosition();
        Uri gmmIntentUri = Uri.parse("geo:"+locale.latitude+","+locale.longitude+"?q="+marker.getTitle());
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
        return true;
    }

    @Override
    public void onPoiClick(PointOfInterest pointOfInterest) {
        Toast.makeText(this,pointOfInterest.name,Toast.LENGTH_LONG).show();

    }
}
