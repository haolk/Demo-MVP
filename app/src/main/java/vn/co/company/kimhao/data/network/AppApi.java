package vn.co.company.kimhao.data.network;

import java.util.List;

import io.reactivex.Observable;
import vn.co.company.kimhao.data.model.User;
import retrofit2.http.GET;

public interface AppApi {
    @GET
    Observable<List<User>> getListUser();
}
