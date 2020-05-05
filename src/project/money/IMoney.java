package project.money;

public interface IMoney {
    /**
     * Интерфейс предназначен для передачи денег от одного пользователя к другому
     * @param amount - сумма для перевода
     * @param idFrom - id пользователя от которого передаются деньги
     * @param idTo - id пользователя, которому передаются деньги
     */

    void moneyTransfer(double amount, long idFrom, long idTo);
}
