public class ProjectManager extends ProgramManager{
    @Override
    public void approveCost(int cost) {
        if (cost > 500) {
            ProgramManager programManager = new ProgramManager();
            programManager.approveCost(cost);
        } else {
            System.out.println("It was handled by " + getClass().getName());
        }
    }
}
