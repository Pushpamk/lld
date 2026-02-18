public class TeamLead extends Approver {

    @Override
    public void approve(int leave) {
        if (leave < 3)
            System.out.println(leave + "leave approved by TeamLead");
        else if (nextApprover != null)
            nextApprover.approve(leave);
    }
}