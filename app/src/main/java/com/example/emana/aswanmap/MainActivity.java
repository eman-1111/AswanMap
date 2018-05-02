package com.example.emana.aswanmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    GoogleMap map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_main);

        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Aswan, Egypt.
        map = googleMap;

        addMarkers();

        // and move the map's camera to the same location.
        LatLng aswan = new LatLng(24.085228,32.887001);
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(aswan, 11));
    }

    private void addMarkers() {

        // location 1
        map.addMarker(new MarkerOptions()
                .position(new LatLng( 24.01266, 32.87754))
                .title("Philae Temple")
                .snippet("is currently an island in the reservoir")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        // location 2
        map.addMarker(new MarkerOptions()
                .position(new LatLng( 24.085228,32.887001))
                .title("Aswan Museum")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        // location 3
        map.addMarker(new MarkerOptions()
                .position(new LatLng( 24.061354,32.871902))
                .title("Seheil Island")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        // location 4
        map.addMarker(new MarkerOptions()
                .position(new LatLng(  24.079425,32.889175))
                .title("Nubian Museum")
                .snippet("Is an archaeological museum")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));

        // location 5
        map.addMarker(new MarkerOptions()
                .position(new LatLng(   24.085652,32.885574))
                .title("Elephantine Island")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
    }

}
