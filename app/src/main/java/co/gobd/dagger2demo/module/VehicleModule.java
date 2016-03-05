package co.gobd.dagger2demo.module;

import javax.inject.Singleton;

import co.gobd.dagger2demo.model.Motor;
import co.gobd.dagger2demo.model.Vehicle;
import dagger.Module;
import dagger.Provides;

/**
 * Created by tonmoy on 05-Mar-16.
 */

@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
