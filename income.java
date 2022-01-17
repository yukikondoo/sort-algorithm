public class income {

    private String type;
    private String size;
    private double price;
    private double quantity;

    public static double caluculateHourlyIncome(double hour, double salary){

        if (salary < 1){
            return -1;
        }
        double hourlyIncome = salary * hour;
        return hourlyIncome ;
    }

    public static double caluculateSickDay(int day, double wage){
        double sickDay = day * wage;
        return sickDay;
    }
    public static void main(String[] args){
        
        double myincome = caluculateHourlyIncome(20, 0);
        double nonework = caluculateSickDay(6, myincome);
        System.out.println(myincome - nonework);

    }
}

