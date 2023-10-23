public class subject {
    private int code;
    private String name;
    private int sem;

    public subject(int code, String name,  int sem) {
        this.code = code;
        this.name = name;
        this.sem = sem;
    }

    //Getters
    public int getCode() {
        return code;
    }

    public int getSem() {
        return sem;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
}