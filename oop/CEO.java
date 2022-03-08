public class CEO implements Responsibility{
    @Override
    public void approveCost(int cost) {
        if (cost > 100000) {
            System.out.println("Nobody can handle it!");
        } else {
            System.out.println("It was handled by " + getClass().getName());
        }
    }
}
