
public class Employee {
	   String name;
       double salary;
       int workHours;
       int hireYear;

       public Employee(String name, double salary, int workHours, int hireYear) {
       this.name = name;
       this.salary = salary;
       this.workHours = workHours;
       this.hireYear = hireYear;
       }

       double Tax()
       {
           if (salary < 1000)
           {
               return 0;
           }
           else
           {
               return salary * 0.03;
           }               
       }

       double Bonus()
       {
           if (workHours < 40)
           {
               return 0;
           }
           else
           {
               return (workHours - 40) * 30;
           }               
       }
       
       double RaiseSalary()
       {
           double totalSalary = salary - Tax() + Bonus();
           if (2021 - hireYear < 10)
           {
               return totalSalary * 0.05;
           }
           else if (2021 - hireYear > 9 && 2021 - hireYear < 20)
           {
               return totalSalary * 0.1;
           }
           else
           {
               return totalSalary * 0.15;
           }
       }

       public String ToString()
       {
           String msg = "Adı : " + name + "\r\nMaaşı : " + salary + "\r\nÇalışma Saati : " + workHours + "\r\nBaşlangıç Yılı : " + hireYear
           		+ "\r\nVergi : " + Tax() + "\r\nBonus : " + Bonus() + "\r\nMaaş Artışı : " + RaiseSalary()
           		+ "\r\nVergi ve Bonuslar ile birlikte maaş : " + (salary - Tax() + Bonus())
           		+ "\r\nToplam Maaş : " + (salary - Tax() + Bonus() + RaiseSalary());

           return msg;
       }
}