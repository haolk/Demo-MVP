package vn.co.company.kimhao.di;

import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import vn.co.company.kimhao.data.network.AppApi;
import vn.co.company.kimhao.util.schedulers.BaseSchedulerProvider;
import vn.co.company.kimhao.util.schedulers.SchedulerProvider;
import vn.co.company.kimhao.util.schedulers.anotation.Remote;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    @Singleton
    @Provides
    BaseSchedulerProvider provideSchedulerProvider() {
        return new SchedulerProvider();
    }

    @Singleton
    @Provides
    AppApi appApi(@Remote Retrofit retrofit) {
        return retrofit.create(AppApi.class);
    }

    @Provides
    @Singleton
    @Remote
    Retrofit restAppApi(OkHttpClient client, GsonBuilder builder) {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl("Server")
                .addConverterFactory(GsonConverterFactory.create(builder.create()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
        retrofitBuilder.client(client);
        return retrofitBuilder.build();
    }
}
