package M03L06_ACP;

import java.util.ArrayList;

public class ClubMembers {
    private ArrayList<MemberInfo> memberList;

    public ClubMembers() {
        memberList = new ArrayList<MemberInfo>();
    }

    /**
     * Helper method to manually add a MemberInfo object (used for testing setups).
     */
    public void addMember(MemberInfo member) {
        memberList.add(member);
    }

    /**
     * Part (a)
     * Adds new club members to memberList.
     * Precondition: names is a non-empty array.
     */
    public void addMembers(String[] names, int gradYear) {
        for (String name : names) {
            // New members are added in good standing (true) with the given gradYear
            memberList.add(new MemberInfo(name, gradYear, true));
        }
    }

    /**
     * Part (b)
     * Removes members who have graduated (gradYear <= year) and returns 
     * a list of those who have graduated AND are in good standing.
     */
    public ArrayList<MemberInfo> removeMembers(int year) {
        ArrayList<MemberInfo> graduatedAndGood = new ArrayList<MemberInfo>();

        int i = 0;
        while (i < memberList.size()) {
            MemberInfo member = memberList.get(i);

            // Check if the member has graduated
            if (member.getGradYear() <= year) {
                // If in good standing, add to the return list
                if (member.inGoodStanding()) {
                    graduatedAndGood.add(member);
                }
                // Remove from memberList regardless of standing
                memberList.remove(i); 
                // Do not increment i because the next element shifts to index i
            } else {
                i++;
            }
        }

        return graduatedAndGood;
    }

    /** Getter for testing memberList contents. */
    public ArrayList<MemberInfo> getMemberList() {
        return memberList;
    }
}
