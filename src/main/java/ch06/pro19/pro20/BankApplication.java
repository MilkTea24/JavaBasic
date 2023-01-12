package ch06.pro19.pro20;

import java.util.Scanner;

public class BankApplication {
    private static BankApplication bankApplication = new BankApplication();
    private BankApplication() {};
    public static BankApplication getInstance() { return bankApplication; }

    private Account[] accounts = new Account[100];
    private boolean programRunning;
    private Scanner scanner = new Scanner(System.in);
    private int accountCount = 0;
    public final String infoString = """
    -------------------------------------------------
    1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
    -------------------------------------------------
""";


    public void programStart() {
        programRunning = true;
        programMain();
    }

    private void programMain() {
        while (programRunning) {
            System.out.println(infoString);
            System.out.print("선택> ");
            String Mode = scanner.nextLine();
            switch (Mode) {
                case "1" -> makeNewAccount();
                case "2" -> showAccounts();
                case "3" -> findAccountAndDeposit();
                case "4" -> findAccountAndWithdrawal();
                default -> programRunning = false;
            }
        }
        System.out.println("프로그램 종료");
        System.exit(1);
    }

    private void makeNewAccount(){
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();
        boolean isValidAccount = validateAccountNumber(accountNumber);
        if (!isValidAccount) {
            System.out.println("잘못된 계좌번호입니다. 다시 입력하세요.");
            return;
        }
        System.out.print("예금주: ");
        String accountHolder = scanner.nextLine();
        int balance = 0;
        try {
            System.out.print("초기입금액: ");
            String strBalance = scanner.nextLine();
            balance = Integer.parseInt(strBalance);
        } catch (NumberFormatException ex) {
            System.out.println("초기입금액은 숫자만 입력해야 합니다.");
        }
        accounts[accountCount++] = new Account(accountNumber, accountHolder, balance);
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private boolean validateAccountNumber(String accountNumber){
        String[] splittedAccountNumber = accountNumber.split("-");
        if (splittedAccountNumber.length != 2) return false;
        for (int i = 0; i < splittedAccountNumber.length; i++){
            try {
                Integer.parseInt(splittedAccountNumber[i]);
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        return true;
    }

    private void showAccounts(){
        String accountListInfoString = """
                ----------------------
                계좌목록
                ----------------------
                """;
        System.out.println(accountListInfoString);
        for (int i = 0; i < accountCount; i++){
            System.out.printf("%-10s %-5s %-10d\n", accounts[i].getAccountNumber(), accounts[i].getAccountHolder(), accounts[i].getBalance());
        }
    }

    private void findAccountAndDeposit() {
        String depositInfoString = """
                ----------------------
                예금
                ----------------------
                """;
        System.out.println(depositInfoString);
        System.out.print("계좌번호: ");
        String inputAccountNumber = scanner.nextLine();
        System.out.print("예금액: ");
        int inputDeposit;
        try {
            String strInputDeposit = scanner.nextLine();
            inputDeposit = Integer.parseInt(strInputDeposit);
        } catch (NumberFormatException ex) {
            System.out.println("예금액은 숫자만 입력해야 합니다.");
            return;
        }
        for (int i = 0; i < accountCount; i++){
            boolean isValidBanking = false;
            if (inputAccountNumber.equals(accounts[i].getAccountNumber())) {
                isValidBanking = accounts[i].deposit(inputDeposit);
                if (!isValidBanking) {
                    System.out.println("입금액은 0 초과만 가능합니다.");
                }
               return;
            }
        }
        System.out.println("입력하신 계좌를 찾을 수 없습니다. 다시 시도해주세요.");
;       }

    private void findAccountAndWithdrawal() {
        String withdrawalInfoString = """
                ----------------------
                출금
                ----------------------
                """;
        System.out.println(withdrawalInfoString);
        System.out.print("계좌번호: ");
        String inputAccountNumber = scanner.nextLine();
        System.out.print("출금액: ");
        int inputWithdrawal;
        try {
            String strInputDeposit = scanner.nextLine();
            inputWithdrawal = Integer.parseInt(strInputDeposit);
        } catch (NumberFormatException ex) {
            System.out.println("출금액은 숫자만 입력해야 합니다.");
            return;
        }
        for (int i = 0; i < accountCount; i++){
            boolean isValidBanking = false;
            if (inputAccountNumber.equals(accounts[i].getAccountNumber())) {
                isValidBanking = accounts[i].withdrawal(inputWithdrawal);
                if (!isValidBanking) {
                    System.out.println("예금액보다 초과하여 출금할 수 없습니다.");
                    return;
                }
                System.out.println("결과: 출금이 성공되었습니다.");
                return;
            }
        }
        System.out.println("입력하신 계좌를 찾을 수 없습니다. 다시 시도해주세요.");
    }
}
