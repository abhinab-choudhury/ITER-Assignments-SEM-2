package semester_2.dsa_minor_project.code;

public class Date {
  private int day, year;
  private String month;

  Date(int day, String month, int year) {
    this.day = day;
    this.year = year;
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public int getYear() {
    return year;
  }

  public String getMonth() {
    return month;
  }

  public String toString() {
    return day + "-" + month + "-" + year;
  }

}
