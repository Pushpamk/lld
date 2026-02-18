class Main {
    public static void main(String[] args) {
        Subject ws = new WeatherStation();
        Observer obj1 = new MobileDisplay();
        Observer obj2 = new TVDisplay();

        ws.register(obj1);
        ws.register(obj2);

        ws.notifyObservers(11f);
    }
}