public class DivisionDirector extends CEO{
    @Override
    public void approveCost(int cost) {
        if (cost > 20000) {
            CEO ceo = new CEO();
            ceo.approveCost(cost);
        } else {
            System.out.println("It was handled by " + getClass().getName());
        }
    }
}
