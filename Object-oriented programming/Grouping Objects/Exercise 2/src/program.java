import java.util.ArrayList;
import java.util.Iterator;

public class program {

        private ArrayList<src.subject> subjects;

        public program() {
            subjects = new ArrayList<src.subject>();
        }

        public void addSub(src.subject Subject1) {
            int code = Subject1.getCode();
            Iterator<src.subject> it = subjects.iterator();
            while (it.hasNext()) {
                src.subject s = it.next();
                if (s.getCode() == code) {
                    System.out.println("Code " + code + " is already in use.");
                    return;
                }
            }
            subjects.add(Subject1);
        }

        public void deleteSub(int code) {
            Iterator<src.subject> it = subjects.iterator();
            while (it.hasNext()) {
                src.subject l = it.next();
                if (l.getCode() == code) {
                    it.remove();
                    return;
                }
            }
            System.out.println("No lesson with such code exists!");
        }

        public void showSub(int sem) {
            Iterator<src.subject> it = subjects.iterator();
            while (it.hasNext()) {
                src.subject l = it.next();
                if (l.getSem() == sem) {
                    System.out.println(l.getCode() + "\t" + l.getName());
                }
            }
        }

        public void changeSemester(int code, int sem) {
            boolean found = false;
            Iterator<src.subject> it = subjects.iterator();
            while (it.hasNext() && !found) {
                src.subject l = it.next();
                if (l.getCode() == code) {
                    found = true;
                    l.setSem(sem);
                }
            }
            if (!found) {
                System.out.println("Code " + code + " doesn't exist.");
            }
        }
    }
}