public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSalary;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSalary = grossSalary;
    }

    // Getters and setters
    public double getCommissionRate() { return commissionRate; }
    public double getGrossSalary() { return grossSalary; }
    public void setCommissionRate(double commissionRate) { this.commissionRate = commissionRate; }
    public void setGrossSalary(double grossSalary) { this.grossSalary = grossSalary; }
}