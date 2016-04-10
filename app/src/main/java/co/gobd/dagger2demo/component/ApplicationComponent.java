package co.gobd.dagger2demo.component;

import javax.inject.Singleton;

import co.gobd.dagger2demo.App;
import co.gobd.dagger2demo.MainActivity;
import co.gobd.dagger2demo.module.ApplicationModule;
import dagger.Component;

/**
 * Created by tonmoy on 06-Apr-16.
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(MainActivity target);
    void inject(App target);
}
