package vn.co.company.kimhao.data.source.remote;

import javax.inject.Inject;
import javax.inject.Singleton;

import vn.co.company.kimhao.data.network.AppApi;
import vn.co.company.kimhao.data.source.intef.AppDataSource;

@Singleton
public class RemoteDataSource implements AppDataSource {
    private AppApi mAppApi;

    @Inject
    public RemoteDataSource(AppApi mAppApi) {
        this.mAppApi = mAppApi;
    }

}
