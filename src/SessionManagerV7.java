import java.util.ArrayList;
import java.util.List;

// 동시성 처리
public class SessionManagerV7 {

    private List<SessionV7> sessions = new ArrayList<>();

    public synchronized void add(SessionV7 session) {
        sessions.add(session);
    }

    public synchronized void remove(SessionV7 session) {
        sessions.remove(session);
    }

    public synchronized void closeAll() {
        for (SessionV7 session : sessions) {
            session.close();
        }
        sessions.clear();
    }
}
