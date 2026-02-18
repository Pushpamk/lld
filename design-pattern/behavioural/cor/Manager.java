public class Manager extends Approver {
    @Override
    public void approve(int leave) {
        if (leave <= 14) {
            System.out.println(leave + "leave approved by Manager");
        } else if (nextApprover != null) {
            nextApprover.approve(leave);
        }
    }
}