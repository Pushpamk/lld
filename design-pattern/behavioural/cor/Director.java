public class Director extends Approver {
    @Override
    public void approve(int leave) {
        System.out.println(leave + "leave approved by Director");
    }
}