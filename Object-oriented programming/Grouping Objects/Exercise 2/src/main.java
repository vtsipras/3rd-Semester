package src;

public class main {
    public static void Main(String[] args){
        src.subject s1 = new src.subject(1, "data structures", 3);
        src.subject s2 = new src.subject(2, "object oriented programming", 3);
        src.subject s3 = new src.subject(3, "basic principles of programming", 1);

    }
    src.program p = new src.program();
    p.addSub(s1);
    p.addSub(s2);
    p.addSub(s3);

    p.showSub(3);

    p.changeSemester(1, 2);

    p.deleteSub(12);

}
