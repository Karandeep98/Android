package codingblocks.com.maps

import android.annotation.SuppressLint
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.PermissionChecker.PERMISSION_DENIED

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.CircleOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.PolylineOptions
import kotlinx.android.synthetic.main.activity_maps.*
import java.util.jar.Manifest

class MapsActivity : AppCompatActivity(), OnMapReadyCallback ,LocationListener{
    lateinit var locMan:LocationManager
    lateinit var loclis:LocationListener
    private lateinit var mMap: GoogleMap
    override fun onLocationChanged(p0: Location?) {
        Toast.makeText(this,"long= ${p0?.longitude} lat=${p0?.latitude}",Toast.LENGTH_LONG).show()
        if(mMap!=null){
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(p0?.latitude?.let{
                LatLng(
                    it,p0.longitude)

            },12f))
        }
        mMap.addMarker(MarkerOptions().position(LatLng(p0!!.latitude,p0.longitude)).title("Current location"))

    }

    override fun onStatusChanged(p0: String?, p1: Int, p2: Bundle?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onProviderEnabled(p0: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onProviderDisabled(p0: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        loclis=this
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

//        fun getpermission() {
            if (ActivityCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.READ_EXTERNAL_STORAGE
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(
                        android.Manifest.permission.ACCESS_FINE_LOCATION,
                        android.Manifest.permission.READ_EXTERNAL_STORAGE
//                        ,android.Manifest.permission.ACCESS_COARSE_LOCATION

                    ),
                    1234
                )
            }
//            else {
//                startlocationupdates()
//            }
//        }
    }


        @SuppressLint("MissingPermission")
        private fun startlocationupdates() {
        locMan=getSystemService(Context.LOCATION_SERVICE) as LocationManager
            locMan.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,1000,0f,loclis)
//            locMan.requestLocationUpdates(LocationManager.GPS_PROVIDER,1000,0f,loclis)
        }

        override fun onRequestPermissionsResult(
            requestCode: Int, permissions:
            Array<out String>, grantResults:
            IntArray
        ) {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults)
            if (requestCode == 1234) {
                if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                    getpermission()
                    startlocationupdates()
                }
            }
        }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        with(mMap.uiSettings){
            setAllGesturesEnabled(true)
            isZoomControlsEnabled=true
        }

        val sydney = LatLng(-34.0, 151.0)
        val melbourne = LatLng(-37.8, 144.96)
        val delhi=LatLng(28.7,77.1)
        bt.setOnClickListener {
            val destination=LatLng(et1.text.toString().toDouble(),et2.text.toString().toDouble())
            mMap.addMarker(MarkerOptions().position(destination).title("Destination"))
            mMap.addPolyline(PolylineOptions().
                add(delhi,destination).
                color(ContextCompat.getColor(baseContext,R.color.colorPrimary)).
                width(5f))
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(destination,5f))
        }
        mMap.addMarker(MarkerOptions().position(delhi).title("Delhi"))
        mMap.addMarker(MarkerOptions().position(sydney).title("Sydney"))
        mMap.addMarker(MarkerOptions().position(melbourne).title("Melbourne"))
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(delhi,12f))
        mMap.addCircle(CircleOptions().center(sydney).radius(200000.0).fillColor(R.color.colorPrimary))
        mMap.addPolyline(PolylineOptions().
            add(sydney,melbourne).
            color(ContextCompat.getColor(baseContext,R.color.colorPrimary)).
            width(10f))
    }
}


