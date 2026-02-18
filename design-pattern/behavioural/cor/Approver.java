public abstract class Approver {
    // should be accessable only to subclasses
    protected Approver nextApprover;

    public abstract void approve(int leave);

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }
}