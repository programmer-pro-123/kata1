package software.ulpgc;

public class Task {
    private int beginning;
    private int end;
    private String description;

    public Task(int beginning, int end, String description){
        this.beginning = beginning;
        this.end = end;
        this.description = description;
    }

    public int getBeginning() {
        return beginning;
    }

    public int getEnd() {
        return end;
    }

    public String getDescription() {
        return description;
    }

    public void setBeginning(int beginning) {
        this.beginning = beginning;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int timeLimit(){
        return this.end - this.beginning;
    }
}
