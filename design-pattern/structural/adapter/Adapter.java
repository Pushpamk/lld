public class Adapter implements AndroidCharger {
    private IPhoneCharger iphoneCharger;

    Adapter(IPhoneCharger iphoneCharger) {
        this.iphoneCharger = iphoneCharger;
    }
    @Override
    public void chargeAndroidPhone() {
        iphoneCharger.chargeIPhone();
    }
}