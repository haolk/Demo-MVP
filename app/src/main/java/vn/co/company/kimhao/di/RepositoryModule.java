package vn.co.company.kimhao.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import vn.co.company.kimhao.data.network.AppApi;
import vn.co.company.kimhao.data.source.intef.AppDataSource;
import vn.co.company.kimhao.data.source.remote.RemoteDataSource;
import vn.co.company.kimhao.util.schedulers.anotation.Remote;

@Module
public class RepositoryModule {

    @Singleton
    @Provides
    @Remote
    AppDataSource provideFleetRemoteDataSource(AppApi appApi) {
        return new RemoteDataSource(appApi);
    }
}
