public class TVDisplay implements Observer {
    @Override
    public void update(float temp) {
        System.out.println(temp + " temperature has been displayed on TV Display");
    }
}