package com.company.models;

public class expense {
    private float loan;
    private float insurance;
    private float randomLogExpense;
    private String randomExpenseName;

    public float getLoan() {
        return loan;
    }

    public void setLoan(float loan) {
        this.loan = loan;
    }

    public float getInsurance() {
        return insurance;
    }

    public void setInsurance(float insurance) {
        this.insurance = insurance;
    }

    public float getRandomLogExpense() {
        return randomLogExpense;
    }

    public void setRandomLogExpense(float randomLogExpense) {
        this.randomLogExpense = randomLogExpense;
    }

    public String getRandomExpenseName() {
        return randomExpenseName;
    }

    public void setRandomExpenseName(String randomExpenseName) {
        this.randomExpenseName = randomExpenseName;
    }
}
