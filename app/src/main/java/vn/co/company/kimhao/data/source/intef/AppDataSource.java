package vn.co.company.kimhao.data.source.intef;

import java.util.List;

import io.reactivex.Observable;
import vn.co.company.kimhao.data.model.User;

public interface AppDataSource {
    Observable<List<User>> uses();
}
