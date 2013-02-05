package no.finntech.integration;

public class AddMessage {

    public AddMessage(int first, int second) {
        this.first = first;
        this.second = second;
    }

    int first;
    int second;

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
