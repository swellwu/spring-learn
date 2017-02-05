/**
 * Created by wuxinjian on 2017/2/5.
 */
public class PLA implements Soldier {

    private Task task;

    PLA(Task task){
        this.task=task;
    }

    public void execute() {
        task.execute();
    }
}
