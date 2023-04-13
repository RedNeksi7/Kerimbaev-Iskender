public class BankAccount {
    private double amount = 0;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        sum+=amount;
        System.out.println("Вы пополнили счет на: " + sum);
    }
    public void withDraw(int sum) throws LimitException{
        if (sum>amount){
            throw new LimitException("Ошибка, сумма больше чем остаток: ", amount);
        }else {
            sum-=amount;
        }
    }
}
