public class Main {;
    public static void main(String[] args) throws LimitException {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(20000);
        System.out.println(bankAccount.getAmount());
        while (true) {
            try{
                bankAccount.withDraw(6000);
            }catch (LimitException limitException){
                int v = (int) bankAccount.getAmount();
                bankAccount.withDraw(v);
            }

        }
    }
}