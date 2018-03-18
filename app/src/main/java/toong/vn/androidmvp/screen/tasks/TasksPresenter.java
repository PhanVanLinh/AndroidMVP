package toong.vn.androidmvp.screen.tasks;

import java.util.List;
import toong.vn.androidmvp.data.model.Task;
import toong.vn.androidmvp.data.source.TaskDataSource;
import toong.vn.androidmvp.data.source.TaskRepository;

/**
 * Created by PhanVanLinh on 07/02/2018.
 * phanvanlinh.94vn@gmail.com
 */

public class TasksPresenter implements TasksContract.Presenter {
    private final TasksContract.View view;
    private TaskRepository taskRepository;

    TasksPresenter(TasksContract.View view, TaskRepository taskRepository) {
        this.view = view;
        this.taskRepository = taskRepository;
    }

    @Override
    public void getTasks() {
        view.showLoading();
        taskRepository.getTasks(new TaskDataSource.LoadTasksCallback() {
            @Override
            public void onTasksLoaded(List<Task> tasks) {
                view.hideLoading();
                view.showListTask(tasks);
            }

            @Override
            public void onDataNotAvailable() {
                view.hideLoading();
                view.showError();
            }
        });
    }
}
