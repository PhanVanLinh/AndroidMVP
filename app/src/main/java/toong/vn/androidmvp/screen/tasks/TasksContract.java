package toong.vn.androidmvp.screen.tasks;

import java.util.List;
import toong.vn.androidmvp.BasePresenter;
import toong.vn.androidmvp.BaseView;
import toong.vn.androidmvp.data.model.Task;

/**
 * Created by PhanVanLinh on 07/02/2018.
 * phanvanlinh.94vn@gmail.com
 */

public interface TasksContract {

    interface View extends BaseView<Presenter> {

        void showListTask(List<Task> tasks);

        void showError();

        void showLoading();

        void hideLoading();
    }

    interface Presenter extends BasePresenter {
        void getTasks();
    }
}
