package toong.vn.androidmvp.screen.tasks;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;
import java.util.List;
import toong.vn.androidmvp.Injection;
import toong.vn.androidmvp.R;
import toong.vn.androidmvp.data.model.Task;

public class TasksActivity extends AppCompatActivity implements TasksContract.View {
    private TasksContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new TasksPresenter(this, Injection.provideTasksRepository(this));
        presenter.getTasks();
    }

    @Override
    public void setPresenter(TasksContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showListTask(List<Task> tasks) {

    }

    @Override
    public void showError() {
        Toast.makeText(this, "error happened", Toast.LENGTH_SHORT).show();
    }
}
