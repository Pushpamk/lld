class Main {
    public static void main(String[] args) {
        IPhoneCharger iphoneCharger = new IPhoneCharger();
        AndroidCharger adapter = new Adapter(iphoneCharger);

        adapter.chargeAndroidPhone();
    }
}