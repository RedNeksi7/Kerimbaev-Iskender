public class Main {;
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(20000);
        System.out.println(bankAccount.getAmount());
        while (true) {
            try{
                bankAccount.withDraw(6000);
            }catch (LimitException limitException){
                try {
                    bankAccount.withDraw((int)limitException.getRemainingAmount());
                } catch (LimitException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}