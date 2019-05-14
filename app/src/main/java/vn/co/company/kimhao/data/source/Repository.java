package vn.co.company.kimhao.data.source;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.reactivex.Observable;
import vn.co.company.kimhao.data.model.User;
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

    @Override
    public Observable<List<User>> uses() {
        return mRemoteDataSource.getListUser();
    }
}
