import java.lang.*;
interface InsuranceAgent {
    void display();
    void calculatePremium();
    void calculateReturns();
}

public class Main implements InsuranceAgent {

    private String agentName;
    private double agentSalary;

    public Main(String name, double salary) {
        this.agentName = name;
        this.agentSalary = salary;
    }
    public void display(){
        System.out.println("Hi"+agentName+"! ,Welcome");
    }

    public void calculatePremium() {
        System.out.println("Calculating premium for agent: " + agentName);
        double premium = agentSalary * 0.1;
        System.out.println("Premium: " + premium);
    }

    public void calculateReturns() {
        System.out.println("Calculating returns for agent: " + agentName);
        double returns = agentSalary * 0.05;
        System.out.println("Returns: " + returns);
    }

    public static void main(String[] args) {
        Main bankAgent = new Main("Akil", 80000);
        bankAgent.display();
        bankAgent.calculatePremium();
        bankAgent.calculateReturns();
    }
}
