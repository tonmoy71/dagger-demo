package co.gobd.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.gobd.dagger2demo.component.DaggerVehicleComponent;
import co.gobd.dagger2demo.component.VehicleComponent;
import co.gobd.dagger2demo.model.Vehicle;
import co.gobd.dagger2demo.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent component = DaggerVehicleComponent.builder()
                .vehicleModule(new VehicleModule()).build();

        vehicle = component.provideVehicle();


    }
}
