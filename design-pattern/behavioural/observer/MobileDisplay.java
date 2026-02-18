public class MobileDisplay implements Observer {
    @Override
    public void update(float temp) {
        System.out.println(temp + " temperature has been displayed on Mobile Display");
    }
}