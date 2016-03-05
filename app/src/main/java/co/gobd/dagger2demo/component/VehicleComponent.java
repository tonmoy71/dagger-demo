package co.gobd.dagger2demo.component;

import javax.inject.Singleton;

import co.gobd.dagger2demo.model.Vehicle;
import co.gobd.dagger2demo.module.VehicleModule;
import dagger.Component;

/**
 * Created by tonmoy on 05-Mar-16.
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
