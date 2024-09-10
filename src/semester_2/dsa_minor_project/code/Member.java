package semester_2.dsa_minor_project.code;

public class Member {

  private int MemberID, HandiCap, Coach;
  private long Phone;
  private String FirstName, LastName, MemberType, Team;
  private Date JoinDate;
  private char Gender;

  Member(int MemberID, String FirstName, String LastName, int HandiCap, char Gender, String Team, String MemberType,
      int Coach, long Phone, Date JoinDate) {
    this.MemberID = MemberID;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.HandiCap = HandiCap;
    this.Gender = Gender;
    this.Team = Team;
    this.MemberType = MemberType;
    this.Coach = Coach;
    this.Phone = Phone;
    this.JoinDate = JoinDate;
  }

  public void display() {
    System.out.println(MemberID + "\t" + LastName + "\t" + FirstName + "\t" + HandiCap + "\t" + Gender + "\t" + Team + "\t" + MemberType + "\t" + Coach + "\t" + Phone + "\t" + JoinDate.toString());

  }

  public int getMemberID() {
    return MemberID;
  }

  public String getLastName() {
    return LastName;
  }

  public String getFirstName() {
    return FirstName;
  }

  public int getHandiCap() {
    return HandiCap;
  }

  public char getGender() {
    return Gender;
  }

  public String getTeam() {
    return Team;
  }

  public String getMemberType() {
    return MemberType;
  }

  public int getCoach() {
    return Coach;
  }

  public long getPhone() {
    return Phone;
  }

  public Date getJoinDate() {
    return JoinDate;
  }
}
