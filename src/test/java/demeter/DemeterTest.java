package demeter;

import org.demeter.Employee;
import org.demeter.TeamLeader;

public class DemeterTest {

    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckNumber(employee);
    }

}
