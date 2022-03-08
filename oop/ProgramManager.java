public class ProgramManager extends SubdivisionManager{
    @Override
    public void approveCost(int cost) {
        if (cost > 2000) {
            SubdivisionManager subdivisionManager = new SubdivisionManager();
            subdivisionManager.approveCost(cost);
        } else {
            System.out.println("It was handled by " + getClass().getName());
        }
    }
}
