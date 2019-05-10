package vn.co.company.kimhao.data.source;

import javax.inject.Inject;
import javax.inject.Singleton;

import vn.co.company.kimhao.data.network.AppApi;
import vn.co.company.kimhao.data.source.intef.AppDataSource;
import vn.co.company.kimhao.util.schedulers.anotation.Remote;

@Singleton
public class Repository implements AppDataSource {
    private final AppApi mRemoteDataSource;

    @Inject
    public Repository(@Remote AppApi mRemoteDataSource) {
        this.mRemoteDataSource = mRemoteDataSource;
    }
}
