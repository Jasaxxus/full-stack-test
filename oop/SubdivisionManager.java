public class SubdivisionManager extends DivisionDirector {
    @Override
    public void approveCost(int cost) {
        if (cost > 5000) {
            DivisionDirector divisionDirector = new DivisionDirector();
            divisionDirector.approveCost(cost);
        } else {
            System.out.println("It was handled by " + getClass().getName());
        }
    }
}
