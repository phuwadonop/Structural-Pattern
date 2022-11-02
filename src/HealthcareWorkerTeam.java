import java.util.HashSet;
import java.util.LinkedHashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private LinkedHashSet<HealthcareServiceable> members;

    public HealthcareWorkerTeam() {
        this.members = new LinkedHashSet<>();
    }

    public void addMember(HealthcareServiceable member) {
        this.members.add(member);
    }
    public void removeMember(HealthcareServiceable memberToRemove) {
        this.members.remove(memberToRemove);
    }
    public void service() {
        for (HealthcareServiceable member : members) {
            member.service();
        }
    }

    public  double getPrice() {
        double totalPrice = 0;
        for (HealthcareServiceable member : members) {
            totalPrice += member.getPrice();
        }
        return totalPrice;
    }
}
