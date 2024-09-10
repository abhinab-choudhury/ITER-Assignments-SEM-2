package semester_2.dsa_minor_project.code;


public class GolfClub {

  public static void InsertData(Member member[]) {
    member[0] = new Member(118, "McKenzie", "Melissa", 30, 'F', "", "Junior", 153, 963270L, new Date(28, "May", 2005));
    member[1] = new Member(138, "Stone", "Michael", 30, 'M', "", "Senior", 0, 983223L, new Date(31, "May", 2009));
    member[2] = new Member(153, "Nolan", "Brenda", 11, 'F', "TeamB", "Senior", 0, 442649L, new Date(12, "Aug", 2006));
    member[3] = new Member(176, "Branch", "Helen", 0, 'F', "", "Social", 0, 589419L, new Date(6, "Dec", 2011));
    member[4] = new Member(178, "Beck", "Sarah", 0, 'F', "", "Social", 0, 226596L, new Date(24, "Jan", 2010));
    member[5] = new Member(228, "Burton", "Sandra", 26, 'F', "", "Junior", 153, 244493L, new Date(9, "Jul", 2013));
    member[6] = new Member(235, "Cooper", "William", 14, 'M', "TeamB", "Senior", 153, 722954L,
        new Date(5, "Mar", 2008));
    member[7] = new Member(239, "Spence", "Thomas", 10, 'M', "", "Senior", 0, 697720L, new Date(22, "Jun", 2006));
    member[8] = new Member(258, "Olson", "Barbara", 16, 'F', "", "Senior", 0, 370186L, new Date(29, "Jul", 2013));
    member[9] = new Member(286, "Pollard", "Robert", 19, 'M', "TeamB", "Junior", 235, 617681L,
        new Date(13, "Aug", 2013));
    member[10] = new Member(290, "Sexton", "Thomas", 26, 'M', "", "Senior", 235, 268936L, new Date(28, "Jul", 2008));
    member[11] = new Member(323, "Wilcox", "Daniel", 3, 'M', "TeamA", "Senior", 0, 665393L, new Date(18, "May", 2009));
    member[12] = new Member(331, "Schmidt", "Thomas", 25, 'M', "", "Senior", 153, 867492L, new Date(7, "Apr", 2009));
    member[13] = new Member(332, "Bridges", "Deborah", 12, 'F', "", "Senior", 235, 279087L, new Date(23, "Mar", 2007));
    member[14] = new Member(339, "Young", "Betty", 21, 'F', "TeamB", "Senior", 0, 507813L, new Date(17, "Apr", 2009));
    member[15] = new Member(414, "Gilmore", "Jane", 5, 'F', "TeamA", "Junior", 153, 459558L, new Date(30, "May", 2007));
    member[16] = new Member(415, "Taylor", "William", 7, 'M', "TeamA", "Senior", 235, 137353L,
        new Date(27, "Nov", 2007));
    member[17] = new Member(461, "Reed", "Robert", 3, 'M', "TeamA", "Senior", 235, 994664L, new Date(5, "Aug", 2005));
    member[18] = new Member(469, "Willis", "Carolyn", 29, 'F', "", "Junior", 0, 688378L, new Date(14, "Jan", 2011));
    member[19] = new Member(487, "Kent", "Susan", 0, 'F', "", "Social", 0, 707217L, new Date(7, "Oct", 2010));
  }

  public static void main(String[] args) {
    Member member[] = new Member[20];

    InsertData(member);

    System.out.println("Display the records of all members with join date before 07-Apr-09 : \n");
    for (int i = 0; i < member.length; i++) {
      Date JoinDate = member[i].getJoinDate();
      if (JoinDate.getYear() <= 2009 && (JoinDate.getMonth() == "Jan" || JoinDate.getMonth() == "Feb"
          || JoinDate.getMonth() == "Mar" || (JoinDate.getMonth() == "Apr" && JoinDate.getDay() < 7))) {
        member[i].display();
      }
    }
    System.out.println();

    System.out.println("Display the records of all the senior members whose handicap score is less than 12 : \n");
    for (int i = 0; i < member.length; i++) {
      if (member[i].getMemberType() == "Senior" && member[i].getHandiCap() < 12) {
        member[i].display();
      }
    }
    System.out.println();

    System.out.println("Display the records of all the female senior members who are part of TeamB : \n");
    for (int i = 0; i < member.length; i++) {
      if (member[i].getGender() == 'F' && member[i].getMemberType() == "Senior" && member[i].getTeam() == "TeamB") {
        member[i].display();
      }
    }
    System.out.println();
  }
}
