package toong.vn.androidmvp;

import android.content.Context;
import android.support.annotation.NonNull;
import toong.vn.androidmvp.data.source.TaskRepository;
import toong.vn.androidmvp.data.source.local.TaskLocalDataSource;
import toong.vn.androidmvp.data.source.local.api.dao.TaskDao;
import toong.vn.androidmvp.data.source.remote.TaskRemoteDataSource;

/**
 * Created by PhanVanLinh on 18/03/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class Injection {
    public static TaskRepository provideTasksRepository(@NonNull Context context) {
        return TaskRepository.getInstance(TaskRemoteDataSource.getInstance(),
                TaskLocalDataSource.getInstance(new TaskDao()));
    }
}
