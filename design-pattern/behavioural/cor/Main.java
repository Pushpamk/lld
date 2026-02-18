class Main {
    public static void main(String[] args) {
        Approver tl = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();

        tl.setNextApprover(manager);
        manager.setNextApprover(director);

        tl.approve(18);
    }
}