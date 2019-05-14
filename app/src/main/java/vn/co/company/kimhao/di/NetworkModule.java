package vn.co.company.kimhao.di;

import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vn.co.company.kimhao.BuildConfig;
import vn.co.company.kimhao.data.network.AppApi;
import vn.co.company.kimhao.util.schedulers.BaseSchedulerProvider;
import vn.co.company.kimhao.util.schedulers.SchedulerProvider;
import vn.co.company.kimhao.util.schedulers.anotation.Remote;

@Module
public class NetworkModule {

    @Singleton
    @Provides
    BaseSchedulerProvider provideSchedulerProvider() {
        return new SchedulerProvider();
    }

    @Singleton
    @Provides
    @Remote
    AppApi appApi(@Remote Retrofit retrofit) {
        return retrofit.create(AppApi.class);
    }

    @Provides
    @Singleton
    @Remote
    Retrofit restAppApi(OkHttpClient client, GsonBuilder builder) {
        Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
                .baseUrl("https://google.com/")
                .addConverterFactory(GsonConverterFactory.create(builder.create()))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create());
        retrofitBuilder.client(client);
        return retrofitBuilder.build();
    }

    @Provides
    @Singleton
    GsonBuilder gsonBuilder() {
        return new GsonBuilder();
    }

    @Provides
    @Singleton
    OkHttpClient getHttpClient() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .writeTimeout(20, TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor().setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BODY : HttpLoggingInterceptor.Level.NONE))
                .readTimeout(20, TimeUnit.SECONDS);
//        try {
//            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
//                    TrustManagerFactory.getDefaultAlgorithm());
//            trustManagerFactory.init((KeyStore) null);
//            TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
//            if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
//                throw new IllegalStateException("Unexpected default trust managers:"
//                        + Arrays.toString(trustManagers));
//            }
//            X509TrustManager trustManager = (X509TrustManager) trustManagers[0];
//            builder.sslSocketFactory(new TLSSocketFactory(), trustManager);
//        } catch (Throwable ignore) {
//
//        }
        return builder.build();
    }
}
