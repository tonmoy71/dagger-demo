package co.gobd.dagger2demo;

import android.app.Application;

import co.gobd.dagger2demo.component.ApplicationComponent;
import co.gobd.dagger2demo.component.DaggerApplicationComponent;
import co.gobd.dagger2demo.module.ApplicationModule;

/**
 * Created by tonmoy on 05-Mar-16.
 */
public class App extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
