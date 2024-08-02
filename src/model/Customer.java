package model;

public class Customer {

    private static int counter = 1;

    private int id;

    private String fullNama;

    private boolean identified;

    private double dept;

    private String phoneNomber;

    public int getAd() {
        return id;
    }

    public String getFullNama() {
        return fullNama;
    }

    public void setFullNama(String fullNama) {
        this.fullNama = fullNama;
    }

    public void setAd(int ad) {
        this.id = id;
    }

    public boolean isIdentified() {
        return identified;
    }

    public void setIdentified(boolean identified) {
        this.identified = identified;
    }

    public double getDept() {
        return dept;
    }

    public void setDept(double dept) {
        this.dept = dept;
    }

    public String getPhoneNomer() {
        return phoneNomber;
    }

    public Customer(String fullNama, String phoneNomer, double dept, boolean identified) {
        this.fullNama = fullNama;
        this.phoneNomber = phoneNomer;
        this.dept = dept;
        this.identified = identified;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.fullNama + getBadge(this.identified)+ " | " + this.dept + " | " + "+998" + this.phoneNomber;
    }
    private String getBadge(boolean identified){
        if (identified) {
            return "✅";
        }else {
            return "❌";
        }
    }
}








