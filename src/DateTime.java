public class DateTime{
   // fields to store date, month, and year
private int day;
private int month;
private int year;

public DateTime(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
}
// Override the toString method to make sure the return date in dd/mm/yyyy format
public String toString(){
return day + "/" + month + "/" + year;
}
public static void main(String[] args) {
    DateTime date = new DateTime(25, 12, 2023);
    System.out.println(date.toString()); // Output: 25/12/2023
}
}