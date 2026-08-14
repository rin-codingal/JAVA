package M03L06_ACP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ClubMembers club = new ClubMembers();

        // Populate initial memberList exactly as shown in Image 04
        club.addMember(new MemberInfo("SMITH, JANE", 2019, false));
        club.addMember(new MemberInfo("FOX, STEVE", 2018, true));
        club.addMember(new MemberInfo("XIN, MICHAEL", 2017, false));
        club.addMember(new MemberInfo("GARCIA, MARIA", 2020, true));

        System.out.println("--- Before removeMembers(2018) ---");
        System.out.println(club.getMemberList());

        // Test Part (b): removeMembers(2018)
        ArrayList<MemberInfo> removedGoodStanding = club.removeMembers(2018);

        System.out.println("\n--- After removeMembers(2018) (memberList) ---");
        System.out.println(club.getMemberList());

        System.out.println("\n--- Returned List (Graduated & Good Standing) ---");
        System.out.println(removedGoodStanding);

        // Test Part (a): addMembers
        System.out.println("\n--- Testing Part (a): addMembers ---");
        String[] newNames = {"JOHNSON, ALEX", "LEE, DAVID"};
        club.addMembers(newNames, 2022);

        System.out.println("Updated memberList after addMembers:");
        System.out.println(club.getMemberList());
    }
}
