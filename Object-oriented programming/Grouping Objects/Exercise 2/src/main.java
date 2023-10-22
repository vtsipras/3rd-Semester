public class main {
    public static void Main(String[] args){
        subject s1 = new subject(1, "data structures", 3);
        subject s2 = new subject(2, "object oriented programming", 3);
        subject s3 = new subject(3, "basic principles of programming", 1);

    }
    program p = new program();
    p.addSub(s1);
    p.addSub(s2);
    p.addSub(s3);

    p.showSub(3);

    p.changeSemester(1, 2);

    p.deleteSub(12);

}
