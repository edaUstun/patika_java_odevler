package MaasHesaplayici;

public class Employee {

    String name;
    double salary;
    double workHours;
    int hireYear;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        } else {
            System.out.println("Maasiniza vergi uygulanmamaktadir. ");
        }
        return 0;
    }

    public double bonus() {
        if(this.workHours>40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        if (this.hireYear <= 2021) {
            if (2021 - this.hireYear < 10) {
                return  this.salary * 5 / 100;
            } else if (2021 - this.hireYear < 20) {
                return this.salary * 10 / 100;
            } else {
                return this.salary * 15 / 100;
            }
        }
        return 0.0;
    }

    public double totalSalary() {
        return this.salary + bonus() + raiseSalary() - tax();
    }

    public double salaryWithoutTotal() {
        return this.salary + bonus() - tax();
    }


    public String toString() {

        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi: " +tax());
        System.out.println("Bonus : " +bonus());
        System.out.println("Maaş Artışı : "+ raiseSalary());


        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + salaryWithoutTotal());
        System.out.println("Toplam Maaş : " + totalSalary());



        return null;
    }
}
